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
 * Contains configurations for a Storage node in a flow. This node stores the input in an Amazon S3 location that you
 * specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StorageFlowNodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageFlowNodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains configurations for the service to use for storing the input into the node.
     * </p>
     */
    private StorageFlowNodeServiceConfiguration serviceConfiguration;

    /**
     * <p>
     * Contains configurations for the service to use for storing the input into the node.
     * </p>
     * 
     * @param serviceConfiguration
     *        Contains configurations for the service to use for storing the input into the node.
     */

    public void setServiceConfiguration(StorageFlowNodeServiceConfiguration serviceConfiguration) {
        this.serviceConfiguration = serviceConfiguration;
    }

    /**
     * <p>
     * Contains configurations for the service to use for storing the input into the node.
     * </p>
     * 
     * @return Contains configurations for the service to use for storing the input into the node.
     */

    public StorageFlowNodeServiceConfiguration getServiceConfiguration() {
        return this.serviceConfiguration;
    }

    /**
     * <p>
     * Contains configurations for the service to use for storing the input into the node.
     * </p>
     * 
     * @param serviceConfiguration
     *        Contains configurations for the service to use for storing the input into the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageFlowNodeConfiguration withServiceConfiguration(StorageFlowNodeServiceConfiguration serviceConfiguration) {
        setServiceConfiguration(serviceConfiguration);
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
        if (getServiceConfiguration() != null)
            sb.append("ServiceConfiguration: ").append(getServiceConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageFlowNodeConfiguration == false)
            return false;
        StorageFlowNodeConfiguration other = (StorageFlowNodeConfiguration) obj;
        if (other.getServiceConfiguration() == null ^ this.getServiceConfiguration() == null)
            return false;
        if (other.getServiceConfiguration() != null && other.getServiceConfiguration().equals(this.getServiceConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceConfiguration() == null) ? 0 : getServiceConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StorageFlowNodeConfiguration clone() {
        try {
            return (StorageFlowNodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.StorageFlowNodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
