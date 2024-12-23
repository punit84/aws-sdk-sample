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
 * Contains configurations for a Lambda function node in the flow. You specify the Lambda function to invoke and the
 * inputs into the function. The output is the response that is defined in the Lambda function. For more information,
 * see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html">Node types in Amazon Bedrock
 * works</a> in the Amazon Bedrock User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/LambdaFunctionFlowNodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionFlowNodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function to invoke.
     * </p>
     */
    private String lambdaArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function to invoke.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of the Lambda function to invoke.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function to invoke.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function to invoke.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function to invoke.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of the Lambda function to invoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionFlowNodeConfiguration withLambdaArn(String lambdaArn) {
        setLambdaArn(lambdaArn);
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
        if (getLambdaArn() != null)
            sb.append("LambdaArn: ").append(getLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionFlowNodeConfiguration == false)
            return false;
        LambdaFunctionFlowNodeConfiguration other = (LambdaFunctionFlowNodeConfiguration) obj;
        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionFlowNodeConfiguration clone() {
        try {
            return (LambdaFunctionFlowNodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.LambdaFunctionFlowNodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
