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
 * A custom processing step for documents moving through a data source ingestion pipeline. To process documents after
 * they have been converted into chunks, set the step to apply to <code>POST_CHUNKING</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/Transformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When the service applies the transformation.
     * </p>
     */
    private String stepToApply;
    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     */
    private TransformationFunction transformationFunction;

    /**
     * <p>
     * When the service applies the transformation.
     * </p>
     * 
     * @param stepToApply
     *        When the service applies the transformation.
     * @see StepType
     */

    public void setStepToApply(String stepToApply) {
        this.stepToApply = stepToApply;
    }

    /**
     * <p>
     * When the service applies the transformation.
     * </p>
     * 
     * @return When the service applies the transformation.
     * @see StepType
     */

    public String getStepToApply() {
        return this.stepToApply;
    }

    /**
     * <p>
     * When the service applies the transformation.
     * </p>
     * 
     * @param stepToApply
     *        When the service applies the transformation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepType
     */

    public Transformation withStepToApply(String stepToApply) {
        setStepToApply(stepToApply);
        return this;
    }

    /**
     * <p>
     * When the service applies the transformation.
     * </p>
     * 
     * @param stepToApply
     *        When the service applies the transformation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepType
     */

    public Transformation withStepToApply(StepType stepToApply) {
        this.stepToApply = stepToApply.toString();
        return this;
    }

    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     * 
     * @param transformationFunction
     *        A Lambda function that processes documents.
     */

    public void setTransformationFunction(TransformationFunction transformationFunction) {
        this.transformationFunction = transformationFunction;
    }

    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     * 
     * @return A Lambda function that processes documents.
     */

    public TransformationFunction getTransformationFunction() {
        return this.transformationFunction;
    }

    /**
     * <p>
     * A Lambda function that processes documents.
     * </p>
     * 
     * @param transformationFunction
     *        A Lambda function that processes documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transformation withTransformationFunction(TransformationFunction transformationFunction) {
        setTransformationFunction(transformationFunction);
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
        if (getStepToApply() != null)
            sb.append("StepToApply: ").append(getStepToApply()).append(",");
        if (getTransformationFunction() != null)
            sb.append("TransformationFunction: ").append(getTransformationFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transformation == false)
            return false;
        Transformation other = (Transformation) obj;
        if (other.getStepToApply() == null ^ this.getStepToApply() == null)
            return false;
        if (other.getStepToApply() != null && other.getStepToApply().equals(this.getStepToApply()) == false)
            return false;
        if (other.getTransformationFunction() == null ^ this.getTransformationFunction() == null)
            return false;
        if (other.getTransformationFunction() != null && other.getTransformationFunction().equals(this.getTransformationFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepToApply() == null) ? 0 : getStepToApply().hashCode());
        hashCode = prime * hashCode + ((getTransformationFunction() == null) ? 0 : getTransformationFunction().hashCode());
        return hashCode;
    }

    @Override
    public Transformation clone() {
        try {
            return (Transformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.TransformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
