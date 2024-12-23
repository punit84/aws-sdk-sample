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
 * Contains configurations for a Lex node in the flow. You specify a Amazon Lex bot to invoke. This node takes an
 * utterance as the input and returns as the output the intent identified by the Amazon Lex bot. For more information,
 * see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html">Node types in Amazon Bedrock
 * works</a> in the Amazon Bedrock User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/LexFlowNodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LexFlowNodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     * </p>
     */
    private String botAliasArn;
    /**
     * <p>
     * The Region to invoke the Amazon Lex bot in.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     * </p>
     * 
     * @param botAliasArn
     *        The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     */

    public void setBotAliasArn(String botAliasArn) {
        this.botAliasArn = botAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     */

    public String getBotAliasArn() {
        return this.botAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     * </p>
     * 
     * @param botAliasArn
     *        The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexFlowNodeConfiguration withBotAliasArn(String botAliasArn) {
        setBotAliasArn(botAliasArn);
        return this;
    }

    /**
     * <p>
     * The Region to invoke the Amazon Lex bot in.
     * </p>
     * 
     * @param localeId
     *        The Region to invoke the Amazon Lex bot in.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The Region to invoke the Amazon Lex bot in.
     * </p>
     * 
     * @return The Region to invoke the Amazon Lex bot in.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The Region to invoke the Amazon Lex bot in.
     * </p>
     * 
     * @param localeId
     *        The Region to invoke the Amazon Lex bot in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexFlowNodeConfiguration withLocaleId(String localeId) {
        setLocaleId(localeId);
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
        if (getBotAliasArn() != null)
            sb.append("BotAliasArn: ").append(getBotAliasArn()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexFlowNodeConfiguration == false)
            return false;
        LexFlowNodeConfiguration other = (LexFlowNodeConfiguration) obj;
        if (other.getBotAliasArn() == null ^ this.getBotAliasArn() == null)
            return false;
        if (other.getBotAliasArn() != null && other.getBotAliasArn().equals(this.getBotAliasArn()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotAliasArn() == null) ? 0 : getBotAliasArn().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public LexFlowNodeConfiguration clone() {
        try {
            return (LexFlowNodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.LexFlowNodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
