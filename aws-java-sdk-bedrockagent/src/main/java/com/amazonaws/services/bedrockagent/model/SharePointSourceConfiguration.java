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
 * The endpoint information to connect to your SharePoint data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/SharePointSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharePointSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector"
     * >SharePoint connection configuration</a>.
     * </p>
     */
    private String credentialsSecretArn;
    /**
     * <p>
     * The domain of your SharePoint instance or site URL/URLs.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The supported host type, whether online/cloud or server/on-premises.
     * </p>
     */
    private String hostType;
    /**
     * <p>
     * A list of one or more SharePoint site URLs.
     * </p>
     */
    private java.util.List<String> siteUrls;
    /**
     * <p>
     * The identifier of your Microsoft 365 tenant.
     * </p>
     */
    private String tenantId;

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * @see SharePointAuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * </p>
     * 
     * @return The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * @see SharePointAuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharePointAuthType
     */

    public SharePointSourceConfiguration withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * </p>
     * 
     * @param authType
     *        The supported authentication type to authenticate and connect to your SharePoint site/sites.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharePointAuthType
     */

    public SharePointSourceConfiguration withAuthType(SharePointAuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector"
     * >SharePoint connection configuration</a>.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     *        SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     *        depending on your authentication type, see <a href=
     *        "https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector"
     *        >SharePoint connection configuration</a>.
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector"
     * >SharePoint connection configuration</a>.
     * </p>
     * 
     * @return The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for
     *         your SharePoint site/sites. For more information on the key-value pairs that must be included in your
     *         secret, depending on your authentication type, see <a href=
     *         "https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector"
     *         >SharePoint connection configuration</a>.
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     * SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     * depending on your authentication type, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector"
     * >SharePoint connection configuration</a>.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name of an Secrets Manager secret that stores your authentication credentials for your
     *        SharePoint site/sites. For more information on the key-value pairs that must be included in your secret,
     *        depending on your authentication type, see <a href=
     *        "https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector"
     *        >SharePoint connection configuration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointSourceConfiguration withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
        return this;
    }

    /**
     * <p>
     * The domain of your SharePoint instance or site URL/URLs.
     * </p>
     * 
     * @param domain
     *        The domain of your SharePoint instance or site URL/URLs.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain of your SharePoint instance or site URL/URLs.
     * </p>
     * 
     * @return The domain of your SharePoint instance or site URL/URLs.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain of your SharePoint instance or site URL/URLs.
     * </p>
     * 
     * @param domain
     *        The domain of your SharePoint instance or site URL/URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointSourceConfiguration withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The supported host type, whether online/cloud or server/on-premises.
     * </p>
     * 
     * @param hostType
     *        The supported host type, whether online/cloud or server/on-premises.
     * @see SharePointHostType
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
     * @see SharePointHostType
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
     * @see SharePointHostType
     */

    public SharePointSourceConfiguration withHostType(String hostType) {
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
     * @see SharePointHostType
     */

    public SharePointSourceConfiguration withHostType(SharePointHostType hostType) {
        this.hostType = hostType.toString();
        return this;
    }

    /**
     * <p>
     * A list of one or more SharePoint site URLs.
     * </p>
     * 
     * @return A list of one or more SharePoint site URLs.
     */

    public java.util.List<String> getSiteUrls() {
        return siteUrls;
    }

    /**
     * <p>
     * A list of one or more SharePoint site URLs.
     * </p>
     * 
     * @param siteUrls
     *        A list of one or more SharePoint site URLs.
     */

    public void setSiteUrls(java.util.Collection<String> siteUrls) {
        if (siteUrls == null) {
            this.siteUrls = null;
            return;
        }

        this.siteUrls = new java.util.ArrayList<String>(siteUrls);
    }

    /**
     * <p>
     * A list of one or more SharePoint site URLs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSiteUrls(java.util.Collection)} or {@link #withSiteUrls(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param siteUrls
     *        A list of one or more SharePoint site URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointSourceConfiguration withSiteUrls(String... siteUrls) {
        if (this.siteUrls == null) {
            setSiteUrls(new java.util.ArrayList<String>(siteUrls.length));
        }
        for (String ele : siteUrls) {
            this.siteUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more SharePoint site URLs.
     * </p>
     * 
     * @param siteUrls
     *        A list of one or more SharePoint site URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointSourceConfiguration withSiteUrls(java.util.Collection<String> siteUrls) {
        setSiteUrls(siteUrls);
        return this;
    }

    /**
     * <p>
     * The identifier of your Microsoft 365 tenant.
     * </p>
     * 
     * @param tenantId
     *        The identifier of your Microsoft 365 tenant.
     */

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * <p>
     * The identifier of your Microsoft 365 tenant.
     * </p>
     * 
     * @return The identifier of your Microsoft 365 tenant.
     */

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * <p>
     * The identifier of your Microsoft 365 tenant.
     * </p>
     * 
     * @param tenantId
     *        The identifier of your Microsoft 365 tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharePointSourceConfiguration withTenantId(String tenantId) {
        setTenantId(tenantId);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getHostType() != null)
            sb.append("HostType: ").append(getHostType()).append(",");
        if (getSiteUrls() != null)
            sb.append("SiteUrls: ").append(getSiteUrls()).append(",");
        if (getTenantId() != null)
            sb.append("TenantId: ").append(getTenantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharePointSourceConfiguration == false)
            return false;
        SharePointSourceConfiguration other = (SharePointSourceConfiguration) obj;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getHostType() == null ^ this.getHostType() == null)
            return false;
        if (other.getHostType() != null && other.getHostType().equals(this.getHostType()) == false)
            return false;
        if (other.getSiteUrls() == null ^ this.getSiteUrls() == null)
            return false;
        if (other.getSiteUrls() != null && other.getSiteUrls().equals(this.getSiteUrls()) == false)
            return false;
        if (other.getTenantId() == null ^ this.getTenantId() == null)
            return false;
        if (other.getTenantId() != null && other.getTenantId().equals(this.getTenantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getCredentialsSecretArn() == null) ? 0 : getCredentialsSecretArn().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getHostType() == null) ? 0 : getHostType().hashCode());
        hashCode = prime * hashCode + ((getSiteUrls() == null) ? 0 : getSiteUrls().hashCode());
        hashCode = prime * hashCode + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        return hashCode;
    }

    @Override
    public SharePointSourceConfiguration clone() {
        try {
            return (SharePointSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.SharePointSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
