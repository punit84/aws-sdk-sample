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
 * Contains configurations for the service to use for retrieving data to return as the output from the node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/RetrievalFlowNodeServiceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrievalFlowNodeServiceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains configurations for the Amazon S3 location from which to retrieve data to return as the output from the
     * node.
     * </p>
     */
    private RetrievalFlowNodeS3Configuration s3;

    /**
     * <p>
     * Contains configurations for the Amazon S3 location from which to retrieve data to return as the output from the
     * node.
     * </p>
     * 
     * @param s3
     *        Contains configurations for the Amazon S3 location from which to retrieve data to return as the output
     *        from the node.
     */

    public void setS3(RetrievalFlowNodeS3Configuration s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Contains configurations for the Amazon S3 location from which to retrieve data to return as the output from the
     * node.
     * </p>
     * 
     * @return Contains configurations for the Amazon S3 location from which to retrieve data to return as the output
     *         from the node.
     */

    public RetrievalFlowNodeS3Configuration getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Contains configurations for the Amazon S3 location from which to retrieve data to return as the output from the
     * node.
     * </p>
     * 
     * @param s3
     *        Contains configurations for the Amazon S3 location from which to retrieve data to return as the output
     *        from the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalFlowNodeServiceConfiguration withS3(RetrievalFlowNodeS3Configuration s3) {
        setS3(s3);
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
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrievalFlowNodeServiceConfiguration == false)
            return false;
        RetrievalFlowNodeServiceConfiguration other = (RetrievalFlowNodeServiceConfiguration) obj;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public RetrievalFlowNodeServiceConfiguration clone() {
        try {
            return (RetrievalFlowNodeServiceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.RetrievalFlowNodeServiceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
