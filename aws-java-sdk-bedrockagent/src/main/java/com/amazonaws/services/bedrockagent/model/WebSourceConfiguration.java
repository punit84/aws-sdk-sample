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
 * The configuration of the URL/URLs for the web content that you want to crawl. You should be authorized to crawl the
 * URLs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/WebSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of the URL/URLs.
     * </p>
     */
    private UrlConfiguration urlConfiguration;

    /**
     * <p>
     * The configuration of the URL/URLs.
     * </p>
     * 
     * @param urlConfiguration
     *        The configuration of the URL/URLs.
     */

    public void setUrlConfiguration(UrlConfiguration urlConfiguration) {
        this.urlConfiguration = urlConfiguration;
    }

    /**
     * <p>
     * The configuration of the URL/URLs.
     * </p>
     * 
     * @return The configuration of the URL/URLs.
     */

    public UrlConfiguration getUrlConfiguration() {
        return this.urlConfiguration;
    }

    /**
     * <p>
     * The configuration of the URL/URLs.
     * </p>
     * 
     * @param urlConfiguration
     *        The configuration of the URL/URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebSourceConfiguration withUrlConfiguration(UrlConfiguration urlConfiguration) {
        setUrlConfiguration(urlConfiguration);
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
        if (getUrlConfiguration() != null)
            sb.append("UrlConfiguration: ").append(getUrlConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebSourceConfiguration == false)
            return false;
        WebSourceConfiguration other = (WebSourceConfiguration) obj;
        if (other.getUrlConfiguration() == null ^ this.getUrlConfiguration() == null)
            return false;
        if (other.getUrlConfiguration() != null && other.getUrlConfiguration().equals(this.getUrlConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrlConfiguration() == null) ? 0 : getUrlConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public WebSourceConfiguration clone() {
        try {
            return (WebSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.WebSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
