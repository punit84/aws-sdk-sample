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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetPrompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPromptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     */
    private String promptIdentifier;
    /**
     * <p>
     * The version of the prompt about which you want to retrieve information.
     * </p>
     */
    private String promptVersion;

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @param promptIdentifier
     *        The unique identifier of the prompt.
     */

    public void setPromptIdentifier(String promptIdentifier) {
        this.promptIdentifier = promptIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @return The unique identifier of the prompt.
     */

    public String getPromptIdentifier() {
        return this.promptIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @param promptIdentifier
     *        The unique identifier of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPromptRequest withPromptIdentifier(String promptIdentifier) {
        setPromptIdentifier(promptIdentifier);
        return this;
    }

    /**
     * <p>
     * The version of the prompt about which you want to retrieve information.
     * </p>
     * 
     * @param promptVersion
     *        The version of the prompt about which you want to retrieve information.
     */

    public void setPromptVersion(String promptVersion) {
        this.promptVersion = promptVersion;
    }

    /**
     * <p>
     * The version of the prompt about which you want to retrieve information.
     * </p>
     * 
     * @return The version of the prompt about which you want to retrieve information.
     */

    public String getPromptVersion() {
        return this.promptVersion;
    }

    /**
     * <p>
     * The version of the prompt about which you want to retrieve information.
     * </p>
     * 
     * @param promptVersion
     *        The version of the prompt about which you want to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPromptRequest withPromptVersion(String promptVersion) {
        setPromptVersion(promptVersion);
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
        if (getPromptIdentifier() != null)
            sb.append("PromptIdentifier: ").append(getPromptIdentifier()).append(",");
        if (getPromptVersion() != null)
            sb.append("PromptVersion: ").append(getPromptVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPromptRequest == false)
            return false;
        GetPromptRequest other = (GetPromptRequest) obj;
        if (other.getPromptIdentifier() == null ^ this.getPromptIdentifier() == null)
            return false;
        if (other.getPromptIdentifier() != null && other.getPromptIdentifier().equals(this.getPromptIdentifier()) == false)
            return false;
        if (other.getPromptVersion() == null ^ this.getPromptVersion() == null)
            return false;
        if (other.getPromptVersion() != null && other.getPromptVersion().equals(this.getPromptVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptIdentifier() == null) ? 0 : getPromptIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPromptVersion() == null) ? 0 : getPromptVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetPromptRequest clone() {
        return (GetPromptRequest) super.clone();
    }

}
