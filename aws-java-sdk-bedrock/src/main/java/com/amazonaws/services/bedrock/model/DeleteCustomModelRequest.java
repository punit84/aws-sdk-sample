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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteCustomModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the model to delete.
     * </p>
     */
    private String modelIdentifier;

    /**
     * <p>
     * Name of the model to delete.
     * </p>
     * 
     * @param modelIdentifier
     *        Name of the model to delete.
     */

    public void setModelIdentifier(String modelIdentifier) {
        this.modelIdentifier = modelIdentifier;
    }

    /**
     * <p>
     * Name of the model to delete.
     * </p>
     * 
     * @return Name of the model to delete.
     */

    public String getModelIdentifier() {
        return this.modelIdentifier;
    }

    /**
     * <p>
     * Name of the model to delete.
     * </p>
     * 
     * @param modelIdentifier
     *        Name of the model to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomModelRequest withModelIdentifier(String modelIdentifier) {
        setModelIdentifier(modelIdentifier);
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
        if (getModelIdentifier() != null)
            sb.append("ModelIdentifier: ").append(getModelIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomModelRequest == false)
            return false;
        DeleteCustomModelRequest other = (DeleteCustomModelRequest) obj;
        if (other.getModelIdentifier() == null ^ this.getModelIdentifier() == null)
            return false;
        if (other.getModelIdentifier() != null && other.getModelIdentifier().equals(this.getModelIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelIdentifier() == null) ? 0 : getModelIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomModelRequest clone() {
        return (DeleteCustomModelRequest) super.clone();
    }

}
