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
 * The PII entity to configure for the guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailPiiEntityConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailPiiEntityConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configure guardrail type when the PII entity is detected.
     * </p>
     * <p>
     * The following PIIs are used to block or mask sensitive information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>General</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ADDRESS</b>
     * </p>
     * <p>
     * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can include
     * information such as the street, building, location, city, state, country, county, zip code, precinct, and
     * neighborhood.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGE</b>
     * </p>
     * <p>
     * An individual's age, including the quantity and unit of time. For example, in the phrase "I am 40 years old,"
     * Guarrails recognizes "40 years" as an age.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NAME</b>
     * </p>
     * <p>
     * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss. guardrails
     * doesn't apply this entity type to names that are part of organizations or addresses. For example, guardrails
     * recognizes the "John Doe Organization" as an organization, and it recognizes "Jane Doe Street" as an address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EMAIL</b>
     * </p>
     * <p>
     * An email address, such as <i>marymajor@email.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PHONE</b>
     * </p>
     * <p>
     * A phone number. This entity type also includes fax and pager numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>USERNAME</b>
     * </p>
     * <p>
     * A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PASSWORD</b>
     * </p>
     * <p>
     * An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRIVER_ID</b>
     * </p>
     * <p>
     * The number assigned to a driver's license, which is an official document permitting an individual to operate one
     * or more motorized vehicles on a public road. A driver's license number consists of alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LICENSE_PLATE</b>
     * </p>
     * <p>
     * A license plate for a vehicle is issued by the state or country where the vehicle is registered. The format for
     * passenger vehicles is typically five to eight digits, consisting of upper-case letters and numbers. The format
     * varies depending on the location of the issuing state or country.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined in the
     * <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Finance</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REDIT_DEBIT_CARD_CVV</b>
     * </p>
     * <p>
     * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and debit
     * cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     * </p>
     * <p>
     * The expiration date for a credit or debit card. This number is usually four digits long and is often formatted as
     * <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as <i>01/21</i>, <i>01/2021</i>,
     * and <i>Jan 2021</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_NUMBER</b>
     * </p>
     * <p>
     * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However, Amazon
     * Comprehend also recognizes credit or debit card numbers when only the last four digits are present.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIN</b>
     * </p>
     * <p>
     * A four-digit personal identification number (PIN) with which you can access your bank account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * An International Bank Account Number has specific formats in each country. For more information, see <a
     * href="https://www.iban.com/structure">www.iban.com/structure</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SWIFT_CODE</b>
     * </p>
     * <p>
     * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or branch.
     * Banks use these codes for money transfers such as international wire transfers.
     * </p>
     * <p>
     * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while eight-digit
     * codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>IT</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IP_ADDRESS</b>
     * </p>
     * <p>
     * An IPv4 address, such as <i>198.51.100.0</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAC_ADDRESS</b>
     * </p>
     * <p>
     * A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface controller
     * (NIC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>URL</b>
     * </p>
     * <p>
     * A web address, such as <i>www.example.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_ACCESS_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with a secret access key; you use the access key ID and secret access key
     * to sign programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_SECRET_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with an access key. You use the access key ID and secret access key to sign
     * programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>USA specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>US_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * A US bank account number, which is typically 10 to 12 digits long.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_BANK_ROUTING_NUMBER</b>
     * </p>
     * <p>
     * A US bank account routing number. These are typically nine digits long,
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and contain a
     * "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third and forth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_PASSPORT_NUMBER</b>
     * </p>
     * <p>
     * A US passport number. Passport numbers range from six to nine alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_SOCIAL_SECURITY_NUMBER</b>
     * </p>
     * <p>
     * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent residents, and
     * temporary working residents.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Canada specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CA_HEALTH_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access healthcare
     * benefits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to access
     * government programs and benefits.
     * </p>
     * <p>
     * The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated through
     * a simple check-digit process called the <a href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn
     * algorithm</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>UK Specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current system
     * formats the 10-digit number with spaces after the third and sixth digits. The final digit is an error-detecting
     * checksum.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social security)
     * benefits. It is also used for some purposes in the UK tax system.
     * </p>
     * <p>
     * The number is nine digits long and starts with two letters, followed by six numbers and one letter. A NINO can be
     * formatted with a space or a dash after the two letters and after the second, forth, and sixth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     * </p>
     * <p>
     * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Custom</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize and act
     * upon such as serial number, booking ID etc..
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Configure guardrail action when the PII entity is detected.
     * </p>
     */
    private String action;

    /**
     * <p>
     * Configure guardrail type when the PII entity is detected.
     * </p>
     * <p>
     * The following PIIs are used to block or mask sensitive information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>General</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ADDRESS</b>
     * </p>
     * <p>
     * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can include
     * information such as the street, building, location, city, state, country, county, zip code, precinct, and
     * neighborhood.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGE</b>
     * </p>
     * <p>
     * An individual's age, including the quantity and unit of time. For example, in the phrase "I am 40 years old,"
     * Guarrails recognizes "40 years" as an age.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NAME</b>
     * </p>
     * <p>
     * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss. guardrails
     * doesn't apply this entity type to names that are part of organizations or addresses. For example, guardrails
     * recognizes the "John Doe Organization" as an organization, and it recognizes "Jane Doe Street" as an address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EMAIL</b>
     * </p>
     * <p>
     * An email address, such as <i>marymajor@email.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PHONE</b>
     * </p>
     * <p>
     * A phone number. This entity type also includes fax and pager numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>USERNAME</b>
     * </p>
     * <p>
     * A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PASSWORD</b>
     * </p>
     * <p>
     * An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRIVER_ID</b>
     * </p>
     * <p>
     * The number assigned to a driver's license, which is an official document permitting an individual to operate one
     * or more motorized vehicles on a public road. A driver's license number consists of alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LICENSE_PLATE</b>
     * </p>
     * <p>
     * A license plate for a vehicle is issued by the state or country where the vehicle is registered. The format for
     * passenger vehicles is typically five to eight digits, consisting of upper-case letters and numbers. The format
     * varies depending on the location of the issuing state or country.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined in the
     * <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Finance</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REDIT_DEBIT_CARD_CVV</b>
     * </p>
     * <p>
     * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and debit
     * cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     * </p>
     * <p>
     * The expiration date for a credit or debit card. This number is usually four digits long and is often formatted as
     * <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as <i>01/21</i>, <i>01/2021</i>,
     * and <i>Jan 2021</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_NUMBER</b>
     * </p>
     * <p>
     * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However, Amazon
     * Comprehend also recognizes credit or debit card numbers when only the last four digits are present.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIN</b>
     * </p>
     * <p>
     * A four-digit personal identification number (PIN) with which you can access your bank account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * An International Bank Account Number has specific formats in each country. For more information, see <a
     * href="https://www.iban.com/structure">www.iban.com/structure</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SWIFT_CODE</b>
     * </p>
     * <p>
     * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or branch.
     * Banks use these codes for money transfers such as international wire transfers.
     * </p>
     * <p>
     * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while eight-digit
     * codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>IT</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IP_ADDRESS</b>
     * </p>
     * <p>
     * An IPv4 address, such as <i>198.51.100.0</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAC_ADDRESS</b>
     * </p>
     * <p>
     * A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface controller
     * (NIC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>URL</b>
     * </p>
     * <p>
     * A web address, such as <i>www.example.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_ACCESS_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with a secret access key; you use the access key ID and secret access key
     * to sign programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_SECRET_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with an access key. You use the access key ID and secret access key to sign
     * programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>USA specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>US_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * A US bank account number, which is typically 10 to 12 digits long.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_BANK_ROUTING_NUMBER</b>
     * </p>
     * <p>
     * A US bank account routing number. These are typically nine digits long,
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and contain a
     * "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third and forth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_PASSPORT_NUMBER</b>
     * </p>
     * <p>
     * A US passport number. Passport numbers range from six to nine alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_SOCIAL_SECURITY_NUMBER</b>
     * </p>
     * <p>
     * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent residents, and
     * temporary working residents.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Canada specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CA_HEALTH_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access healthcare
     * benefits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to access
     * government programs and benefits.
     * </p>
     * <p>
     * The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated through
     * a simple check-digit process called the <a href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn
     * algorithm</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>UK Specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current system
     * formats the 10-digit number with spaces after the third and sixth digits. The final digit is an error-detecting
     * checksum.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social security)
     * benefits. It is also used for some purposes in the UK tax system.
     * </p>
     * <p>
     * The number is nine digits long and starts with two letters, followed by six numbers and one letter. A NINO can be
     * formatted with a space or a dash after the two letters and after the second, forth, and sixth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     * </p>
     * <p>
     * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Custom</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize and act
     * upon such as serial number, booking ID etc..
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param type
     *        Configure guardrail type when the PII entity is detected.</p>
     *        <p>
     *        The following PIIs are used to block or mask sensitive information:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>General</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ADDRESS</b>
     *        </p>
     *        <p>
     *        A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can
     *        include information such as the street, building, location, city, state, country, county, zip code,
     *        precinct, and neighborhood.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AGE</b>
     *        </p>
     *        <p>
     *        An individual's age, including the quantity and unit of time. For example, in the phrase
     *        "I am 40 years old," Guarrails recognizes "40 years" as an age.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NAME</b>
     *        </p>
     *        <p>
     *        An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss.
     *        guardrails doesn't apply this entity type to names that are part of organizations or addresses. For
     *        example, guardrails recognizes the "John Doe Organization" as an organization, and it recognizes
     *        "Jane Doe Street" as an address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EMAIL</b>
     *        </p>
     *        <p>
     *        An email address, such as <i>marymajor@email.com</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PHONE</b>
     *        </p>
     *        <p>
     *        A phone number. This entity type also includes fax and pager numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>USERNAME</b>
     *        </p>
     *        <p>
     *        A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PASSWORD</b>
     *        </p>
     *        <p>
     *        An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DRIVER_ID</b>
     *        </p>
     *        <p>
     *        The number assigned to a driver's license, which is an official document permitting an individual to
     *        operate one or more motorized vehicles on a public road. A driver's license number consists of
     *        alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>LICENSE_PLATE</b>
     *        </p>
     *        <p>
     *        A license plate for a vehicle is issued by the state or country where the vehicle is registered. The
     *        format for passenger vehicles is typically five to eight digits, consisting of upper-case letters and
     *        numbers. The format varies depending on the location of the issuing state or country.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     *        </p>
     *        <p>
     *        A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined in
     *        the <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Finance</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REDIT_DEBIT_CARD_CVV</b>
     *        </p>
     *        <p>
     *        A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and
     *        debit cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     *        </p>
     *        <p>
     *        The expiration date for a credit or debit card. This number is usually four digits long and is often
     *        formatted as <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as
     *        <i>01/21</i>, <i>01/2021</i>, and <i>Jan 2021</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREDIT_DEBIT_CARD_NUMBER</b>
     *        </p>
     *        <p>
     *        The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However,
     *        Amazon Comprehend also recognizes credit or debit card numbers when only the last four digits are present.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIN</b>
     *        </p>
     *        <p>
     *        A four-digit personal identification number (PIN) with which you can access your bank account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     *        </p>
     *        <p>
     *        An International Bank Account Number has specific formats in each country. For more information, see <a
     *        href="https://www.iban.com/structure">www.iban.com/structure</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SWIFT_CODE</b>
     *        </p>
     *        <p>
     *        A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or
     *        branch. Banks use these codes for money transfers such as international wire transfers.
     *        </p>
     *        <p>
     *        SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while
     *        eight-digit codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IT</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>IP_ADDRESS</b>
     *        </p>
     *        <p>
     *        An IPv4 address, such as <i>198.51.100.0</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAC_ADDRESS</b>
     *        </p>
     *        <p>
     *        A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface
     *        controller (NIC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>URL</b>
     *        </p>
     *        <p>
     *        A web address, such as <i>www.example.com</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS_ACCESS_KEY</b>
     *        </p>
     *        <p>
     *        A unique identifier that's associated with a secret access key; you use the access key ID and secret
     *        access key to sign programmatic Amazon Web Services requests cryptographically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS_SECRET_KEY</b>
     *        </p>
     *        <p>
     *        A unique identifier that's associated with an access key. You use the access key ID and secret access key
     *        to sign programmatic Amazon Web Services requests cryptographically.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>USA specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>US_BANK_ACCOUNT_NUMBER</b>
     *        </p>
     *        <p>
     *        A US bank account number, which is typically 10 to 12 digits long.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_BANK_ROUTING_NUMBER</b>
     *        </p>
     *        <p>
     *        A US bank account routing number. These are typically nine digits long,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     *        </p>
     *        <p>
     *        A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and
     *        contain a "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third
     *        and forth digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_PASSPORT_NUMBER</b>
     *        </p>
     *        <p>
     *        A US passport number. Passport numbers range from six to nine alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_SOCIAL_SECURITY_NUMBER</b>
     *        </p>
     *        <p>
     *        A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent
     *        residents, and temporary working residents.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Canada specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CA_HEALTH_NUMBER</b>
     *        </p>
     *        <p>
     *        A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access
     *        healthcare benefits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to
     *        access government programs and benefits.
     *        </p>
     *        <p>
     *        The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated
     *        through a simple check-digit process called the <a
     *        href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn algorithm</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK Specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current
     *        system formats the 10-digit number with spaces after the third and sixth digits. The final digit is an
     *        error-detecting checksum.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social
     *        security) benefits. It is also used for some purposes in the UK tax system.
     *        </p>
     *        <p>
     *        The number is nine digits long and starts with two letters, followed by six numbers and one letter. A NINO
     *        can be formatted with a space or a dash after the two letters and after the second, forth, and sixth
     *        digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Custom</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize
     *        and act upon such as serial number, booking ID etc..
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see GuardrailPiiEntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Configure guardrail type when the PII entity is detected.
     * </p>
     * <p>
     * The following PIIs are used to block or mask sensitive information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>General</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ADDRESS</b>
     * </p>
     * <p>
     * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can include
     * information such as the street, building, location, city, state, country, county, zip code, precinct, and
     * neighborhood.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGE</b>
     * </p>
     * <p>
     * An individual's age, including the quantity and unit of time. For example, in the phrase "I am 40 years old,"
     * Guarrails recognizes "40 years" as an age.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NAME</b>
     * </p>
     * <p>
     * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss. guardrails
     * doesn't apply this entity type to names that are part of organizations or addresses. For example, guardrails
     * recognizes the "John Doe Organization" as an organization, and it recognizes "Jane Doe Street" as an address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EMAIL</b>
     * </p>
     * <p>
     * An email address, such as <i>marymajor@email.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PHONE</b>
     * </p>
     * <p>
     * A phone number. This entity type also includes fax and pager numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>USERNAME</b>
     * </p>
     * <p>
     * A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PASSWORD</b>
     * </p>
     * <p>
     * An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRIVER_ID</b>
     * </p>
     * <p>
     * The number assigned to a driver's license, which is an official document permitting an individual to operate one
     * or more motorized vehicles on a public road. A driver's license number consists of alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LICENSE_PLATE</b>
     * </p>
     * <p>
     * A license plate for a vehicle is issued by the state or country where the vehicle is registered. The format for
     * passenger vehicles is typically five to eight digits, consisting of upper-case letters and numbers. The format
     * varies depending on the location of the issuing state or country.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined in the
     * <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Finance</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REDIT_DEBIT_CARD_CVV</b>
     * </p>
     * <p>
     * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and debit
     * cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     * </p>
     * <p>
     * The expiration date for a credit or debit card. This number is usually four digits long and is often formatted as
     * <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as <i>01/21</i>, <i>01/2021</i>,
     * and <i>Jan 2021</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_NUMBER</b>
     * </p>
     * <p>
     * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However, Amazon
     * Comprehend also recognizes credit or debit card numbers when only the last four digits are present.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIN</b>
     * </p>
     * <p>
     * A four-digit personal identification number (PIN) with which you can access your bank account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * An International Bank Account Number has specific formats in each country. For more information, see <a
     * href="https://www.iban.com/structure">www.iban.com/structure</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SWIFT_CODE</b>
     * </p>
     * <p>
     * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or branch.
     * Banks use these codes for money transfers such as international wire transfers.
     * </p>
     * <p>
     * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while eight-digit
     * codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>IT</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IP_ADDRESS</b>
     * </p>
     * <p>
     * An IPv4 address, such as <i>198.51.100.0</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAC_ADDRESS</b>
     * </p>
     * <p>
     * A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface controller
     * (NIC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>URL</b>
     * </p>
     * <p>
     * A web address, such as <i>www.example.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_ACCESS_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with a secret access key; you use the access key ID and secret access key
     * to sign programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_SECRET_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with an access key. You use the access key ID and secret access key to sign
     * programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>USA specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>US_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * A US bank account number, which is typically 10 to 12 digits long.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_BANK_ROUTING_NUMBER</b>
     * </p>
     * <p>
     * A US bank account routing number. These are typically nine digits long,
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and contain a
     * "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third and forth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_PASSPORT_NUMBER</b>
     * </p>
     * <p>
     * A US passport number. Passport numbers range from six to nine alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_SOCIAL_SECURITY_NUMBER</b>
     * </p>
     * <p>
     * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent residents, and
     * temporary working residents.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Canada specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CA_HEALTH_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access healthcare
     * benefits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to access
     * government programs and benefits.
     * </p>
     * <p>
     * The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated through
     * a simple check-digit process called the <a href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn
     * algorithm</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>UK Specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current system
     * formats the 10-digit number with spaces after the third and sixth digits. The final digit is an error-detecting
     * checksum.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social security)
     * benefits. It is also used for some purposes in the UK tax system.
     * </p>
     * <p>
     * The number is nine digits long and starts with two letters, followed by six numbers and one letter. A NINO can be
     * formatted with a space or a dash after the two letters and after the second, forth, and sixth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     * </p>
     * <p>
     * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Custom</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize and act
     * upon such as serial number, booking ID etc..
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Configure guardrail type when the PII entity is detected.</p>
     *         <p>
     *         The following PIIs are used to block or mask sensitive information:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>General</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ADDRESS</b>
     *         </p>
     *         <p>
     *         A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can
     *         include information such as the street, building, location, city, state, country, county, zip code,
     *         precinct, and neighborhood.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AGE</b>
     *         </p>
     *         <p>
     *         An individual's age, including the quantity and unit of time. For example, in the phrase
     *         "I am 40 years old," Guarrails recognizes "40 years" as an age.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NAME</b>
     *         </p>
     *         <p>
     *         An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss.
     *         guardrails doesn't apply this entity type to names that are part of organizations or addresses. For
     *         example, guardrails recognizes the "John Doe Organization" as an organization, and it recognizes
     *         "Jane Doe Street" as an address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EMAIL</b>
     *         </p>
     *         <p>
     *         An email address, such as <i>marymajor@email.com</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PHONE</b>
     *         </p>
     *         <p>
     *         A phone number. This entity type also includes fax and pager numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>USERNAME</b>
     *         </p>
     *         <p>
     *         A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PASSWORD</b>
     *         </p>
     *         <p>
     *         An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DRIVER_ID</b>
     *         </p>
     *         <p>
     *         The number assigned to a driver's license, which is an official document permitting an individual to
     *         operate one or more motorized vehicles on a public road. A driver's license number consists of
     *         alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>LICENSE_PLATE</b>
     *         </p>
     *         <p>
     *         A license plate for a vehicle is issued by the state or country where the vehicle is registered. The
     *         format for passenger vehicles is typically five to eight digits, consisting of upper-case letters and
     *         numbers. The format varies depending on the location of the issuing state or country.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     *         </p>
     *         <p>
     *         A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined
     *         in the <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Finance</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>REDIT_DEBIT_CARD_CVV</b>
     *         </p>
     *         <p>
     *         A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and
     *         debit cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     *         </p>
     *         <p>
     *         The expiration date for a credit or debit card. This number is usually four digits long and is often
     *         formatted as <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as
     *         <i>01/21</i>, <i>01/2021</i>, and <i>Jan 2021</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CREDIT_DEBIT_CARD_NUMBER</b>
     *         </p>
     *         <p>
     *         The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However,
     *         Amazon Comprehend also recognizes credit or debit card numbers when only the last four digits are
     *         present.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PIN</b>
     *         </p>
     *         <p>
     *         A four-digit personal identification number (PIN) with which you can access your bank account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     *         </p>
     *         <p>
     *         An International Bank Account Number has specific formats in each country. For more information, see <a
     *         href="https://www.iban.com/structure">www.iban.com/structure</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SWIFT_CODE</b>
     *         </p>
     *         <p>
     *         A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or
     *         branch. Banks use these codes for money transfers such as international wire transfers.
     *         </p>
     *         <p>
     *         SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while
     *         eight-digit codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IT</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>IP_ADDRESS</b>
     *         </p>
     *         <p>
     *         An IPv4 address, such as <i>198.51.100.0</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAC_ADDRESS</b>
     *         </p>
     *         <p>
     *         A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface
     *         controller (NIC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>URL</b>
     *         </p>
     *         <p>
     *         A web address, such as <i>www.example.com</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AWS_ACCESS_KEY</b>
     *         </p>
     *         <p>
     *         A unique identifier that's associated with a secret access key; you use the access key ID and secret
     *         access key to sign programmatic Amazon Web Services requests cryptographically.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AWS_SECRET_KEY</b>
     *         </p>
     *         <p>
     *         A unique identifier that's associated with an access key. You use the access key ID and secret access key
     *         to sign programmatic Amazon Web Services requests cryptographically.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>USA specific</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>US_BANK_ACCOUNT_NUMBER</b>
     *         </p>
     *         <p>
     *         A US bank account number, which is typically 10 to 12 digits long.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>US_BANK_ROUTING_NUMBER</b>
     *         </p>
     *         <p>
     *         A US bank account routing number. These are typically nine digits long,
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     *         </p>
     *         <p>
     *         A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and
     *         contain a "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third
     *         and forth digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>US_PASSPORT_NUMBER</b>
     *         </p>
     *         <p>
     *         A US passport number. Passport numbers range from six to nine alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>US_SOCIAL_SECURITY_NUMBER</b>
     *         </p>
     *         <p>
     *         A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent
     *         residents, and temporary working residents.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Canada specific</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>CA_HEALTH_NUMBER</b>
     *         </p>
     *         <p>
     *         A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access
     *         healthcare benefits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     *         </p>
     *         <p>
     *         A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to
     *         access government programs and benefits.
     *         </p>
     *         <p>
     *         The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated
     *         through a simple check-digit process called the <a
     *         href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn algorithm</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UK Specific</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     *         </p>
     *         <p>
     *         A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current
     *         system formats the 10-digit number with spaces after the third and sixth digits. The final digit is an
     *         error-detecting checksum.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     *         </p>
     *         <p>
     *         A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social
     *         security) benefits. It is also used for some purposes in the UK tax system.
     *         </p>
     *         <p>
     *         The number is nine digits long and starts with two letters, followed by six numbers and one letter. A
     *         NINO can be formatted with a space or a dash after the two letters and after the second, forth, and sixth
     *         digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     *         </p>
     *         <p>
     *         A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Custom</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize
     *         and act upon such as serial number, booking ID etc..
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see GuardrailPiiEntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Configure guardrail type when the PII entity is detected.
     * </p>
     * <p>
     * The following PIIs are used to block or mask sensitive information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>General</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ADDRESS</b>
     * </p>
     * <p>
     * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can include
     * information such as the street, building, location, city, state, country, county, zip code, precinct, and
     * neighborhood.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGE</b>
     * </p>
     * <p>
     * An individual's age, including the quantity and unit of time. For example, in the phrase "I am 40 years old,"
     * Guarrails recognizes "40 years" as an age.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NAME</b>
     * </p>
     * <p>
     * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss. guardrails
     * doesn't apply this entity type to names that are part of organizations or addresses. For example, guardrails
     * recognizes the "John Doe Organization" as an organization, and it recognizes "Jane Doe Street" as an address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EMAIL</b>
     * </p>
     * <p>
     * An email address, such as <i>marymajor@email.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PHONE</b>
     * </p>
     * <p>
     * A phone number. This entity type also includes fax and pager numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>USERNAME</b>
     * </p>
     * <p>
     * A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PASSWORD</b>
     * </p>
     * <p>
     * An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRIVER_ID</b>
     * </p>
     * <p>
     * The number assigned to a driver's license, which is an official document permitting an individual to operate one
     * or more motorized vehicles on a public road. A driver's license number consists of alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LICENSE_PLATE</b>
     * </p>
     * <p>
     * A license plate for a vehicle is issued by the state or country where the vehicle is registered. The format for
     * passenger vehicles is typically five to eight digits, consisting of upper-case letters and numbers. The format
     * varies depending on the location of the issuing state or country.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined in the
     * <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Finance</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REDIT_DEBIT_CARD_CVV</b>
     * </p>
     * <p>
     * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and debit
     * cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     * </p>
     * <p>
     * The expiration date for a credit or debit card. This number is usually four digits long and is often formatted as
     * <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as <i>01/21</i>, <i>01/2021</i>,
     * and <i>Jan 2021</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_NUMBER</b>
     * </p>
     * <p>
     * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However, Amazon
     * Comprehend also recognizes credit or debit card numbers when only the last four digits are present.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIN</b>
     * </p>
     * <p>
     * A four-digit personal identification number (PIN) with which you can access your bank account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * An International Bank Account Number has specific formats in each country. For more information, see <a
     * href="https://www.iban.com/structure">www.iban.com/structure</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SWIFT_CODE</b>
     * </p>
     * <p>
     * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or branch.
     * Banks use these codes for money transfers such as international wire transfers.
     * </p>
     * <p>
     * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while eight-digit
     * codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>IT</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IP_ADDRESS</b>
     * </p>
     * <p>
     * An IPv4 address, such as <i>198.51.100.0</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAC_ADDRESS</b>
     * </p>
     * <p>
     * A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface controller
     * (NIC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>URL</b>
     * </p>
     * <p>
     * A web address, such as <i>www.example.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_ACCESS_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with a secret access key; you use the access key ID and secret access key
     * to sign programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_SECRET_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with an access key. You use the access key ID and secret access key to sign
     * programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>USA specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>US_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * A US bank account number, which is typically 10 to 12 digits long.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_BANK_ROUTING_NUMBER</b>
     * </p>
     * <p>
     * A US bank account routing number. These are typically nine digits long,
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and contain a
     * "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third and forth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_PASSPORT_NUMBER</b>
     * </p>
     * <p>
     * A US passport number. Passport numbers range from six to nine alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_SOCIAL_SECURITY_NUMBER</b>
     * </p>
     * <p>
     * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent residents, and
     * temporary working residents.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Canada specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CA_HEALTH_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access healthcare
     * benefits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to access
     * government programs and benefits.
     * </p>
     * <p>
     * The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated through
     * a simple check-digit process called the <a href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn
     * algorithm</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>UK Specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current system
     * formats the 10-digit number with spaces after the third and sixth digits. The final digit is an error-detecting
     * checksum.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social security)
     * benefits. It is also used for some purposes in the UK tax system.
     * </p>
     * <p>
     * The number is nine digits long and starts with two letters, followed by six numbers and one letter. A NINO can be
     * formatted with a space or a dash after the two letters and after the second, forth, and sixth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     * </p>
     * <p>
     * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Custom</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize and act
     * upon such as serial number, booking ID etc..
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param type
     *        Configure guardrail type when the PII entity is detected.</p>
     *        <p>
     *        The following PIIs are used to block or mask sensitive information:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>General</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ADDRESS</b>
     *        </p>
     *        <p>
     *        A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can
     *        include information such as the street, building, location, city, state, country, county, zip code,
     *        precinct, and neighborhood.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AGE</b>
     *        </p>
     *        <p>
     *        An individual's age, including the quantity and unit of time. For example, in the phrase
     *        "I am 40 years old," Guarrails recognizes "40 years" as an age.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NAME</b>
     *        </p>
     *        <p>
     *        An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss.
     *        guardrails doesn't apply this entity type to names that are part of organizations or addresses. For
     *        example, guardrails recognizes the "John Doe Organization" as an organization, and it recognizes
     *        "Jane Doe Street" as an address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EMAIL</b>
     *        </p>
     *        <p>
     *        An email address, such as <i>marymajor@email.com</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PHONE</b>
     *        </p>
     *        <p>
     *        A phone number. This entity type also includes fax and pager numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>USERNAME</b>
     *        </p>
     *        <p>
     *        A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PASSWORD</b>
     *        </p>
     *        <p>
     *        An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DRIVER_ID</b>
     *        </p>
     *        <p>
     *        The number assigned to a driver's license, which is an official document permitting an individual to
     *        operate one or more motorized vehicles on a public road. A driver's license number consists of
     *        alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>LICENSE_PLATE</b>
     *        </p>
     *        <p>
     *        A license plate for a vehicle is issued by the state or country where the vehicle is registered. The
     *        format for passenger vehicles is typically five to eight digits, consisting of upper-case letters and
     *        numbers. The format varies depending on the location of the issuing state or country.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     *        </p>
     *        <p>
     *        A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined in
     *        the <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Finance</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REDIT_DEBIT_CARD_CVV</b>
     *        </p>
     *        <p>
     *        A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and
     *        debit cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     *        </p>
     *        <p>
     *        The expiration date for a credit or debit card. This number is usually four digits long and is often
     *        formatted as <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as
     *        <i>01/21</i>, <i>01/2021</i>, and <i>Jan 2021</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREDIT_DEBIT_CARD_NUMBER</b>
     *        </p>
     *        <p>
     *        The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However,
     *        Amazon Comprehend also recognizes credit or debit card numbers when only the last four digits are present.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIN</b>
     *        </p>
     *        <p>
     *        A four-digit personal identification number (PIN) with which you can access your bank account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     *        </p>
     *        <p>
     *        An International Bank Account Number has specific formats in each country. For more information, see <a
     *        href="https://www.iban.com/structure">www.iban.com/structure</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SWIFT_CODE</b>
     *        </p>
     *        <p>
     *        A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or
     *        branch. Banks use these codes for money transfers such as international wire transfers.
     *        </p>
     *        <p>
     *        SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while
     *        eight-digit codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IT</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>IP_ADDRESS</b>
     *        </p>
     *        <p>
     *        An IPv4 address, such as <i>198.51.100.0</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAC_ADDRESS</b>
     *        </p>
     *        <p>
     *        A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface
     *        controller (NIC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>URL</b>
     *        </p>
     *        <p>
     *        A web address, such as <i>www.example.com</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS_ACCESS_KEY</b>
     *        </p>
     *        <p>
     *        A unique identifier that's associated with a secret access key; you use the access key ID and secret
     *        access key to sign programmatic Amazon Web Services requests cryptographically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS_SECRET_KEY</b>
     *        </p>
     *        <p>
     *        A unique identifier that's associated with an access key. You use the access key ID and secret access key
     *        to sign programmatic Amazon Web Services requests cryptographically.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>USA specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>US_BANK_ACCOUNT_NUMBER</b>
     *        </p>
     *        <p>
     *        A US bank account number, which is typically 10 to 12 digits long.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_BANK_ROUTING_NUMBER</b>
     *        </p>
     *        <p>
     *        A US bank account routing number. These are typically nine digits long,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     *        </p>
     *        <p>
     *        A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and
     *        contain a "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third
     *        and forth digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_PASSPORT_NUMBER</b>
     *        </p>
     *        <p>
     *        A US passport number. Passport numbers range from six to nine alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_SOCIAL_SECURITY_NUMBER</b>
     *        </p>
     *        <p>
     *        A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent
     *        residents, and temporary working residents.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Canada specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CA_HEALTH_NUMBER</b>
     *        </p>
     *        <p>
     *        A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access
     *        healthcare benefits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to
     *        access government programs and benefits.
     *        </p>
     *        <p>
     *        The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated
     *        through a simple check-digit process called the <a
     *        href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn algorithm</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK Specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current
     *        system formats the 10-digit number with spaces after the third and sixth digits. The final digit is an
     *        error-detecting checksum.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social
     *        security) benefits. It is also used for some purposes in the UK tax system.
     *        </p>
     *        <p>
     *        The number is nine digits long and starts with two letters, followed by six numbers and one letter. A NINO
     *        can be formatted with a space or a dash after the two letters and after the second, forth, and sixth
     *        digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Custom</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize
     *        and act upon such as serial number, booking ID etc..
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailPiiEntityType
     */

    public GuardrailPiiEntityConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Configure guardrail type when the PII entity is detected.
     * </p>
     * <p>
     * The following PIIs are used to block or mask sensitive information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>General</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ADDRESS</b>
     * </p>
     * <p>
     * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can include
     * information such as the street, building, location, city, state, country, county, zip code, precinct, and
     * neighborhood.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AGE</b>
     * </p>
     * <p>
     * An individual's age, including the quantity and unit of time. For example, in the phrase "I am 40 years old,"
     * Guarrails recognizes "40 years" as an age.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NAME</b>
     * </p>
     * <p>
     * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss. guardrails
     * doesn't apply this entity type to names that are part of organizations or addresses. For example, guardrails
     * recognizes the "John Doe Organization" as an organization, and it recognizes "Jane Doe Street" as an address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EMAIL</b>
     * </p>
     * <p>
     * An email address, such as <i>marymajor@email.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PHONE</b>
     * </p>
     * <p>
     * A phone number. This entity type also includes fax and pager numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>USERNAME</b>
     * </p>
     * <p>
     * A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PASSWORD</b>
     * </p>
     * <p>
     * An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRIVER_ID</b>
     * </p>
     * <p>
     * The number assigned to a driver's license, which is an official document permitting an individual to operate one
     * or more motorized vehicles on a public road. A driver's license number consists of alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>LICENSE_PLATE</b>
     * </p>
     * <p>
     * A license plate for a vehicle is issued by the state or country where the vehicle is registered. The format for
     * passenger vehicles is typically five to eight digits, consisting of upper-case letters and numbers. The format
     * varies depending on the location of the issuing state or country.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined in the
     * <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Finance</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REDIT_DEBIT_CARD_CVV</b>
     * </p>
     * <p>
     * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and debit
     * cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     * </p>
     * <p>
     * The expiration date for a credit or debit card. This number is usually four digits long and is often formatted as
     * <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as <i>01/21</i>, <i>01/2021</i>,
     * and <i>Jan 2021</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREDIT_DEBIT_CARD_NUMBER</b>
     * </p>
     * <p>
     * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However, Amazon
     * Comprehend also recognizes credit or debit card numbers when only the last four digits are present.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIN</b>
     * </p>
     * <p>
     * A four-digit personal identification number (PIN) with which you can access your bank account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * An International Bank Account Number has specific formats in each country. For more information, see <a
     * href="https://www.iban.com/structure">www.iban.com/structure</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SWIFT_CODE</b>
     * </p>
     * <p>
     * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or branch.
     * Banks use these codes for money transfers such as international wire transfers.
     * </p>
     * <p>
     * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while eight-digit
     * codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>IT</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IP_ADDRESS</b>
     * </p>
     * <p>
     * An IPv4 address, such as <i>198.51.100.0</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAC_ADDRESS</b>
     * </p>
     * <p>
     * A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface controller
     * (NIC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>URL</b>
     * </p>
     * <p>
     * A web address, such as <i>www.example.com</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_ACCESS_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with a secret access key; you use the access key ID and secret access key
     * to sign programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS_SECRET_KEY</b>
     * </p>
     * <p>
     * A unique identifier that's associated with an access key. You use the access key ID and secret access key to sign
     * programmatic Amazon Web Services requests cryptographically.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>USA specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>US_BANK_ACCOUNT_NUMBER</b>
     * </p>
     * <p>
     * A US bank account number, which is typically 10 to 12 digits long.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_BANK_ROUTING_NUMBER</b>
     * </p>
     * <p>
     * A US bank account routing number. These are typically nine digits long,
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     * </p>
     * <p>
     * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and contain a
     * "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third and forth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_PASSPORT_NUMBER</b>
     * </p>
     * <p>
     * A US passport number. Passport numbers range from six to nine alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>US_SOCIAL_SECURITY_NUMBER</b>
     * </p>
     * <p>
     * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent residents, and
     * temporary working residents.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Canada specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CA_HEALTH_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access healthcare
     * benefits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to access
     * government programs and benefits.
     * </p>
     * <p>
     * The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated through
     * a simple check-digit process called the <a href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn
     * algorithm</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>UK Specific</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current system
     * formats the 10-digit number with spaces after the third and sixth digits. The final digit is an error-detecting
     * checksum.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     * </p>
     * <p>
     * A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social security)
     * benefits. It is also used for some purposes in the UK tax system.
     * </p>
     * <p>
     * The number is nine digits long and starts with two letters, followed by six numbers and one letter. A NINO can be
     * formatted with a space or a dash after the two letters and after the second, forth, and sixth digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     * </p>
     * <p>
     * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Custom</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize and act
     * upon such as serial number, booking ID etc..
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param type
     *        Configure guardrail type when the PII entity is detected.</p>
     *        <p>
     *        The following PIIs are used to block or mask sensitive information:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>General</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ADDRESS</b>
     *        </p>
     *        <p>
     *        A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An address can
     *        include information such as the street, building, location, city, state, country, county, zip code,
     *        precinct, and neighborhood.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AGE</b>
     *        </p>
     *        <p>
     *        An individual's age, including the quantity and unit of time. For example, in the phrase
     *        "I am 40 years old," Guarrails recognizes "40 years" as an age.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NAME</b>
     *        </p>
     *        <p>
     *        An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or Miss.
     *        guardrails doesn't apply this entity type to names that are part of organizations or addresses. For
     *        example, guardrails recognizes the "John Doe Organization" as an organization, and it recognizes
     *        "Jane Doe Street" as an address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EMAIL</b>
     *        </p>
     *        <p>
     *        An email address, such as <i>marymajor@email.com</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PHONE</b>
     *        </p>
     *        <p>
     *        A phone number. This entity type also includes fax and pager numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>USERNAME</b>
     *        </p>
     *        <p>
     *        A user name that identifies an account, such as a login name, screen name, nick name, or handle.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PASSWORD</b>
     *        </p>
     *        <p>
     *        An alphanumeric string that is used as a password, such as "*<i>very20special#pass*</i>".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DRIVER_ID</b>
     *        </p>
     *        <p>
     *        The number assigned to a driver's license, which is an official document permitting an individual to
     *        operate one or more motorized vehicles on a public road. A driver's license number consists of
     *        alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>LICENSE_PLATE</b>
     *        </p>
     *        <p>
     *        A license plate for a vehicle is issued by the state or country where the vehicle is registered. The
     *        format for passenger vehicles is typically five to eight digits, consisting of upper-case letters and
     *        numbers. The format varies depending on the location of the issuing state or country.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VEHICLE_IDENTIFICATION_NUMBER</b>
     *        </p>
     *        <p>
     *        A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format are defined in
     *        the <i>ISO 3779</i> specification. Each country has specific codes and formats for VINs.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Finance</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REDIT_DEBIT_CARD_CVV</b>
     *        </p>
     *        <p>
     *        A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover credit and
     *        debit cards. For American Express credit or debit cards, the CVV is a four-digit numeric code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREDIT_DEBIT_CARD_EXPIRY</b>
     *        </p>
     *        <p>
     *        The expiration date for a credit or debit card. This number is usually four digits long and is often
     *        formatted as <i>month/year</i> or <i>MM/YY</i>. Guardrails recognizes expiration dates such as
     *        <i>01/21</i>, <i>01/2021</i>, and <i>Jan 2021</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREDIT_DEBIT_CARD_NUMBER</b>
     *        </p>
     *        <p>
     *        The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length. However,
     *        Amazon Comprehend also recognizes credit or debit card numbers when only the last four digits are present.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIN</b>
     *        </p>
     *        <p>
     *        A four-digit personal identification number (PIN) with which you can access your bank account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>INTERNATIONAL_BANK_ACCOUNT_NUMBER</b>
     *        </p>
     *        <p>
     *        An International Bank Account Number has specific formats in each country. For more information, see <a
     *        href="https://www.iban.com/structure">www.iban.com/structure</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SWIFT_CODE</b>
     *        </p>
     *        <p>
     *        A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular bank or
     *        branch. Banks use these codes for money transfers such as international wire transfers.
     *        </p>
     *        <p>
     *        SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches, while
     *        eight-digit codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IT</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>IP_ADDRESS</b>
     *        </p>
     *        <p>
     *        An IPv4 address, such as <i>198.51.100.0</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAC_ADDRESS</b>
     *        </p>
     *        <p>
     *        A <i>media access control</i> (MAC) address is a unique identifier assigned to a network interface
     *        controller (NIC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>URL</b>
     *        </p>
     *        <p>
     *        A web address, such as <i>www.example.com</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS_ACCESS_KEY</b>
     *        </p>
     *        <p>
     *        A unique identifier that's associated with a secret access key; you use the access key ID and secret
     *        access key to sign programmatic Amazon Web Services requests cryptographically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS_SECRET_KEY</b>
     *        </p>
     *        <p>
     *        A unique identifier that's associated with an access key. You use the access key ID and secret access key
     *        to sign programmatic Amazon Web Services requests cryptographically.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>USA specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>US_BANK_ACCOUNT_NUMBER</b>
     *        </p>
     *        <p>
     *        A US bank account number, which is typically 10 to 12 digits long.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_BANK_ROUTING_NUMBER</b>
     *        </p>
     *        <p>
     *        A US bank account routing number. These are typically nine digits long,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER</b>
     *        </p>
     *        <p>
     *        A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with a "9" and
     *        contain a "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a dash after the third
     *        and forth digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_PASSPORT_NUMBER</b>
     *        </p>
     *        <p>
     *        A US passport number. Passport numbers range from six to nine alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>US_SOCIAL_SECURITY_NUMBER</b>
     *        </p>
     *        <p>
     *        A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens, permanent
     *        residents, and temporary working residents.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Canada specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CA_HEALTH_NUMBER</b>
     *        </p>
     *        <p>
     *        A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to access
     *        healthcare benefits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CA_SOCIAL_INSURANCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for individuals to
     *        access government programs and benefits.
     *        </p>
     *        <p>
     *        The SIN is formatted as three groups of three digits, such as <i>123-456-789</i>. A SIN can be validated
     *        through a simple check-digit process called the <a
     *        href="https://www.wikipedia.org/wiki/Luhn_algorithm">Luhn algorithm</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK Specific</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UK_NATIONAL_HEALTH_SERVICE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK National Health Service Number is a 10-17 digit number, such as <i>485 777 3456</i>. The current
     *        system formats the 10-digit number with spaces after the third and sixth digits. The final digit is an
     *        error-detecting checksum.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK_NATIONAL_INSURANCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK National Insurance Number (NINO) provides individuals with access to National Insurance (social
     *        security) benefits. It is also used for some purposes in the UK tax system.
     *        </p>
     *        <p>
     *        The number is nine digits long and starts with two letters, followed by six numbers and one letter. A NINO
     *        can be formatted with a space or a dash after the two letters and after the second, forth, and sixth
     *        digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER</b>
     *        </p>
     *        <p>
     *        A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a business.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Custom</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Regex filter</b> - You can use a regular expressions to define patterns for a guardrail to recognize
     *        and act upon such as serial number, booking ID etc..
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailPiiEntityType
     */

    public GuardrailPiiEntityConfig withType(GuardrailPiiEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Configure guardrail action when the PII entity is detected.
     * </p>
     * 
     * @param action
     *        Configure guardrail action when the PII entity is detected.
     * @see GuardrailSensitiveInformationAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Configure guardrail action when the PII entity is detected.
     * </p>
     * 
     * @return Configure guardrail action when the PII entity is detected.
     * @see GuardrailSensitiveInformationAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Configure guardrail action when the PII entity is detected.
     * </p>
     * 
     * @param action
     *        Configure guardrail action when the PII entity is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailSensitiveInformationAction
     */

    public GuardrailPiiEntityConfig withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Configure guardrail action when the PII entity is detected.
     * </p>
     * 
     * @param action
     *        Configure guardrail action when the PII entity is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailSensitiveInformationAction
     */

    public GuardrailPiiEntityConfig withAction(GuardrailSensitiveInformationAction action) {
        this.action = action.toString();
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailPiiEntityConfig == false)
            return false;
        GuardrailPiiEntityConfig other = (GuardrailPiiEntityConfig) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailPiiEntityConfig clone() {
        try {
            return (GuardrailPiiEntityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailPiiEntityConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}