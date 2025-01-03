/*
 * Copyright 2020-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.internal.crypto.keywrap;

import com.amazonaws.services.s3.model.KMSEncryptionMaterials;

public class KMSKeyWrapperProvider implements KeyWrapperProvider {
    private static final KMSKeyWrapperProvider DEFAULT = new KMSKeyWrapperProvider();

    private KMSKeyWrapperProvider() {
    }

    public static KMSKeyWrapperProvider create() {
        return DEFAULT;
    }

    @Override
    public InternalKeyWrapAlgorithm algorithm() {
        return InternalKeyWrapAlgorithm.KMS;
    }

    @Override
    public KeyWrapper createKeyWrapper(KeyWrapperContext keyWrapperContext) {
        return KMSKeyWrapper.builder()
                            .encryptionMaterials((KMSEncryptionMaterials) keyWrapperContext.materials())
                            .kmsKeyWrapperContext(keyWrapperContext.kmsKeyWrapperContext())
                            .build();
    }
}
