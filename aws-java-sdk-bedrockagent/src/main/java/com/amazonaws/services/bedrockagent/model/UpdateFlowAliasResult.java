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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlowAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time at which the flow was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the flow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     */
    private String flowId;
    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the flow alias.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contains information about the version that the alias is mapped to.
     * </p>
     */
    private java.util.List<FlowAliasRoutingConfigurationListItem> routingConfiguration;
    /**
     * <p>
     * The time at which the flow alias was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the flow.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the flow.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time at which the flow was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the flow was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the flow was created.
     * </p>
     * 
     * @return The time at which the flow was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the flow was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the flow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     * 
     * @param description
     *        The description of the flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     * 
     * @return The description of the flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     * 
     * @param description
     *        The description of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param flowId
     *        The unique identifier of the flow.
     */

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @return The unique identifier of the flow.
     */

    public String getFlowId() {
        return this.flowId;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param flowId
     *        The unique identifier of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasResult withFlowId(String flowId) {
        setFlowId(flowId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @param id
     *        The unique identifier of the alias.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @return The unique identifier of the alias.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the alias.
     * </p>
     * 
     * @param id
     *        The unique identifier of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasResult withId(String id) {
        setId(id);
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

    public UpdateFlowAliasResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains information about the version that the alias is mapped to.
     * </p>
     * 
     * @return Contains information about the version that the alias is mapped to.
     */

    public java.util.List<FlowAliasRoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * <p>
     * Contains information about the version that the alias is mapped to.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains information about the version that the alias is mapped to.
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
     * Contains information about the version that the alias is mapped to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains information about the version that the alias is mapped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasResult withRoutingConfiguration(FlowAliasRoutingConfigurationListItem... routingConfiguration) {
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
     * Contains information about the version that the alias is mapped to.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains information about the version that the alias is mapped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasResult withRoutingConfiguration(java.util.Collection<FlowAliasRoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the flow alias was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the flow alias was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the flow alias was last updated.
     * </p>
     * 
     * @return The time at which the flow alias was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the flow alias was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the flow alias was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowAliasResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFlowId() != null)
            sb.append("FlowId: ").append(getFlowId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFlowAliasResult == false)
            return false;
        UpdateFlowAliasResult other = (UpdateFlowAliasResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFlowId() == null ^ this.getFlowId() == null)
            return false;
        if (other.getFlowId() != null && other.getFlowId().equals(this.getFlowId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlowAliasResult clone() {
        try {
            return (UpdateFlowAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
