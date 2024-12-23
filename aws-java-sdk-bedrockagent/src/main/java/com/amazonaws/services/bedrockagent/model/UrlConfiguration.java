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
 * The configuration of web URLs that you want to crawl. You should be authorized to crawl the URLs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UrlConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UrlConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more seed or starting point URLs.
     * </p>
     */
    private java.util.List<SeedUrl> seedUrls;

    /**
     * <p>
     * One or more seed or starting point URLs.
     * </p>
     * 
     * @return One or more seed or starting point URLs.
     */

    public java.util.List<SeedUrl> getSeedUrls() {
        return seedUrls;
    }

    /**
     * <p>
     * One or more seed or starting point URLs.
     * </p>
     * 
     * @param seedUrls
     *        One or more seed or starting point URLs.
     */

    public void setSeedUrls(java.util.Collection<SeedUrl> seedUrls) {
        if (seedUrls == null) {
            this.seedUrls = null;
            return;
        }

        this.seedUrls = new java.util.ArrayList<SeedUrl>(seedUrls);
    }

    /**
     * <p>
     * One or more seed or starting point URLs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSeedUrls(java.util.Collection)} or {@link #withSeedUrls(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param seedUrls
     *        One or more seed or starting point URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UrlConfiguration withSeedUrls(SeedUrl... seedUrls) {
        if (this.seedUrls == null) {
            setSeedUrls(new java.util.ArrayList<SeedUrl>(seedUrls.length));
        }
        for (SeedUrl ele : seedUrls) {
            this.seedUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more seed or starting point URLs.
     * </p>
     * 
     * @param seedUrls
     *        One or more seed or starting point URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UrlConfiguration withSeedUrls(java.util.Collection<SeedUrl> seedUrls) {
        setSeedUrls(seedUrls);
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
        if (getSeedUrls() != null)
            sb.append("SeedUrls: ").append(getSeedUrls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UrlConfiguration == false)
            return false;
        UrlConfiguration other = (UrlConfiguration) obj;
        if (other.getSeedUrls() == null ^ this.getSeedUrls() == null)
            return false;
        if (other.getSeedUrls() != null && other.getSeedUrls().equals(this.getSeedUrls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeedUrls() == null) ? 0 : getSeedUrls().hashCode());
        return hashCode;
    }

    @Override
    public UrlConfiguration clone() {
        try {
            return (UrlConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.UrlConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
