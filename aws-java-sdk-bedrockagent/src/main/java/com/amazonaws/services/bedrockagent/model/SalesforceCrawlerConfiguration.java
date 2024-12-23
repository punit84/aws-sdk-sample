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
 * The configuration of the Salesforce content. For example, configuring specific types of Salesforce content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/SalesforceCrawlerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceCrawlerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of filtering the Salesforce content. For example, configuring regular expression patterns to
     * include or exclude certain content.
     * </p>
     */
    private CrawlFilterConfiguration filterConfiguration;

    /**
     * <p>
     * The configuration of filtering the Salesforce content. For example, configuring regular expression patterns to
     * include or exclude certain content.
     * </p>
     * 
     * @param filterConfiguration
     *        The configuration of filtering the Salesforce content. For example, configuring regular expression
     *        patterns to include or exclude certain content.
     */

    public void setFilterConfiguration(CrawlFilterConfiguration filterConfiguration) {
        this.filterConfiguration = filterConfiguration;
    }

    /**
     * <p>
     * The configuration of filtering the Salesforce content. For example, configuring regular expression patterns to
     * include or exclude certain content.
     * </p>
     * 
     * @return The configuration of filtering the Salesforce content. For example, configuring regular expression
     *         patterns to include or exclude certain content.
     */

    public CrawlFilterConfiguration getFilterConfiguration() {
        return this.filterConfiguration;
    }

    /**
     * <p>
     * The configuration of filtering the Salesforce content. For example, configuring regular expression patterns to
     * include or exclude certain content.
     * </p>
     * 
     * @param filterConfiguration
     *        The configuration of filtering the Salesforce content. For example, configuring regular expression
     *        patterns to include or exclude certain content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceCrawlerConfiguration withFilterConfiguration(CrawlFilterConfiguration filterConfiguration) {
        setFilterConfiguration(filterConfiguration);
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
        if (getFilterConfiguration() != null)
            sb.append("FilterConfiguration: ").append(getFilterConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceCrawlerConfiguration == false)
            return false;
        SalesforceCrawlerConfiguration other = (SalesforceCrawlerConfiguration) obj;
        if (other.getFilterConfiguration() == null ^ this.getFilterConfiguration() == null)
            return false;
        if (other.getFilterConfiguration() != null && other.getFilterConfiguration().equals(this.getFilterConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterConfiguration() == null) ? 0 : getFilterConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceCrawlerConfiguration clone() {
        try {
            return (SalesforceCrawlerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.SalesforceCrawlerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
