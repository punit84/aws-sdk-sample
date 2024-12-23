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
 * Use to specify a automatic model evaluation job. The <code>EvaluationDatasetMetricConfig</code> object is used to
 * specify the prompt datasets, task type, and metric names.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/AutomatedEvaluationConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomatedEvaluationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the required elements for an automatic model evaluation job.
     * </p>
     */
    private java.util.List<EvaluationDatasetMetricConfig> datasetMetricConfigs;

    /**
     * <p>
     * Specifies the required elements for an automatic model evaluation job.
     * </p>
     * 
     * @return Specifies the required elements for an automatic model evaluation job.
     */

    public java.util.List<EvaluationDatasetMetricConfig> getDatasetMetricConfigs() {
        return datasetMetricConfigs;
    }

    /**
     * <p>
     * Specifies the required elements for an automatic model evaluation job.
     * </p>
     * 
     * @param datasetMetricConfigs
     *        Specifies the required elements for an automatic model evaluation job.
     */

    public void setDatasetMetricConfigs(java.util.Collection<EvaluationDatasetMetricConfig> datasetMetricConfigs) {
        if (datasetMetricConfigs == null) {
            this.datasetMetricConfigs = null;
            return;
        }

        this.datasetMetricConfigs = new java.util.ArrayList<EvaluationDatasetMetricConfig>(datasetMetricConfigs);
    }

    /**
     * <p>
     * Specifies the required elements for an automatic model evaluation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetMetricConfigs(java.util.Collection)} or {@link #withDatasetMetricConfigs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param datasetMetricConfigs
     *        Specifies the required elements for an automatic model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedEvaluationConfig withDatasetMetricConfigs(EvaluationDatasetMetricConfig... datasetMetricConfigs) {
        if (this.datasetMetricConfigs == null) {
            setDatasetMetricConfigs(new java.util.ArrayList<EvaluationDatasetMetricConfig>(datasetMetricConfigs.length));
        }
        for (EvaluationDatasetMetricConfig ele : datasetMetricConfigs) {
            this.datasetMetricConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the required elements for an automatic model evaluation job.
     * </p>
     * 
     * @param datasetMetricConfigs
     *        Specifies the required elements for an automatic model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedEvaluationConfig withDatasetMetricConfigs(java.util.Collection<EvaluationDatasetMetricConfig> datasetMetricConfigs) {
        setDatasetMetricConfigs(datasetMetricConfigs);
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
        if (getDatasetMetricConfigs() != null)
            sb.append("DatasetMetricConfigs: ").append(getDatasetMetricConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomatedEvaluationConfig == false)
            return false;
        AutomatedEvaluationConfig other = (AutomatedEvaluationConfig) obj;
        if (other.getDatasetMetricConfigs() == null ^ this.getDatasetMetricConfigs() == null)
            return false;
        if (other.getDatasetMetricConfigs() != null && other.getDatasetMetricConfigs().equals(this.getDatasetMetricConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetMetricConfigs() == null) ? 0 : getDatasetMetricConfigs().hashCode());
        return hashCode;
    }

    @Override
    public AutomatedEvaluationConfig clone() {
        try {
            return (AutomatedEvaluationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.AutomatedEvaluationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
