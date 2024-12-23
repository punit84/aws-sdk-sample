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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdatePrompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePromptResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time at which the prompt was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the prompt.
     * </p>
     */
    private String customerEncryptionKeyArn;
    /**
     * <p>
     * The name of the default variant for the prompt. This value must match the <code>name</code> field in the relevant
     * <a href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html">PromptVariant</a>
     * object.
     * </p>
     */
    private String defaultVariant;
    /**
     * <p>
     * The description of the prompt.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the prompt.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time at which the prompt was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * A list of objects, each containing details about a variant of the prompt.
     * </p>
     */
    private java.util.List<PromptVariant> variants;
    /**
     * <p>
     * The version of the prompt. When you update a prompt, the version updated is the <code>DRAFT</code> version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the prompt.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the prompt.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time at which the prompt was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the prompt was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the prompt was created.
     * </p>
     * 
     * @return The time at which the prompt was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the prompt was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the prompt was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the prompt.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key to encrypt the prompt.
     */

    public void setCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        this.customerEncryptionKeyArn = customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the prompt.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key to encrypt the prompt.
     */

    public String getCustomerEncryptionKeyArn() {
        return this.customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the prompt.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key to encrypt the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the default variant for the prompt. This value must match the <code>name</code> field in the relevant
     * <a href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html">PromptVariant</a>
     * object.
     * </p>
     * 
     * @param defaultVariant
     *        The name of the default variant for the prompt. This value must match the <code>name</code> field in the
     *        relevant <a href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html">
     *        PromptVariant</a> object.
     */

    public void setDefaultVariant(String defaultVariant) {
        this.defaultVariant = defaultVariant;
    }

    /**
     * <p>
     * The name of the default variant for the prompt. This value must match the <code>name</code> field in the relevant
     * <a href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html">PromptVariant</a>
     * object.
     * </p>
     * 
     * @return The name of the default variant for the prompt. This value must match the <code>name</code> field in the
     *         relevant <a href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html">
     *         PromptVariant</a> object.
     */

    public String getDefaultVariant() {
        return this.defaultVariant;
    }

    /**
     * <p>
     * The name of the default variant for the prompt. This value must match the <code>name</code> field in the relevant
     * <a href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html">PromptVariant</a>
     * object.
     * </p>
     * 
     * @param defaultVariant
     *        The name of the default variant for the prompt. This value must match the <code>name</code> field in the
     *        relevant <a href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html">
     *        PromptVariant</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withDefaultVariant(String defaultVariant) {
        setDefaultVariant(defaultVariant);
        return this;
    }

    /**
     * <p>
     * The description of the prompt.
     * </p>
     * 
     * @param description
     *        The description of the prompt.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the prompt.
     * </p>
     * 
     * @return The description of the prompt.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the prompt.
     * </p>
     * 
     * @param description
     *        The description of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @param id
     *        The unique identifier of the prompt.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @return The unique identifier of the prompt.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @param id
     *        The unique identifier of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the prompt.
     * </p>
     * 
     * @param name
     *        The name of the prompt.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the prompt.
     * </p>
     * 
     * @return The name of the prompt.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the prompt.
     * </p>
     * 
     * @param name
     *        The name of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time at which the prompt was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the prompt was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the prompt was last updated.
     * </p>
     * 
     * @return The time at which the prompt was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the prompt was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the prompt was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * A list of objects, each containing details about a variant of the prompt.
     * </p>
     * 
     * @return A list of objects, each containing details about a variant of the prompt.
     */

    public java.util.List<PromptVariant> getVariants() {
        return variants;
    }

    /**
     * <p>
     * A list of objects, each containing details about a variant of the prompt.
     * </p>
     * 
     * @param variants
     *        A list of objects, each containing details about a variant of the prompt.
     */

    public void setVariants(java.util.Collection<PromptVariant> variants) {
        if (variants == null) {
            this.variants = null;
            return;
        }

        this.variants = new java.util.ArrayList<PromptVariant>(variants);
    }

    /**
     * <p>
     * A list of objects, each containing details about a variant of the prompt.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariants(java.util.Collection)} or {@link #withVariants(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param variants
     *        A list of objects, each containing details about a variant of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withVariants(PromptVariant... variants) {
        if (this.variants == null) {
            setVariants(new java.util.ArrayList<PromptVariant>(variants.length));
        }
        for (PromptVariant ele : variants) {
            this.variants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each containing details about a variant of the prompt.
     * </p>
     * 
     * @param variants
     *        A list of objects, each containing details about a variant of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withVariants(java.util.Collection<PromptVariant> variants) {
        setVariants(variants);
        return this;
    }

    /**
     * <p>
     * The version of the prompt. When you update a prompt, the version updated is the <code>DRAFT</code> version.
     * </p>
     * 
     * @param version
     *        The version of the prompt. When you update a prompt, the version updated is the <code>DRAFT</code>
     *        version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the prompt. When you update a prompt, the version updated is the <code>DRAFT</code> version.
     * </p>
     * 
     * @return The version of the prompt. When you update a prompt, the version updated is the <code>DRAFT</code>
     *         version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the prompt. When you update a prompt, the version updated is the <code>DRAFT</code> version.
     * </p>
     * 
     * @param version
     *        The version of the prompt. When you update a prompt, the version updated is the <code>DRAFT</code>
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withVersion(String version) {
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
        if (getCustomerEncryptionKeyArn() != null)
            sb.append("CustomerEncryptionKeyArn: ").append(getCustomerEncryptionKeyArn()).append(",");
        if (getDefaultVariant() != null)
            sb.append("DefaultVariant: ").append(getDefaultVariant()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getVariants() != null)
            sb.append("Variants: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof UpdatePromptResult == false)
            return false;
        UpdatePromptResult other = (UpdatePromptResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCustomerEncryptionKeyArn() == null ^ this.getCustomerEncryptionKeyArn() == null)
            return false;
        if (other.getCustomerEncryptionKeyArn() != null && other.getCustomerEncryptionKeyArn().equals(this.getCustomerEncryptionKeyArn()) == false)
            return false;
        if (other.getDefaultVariant() == null ^ this.getDefaultVariant() == null)
            return false;
        if (other.getDefaultVariant() != null && other.getDefaultVariant().equals(this.getDefaultVariant()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getVariants() == null ^ this.getVariants() == null)
            return false;
        if (other.getVariants() != null && other.getVariants().equals(this.getVariants()) == false)
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
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultVariant() == null) ? 0 : getDefaultVariant().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getVariants() == null) ? 0 : getVariants().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePromptResult clone() {
        try {
            return (UpdatePromptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
