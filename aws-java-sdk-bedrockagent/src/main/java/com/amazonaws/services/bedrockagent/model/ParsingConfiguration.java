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
 * Settings for parsing document contents. By default, the service converts the contents of each document into text
 * before splitting it into chunks. To improve processing of PDF files with tables and images, you can configure the
 * data source to convert the pages of text into images and use a model to describe the contents of each page.
 * </p>
 * <p>
 * To use a model to parse PDF documents, set the parsing strategy to <code>BEDROCK_FOUNDATION_MODEL</code> and specify
 * the model to use by ARN. You can also override the default parsing prompt with instructions for how to interpret
 * images and tables in your documents. The following models are supported.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Anthropic Claude 3 Sonnet - <code>anthropic.claude-3-sonnet-20240229-v1:0</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Anthropic Claude 3 Haiku - <code>anthropic.claude-3-haiku-20240307-v1:0</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can get the ARN of a model with the action. Standard model usage charges apply for the foundation model parsing
 * strategy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ParsingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParsingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Settings for a foundation model used to parse documents for a data source.
     * </p>
     */
    private BedrockFoundationModelConfiguration bedrockFoundationModelConfiguration;
    /**
     * <p>
     * The parsing strategy for the data source.
     * </p>
     */
    private String parsingStrategy;

    /**
     * <p>
     * Settings for a foundation model used to parse documents for a data source.
     * </p>
     * 
     * @param bedrockFoundationModelConfiguration
     *        Settings for a foundation model used to parse documents for a data source.
     */

    public void setBedrockFoundationModelConfiguration(BedrockFoundationModelConfiguration bedrockFoundationModelConfiguration) {
        this.bedrockFoundationModelConfiguration = bedrockFoundationModelConfiguration;
    }

    /**
     * <p>
     * Settings for a foundation model used to parse documents for a data source.
     * </p>
     * 
     * @return Settings for a foundation model used to parse documents for a data source.
     */

    public BedrockFoundationModelConfiguration getBedrockFoundationModelConfiguration() {
        return this.bedrockFoundationModelConfiguration;
    }

    /**
     * <p>
     * Settings for a foundation model used to parse documents for a data source.
     * </p>
     * 
     * @param bedrockFoundationModelConfiguration
     *        Settings for a foundation model used to parse documents for a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParsingConfiguration withBedrockFoundationModelConfiguration(BedrockFoundationModelConfiguration bedrockFoundationModelConfiguration) {
        setBedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration);
        return this;
    }

    /**
     * <p>
     * The parsing strategy for the data source.
     * </p>
     * 
     * @param parsingStrategy
     *        The parsing strategy for the data source.
     * @see ParsingStrategy
     */

    public void setParsingStrategy(String parsingStrategy) {
        this.parsingStrategy = parsingStrategy;
    }

    /**
     * <p>
     * The parsing strategy for the data source.
     * </p>
     * 
     * @return The parsing strategy for the data source.
     * @see ParsingStrategy
     */

    public String getParsingStrategy() {
        return this.parsingStrategy;
    }

    /**
     * <p>
     * The parsing strategy for the data source.
     * </p>
     * 
     * @param parsingStrategy
     *        The parsing strategy for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParsingStrategy
     */

    public ParsingConfiguration withParsingStrategy(String parsingStrategy) {
        setParsingStrategy(parsingStrategy);
        return this;
    }

    /**
     * <p>
     * The parsing strategy for the data source.
     * </p>
     * 
     * @param parsingStrategy
     *        The parsing strategy for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParsingStrategy
     */

    public ParsingConfiguration withParsingStrategy(ParsingStrategy parsingStrategy) {
        this.parsingStrategy = parsingStrategy.toString();
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
        if (getBedrockFoundationModelConfiguration() != null)
            sb.append("BedrockFoundationModelConfiguration: ").append(getBedrockFoundationModelConfiguration()).append(",");
        if (getParsingStrategy() != null)
            sb.append("ParsingStrategy: ").append(getParsingStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParsingConfiguration == false)
            return false;
        ParsingConfiguration other = (ParsingConfiguration) obj;
        if (other.getBedrockFoundationModelConfiguration() == null ^ this.getBedrockFoundationModelConfiguration() == null)
            return false;
        if (other.getBedrockFoundationModelConfiguration() != null
                && other.getBedrockFoundationModelConfiguration().equals(this.getBedrockFoundationModelConfiguration()) == false)
            return false;
        if (other.getParsingStrategy() == null ^ this.getParsingStrategy() == null)
            return false;
        if (other.getParsingStrategy() != null && other.getParsingStrategy().equals(this.getParsingStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBedrockFoundationModelConfiguration() == null) ? 0 : getBedrockFoundationModelConfiguration().hashCode());
        hashCode = prime * hashCode + ((getParsingStrategy() == null) ? 0 : getParsingStrategy().hashCode());
        return hashCode;
    }

    @Override
    public ParsingConfiguration clone() {
        try {
            return (ParsingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.ParsingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
