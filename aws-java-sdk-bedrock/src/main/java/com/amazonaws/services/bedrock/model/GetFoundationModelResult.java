/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetFoundationModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFoundationModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the foundation model.
     * </p>
     */
    private FoundationModelDetails modelDetails;

    /**
     * <p>
     * Information about the foundation model.
     * </p>
     * 
     * @param modelDetails
     *        Information about the foundation model.
     */

    public void setModelDetails(FoundationModelDetails modelDetails) {
        this.modelDetails = modelDetails;
    }

    /**
     * <p>
     * Information about the foundation model.
     * </p>
     * 
     * @return Information about the foundation model.
     */

    public FoundationModelDetails getModelDetails() {
        return this.modelDetails;
    }

    /**
     * <p>
     * Information about the foundation model.
     * </p>
     * 
     * @param modelDetails
     *        Information about the foundation model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFoundationModelResult withModelDetails(FoundationModelDetails modelDetails) {
        setModelDetails(modelDetails);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getModelDetails() != null)
            sb.append("ModelDetails: ").append(getModelDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFoundationModelResult == false)
            return false;
        GetFoundationModelResult other = (GetFoundationModelResult) obj;
        if (other.getModelDetails() == null ^ this.getModelDetails() == null)
            return false;
        if (other.getModelDetails() != null && other.getModelDetails().equals(this.getModelDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelDetails() == null) ? 0 : getModelDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetFoundationModelResult clone() {
        try {
            return (GetFoundationModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
