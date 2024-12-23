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
 * Details of the memory configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/MemoryConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemoryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of memory that is stored.
     * </p>
     */
    private java.util.List<String> enabledMemoryTypes;
    /**
     * <p>
     * The number of days the agent is configured to retain the conversational context.
     * </p>
     */
    private Integer storageDays;

    /**
     * <p>
     * The type of memory that is stored.
     * </p>
     * 
     * @return The type of memory that is stored.
     * @see MemoryType
     */

    public java.util.List<String> getEnabledMemoryTypes() {
        return enabledMemoryTypes;
    }

    /**
     * <p>
     * The type of memory that is stored.
     * </p>
     * 
     * @param enabledMemoryTypes
     *        The type of memory that is stored.
     * @see MemoryType
     */

    public void setEnabledMemoryTypes(java.util.Collection<String> enabledMemoryTypes) {
        if (enabledMemoryTypes == null) {
            this.enabledMemoryTypes = null;
            return;
        }

        this.enabledMemoryTypes = new java.util.ArrayList<String>(enabledMemoryTypes);
    }

    /**
     * <p>
     * The type of memory that is stored.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledMemoryTypes(java.util.Collection)} or {@link #withEnabledMemoryTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param enabledMemoryTypes
     *        The type of memory that is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemoryType
     */

    public MemoryConfiguration withEnabledMemoryTypes(String... enabledMemoryTypes) {
        if (this.enabledMemoryTypes == null) {
            setEnabledMemoryTypes(new java.util.ArrayList<String>(enabledMemoryTypes.length));
        }
        for (String ele : enabledMemoryTypes) {
            this.enabledMemoryTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of memory that is stored.
     * </p>
     * 
     * @param enabledMemoryTypes
     *        The type of memory that is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemoryType
     */

    public MemoryConfiguration withEnabledMemoryTypes(java.util.Collection<String> enabledMemoryTypes) {
        setEnabledMemoryTypes(enabledMemoryTypes);
        return this;
    }

    /**
     * <p>
     * The type of memory that is stored.
     * </p>
     * 
     * @param enabledMemoryTypes
     *        The type of memory that is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemoryType
     */

    public MemoryConfiguration withEnabledMemoryTypes(MemoryType... enabledMemoryTypes) {
        java.util.ArrayList<String> enabledMemoryTypesCopy = new java.util.ArrayList<String>(enabledMemoryTypes.length);
        for (MemoryType value : enabledMemoryTypes) {
            enabledMemoryTypesCopy.add(value.toString());
        }
        if (getEnabledMemoryTypes() == null) {
            setEnabledMemoryTypes(enabledMemoryTypesCopy);
        } else {
            getEnabledMemoryTypes().addAll(enabledMemoryTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The number of days the agent is configured to retain the conversational context.
     * </p>
     * 
     * @param storageDays
     *        The number of days the agent is configured to retain the conversational context.
     */

    public void setStorageDays(Integer storageDays) {
        this.storageDays = storageDays;
    }

    /**
     * <p>
     * The number of days the agent is configured to retain the conversational context.
     * </p>
     * 
     * @return The number of days the agent is configured to retain the conversational context.
     */

    public Integer getStorageDays() {
        return this.storageDays;
    }

    /**
     * <p>
     * The number of days the agent is configured to retain the conversational context.
     * </p>
     * 
     * @param storageDays
     *        The number of days the agent is configured to retain the conversational context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemoryConfiguration withStorageDays(Integer storageDays) {
        setStorageDays(storageDays);
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
        if (getEnabledMemoryTypes() != null)
            sb.append("EnabledMemoryTypes: ").append(getEnabledMemoryTypes()).append(",");
        if (getStorageDays() != null)
            sb.append("StorageDays: ").append(getStorageDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemoryConfiguration == false)
            return false;
        MemoryConfiguration other = (MemoryConfiguration) obj;
        if (other.getEnabledMemoryTypes() == null ^ this.getEnabledMemoryTypes() == null)
            return false;
        if (other.getEnabledMemoryTypes() != null && other.getEnabledMemoryTypes().equals(this.getEnabledMemoryTypes()) == false)
            return false;
        if (other.getStorageDays() == null ^ this.getStorageDays() == null)
            return false;
        if (other.getStorageDays() != null && other.getStorageDays().equals(this.getStorageDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabledMemoryTypes() == null) ? 0 : getEnabledMemoryTypes().hashCode());
        hashCode = prime * hashCode + ((getStorageDays() == null) ? 0 : getStorageDays().hashCode());
        return hashCode;
    }

    @Override
    public MemoryConfiguration clone() {
        try {
            return (MemoryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.MemoryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
