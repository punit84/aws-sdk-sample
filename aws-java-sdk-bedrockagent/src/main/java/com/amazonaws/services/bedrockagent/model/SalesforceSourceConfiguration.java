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
 * The endpoint information to connect to your Salesforce data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/SalesforceSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Salesforce instance.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector"
     * >Salesforce connection configuration</a>.
     * </p>
     */
    private String credentialsSecretArn;
    /**
     * <p>
     * The Salesforce host URL or instance URL.
     * </p>
     */
    private String hostUrl;

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Salesforce instance.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your Salesforce instance.
     * @see SalesforceAuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Salesforce instance.
     * </p>
     * 
     * @return The supported authentication type to authenticate and connect to your Salesforce instance.
     * @see SalesforceAuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Salesforce instance.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your Salesforce instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceAuthType
     */

    public SalesforceSourceConfiguration withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Salesforce instance.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your Salesforce instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceAuthType
     */

    public SalesforceSourceConfiguration withAuthType(SalesforceAuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector"
     * >Salesforce connection configuration</a>.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     *        SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     *        depending on your authentication type, see <a href=
     *        "https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector"
     *        >Salesforce connection configuration</a>.
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector"
     * >Salesforce connection configuration</a>.
     * </p>
     * 
     * @return The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for
     *         your SharePoint site/sites. For more information on the key-value pairs that must be included in your
     *         secret, depending on your authentication type, see <a href=
     *         "https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector"
     *         >Salesforce connection configuration</a>.
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector"
     * >Salesforce connection configuration</a>.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     *        SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     *        depending on your authentication type, see <a href=
     *        "https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector"
     *        >Salesforce connection configuration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceSourceConfiguration withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
        return this;
    }

    /**
     * <p>
     * The Salesforce host URL or instance URL.
     * </p>
     * 
     * @param hostUrl
     *        The Salesforce host URL or instance URL.
     */

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    /**
     * <p>
     * The Salesforce host URL or instance URL.
     * </p>
     * 
     * @return The Salesforce host URL or instance URL.
     */

    public String getHostUrl() {
        return this.hostUrl;
    }

    /**
     * <p>
     * The Salesforce host URL or instance URL.
     * </p>
     * 
     * @param hostUrl
     *        The Salesforce host URL or instance URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceSourceConfiguration withHostUrl(String hostUrl) {
        setHostUrl(hostUrl);
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
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getCredentialsSecretArn() != null)
            sb.append("CredentialsSecretArn: ").append(getCredentialsSecretArn()).append(",");
        if (getHostUrl() != null)
            sb.append("HostUrl: ").append(getHostUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceSourceConfiguration == false)
            return false;
        SalesforceSourceConfiguration other = (SalesforceSourceConfiguration) obj;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        if (other.getHostUrl() == null ^ this.getHostUrl() == null)
            return false;
        if (other.getHostUrl() != null && other.getHostUrl().equals(this.getHostUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getCredentialsSecretArn() == null) ? 0 : getCredentialsSecretArn().hashCode());
        hashCode = prime * hashCode + ((getHostUrl() == null) ? 0 : getHostUrl().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceSourceConfiguration clone() {
        try {
            return (SalesforceSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.SalesforceSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
