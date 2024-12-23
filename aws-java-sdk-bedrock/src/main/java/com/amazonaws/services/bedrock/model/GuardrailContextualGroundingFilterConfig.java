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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter configuration details for the guardrails contextual grounding filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailContextualGroundingFilterConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailContextualGroundingFilterConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filter details for the guardrails contextual grounding filter.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The threshold details for the guardrails contextual grounding filter.
     * </p>
     */
    private Double threshold;

    /**
     * <p>
     * The filter details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @param type
     *        The filter details for the guardrails contextual grounding filter.
     * @see GuardrailContextualGroundingFilterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The filter details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @return The filter details for the guardrails contextual grounding filter.
     * @see GuardrailContextualGroundingFilterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The filter details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @param type
     *        The filter details for the guardrails contextual grounding filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContextualGroundingFilterType
     */

    public GuardrailContextualGroundingFilterConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The filter details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @param type
     *        The filter details for the guardrails contextual grounding filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContextualGroundingFilterType
     */

    public GuardrailContextualGroundingFilterConfig withType(GuardrailContextualGroundingFilterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The threshold details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @param threshold
     *        The threshold details for the guardrails contextual grounding filter.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The threshold details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @return The threshold details for the guardrails contextual grounding filter.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The threshold details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @param threshold
     *        The threshold details for the guardrails contextual grounding filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailContextualGroundingFilterConfig withThreshold(Double threshold) {
        setThreshold(threshold);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailContextualGroundingFilterConfig == false)
            return false;
        GuardrailContextualGroundingFilterConfig other = (GuardrailContextualGroundingFilterConfig) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailContextualGroundingFilterConfig clone() {
        try {
            return (GuardrailContextualGroundingFilterConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailContextualGroundingFilterConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
