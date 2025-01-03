/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that the request was throttled.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyRequestsException extends com.amazonaws.services.athena.model.AmazonAthenaException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new TooManyRequestsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyRequestsException(String message) {
        super(message);
    }

    /**
     * @param reason
     * @see ThrottleReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see ThrottleReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThrottleReason
     */

    public TooManyRequestsException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @param reason
     * @see ThrottleReason
     */

    public void setReason(ThrottleReason reason) {
        withReason(reason);
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThrottleReason
     */

    public TooManyRequestsException withReason(ThrottleReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
