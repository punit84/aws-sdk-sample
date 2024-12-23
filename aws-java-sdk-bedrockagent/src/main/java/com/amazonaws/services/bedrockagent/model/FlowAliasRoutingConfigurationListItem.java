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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a version that the alias maps to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowAliasRoutingConfigurationListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowAliasRoutingConfigurationListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version that the alias maps to.
     * </p>
     */
    private String flowVersion;

    /**
     * <p>
     * The version that the alias maps to.
     * </p>
     * 
     * @param flowVersion
     *        The version that the alias maps to.
     */

    public void setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
    }

    /**
     * <p>
     * The version that the alias maps to.
     * </p>
     * 
     * @return The version that the alias maps to.
     */

    public String getFlowVersion() {
        return this.flowVersion;
    }

    /**
     * <p>
     * The version that the alias maps to.
     * </p>
     * 
     * @param flowVersion
     *        The version that the alias maps to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowAliasRoutingConfigurationListItem withFlowVersion(String flowVersion) {
        setFlowVersion(flowVersion);
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
        if (getFlowVersion() != null)
            sb.append("FlowVersion: ").append(getFlowVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowAliasRoutingConfigurationListItem == false)
            return false;
        FlowAliasRoutingConfigurationListItem other = (FlowAliasRoutingConfigurationListItem) obj;
        if (other.getFlowVersion() == null ^ this.getFlowVersion() == null)
            return false;
        if (other.getFlowVersion() != null && other.getFlowVersion().equals(this.getFlowVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowVersion() == null) ? 0 : getFlowVersion().hashCode());
        return hashCode;
    }

    @Override
    public FlowAliasRoutingConfigurationListItem clone() {
        try {
            return (FlowAliasRoutingConfigurationListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowAliasRoutingConfigurationListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
