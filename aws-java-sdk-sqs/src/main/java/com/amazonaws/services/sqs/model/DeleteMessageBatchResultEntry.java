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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Encloses the <code>Id</code> of an entry in <code> <a>DeleteMessageBatch</a>.</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/DeleteMessageBatchResultEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMessageBatchResultEntry implements Serializable, Cloneable {

    /**
     * <p>
     * Represents a successfully deleted message.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Represents a successfully deleted message.
     * </p>
     * 
     * @param id
     *        Represents a successfully deleted message.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Represents a successfully deleted message.
     * </p>
     * 
     * @return Represents a successfully deleted message.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Represents a successfully deleted message.
     * </p>
     * 
     * @param id
     *        Represents a successfully deleted message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMessageBatchResultEntry withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMessageBatchResultEntry == false)
            return false;
        DeleteMessageBatchResultEntry other = (DeleteMessageBatchResultEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMessageBatchResultEntry clone() {
        try {
            return (DeleteMessageBatchResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
