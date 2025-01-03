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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeletePrompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePromptResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the prompt that was deleted.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version of the prompt that was deleted.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The unique identifier of the prompt that was deleted.
     * </p>
     * 
     * @param id
     *        The unique identifier of the prompt that was deleted.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the prompt that was deleted.
     * </p>
     * 
     * @return The unique identifier of the prompt that was deleted.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the prompt that was deleted.
     * </p>
     * 
     * @param id
     *        The unique identifier of the prompt that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePromptResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version of the prompt that was deleted.
     * </p>
     * 
     * @param version
     *        The version of the prompt that was deleted.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the prompt that was deleted.
     * </p>
     * 
     * @return The version of the prompt that was deleted.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the prompt that was deleted.
     * </p>
     * 
     * @param version
     *        The version of the prompt that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePromptResult withVersion(String version) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof DeletePromptResult == false)
            return false;
        DeletePromptResult other = (DeletePromptResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeletePromptResult clone() {
        try {
            return (DeletePromptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
