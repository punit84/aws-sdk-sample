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
 * The connection configuration for the data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DataSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration information to connect to Confluence as your data source.
     * </p>
     * <note>
     * <p>
     * Confluence data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     */
    private ConfluenceDataSourceConfiguration confluenceConfiguration;
    /**
     * <p>
     * The configuration information to connect to Amazon S3 as your data source.
     * </p>
     */
    private S3DataSourceConfiguration s3Configuration;
    /**
     * <p>
     * The configuration information to connect to Salesforce as your data source.
     * </p>
     * <note>
     * <p>
     * Salesforce data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     */
    private SalesforceDataSourceConfiguration salesforceConfiguration;
    /**
     * <p>
     * The configuration information to connect to SharePoint as your data source.
     * </p>
     * <note>
     * <p>
     * SharePoint data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     */
    private SharePointDataSourceConfiguration sharePointConfiguration;
    /**
     * <p>
     * The type of data source.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The configuration of web URLs to crawl for your data source. You should be authorized to crawl the URLs.
     * </p>
     * <note>
     * <p>
     * Crawling web URLs as your data source is in preview release and is subject to change.
     * </p>
     * </note>
     */
    private WebDataSourceConfiguration webConfiguration;

    /**
     * <p>
     * The configuration information to connect to Confluence as your data source.
     * </p>
     * <note>
     * <p>
     * Confluence data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @param confluenceConfiguration
     *        The configuration information to connect to Confluence as your data source.</p> <note>
     *        <p>
     *        Confluence data source connector is in preview release and is subject to change.
     *        </p>
     */

    public void setConfluenceConfiguration(ConfluenceDataSourceConfiguration confluenceConfiguration) {
        this.confluenceConfiguration = confluenceConfiguration;
    }

    /**
     * <p>
     * The configuration information to connect to Confluence as your data source.
     * </p>
     * <note>
     * <p>
     * Confluence data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @return The configuration information to connect to Confluence as your data source.</p> <note>
     *         <p>
     *         Confluence data source connector is in preview release and is subject to change.
     *         </p>
     */

    public ConfluenceDataSourceConfiguration getConfluenceConfiguration() {
        return this.confluenceConfiguration;
    }

    /**
     * <p>
     * The configuration information to connect to Confluence as your data source.
     * </p>
     * <note>
     * <p>
     * Confluence data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @param confluenceConfiguration
     *        The configuration information to connect to Confluence as your data source.</p> <note>
     *        <p>
     *        Confluence data source connector is in preview release and is subject to change.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withConfluenceConfiguration(ConfluenceDataSourceConfiguration confluenceConfiguration) {
        setConfluenceConfiguration(confluenceConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration information to connect to Amazon S3 as your data source.
     * </p>
     * 
     * @param s3Configuration
     *        The configuration information to connect to Amazon S3 as your data source.
     */

    public void setS3Configuration(S3DataSourceConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * The configuration information to connect to Amazon S3 as your data source.
     * </p>
     * 
     * @return The configuration information to connect to Amazon S3 as your data source.
     */

    public S3DataSourceConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * The configuration information to connect to Amazon S3 as your data source.
     * </p>
     * 
     * @param s3Configuration
     *        The configuration information to connect to Amazon S3 as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withS3Configuration(S3DataSourceConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * The configuration information to connect to Salesforce as your data source.
     * </p>
     * <note>
     * <p>
     * Salesforce data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @param salesforceConfiguration
     *        The configuration information to connect to Salesforce as your data source.</p> <note>
     *        <p>
     *        Salesforce data source connector is in preview release and is subject to change.
     *        </p>
     */

    public void setSalesforceConfiguration(SalesforceDataSourceConfiguration salesforceConfiguration) {
        this.salesforceConfiguration = salesforceConfiguration;
    }

    /**
     * <p>
     * The configuration information to connect to Salesforce as your data source.
     * </p>
     * <note>
     * <p>
     * Salesforce data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @return The configuration information to connect to Salesforce as your data source.</p> <note>
     *         <p>
     *         Salesforce data source connector is in preview release and is subject to change.
     *         </p>
     */

    public SalesforceDataSourceConfiguration getSalesforceConfiguration() {
        return this.salesforceConfiguration;
    }

    /**
     * <p>
     * The configuration information to connect to Salesforce as your data source.
     * </p>
     * <note>
     * <p>
     * Salesforce data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @param salesforceConfiguration
     *        The configuration information to connect to Salesforce as your data source.</p> <note>
     *        <p>
     *        Salesforce data source connector is in preview release and is subject to change.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withSalesforceConfiguration(SalesforceDataSourceConfiguration salesforceConfiguration) {
        setSalesforceConfiguration(salesforceConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration information to connect to SharePoint as your data source.
     * </p>
     * <note>
     * <p>
     * SharePoint data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @param sharePointConfiguration
     *        The configuration information to connect to SharePoint as your data source.</p> <note>
     *        <p>
     *        SharePoint data source connector is in preview release and is subject to change.
     *        </p>
     */

    public void setSharePointConfiguration(SharePointDataSourceConfiguration sharePointConfiguration) {
        this.sharePointConfiguration = sharePointConfiguration;
    }

    /**
     * <p>
     * The configuration information to connect to SharePoint as your data source.
     * </p>
     * <note>
     * <p>
     * SharePoint data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @return The configuration information to connect to SharePoint as your data source.</p> <note>
     *         <p>
     *         SharePoint data source connector is in preview release and is subject to change.
     *         </p>
     */

    public SharePointDataSourceConfiguration getSharePointConfiguration() {
        return this.sharePointConfiguration;
    }

    /**
     * <p>
     * The configuration information to connect to SharePoint as your data source.
     * </p>
     * <note>
     * <p>
     * SharePoint data source connector is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @param sharePointConfiguration
     *        The configuration information to connect to SharePoint as your data source.</p> <note>
     *        <p>
     *        SharePoint data source connector is in preview release and is subject to change.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withSharePointConfiguration(SharePointDataSourceConfiguration sharePointConfiguration) {
        setSharePointConfiguration(sharePointConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of data source.
     * </p>
     * 
     * @param type
     *        The type of data source.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data source.
     * </p>
     * 
     * @return The type of data source.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data source.
     * </p>
     * 
     * @param type
     *        The type of data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSourceConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data source.
     * </p>
     * 
     * @param type
     *        The type of data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSourceConfiguration withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The configuration of web URLs to crawl for your data source. You should be authorized to crawl the URLs.
     * </p>
     * <note>
     * <p>
     * Crawling web URLs as your data source is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @param webConfiguration
     *        The configuration of web URLs to crawl for your data source. You should be authorized to crawl the
     *        URLs.</p> <note>
     *        <p>
     *        Crawling web URLs as your data source is in preview release and is subject to change.
     *        </p>
     */

    public void setWebConfiguration(WebDataSourceConfiguration webConfiguration) {
        this.webConfiguration = webConfiguration;
    }

    /**
     * <p>
     * The configuration of web URLs to crawl for your data source. You should be authorized to crawl the URLs.
     * </p>
     * <note>
     * <p>
     * Crawling web URLs as your data source is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @return The configuration of web URLs to crawl for your data source. You should be authorized to crawl the
     *         URLs.</p> <note>
     *         <p>
     *         Crawling web URLs as your data source is in preview release and is subject to change.
     *         </p>
     */

    public WebDataSourceConfiguration getWebConfiguration() {
        return this.webConfiguration;
    }

    /**
     * <p>
     * The configuration of web URLs to crawl for your data source. You should be authorized to crawl the URLs.
     * </p>
     * <note>
     * <p>
     * Crawling web URLs as your data source is in preview release and is subject to change.
     * </p>
     * </note>
     * 
     * @param webConfiguration
     *        The configuration of web URLs to crawl for your data source. You should be authorized to crawl the
     *        URLs.</p> <note>
     *        <p>
     *        Crawling web URLs as your data source is in preview release and is subject to change.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withWebConfiguration(WebDataSourceConfiguration webConfiguration) {
        setWebConfiguration(webConfiguration);
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
        if (getConfluenceConfiguration() != null)
            sb.append("ConfluenceConfiguration: ").append(getConfluenceConfiguration()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getSalesforceConfiguration() != null)
            sb.append("SalesforceConfiguration: ").append(getSalesforceConfiguration()).append(",");
        if (getSharePointConfiguration() != null)
            sb.append("SharePointConfiguration: ").append(getSharePointConfiguration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getWebConfiguration() != null)
            sb.append("WebConfiguration: ").append(getWebConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;
        if (other.getConfluenceConfiguration() == null ^ this.getConfluenceConfiguration() == null)
            return false;
        if (other.getConfluenceConfiguration() != null && other.getConfluenceConfiguration().equals(this.getConfluenceConfiguration()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getSalesforceConfiguration() == null ^ this.getSalesforceConfiguration() == null)
            return false;
        if (other.getSalesforceConfiguration() != null && other.getSalesforceConfiguration().equals(this.getSalesforceConfiguration()) == false)
            return false;
        if (other.getSharePointConfiguration() == null ^ this.getSharePointConfiguration() == null)
            return false;
        if (other.getSharePointConfiguration() != null && other.getSharePointConfiguration().equals(this.getSharePointConfiguration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getWebConfiguration() == null ^ this.getWebConfiguration() == null)
            return false;
        if (other.getWebConfiguration() != null && other.getWebConfiguration().equals(this.getWebConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfluenceConfiguration() == null) ? 0 : getConfluenceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getSalesforceConfiguration() == null) ? 0 : getSalesforceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSharePointConfiguration() == null) ? 0 : getSharePointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getWebConfiguration() == null) ? 0 : getWebConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfiguration clone() {
        try {
            return (DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
