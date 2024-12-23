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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdatePrompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePromptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A description for the prompt.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A name for the prompt.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     */
    private String promptIdentifier;
    /**
     * <p>
     * A list of objects, each containing details about a variant of the prompt.
     * </p>
     */
    private java.util.List<PromptVariant> variants;

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

    public UpdatePromptRequest withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
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

    public UpdatePromptRequest withDefaultVariant(String defaultVariant) {
        setDefaultVariant(defaultVariant);
        return this;
    }

    /**
     * <p>
     * A description for the prompt.
     * </p>
     * 
     * @param description
     *        A description for the prompt.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the prompt.
     * </p>
     * 
     * @return A description for the prompt.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the prompt.
     * </p>
     * 
     * @param description
     *        A description for the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A name for the prompt.
     * </p>
     * 
     * @param name
     *        A name for the prompt.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the prompt.
     * </p>
     * 
     * @return A name for the prompt.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the prompt.
     * </p>
     * 
     * @param name
     *        A name for the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptRequest withName(String name) {
        setName(name);
        return this;
    }

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

    public UpdatePromptRequest withPromptIdentifier(String promptIdentifier) {
        setPromptIdentifier(promptIdentifier);
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

    public UpdatePromptRequest withVariants(PromptVariant... variants) {
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

    public UpdatePromptRequest withVariants(java.util.Collection<PromptVariant> variants) {
        setVariants(variants);
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
        if (getCustomerEncryptionKeyArn() != null)
            sb.append("CustomerEncryptionKeyArn: ").append(getCustomerEncryptionKeyArn()).append(",");
        if (getDefaultVariant() != null)
            sb.append("DefaultVariant: ").append(getDefaultVariant()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPromptIdentifier() != null)
            sb.append("PromptIdentifier: ").append(getPromptIdentifier()).append(",");
        if (getVariants() != null)
            sb.append("Variants: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePromptRequest == false)
            return false;
        UpdatePromptRequest other = (UpdatePromptRequest) obj;
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPromptIdentifier() == null ^ this.getPromptIdentifier() == null)
            return false;
        if (other.getPromptIdentifier() != null && other.getPromptIdentifier().equals(this.getPromptIdentifier()) == false)
            return false;
        if (other.getVariants() == null ^ this.getVariants() == null)
            return false;
        if (other.getVariants() != null && other.getVariants().equals(this.getVariants()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultVariant() == null) ? 0 : getDefaultVariant().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPromptIdentifier() == null) ? 0 : getPromptIdentifier().hashCode());
        hashCode = prime * hashCode + ((getVariants() == null) ? 0 : getVariants().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePromptRequest clone() {
        return (UpdatePromptRequest) super.clone();
    }

}
