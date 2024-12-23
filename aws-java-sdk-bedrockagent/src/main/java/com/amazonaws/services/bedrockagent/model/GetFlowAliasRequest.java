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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlowAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFlowAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the alias for which to retrieve information.
     * </p>
     */
    private String aliasIdentifier;
    /**
     * <p>
     * The unique identifier of the flow that the alias belongs to.
     * </p>
     */
    private String flowIdentifier;

    /**
     * <p>
     * The unique identifier of the alias for which to retrieve information.
     * </p>
     * 
     * @param aliasIdentifier
     *        The unique identifier of the alias for which to retrieve information.
     */

    public void setAliasIdentifier(String aliasIdentifier) {
        this.aliasIdentifier = aliasIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the alias for which to retrieve information.
     * </p>
     * 
     * @return The unique identifier of the alias for which to retrieve information.
     */

    public String getAliasIdentifier() {
        return this.aliasIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the alias for which to retrieve information.
     * </p>
     * 
     * @param aliasIdentifier
     *        The unique identifier of the alias for which to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowAliasRequest withAliasIdentifier(String aliasIdentifier) {
        setAliasIdentifier(aliasIdentifier);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the flow that the alias belongs to.
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow that the alias belongs to.
     */

    public void setFlowIdentifier(String flowIdentifier) {
        this.flowIdentifier = flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow that the alias belongs to.
     * </p>
     * 
     * @return The unique identifier of the flow that the alias belongs to.
     */

    public String getFlowIdentifier() {
        return this.flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow that the alias belongs to.
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow that the alias belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowAliasRequest withFlowIdentifier(String flowIdentifier) {
        setFlowIdentifier(flowIdentifier);
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
        if (getAliasIdentifier() != null)
            sb.append("AliasIdentifier: ").append(getAliasIdentifier()).append(",");
        if (getFlowIdentifier() != null)
            sb.append("FlowIdentifier: ").append(getFlowIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFlowAliasRequest == false)
            return false;
        GetFlowAliasRequest other = (GetFlowAliasRequest) obj;
        if (other.getAliasIdentifier() == null ^ this.getAliasIdentifier() == null)
            return false;
        if (other.getAliasIdentifier() != null && other.getAliasIdentifier().equals(this.getAliasIdentifier()) == false)
            return false;
        if (other.getFlowIdentifier() == null ^ this.getFlowIdentifier() == null)
            return false;
        if (other.getFlowIdentifier() != null && other.getFlowIdentifier().equals(this.getFlowIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasIdentifier() == null) ? 0 : getAliasIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFlowIdentifier() == null) ? 0 : getFlowIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetFlowAliasRequest clone() {
        return (GetFlowAliasRequest) super.clone();
    }

}
