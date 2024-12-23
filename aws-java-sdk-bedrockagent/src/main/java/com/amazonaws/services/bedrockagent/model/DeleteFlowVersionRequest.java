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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlowVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFlowVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the flow whose version that you want to delete
     * </p>
     */
    private String flowIdentifier;
    /**
     * <p>
     * The version of the flow that you want to delete.
     * </p>
     */
    private String flowVersion;
    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     */
    private Boolean skipResourceInUseCheck;

    /**
     * <p>
     * The unique identifier of the flow whose version that you want to delete
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow whose version that you want to delete
     */

    public void setFlowIdentifier(String flowIdentifier) {
        this.flowIdentifier = flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow whose version that you want to delete
     * </p>
     * 
     * @return The unique identifier of the flow whose version that you want to delete
     */

    public String getFlowIdentifier() {
        return this.flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow whose version that you want to delete
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow whose version that you want to delete
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowVersionRequest withFlowIdentifier(String flowIdentifier) {
        setFlowIdentifier(flowIdentifier);
        return this;
    }

    /**
     * <p>
     * The version of the flow that you want to delete.
     * </p>
     * 
     * @param flowVersion
     *        The version of the flow that you want to delete.
     */

    public void setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
    }

    /**
     * <p>
     * The version of the flow that you want to delete.
     * </p>
     * 
     * @return The version of the flow that you want to delete.
     */

    public String getFlowVersion() {
        return this.flowVersion;
    }

    /**
     * <p>
     * The version of the flow that you want to delete.
     * </p>
     * 
     * @param flowVersion
     *        The version of the flow that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowVersionRequest withFlowVersion(String flowVersion) {
        setFlowVersion(flowVersion);
        return this;
    }

    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     * 
     * @param skipResourceInUseCheck
     *        By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set
     *        it to <code>true</code>, the resource will be deleted even if the resource is in use.
     */

    public void setSkipResourceInUseCheck(Boolean skipResourceInUseCheck) {
        this.skipResourceInUseCheck = skipResourceInUseCheck;
    }

    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     * 
     * @return By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you
     *         set it to <code>true</code>, the resource will be deleted even if the resource is in use.
     */

    public Boolean getSkipResourceInUseCheck() {
        return this.skipResourceInUseCheck;
    }

    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     * 
     * @param skipResourceInUseCheck
     *        By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set
     *        it to <code>true</code>, the resource will be deleted even if the resource is in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowVersionRequest withSkipResourceInUseCheck(Boolean skipResourceInUseCheck) {
        setSkipResourceInUseCheck(skipResourceInUseCheck);
        return this;
    }

    /**
     * <p>
     * By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you set it to
     * <code>true</code>, the resource will be deleted even if the resource is in use.
     * </p>
     * 
     * @return By default, this value is <code>false</code> and deletion is stopped if the resource is in use. If you
     *         set it to <code>true</code>, the resource will be deleted even if the resource is in use.
     */

    public Boolean isSkipResourceInUseCheck() {
        return this.skipResourceInUseCheck;
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
        if (getFlowIdentifier() != null)
            sb.append("FlowIdentifier: ").append(getFlowIdentifier()).append(",");
        if (getFlowVersion() != null)
            sb.append("FlowVersion: ").append(getFlowVersion()).append(",");
        if (getSkipResourceInUseCheck() != null)
            sb.append("SkipResourceInUseCheck: ").append(getSkipResourceInUseCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlowVersionRequest == false)
            return false;
        DeleteFlowVersionRequest other = (DeleteFlowVersionRequest) obj;
        if (other.getFlowIdentifier() == null ^ this.getFlowIdentifier() == null)
            return false;
        if (other.getFlowIdentifier() != null && other.getFlowIdentifier().equals(this.getFlowIdentifier()) == false)
            return false;
        if (other.getFlowVersion() == null ^ this.getFlowVersion() == null)
            return false;
        if (other.getFlowVersion() != null && other.getFlowVersion().equals(this.getFlowVersion()) == false)
            return false;
        if (other.getSkipResourceInUseCheck() == null ^ this.getSkipResourceInUseCheck() == null)
            return false;
        if (other.getSkipResourceInUseCheck() != null && other.getSkipResourceInUseCheck().equals(this.getSkipResourceInUseCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowIdentifier() == null) ? 0 : getFlowIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFlowVersion() == null) ? 0 : getFlowVersion().hashCode());
        hashCode = prime * hashCode + ((getSkipResourceInUseCheck() == null) ? 0 : getSkipResourceInUseCheck().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFlowVersionRequest clone() {
        return (DeleteFlowVersionRequest) super.clone();
    }

}
