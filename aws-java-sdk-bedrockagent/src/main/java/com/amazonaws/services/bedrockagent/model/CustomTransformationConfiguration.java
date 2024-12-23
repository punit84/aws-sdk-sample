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
 * Settings for customizing steps in the data source content ingestion pipeline.
 * </p>
 * <p>
 * You can configure the data source to process documents with a Lambda function after they are parsed and converted
 * into chunks. When you add a post-chunking transformation, the service stores chunked documents in an S3 bucket and
 * invokes a Lambda function to process them.
 * </p>
 * <p>
 * To process chunked documents with a Lambda function, define an S3 bucket path for input and output objects, and a
 * transformation that specifies the Lambda function to invoke. You can use the Lambda function to customize how chunks
 * are split, and the metadata for each chunk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CustomTransformationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomTransformationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An S3 bucket path for input and output objects.
     * </p>
     */
    private IntermediateStorage intermediateStorage;
    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     */
    private java.util.List<Transformation> transformations;

    /**
     * <p>
     * An S3 bucket path for input and output objects.
     * </p>
     * 
     * @param intermediateStorage
     *        An S3 bucket path for input and output objects.
     */

    public void setIntermediateStorage(IntermediateStorage intermediateStorage) {
        this.intermediateStorage = intermediateStorage;
    }

    /**
     * <p>
     * An S3 bucket path for input and output objects.
     * </p>
     * 
     * @return An S3 bucket path for input and output objects.
     */

    public IntermediateStorage getIntermediateStorage() {
        return this.intermediateStorage;
    }

    /**
     * <p>
     * An S3 bucket path for input and output objects.
     * </p>
     * 
     * @param intermediateStorage
     *        An S3 bucket path for input and output objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomTransformationConfiguration withIntermediateStorage(IntermediateStorage intermediateStorage) {
        setIntermediateStorage(intermediateStorage);
        return this;
    }

    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     * 
     * @return A Lambda function that processes documents.
     */

    public java.util.List<Transformation> getTransformations() {
        return transformations;
    }

    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     * 
     * @param transformations
     *        A Lambda function that processes documents.
     */

    public void setTransformations(java.util.Collection<Transformation> transformations) {
        if (transformations == null) {
            this.transformations = null;
            return;
        }

        this.transformations = new java.util.ArrayList<Transformation>(transformations);
    }

    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransformations(java.util.Collection)} or {@link #withTransformations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param transformations
     *        A Lambda function that processes documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomTransformationConfiguration withTransformations(Transformation... transformations) {
        if (this.transformations == null) {
            setTransformations(new java.util.ArrayList<Transformation>(transformations.length));
        }
        for (Transformation ele : transformations) {
            this.transformations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     * 
     * @param transformations
     *        A Lambda function that processes documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomTransformationConfiguration withTransformations(java.util.Collection<Transformation> transformations) {
        setTransformations(transformations);
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
        if (getIntermediateStorage() != null)
            sb.append("IntermediateStorage: ").append(getIntermediateStorage()).append(",");
        if (getTransformations() != null)
            sb.append("Transformations: ").append(getTransformations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomTransformationConfiguration == false)
            return false;
        CustomTransformationConfiguration other = (CustomTransformationConfiguration) obj;
        if (other.getIntermediateStorage() == null ^ this.getIntermediateStorage() == null)
            return false;
        if (other.getIntermediateStorage() != null && other.getIntermediateStorage().equals(this.getIntermediateStorage()) == false)
            return false;
        if (other.getTransformations() == null ^ this.getTransformations() == null)
            return false;
        if (other.getTransformations() != null && other.getTransformations().equals(this.getTransformations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntermediateStorage() == null) ? 0 : getIntermediateStorage().hashCode());
        hashCode = prime * hashCode + ((getTransformations() == null) ? 0 : getTransformations().hashCode());
        return hashCode;
    }

    @Override
    public CustomTransformationConfiguration clone() {
        try {
            return (CustomTransformationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.CustomTransformationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
