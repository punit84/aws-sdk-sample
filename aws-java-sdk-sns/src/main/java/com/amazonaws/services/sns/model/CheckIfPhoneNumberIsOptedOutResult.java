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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response from the <code>CheckIfPhoneNumberIsOptedOut</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CheckIfPhoneNumberIsOptedOut" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckIfPhoneNumberIsOptedOutResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean isOptedOut;

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     * 
     * @param isOptedOut
     *        Indicates whether the phone number is opted out:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     *        </p>
     *        </li>
     */

    public void setIsOptedOut(Boolean isOptedOut) {
        this.isOptedOut = isOptedOut;
    }

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the phone number is opted out:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     *         </p>
     *         </li>
     */

    public Boolean getIsOptedOut() {
        return this.isOptedOut;
    }

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     * 
     * @param isOptedOut
     *        Indicates whether the phone number is opted out:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckIfPhoneNumberIsOptedOutResult withIsOptedOut(Boolean isOptedOut) {
        setIsOptedOut(isOptedOut);
        return this;
    }

    /**
     * <p>
     * Indicates whether the phone number is opted out:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the phone number is opted out:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> – The phone number is opted out, meaning you cannot publish SMS messages to it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> – The phone number is opted in, meaning you can publish SMS messages to it.
     *         </p>
     *         </li>
     */

    public Boolean isOptedOut() {
        return this.isOptedOut;
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
        if (getIsOptedOut() != null)
            sb.append("IsOptedOut: ").append(getIsOptedOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckIfPhoneNumberIsOptedOutResult == false)
            return false;
        CheckIfPhoneNumberIsOptedOutResult other = (CheckIfPhoneNumberIsOptedOutResult) obj;
        if (other.getIsOptedOut() == null ^ this.getIsOptedOut() == null)
            return false;
        if (other.getIsOptedOut() != null && other.getIsOptedOut().equals(this.getIsOptedOut()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsOptedOut() == null) ? 0 : getIsOptedOut().hashCode());
        return hashCode;
    }

    @Override
    public CheckIfPhoneNumberIsOptedOutResult clone() {
        try {
            return (CheckIfPhoneNumberIsOptedOutResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
