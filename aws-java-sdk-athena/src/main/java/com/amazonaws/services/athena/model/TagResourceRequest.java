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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the Athena resource (workgroup or data catalog) to which tags are to be added.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     * resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the ARN of the Athena resource (workgroup or data catalog) to which tags are to be added.
     * </p>
     * 
     * @param resourceARN
     *        Specifies the ARN of the Athena resource (workgroup or data catalog) to which tags are to be added.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Specifies the ARN of the Athena resource (workgroup or data catalog) to which tags are to be added.
     * </p>
     * 
     * @return Specifies the ARN of the Athena resource (workgroup or data catalog) to which tags are to be added.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * Specifies the ARN of the Athena resource (workgroup or data catalog) to which tags are to be added.
     * </p>
     * 
     * @param resourceARN
     *        Specifies the ARN of the Athena resource (workgroup or data catalog) to which tags are to be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     * resource.
     * </p>
     * 
     * @return A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     *         resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     * resource.
     * </p>
     * 
     * @param tags
     *        A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     *        resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     * resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     * resource.
     * </p>
     * 
     * @param tags
     *        A collection of one or more tags, separated by commas, to be added to an Athena workgroup or data catalog
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
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

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
