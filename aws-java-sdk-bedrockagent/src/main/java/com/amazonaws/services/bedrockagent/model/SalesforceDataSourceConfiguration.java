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
 * The configuration information to connect to Salesforce as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/SalesforceDataSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceDataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of the Salesforce content. For example, configuring specific types of Salesforce content.
     * </p>
     */
    private SalesforceCrawlerConfiguration crawlerConfiguration;
    /**
     * <p>
     * The endpoint information to connect to your Salesforce data source.
     * </p>
     */
    private SalesforceSourceConfiguration sourceConfiguration;

    /**
     * <p>
     * The configuration of the Salesforce content. For example, configuring specific types of Salesforce content.
     * </p>
     * 
     * @param crawlerConfiguration
     *        The configuration of the Salesforce content. For example, configuring specific types of Salesforce
     *        content.
     */

    public void setCrawlerConfiguration(SalesforceCrawlerConfiguration crawlerConfiguration) {
        this.crawlerConfiguration = crawlerConfiguration;
    }

    /**
     * <p>
     * The configuration of the Salesforce content. For example, configuring specific types of Salesforce content.
     * </p>
     * 
     * @return The configuration of the Salesforce content. For example, configuring specific types of Salesforce
     *         content.
     */

    public SalesforceCrawlerConfiguration getCrawlerConfiguration() {
        return this.crawlerConfiguration;
    }

    /**
     * <p>
     * The configuration of the Salesforce content. For example, configuring specific types of Salesforce content.
     * </p>
     * 
     * @param crawlerConfiguration
     *        The configuration of the Salesforce content. For example, configuring specific types of Salesforce
     *        content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceDataSourceConfiguration withCrawlerConfiguration(SalesforceCrawlerConfiguration crawlerConfiguration) {
        setCrawlerConfiguration(crawlerConfiguration);
        return this;
    }

    /**
     * <p>
     * The endpoint information to connect to your Salesforce data source.
     * </p>
     * 
     * @param sourceConfiguration
     *        The endpoint information to connect to your Salesforce data source.
     */

    public void setSourceConfiguration(SalesforceSourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * The endpoint information to connect to your Salesforce data source.
     * </p>
     * 
     * @return The endpoint information to connect to your Salesforce data source.
     */

    public SalesforceSourceConfiguration getSourceConfiguration() {
        return this.sourceConfiguration;
    }

    /**
     * <p>
     * The endpoint information to connect to your Salesforce data source.
     * </p>
     * 
     * @param sourceConfiguration
     *        The endpoint information to connect to your Salesforce data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceDataSourceConfiguration withSourceConfiguration(SalesforceSourceConfiguration sourceConfiguration) {
        setSourceConfiguration(sourceConfiguration);
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
        if (getCrawlerConfiguration() != null)
            sb.append("CrawlerConfiguration: ").append(getCrawlerConfiguration()).append(",");
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: ").append(getSourceConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceDataSourceConfiguration == false)
            return false;
        SalesforceDataSourceConfiguration other = (SalesforceDataSourceConfiguration) obj;
        if (other.getCrawlerConfiguration() == null ^ this.getCrawlerConfiguration() == null)
            return false;
        if (other.getCrawlerConfiguration() != null && other.getCrawlerConfiguration().equals(this.getCrawlerConfiguration()) == false)
            return false;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlerConfiguration() == null) ? 0 : getCrawlerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceDataSourceConfiguration clone() {
        try {
            return (SalesforceDataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.SalesforceDataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
