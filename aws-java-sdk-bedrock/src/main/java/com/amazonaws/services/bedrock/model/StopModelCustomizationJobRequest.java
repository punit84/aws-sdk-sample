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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopModelCustomizationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopModelCustomizationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Job identifier of the job to stop.
     * </p>
     */
    private String jobIdentifier;

    /**
     * <p>
     * Job identifier of the job to stop.
     * </p>
     * 
     * @param jobIdentifier
     *        Job identifier of the job to stop.
     */

    public void setJobIdentifier(String jobIdentifier) {
        this.jobIdentifier = jobIdentifier;
    }

    /**
     * <p>
     * Job identifier of the job to stop.
     * </p>
     * 
     * @return Job identifier of the job to stop.
     */

    public String getJobIdentifier() {
        return this.jobIdentifier;
    }

    /**
     * <p>
     * Job identifier of the job to stop.
     * </p>
     * 
     * @param jobIdentifier
     *        Job identifier of the job to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopModelCustomizationJobRequest withJobIdentifier(String jobIdentifier) {
        setJobIdentifier(jobIdentifier);
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
        if (getJobIdentifier() != null)
            sb.append("JobIdentifier: ").append(getJobIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopModelCustomizationJobRequest == false)
            return false;
        StopModelCustomizationJobRequest other = (StopModelCustomizationJobRequest) obj;
        if (other.getJobIdentifier() == null ^ this.getJobIdentifier() == null)
            return false;
        if (other.getJobIdentifier() != null && other.getJobIdentifier().equals(this.getJobIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobIdentifier() == null) ? 0 : getJobIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public StopModelCustomizationJobRequest clone() {
        return (StopModelCustomizationJobRequest) super.clone();
    }

}
