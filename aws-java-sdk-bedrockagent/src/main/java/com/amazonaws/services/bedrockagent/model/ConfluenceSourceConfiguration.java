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
 * The endpoint information to connect to your Confluence data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ConfluenceSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluenceSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Confluence instance.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector"
     * >Confluence connection configuration</a>.
     * </p>
     */
    private String credentialsSecretArn;
    /**
     * <p>
     * The supported host type, whether online/cloud or server/on-premises.
     * </p>
     */
    private String hostType;
    /**
     * <p>
     * The Confluence host URL or instance URL.
     * </p>
     */
    private String hostUrl;

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Confluence instance.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your Confluence instance.
     * @see ConfluenceAuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Confluence instance.
     * </p>
     * 
     * @return The supported authentication type to authenticate and connect to your Confluence instance.
     * @see ConfluenceAuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Confluence instance.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your Confluence instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfluenceAuthType
     */

    public ConfluenceSourceConfiguration withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your Confluence instance.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your Confluence instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfluenceAuthType
     */

    public ConfluenceSourceConfiguration withAuthType(ConfluenceAuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector"
     * >Confluence connection configuration</a>.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     *        SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     *        depending on your authentication type, see <a href=
     *        "https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector"
     *        >Confluence connection configuration</a>.
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector"
     * >Confluence connection configuration</a>.
     * </p>
     * 
     * @return The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for
     *         your SharePoint site/sites. For more information on the key-value pairs that must be included in your
     *         secret, depending on your authentication type, see <a href=
     *         "https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector"
     *         >Confluence connection configuration</a>.
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector"
     * >Confluence connection configuration</a>.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     *        SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     *        depending on your authentication type, see <a href=
     *        "https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector"
     *        >Confluence connection configuration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSourceConfiguration withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
        return this;
    }

    /**
     * <p>
     * The supported host type, whether online/cloud or server/on-premises.
     * </p>
     * 
     * @param hostType
     *        The supported host type, whether online/cloud or server/on-premises.
     * @see ConfluenceHostType
     */

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    /**
     * <p>
     * The supported host type, whether online/cloud or server/on-premises.
     * </p>
     * 
     * @return The supported host type, whether online/cloud or server/on-premises.
     * @see ConfluenceHostType
     */

    public String getHostType() {
        return this.hostType;
    }

    /**
     * <p>
     * The supported host type, whether online/cloud or server/on-premises.
     * </p>
     * 
     * @param hostType
     *        The supported host type, whether online/cloud or server/on-premises.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfluenceHostType
     */

    public ConfluenceSourceConfiguration withHostType(String hostType) {
        setHostType(hostType);
        return this;
    }

    /**
     * <p>
     * The supported host type, whether online/cloud or server/on-premises.
     * </p>
     * 
     * @param hostType
     *        The supported host type, whether online/cloud or server/on-premises.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfluenceHostType
     */

    public ConfluenceSourceConfiguration withHostType(ConfluenceHostType hostType) {
        this.hostType = hostType.toString();
        return this;
    }

    /**
     * <p>
     * The Confluence host URL or instance URL.
     * </p>
     * 
     * @param hostUrl
     *        The Confluence host URL or instance URL.
     */

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    /**
     * <p>
     * The Confluence host URL or instance URL.
     * </p>
     * 
     * @return The Confluence host URL or instance URL.
     */

    public String getHostUrl() {
        return this.hostUrl;
    }

    /**
     * <p>
     * The Confluence host URL or instance URL.
     * </p>
     * 
     * @param hostUrl
     *        The Confluence host URL or instance URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfluenceSourceConfiguration withHostUrl(String hostUrl) {
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
        if (getHostType() != null)
            sb.append("HostType: ").append(getHostType()).append(",");
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

        if (obj instanceof ConfluenceSourceConfiguration == false)
            return false;
        ConfluenceSourceConfiguration other = (ConfluenceSourceConfiguration) obj;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        if (other.getHostType() == null ^ this.getHostType() == null)
            return false;
        if (other.getHostType() != null && other.getHostType().equals(this.getHostType()) == false)
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
        hashCode = prime * hashCode + ((getHostType() == null) ? 0 : getHostType().hashCode());
        hashCode = prime * hashCode + ((getHostUrl() == null) ? 0 : getHostUrl().hashCode());
        return hashCode;
    }

    @Override
    public ConfluenceSourceConfiguration clone() {
        try {
            return (ConfluenceSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.ConfluenceSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
