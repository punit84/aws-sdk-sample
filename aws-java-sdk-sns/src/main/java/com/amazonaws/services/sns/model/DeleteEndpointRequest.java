/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for DeleteEndpoint action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * EndpointArn of endpoint to delete.
     * </p>
     */
    private String endpointArn;

    /**
     * <p>
     * EndpointArn of endpoint to delete.
     * </p>
     * 
     * @param endpointArn
     *        EndpointArn of endpoint to delete.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * EndpointArn of endpoint to delete.
     * </p>
     * 
     * @return EndpointArn of endpoint to delete.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * EndpointArn of endpoint to delete.
     * </p>
     * 
     * @param endpointArn
     *        EndpointArn of endpoint to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEndpointRequest withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEndpointRequest == false)
            return false;
        DeleteEndpointRequest other = (DeleteEndpointRequest) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEndpointRequest clone() {
        return (DeleteEndpointRequest) super.clone();
    }

}
