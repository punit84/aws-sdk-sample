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
 * Contains information about the flow version.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_ListFlowVersions.html#API_agent_ListFlowVersions_ResponseSyntax"
 * >ListFlowVersions response</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow that the version belongs to.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time at the flow version was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the flow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The version of the flow.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow that the version belongs to.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the flow that the version belongs to.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow that the version belongs to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the flow that the version belongs to.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow that the version belongs to.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the flow that the version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowVersionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time at the flow version was created.
     * </p>
     * 
     * @param createdAt
     *        The time at the flow version was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at the flow version was created.
     * </p>
     * 
     * @return The time at the flow version was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at the flow version was created.
     * </p>
     * 
     * @param createdAt
     *        The time at the flow version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowVersionSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param id
     *        The unique identifier of the flow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @return The unique identifier of the flow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param id
     *        The unique identifier of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowVersionSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * 
     * @param status
     *        The status of the flow.
     * @see FlowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * 
     * @return The status of the flow.
     * @see FlowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * 
     * @param status
     *        The status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public FlowVersionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * 
     * @param status
     *        The status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public FlowVersionSummary withStatus(FlowStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The version of the flow.
     * </p>
     * 
     * @param version
     *        The version of the flow.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the flow.
     * </p>
     * 
     * @return The version of the flow.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the flow.
     * </p>
     * 
     * @param version
     *        The version of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowVersionSummary withVersion(String version) {
        setVersion(version);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowVersionSummary == false)
            return false;
        FlowVersionSummary other = (FlowVersionSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public FlowVersionSummary clone() {
        try {
            return (FlowVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
