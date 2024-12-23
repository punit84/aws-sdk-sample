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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlowAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     */
    private String aliasIdentifier;
    /**
     * <p>
     * A description for the flow alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     */
    private String flowIdentifier;
    /**
     * <p>
     * The name of the flow alias.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contains information about the version to which to map the alias.
     * </p>
     */
    private java.util.List<FlowAliasRoutingConfigurationListItem> routingConfiguration;

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @param aliasIdentifier
     *        The unique identifier of the alias.
     */

    public void setAliasIdentifier(String aliasIdentifier) {
        this.aliasIdentifier = aliasIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @return The unique identifier of the alias.
     */

    public String getAliasIdentifier() {
        return this.aliasIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @param aliasIdentifier
     *        The unique identifier of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasRequest withAliasIdentifier(String aliasIdentifier) {
        setAliasIdentifier(aliasIdentifier);
        return this;
    }

    /**
     * <p>
     * A description for the flow alias.
     * </p>
     * 
     * @param description
     *        A description for the flow alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the flow alias.
     * </p>
     * 
     * @return A description for the flow alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the flow alias.
     * </p>
     * 
     * @param description
     *        A description for the flow alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow.
     */

    public void setFlowIdentifier(String flowIdentifier) {
        this.flowIdentifier = flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @return The unique identifier of the flow.
     */

    public String getFlowIdentifier() {
        return this.flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasRequest withFlowIdentifier(String flowIdentifier) {
        setFlowIdentifier(flowIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the flow alias.
     * </p>
     * 
     * @param name
     *        The name of the flow alias.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the flow alias.
     * </p>
     * 
     * @return The name of the flow alias.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the flow alias.
     * </p>
     * 
     * @param name
     *        The name of the flow alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains information about the version to which to map the alias.
     * </p>
     * 
     * @return Contains information about the version to which to map the alias.
     */

    public java.util.List<FlowAliasRoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * <p>
     * Contains information about the version to which to map the alias.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains information about the version to which to map the alias.
     */

    public void setRoutingConfiguration(java.util.Collection<FlowAliasRoutingConfigurationListItem> routingConfiguration) {
        if (routingConfiguration == null) {
            this.routingConfiguration = null;
            return;
        }

        this.routingConfiguration = new java.util.ArrayList<FlowAliasRoutingConfigurationListItem>(routingConfiguration);
    }

    /**
     * <p>
     * Contains information about the version to which to map the alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains information about the version to which to map the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasRequest withRoutingConfiguration(FlowAliasRoutingConfigurationListItem... routingConfiguration) {
        if (this.routingConfiguration == null) {
            setRoutingConfiguration(new java.util.ArrayList<FlowAliasRoutingConfigurationListItem>(routingConfiguration.length));
        }
        for (FlowAliasRoutingConfigurationListItem ele : routingConfiguration) {
            this.routingConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the version to which to map the alias.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains information about the version to which to map the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasRequest withRoutingConfiguration(java.util.Collection<FlowAliasRoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFlowIdentifier() != null)
            sb.append("FlowIdentifier: ").append(getFlowIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFlowAliasRequest == false)
            return false;
        UpdateFlowAliasRequest other = (UpdateFlowAliasRequest) obj;
        if (other.getAliasIdentifier() == null ^ this.getAliasIdentifier() == null)
            return false;
        if (other.getAliasIdentifier() != null && other.getAliasIdentifier().equals(this.getAliasIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFlowIdentifier() == null ^ this.getFlowIdentifier() == null)
            return false;
        if (other.getFlowIdentifier() != null && other.getFlowIdentifier().equals(this.getFlowIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasIdentifier() == null) ? 0 : getAliasIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFlowIdentifier() == null) ? 0 : getFlowIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlowAliasRequest clone() {
        return (UpdateFlowAliasRequest) super.clone();
    }

}
