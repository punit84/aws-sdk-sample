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
package com.amazonaws.services.simpleemail.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that the Amazon Kinesis Firehose destination is invalid. See the error message for details.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidFirehoseDestinationException extends com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that the configuration set does not exist.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * Indicates that the event destination does not exist.
     * </p>
     */
    private String eventDestinationName;

    /**
     * Constructs a new InvalidFirehoseDestinationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidFirehoseDestinationException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that the configuration set does not exist.
     * </p>
     * 
     * @param configurationSetName
     *        Indicates that the configuration set does not exist.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * Indicates that the configuration set does not exist.
     * </p>
     * 
     * @return Indicates that the configuration set does not exist.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * Indicates that the configuration set does not exist.
     * </p>
     * 
     * @param configurationSetName
     *        Indicates that the configuration set does not exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidFirehoseDestinationException withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * Indicates that the event destination does not exist.
     * </p>
     * 
     * @param eventDestinationName
     *        Indicates that the event destination does not exist.
     */

    public void setEventDestinationName(String eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
    }

    /**
     * <p>
     * Indicates that the event destination does not exist.
     * </p>
     * 
     * @return Indicates that the event destination does not exist.
     */

    public String getEventDestinationName() {
        return this.eventDestinationName;
    }

    /**
     * <p>
     * Indicates that the event destination does not exist.
     * </p>
     * 
     * @param eventDestinationName
     *        Indicates that the event destination does not exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidFirehoseDestinationException withEventDestinationName(String eventDestinationName) {
        setEventDestinationName(eventDestinationName);
        return this;
    }

}
