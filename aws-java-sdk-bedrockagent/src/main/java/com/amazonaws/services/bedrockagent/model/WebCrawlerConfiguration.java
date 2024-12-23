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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/WebCrawlerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebCrawlerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of crawl limits for the web URLs.
     * </p>
     */
    private WebCrawlerLimits crawlerLimits;
    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     */
    private java.util.List<String> exclusionFilters;
    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     */
    private java.util.List<String> inclusionFilters;
    /**
     * <p>
     * The scope of what is crawled for your URLs.
     * </p>
     * <p>
     * You can choose to crawl only web pages that belong to the same host or primary domain. For example, only web
     * pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You
     * can choose to include sub domains in addition to the host or primary domain. For example, web pages that contain
     * "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * </p>
     */
    private String scope;

    /**
     * <p>
     * The configuration of crawl limits for the web URLs.
     * </p>
     * 
     * @param crawlerLimits
     *        The configuration of crawl limits for the web URLs.
     */

    public void setCrawlerLimits(WebCrawlerLimits crawlerLimits) {
        this.crawlerLimits = crawlerLimits;
    }

    /**
     * <p>
     * The configuration of crawl limits for the web URLs.
     * </p>
     * 
     * @return The configuration of crawl limits for the web URLs.
     */

    public WebCrawlerLimits getCrawlerLimits() {
        return this.crawlerLimits;
    }

    /**
     * <p>
     * The configuration of crawl limits for the web URLs.
     * </p>
     * 
     * @param crawlerLimits
     *        The configuration of crawl limits for the web URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withCrawlerLimits(WebCrawlerLimits crawlerLimits) {
        setCrawlerLimits(crawlerLimits);
        return this;
    }

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     * 
     * @return A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an
     *         inclusion and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and
     *         the web content of the URL isn’t crawled.
     */

    public java.util.List<String> getExclusionFilters() {
        return exclusionFilters;
    }

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     * 
     * @param exclusionFilters
     *        A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an
     *        inclusion and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the
     *        web content of the URL isn’t crawled.
     */

    public void setExclusionFilters(java.util.Collection<String> exclusionFilters) {
        if (exclusionFilters == null) {
            this.exclusionFilters = null;
            return;
        }

        this.exclusionFilters = new java.util.ArrayList<String>(exclusionFilters);
    }

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionFilters(java.util.Collection)} or {@link #withExclusionFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exclusionFilters
     *        A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an
     *        inclusion and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the
     *        web content of the URL isn’t crawled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withExclusionFilters(String... exclusionFilters) {
        if (this.exclusionFilters == null) {
            setExclusionFilters(new java.util.ArrayList<String>(exclusionFilters.length));
        }
        for (String ele : exclusionFilters) {
            this.exclusionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     * 
     * @param exclusionFilters
     *        A list of one or more exclusion regular expression patterns to exclude certain URLs. If you specify an
     *        inclusion and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the
     *        web content of the URL isn’t crawled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withExclusionFilters(java.util.Collection<String> exclusionFilters) {
        setExclusionFilters(exclusionFilters);
        return this;
    }

    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     * 
     * @return A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an
     *         inclusion and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and
     *         the web content of the URL isn’t crawled.
     */

    public java.util.List<String> getInclusionFilters() {
        return inclusionFilters;
    }

    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     * 
     * @param inclusionFilters
     *        A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an
     *        inclusion and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the
     *        web content of the URL isn’t crawled.
     */

    public void setInclusionFilters(java.util.Collection<String> inclusionFilters) {
        if (inclusionFilters == null) {
            this.inclusionFilters = null;
            return;
        }

        this.inclusionFilters = new java.util.ArrayList<String>(inclusionFilters);
    }

    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionFilters(java.util.Collection)} or {@link #withInclusionFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inclusionFilters
     *        A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an
     *        inclusion and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the
     *        web content of the URL isn’t crawled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withInclusionFilters(String... inclusionFilters) {
        if (this.inclusionFilters == null) {
            setInclusionFilters(new java.util.ArrayList<String>(inclusionFilters.length));
        }
        for (String ele : inclusionFilters) {
            this.inclusionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an inclusion
     * and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the web content of
     * the URL isn’t crawled.
     * </p>
     * 
     * @param inclusionFilters
     *        A list of one or more inclusion regular expression patterns to include certain URLs. If you specify an
     *        inclusion and exclusion filter/pattern and both match a URL, the exclusion filter takes precedence and the
     *        web content of the URL isn’t crawled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withInclusionFilters(java.util.Collection<String> inclusionFilters) {
        setInclusionFilters(inclusionFilters);
        return this;
    }

    /**
     * <p>
     * The scope of what is crawled for your URLs.
     * </p>
     * <p>
     * You can choose to crawl only web pages that belong to the same host or primary domain. For example, only web
     * pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You
     * can choose to include sub domains in addition to the host or primary domain. For example, web pages that contain
     * "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * </p>
     * 
     * @param scope
     *        The scope of what is crawled for your URLs.</p>
     *        <p>
     *        You can choose to crawl only web pages that belong to the same host or primary domain. For example, only
     *        web pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other
     *        domains. You can choose to include sub domains in addition to the host or primary domain. For example, web
     *        pages that contain "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * @see WebScopeType
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope of what is crawled for your URLs.
     * </p>
     * <p>
     * You can choose to crawl only web pages that belong to the same host or primary domain. For example, only web
     * pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You
     * can choose to include sub domains in addition to the host or primary domain. For example, web pages that contain
     * "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * </p>
     * 
     * @return The scope of what is crawled for your URLs.</p>
     *         <p>
     *         You can choose to crawl only web pages that belong to the same host or primary domain. For example, only
     *         web pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other
     *         domains. You can choose to include sub domains in addition to the host or primary domain. For example,
     *         web pages that contain "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * @see WebScopeType
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope of what is crawled for your URLs.
     * </p>
     * <p>
     * You can choose to crawl only web pages that belong to the same host or primary domain. For example, only web
     * pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You
     * can choose to include sub domains in addition to the host or primary domain. For example, web pages that contain
     * "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * </p>
     * 
     * @param scope
     *        The scope of what is crawled for your URLs.</p>
     *        <p>
     *        You can choose to crawl only web pages that belong to the same host or primary domain. For example, only
     *        web pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other
     *        domains. You can choose to include sub domains in addition to the host or primary domain. For example, web
     *        pages that contain "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebScopeType
     */

    public WebCrawlerConfiguration withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The scope of what is crawled for your URLs.
     * </p>
     * <p>
     * You can choose to crawl only web pages that belong to the same host or primary domain. For example, only web
     * pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You
     * can choose to include sub domains in addition to the host or primary domain. For example, web pages that contain
     * "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * </p>
     * 
     * @param scope
     *        The scope of what is crawled for your URLs.</p>
     *        <p>
     *        You can choose to crawl only web pages that belong to the same host or primary domain. For example, only
     *        web pages that contain the seed URL "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other
     *        domains. You can choose to include sub domains in addition to the host or primary domain. For example, web
     *        pages that contain "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebScopeType
     */

    public WebCrawlerConfiguration withScope(WebScopeType scope) {
        this.scope = scope.toString();
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
        if (getCrawlerLimits() != null)
            sb.append("CrawlerLimits: ").append(getCrawlerLimits()).append(",");
        if (getExclusionFilters() != null)
            sb.append("ExclusionFilters: ").append("***Sensitive Data Redacted***").append(",");
        if (getInclusionFilters() != null)
            sb.append("InclusionFilters: ").append("***Sensitive Data Redacted***").append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebCrawlerConfiguration == false)
            return false;
        WebCrawlerConfiguration other = (WebCrawlerConfiguration) obj;
        if (other.getCrawlerLimits() == null ^ this.getCrawlerLimits() == null)
            return false;
        if (other.getCrawlerLimits() != null && other.getCrawlerLimits().equals(this.getCrawlerLimits()) == false)
            return false;
        if (other.getExclusionFilters() == null ^ this.getExclusionFilters() == null)
            return false;
        if (other.getExclusionFilters() != null && other.getExclusionFilters().equals(this.getExclusionFilters()) == false)
            return false;
        if (other.getInclusionFilters() == null ^ this.getInclusionFilters() == null)
            return false;
        if (other.getInclusionFilters() != null && other.getInclusionFilters().equals(this.getInclusionFilters()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlerLimits() == null) ? 0 : getCrawlerLimits().hashCode());
        hashCode = prime * hashCode + ((getExclusionFilters() == null) ? 0 : getExclusionFilters().hashCode());
        hashCode = prime * hashCode + ((getInclusionFilters() == null) ? 0 : getInclusionFilters().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public WebCrawlerConfiguration clone() {
        try {
            return (WebCrawlerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.WebCrawlerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
