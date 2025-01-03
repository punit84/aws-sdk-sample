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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A label that you assign to a resource. In Athena, a resource can be a workgroup or data catalog. Each tag consists of
 * a key and an optional value, both of which you define. For example, you can use tags to categorize Athena workgroups
 * or data catalogs by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and
 * filter workgroups or data catalogs in your account. For best practices, see <a
 * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">Tagging Best Practices</a>. Tag keys
 * can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters. Tags can
 * use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values
 * are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate them by commas.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A tag key. The tag key length is from 1 to 128 Unicode characters in UTF-8. You can use letters and numbers
     * representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys are case-sensitive and must be
     * unique per resource.
     * </p>
     */
    private String key;
    /**
     * <p>
     * A tag value. The tag value length is from 0 to 256 Unicode characters in UTF-8. You can use letters and numbers
     * representable in UTF-8, and the following characters: + - = . _ : / @. Tag values are case-sensitive.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A tag key. The tag key length is from 1 to 128 Unicode characters in UTF-8. You can use letters and numbers
     * representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys are case-sensitive and must be
     * unique per resource.
     * </p>
     * 
     * @param key
     *        A tag key. The tag key length is from 1 to 128 Unicode characters in UTF-8. You can use letters and
     *        numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys are case-sensitive
     *        and must be unique per resource.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * A tag key. The tag key length is from 1 to 128 Unicode characters in UTF-8. You can use letters and numbers
     * representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys are case-sensitive and must be
     * unique per resource.
     * </p>
     * 
     * @return A tag key. The tag key length is from 1 to 128 Unicode characters in UTF-8. You can use letters and
     *         numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys are
     *         case-sensitive and must be unique per resource.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * A tag key. The tag key length is from 1 to 128 Unicode characters in UTF-8. You can use letters and numbers
     * representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys are case-sensitive and must be
     * unique per resource.
     * </p>
     * 
     * @param key
     *        A tag key. The tag key length is from 1 to 128 Unicode characters in UTF-8. You can use letters and
     *        numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys are case-sensitive
     *        and must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * A tag value. The tag value length is from 0 to 256 Unicode characters in UTF-8. You can use letters and numbers
     * representable in UTF-8, and the following characters: + - = . _ : / @. Tag values are case-sensitive.
     * </p>
     * 
     * @param value
     *        A tag value. The tag value length is from 0 to 256 Unicode characters in UTF-8. You can use letters and
     *        numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag values are
     *        case-sensitive.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A tag value. The tag value length is from 0 to 256 Unicode characters in UTF-8. You can use letters and numbers
     * representable in UTF-8, and the following characters: + - = . _ : / @. Tag values are case-sensitive.
     * </p>
     * 
     * @return A tag value. The tag value length is from 0 to 256 Unicode characters in UTF-8. You can use letters and
     *         numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag values are
     *         case-sensitive.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A tag value. The tag value length is from 0 to 256 Unicode characters in UTF-8. You can use letters and numbers
     * representable in UTF-8, and the following characters: + - = . _ : / @. Tag values are case-sensitive.
     * </p>
     * 
     * @param value
     *        A tag value. The tag value length is from 0 to 256 Unicode characters in UTF-8. You can use letters and
     *        numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag values are
     *        case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
