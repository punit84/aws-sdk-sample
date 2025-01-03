/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about an email template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/TemplateMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time and date the template was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param name
     *        The name of the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @return The name of the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param name
     *        The name of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time and date the template was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time and date the template was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time and date the template was created.
     * </p>
     * 
     * @return The time and date the template was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time and date the template was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time and date the template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateMetadata withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateMetadata == false)
            return false;
        TemplateMetadata other = (TemplateMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public TemplateMetadata clone() {
        try {
            return (TemplateMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
