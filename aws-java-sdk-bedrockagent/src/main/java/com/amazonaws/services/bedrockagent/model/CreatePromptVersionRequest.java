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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreatePromptVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePromptVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description for the version of the prompt.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the prompt that you want to create a version of.
     * </p>
     */
    private String promptIdentifier;
    /**
     * <p>
     * Any tags that you want to attach to the version of the prompt. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon Bedrock</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePromptVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description for the version of the prompt.
     * </p>
     * 
     * @param description
     *        A description for the version of the prompt.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the version of the prompt.
     * </p>
     * 
     * @return A description for the version of the prompt.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the version of the prompt.
     * </p>
     * 
     * @param description
     *        A description for the version of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePromptVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the prompt that you want to create a version of.
     * </p>
     * 
     * @param promptIdentifier
     *        The unique identifier of the prompt that you want to create a version of.
     */

    public void setPromptIdentifier(String promptIdentifier) {
        this.promptIdentifier = promptIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the prompt that you want to create a version of.
     * </p>
     * 
     * @return The unique identifier of the prompt that you want to create a version of.
     */

    public String getPromptIdentifier() {
        return this.promptIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the prompt that you want to create a version of.
     * </p>
     * 
     * @param promptIdentifier
     *        The unique identifier of the prompt that you want to create a version of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePromptVersionRequest withPromptIdentifier(String promptIdentifier) {
        setPromptIdentifier(promptIdentifier);
        return this;
    }

    /**
     * <p>
     * Any tags that you want to attach to the version of the prompt. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon Bedrock</a>.
     * </p>
     * 
     * @return Any tags that you want to attach to the version of the prompt. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon
     *         Bedrock</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags that you want to attach to the version of the prompt. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon Bedrock</a>.
     * </p>
     * 
     * @param tags
     *        Any tags that you want to attach to the version of the prompt. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon
     *        Bedrock</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Any tags that you want to attach to the version of the prompt. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon Bedrock</a>.
     * </p>
     * 
     * @param tags
     *        Any tags that you want to attach to the version of the prompt. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon
     *        Bedrock</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePromptVersionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePromptVersionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePromptVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePromptVersionRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPromptIdentifier() != null)
            sb.append("PromptIdentifier: ").append(getPromptIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePromptVersionRequest == false)
            return false;
        CreatePromptVersionRequest other = (CreatePromptVersionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPromptIdentifier() == null ^ this.getPromptIdentifier() == null)
            return false;
        if (other.getPromptIdentifier() != null && other.getPromptIdentifier().equals(this.getPromptIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPromptIdentifier() == null) ? 0 : getPromptIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePromptVersionRequest clone() {
        return (CreatePromptVersionRequest) super.clone();
    }

}
