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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/CreateQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new queue. The following limits apply to this name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A queue name can have up to 80 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueName;
    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the delivery of all messages in the queue
     * is delayed. Valid values: An integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * Valid values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for which Amazon SQS retains a message.
     * Valid values: An integer from 60 seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid Amazon Web Services policy. For more information about policy
     * structure, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of
     * Amazon Web Services IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in seconds, for which a
     * <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: An integer from 0 to 20
     * (seconds). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a standard
     * queue must also be a standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in seconds. Valid values: An integer from
     * 0 to 43,200 (12 hours). Default: 30. For more information about the visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed customer master key (CMK) for Amazon SQS
     * or a custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the Amazon Web Services managed CMK for Amazon SQS is always
     * <code>alias/aws/sqs</code>, the alias of a custom CMK can, for example, be <code>alias/<i>MyAlias</i> </code>.
     * For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in seconds, for which Amazon SQS can reuse a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data key</a> to encrypt or
     * decrypt messages before calling KMS again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time period provides better security but results
     * in more calls to KMS which might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SqsManagedSseEnabled</code> – Enables server-side queue encryption using SQS owned encryption keys. Only
     * one server-side encryption option is supported per queue (e.g. <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html"
     * >SSE-KMS</a> or <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html"
     * >SSE-SQS</a>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values are <code>true</code> and <code>false</code>.
     * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue. You can provide
     * this attribute only during queue creation. You can't change it for an existing queue. When you set this
     * attribute, you must also provide the <code>MessageGroupId</code> for your messages explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-understanding-logic.html"
     * >FIFO queue logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based deduplication. Valid values are <code>true</code>
     * and <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-exactly-once-processing.html"
     * >Exactly-once processing</a> in the <i>Amazon SQS Developer Guide</i>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html">high
     * throughput for FIFO queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, normal
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * For information on throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html">Tagging
     * Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Quotas related to queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the <code>sqs:CreateQueue</code> and
     * <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a user name</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * Default constructor for CreateQueueRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateQueueRequest() {
    }

    /**
     * Constructs a new CreateQueueRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueName
     *        The name of the new queue. The following limits apply to this name:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A queue name can have up to 80 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A FIFO queue name must end with the <code>.fifo</code> suffix.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */
    public CreateQueueRequest(String queueName) {
        setQueueName(queueName);
    }

    /**
     * <p>
     * The name of the new queue. The following limits apply to this name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A queue name can have up to 80 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueName
     *        The name of the new queue. The following limits apply to this name:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A queue name can have up to 80 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A FIFO queue name must end with the <code>.fifo</code> suffix.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name of the new queue. The following limits apply to this name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A queue name can have up to 80 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @return The name of the new queue. The following limits apply to this name:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A queue name can have up to 80 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A FIFO queue name must end with the <code>.fifo</code> suffix.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     */

    public String getQueueName() {
        return this.queueName;
    }

    /**
     * <p>
     * The name of the new queue. The following limits apply to this name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A queue name can have up to 80 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * A FIFO queue name must end with the <code>.fifo</code> suffix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueName
     *        The name of the new queue. The following limits apply to this name:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A queue name can have up to 80 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A FIFO queue name must end with the <code>.fifo</code> suffix.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withQueueName(String queueName) {
        setQueueName(queueName);
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the delivery of all messages in the queue
     * is delayed. Valid values: An integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * Valid values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for which Amazon SQS retains a message.
     * Valid values: An integer from 60 seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid Amazon Web Services policy. For more information about policy
     * structure, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of
     * Amazon Web Services IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in seconds, for which a
     * <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: An integer from 0 to 20
     * (seconds). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a standard
     * queue must also be a standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in seconds. Valid values: An integer from
     * 0 to 43,200 (12 hours). Default: 30. For more information about the visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed customer master key (CMK) for Amazon SQS
     * or a custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the Amazon Web Services managed CMK for Amazon SQS is always
     * <code>alias/aws/sqs</code>, the alias of a custom CMK can, for example, be <code>alias/<i>MyAlias</i> </code>.
     * For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in seconds, for which Amazon SQS can reuse a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data key</a> to encrypt or
     * decrypt messages before calling KMS again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time period provides better security but results
     * in more calls to KMS which might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SqsManagedSseEnabled</code> – Enables server-side queue encryption using SQS owned encryption keys. Only
     * one server-side encryption option is supported per queue (e.g. <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html"
     * >SSE-KMS</a> or <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html"
     * >SSE-SQS</a>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values are <code>true</code> and <code>false</code>.
     * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue. You can provide
     * this attribute only during queue creation. You can't change it for an existing queue. When you set this
     * attribute, you must also provide the <code>MessageGroupId</code> for your messages explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-understanding-logic.html"
     * >FIFO queue logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based deduplication. Valid values are <code>true</code>
     * and <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-exactly-once-processing.html"
     * >Exactly-once processing</a> in the <i>Amazon SQS Developer Guide</i>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html">high
     * throughput for FIFO queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, normal
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * For information on throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @return A map of attributes with their corresponding values.</p>
     *         <p>
     *         The following lists the names, descriptions, and values of the special request parameters that the
     *         <code>CreateQueue</code> action uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DelaySeconds</code> – The length of time, in seconds, for which the delivery of all messages in the
     *         queue is delayed. Valid values: An integer from 0 to 900 seconds (15 minutes). Default: 0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaximumMessageSize</code> – The limit of how many bytes a message can contain before Amazon SQS
     *         rejects it. Valid values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default:
     *         262,144 (256 KiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRetentionPeriod</code> – The length of time, in seconds, for which Amazon SQS retains a
     *         message. Valid values: An integer from 60 seconds (1 minute) to 1,209,600 seconds (14 days). Default:
     *         345,600 (4 days).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> – The queue's policy. A valid Amazon Web Services policy. For more information about
     *         policy structure, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of Amazon Web
     *         Services IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in seconds, for which a
     *         <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: An integer from
     *         0 to 20 (seconds). Default: 0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *         functionality of the source queue as a JSON object. For more information about the redrive policy and
     *         dead-letter queues, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *         >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which
     *         Amazon SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before
     *         being moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *         <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a
     *         standard queue must also be a standard queue.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>VisibilityTimeout</code> – The visibility timeout for the queue, in seconds. Valid values: An
     *         integer from 0 to 43,200 (12 hours). Default: 30. For more information about the visibility timeout, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *         >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *         >server-side-encryption</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed customer master key (CMK) for
     *         Amazon SQS or a custom CMK. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *         >Key Terms</a>. While the alias of the Amazon Web Services managed CMK for Amazon SQS is always
     *         <code>alias/aws/sqs</code>, the alias of a custom CMK can, for example, be
     *         <code>alias/<i>MyAlias</i> </code>. For more examples, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *         >KeyId</a> in the <i>Key Management Service API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in seconds, for which Amazon SQS can
     *         reuse a <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data
     *         key</a> to encrypt or decrypt messages before calling KMS again. An integer representing seconds, between
     *         60 seconds (1 minute) and 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time period
     *         provides better security but results in more calls to KMS which might incur charges after Free Tier. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *         >How Does the Data Key Reuse Period Work?</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SqsManagedSseEnabled</code> – Enables server-side queue encryption using SQS owned encryption keys.
     *         Only one server-side encryption option is supported per queue (e.g. <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html"
     *         >SSE-KMS</a> or <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html"
     *         >SSE-SQS</a>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a
     *         href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *         (first-in-first-out) queues</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FifoQueue</code> – Designates a queue as FIFO. Valid values are <code>true</code> and
     *         <code>false</code>. If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a
     *         standard queue. You can provide this attribute only during queue creation. You can't change it for an
     *         existing queue. When you set this attribute, you must also provide the <code>MessageGroupId</code> for
     *         your messages explicitly.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-understanding-logic.html"
     *         >FIFO queue logic</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ContentBasedDeduplication</code> – Enables content-based deduplication. Valid values are
     *         <code>true</code> and <code>false</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-exactly-once-processing.html"
     *         >Exactly-once processing</a> in the <i>Amazon SQS Developer Guide</i>. Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Every message must have a unique <code>MessageDeduplicationId</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You may provide a <code>MessageDeduplicationId</code> explicitly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *         <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *         <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the
     *         message).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *         <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *         overrides the generated one.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *         deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *         a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *         <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *         message is delivered.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes apply only to <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *         >high throughput for FIFO queues</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *         queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the
     *         entire queue or per message group. Valid values are <code>perQueue</code> and
     *         <code>perMessageGroupId</code>. The <code>perMessageGroupId</code> value is allowed only when the value
     *         for <code>DeduplicationScope</code> is <code>messageGroup</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To enable high throughput for FIFO queues, do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you set these attributes to anything other than the values shown for enabling high throughput, normal
     *         throughput is in effect and deduplication occurs as specified.
     *         </p>
     *         <p>
     *         For information on throughput quotas, see <a
     *         href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *         >Quotas related to messages</a> in the <i>Amazon SQS Developer Guide</i>.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the delivery of all messages in the queue
     * is delayed. Valid values: An integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * Valid values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for which Amazon SQS retains a message.
     * Valid values: An integer from 60 seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid Amazon Web Services policy. For more information about policy
     * structure, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of
     * Amazon Web Services IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in seconds, for which a
     * <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: An integer from 0 to 20
     * (seconds). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a standard
     * queue must also be a standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in seconds. Valid values: An integer from
     * 0 to 43,200 (12 hours). Default: 30. For more information about the visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed customer master key (CMK) for Amazon SQS
     * or a custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the Amazon Web Services managed CMK for Amazon SQS is always
     * <code>alias/aws/sqs</code>, the alias of a custom CMK can, for example, be <code>alias/<i>MyAlias</i> </code>.
     * For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in seconds, for which Amazon SQS can reuse a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data key</a> to encrypt or
     * decrypt messages before calling KMS again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time period provides better security but results
     * in more calls to KMS which might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SqsManagedSseEnabled</code> – Enables server-side queue encryption using SQS owned encryption keys. Only
     * one server-side encryption option is supported per queue (e.g. <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html"
     * >SSE-KMS</a> or <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html"
     * >SSE-SQS</a>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values are <code>true</code> and <code>false</code>.
     * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue. You can provide
     * this attribute only during queue creation. You can't change it for an existing queue. When you set this
     * attribute, you must also provide the <code>MessageGroupId</code> for your messages explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-understanding-logic.html"
     * >FIFO queue logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based deduplication. Valid values are <code>true</code>
     * and <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-exactly-once-processing.html"
     * >Exactly-once processing</a> in the <i>Amazon SQS Developer Guide</i>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html">high
     * throughput for FIFO queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, normal
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * For information on throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>CreateQueue</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> – The length of time, in seconds, for which the delivery of all messages in the
     *        queue is delayed. Valid values: An integer from 0 to 900 seconds (15 minutes). Default: 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> – The limit of how many bytes a message can contain before Amazon SQS
     *        rejects it. Valid values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144
     *        (256 KiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> – The length of time, in seconds, for which Amazon SQS retains a
     *        message. Valid values: An integer from 60 seconds (1 minute) to 1,209,600 seconds (14 days). Default:
     *        345,600 (4 days).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – The queue's policy. A valid Amazon Web Services policy. For more information about
     *        policy structure, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of Amazon Web
     *        Services IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in seconds, for which a
     *        <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: An integer from 0
     *        to 20 (seconds). Default: 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *        functionality of the source queue as a JSON object. For more information about the redrive policy and
     *        dead-letter queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     *        SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being
     *        moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *        <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a
     *        standard queue must also be a standard queue.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> – The visibility timeout for the queue, in seconds. Valid values: An
     *        integer from 0 to 43,200 (12 hours). Default: 30. For more information about the visibility timeout, see
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed customer master key (CMK) for
     *        Amazon SQS or a custom CMK. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *        >Key Terms</a>. While the alias of the Amazon Web Services managed CMK for Amazon SQS is always
     *        <code>alias/aws/sqs</code>, the alias of a custom CMK can, for example, be
     *        <code>alias/<i>MyAlias</i> </code>. For more examples, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *        >KeyId</a> in the <i>Key Management Service API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in seconds, for which Amazon SQS can reuse
     *        a <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data key</a> to
     *        encrypt or decrypt messages before calling KMS again. An integer representing seconds, between 60 seconds
     *        (1 minute) and 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time period provides better
     *        security but results in more calls to KMS which might incur charges after Free Tier. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *        >How Does the Data Key Reuse Period Work?</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SqsManagedSseEnabled</code> – Enables server-side queue encryption using SQS owned encryption keys.
     *        Only one server-side encryption option is supported per queue (e.g. <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html"
     *        >SSE-KMS</a> or <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html"
     *        >SSE-SQS</a>).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoQueue</code> – Designates a queue as FIFO. Valid values are <code>true</code> and
     *        <code>false</code>. If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a
     *        standard queue. You can provide this attribute only during queue creation. You can't change it for an
     *        existing queue. When you set this attribute, you must also provide the <code>MessageGroupId</code> for
     *        your messages explicitly.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-understanding-logic.html"
     *        >FIFO queue logic</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Enables content-based deduplication. Valid values are
     *        <code>true</code> and <code>false</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-exactly-once-processing.html"
     *        >Exactly-once processing</a> in the <i>Amazon SQS Developer Guide</i>. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every message must have a unique <code>MessageDeduplicationId</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You may provide a <code>MessageDeduplicationId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *        <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *        <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *        <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *        overrides the generated one.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *        deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *        a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *        <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *        message is delivered.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *        >high throughput for FIFO queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *        queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire
     *        queue or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     *        <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     *        <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable high throughput for FIFO queues, do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set these attributes to anything other than the values shown for enabling high throughput, normal
     *        throughput is in effect and deduplication occurs as specified.
     *        </p>
     *        <p>
     *        For information on throughput quotas, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *        >Quotas related to messages</a> in the <i>Amazon SQS Developer Guide</i>.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateQueue</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> – The length of time, in seconds, for which the delivery of all messages in the queue
     * is delayed. Valid values: An integer from 0 to 900 seconds (15 minutes). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> – The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * Valid values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256 KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> – The length of time, in seconds, for which Amazon SQS retains a message.
     * Valid values: An integer from 60 seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The queue's policy. A valid Amazon Web Services policy. For more information about policy
     * structure, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of
     * Amazon Web Services IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in seconds, for which a
     * <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: An integer from 0 to 20
     * (seconds). Default: 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue functionality of
     * the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
     * Amazon SQS Dead-Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS
     * moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being moved
     * to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     * <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a standard
     * queue must also be a standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> – The visibility timeout for the queue, in seconds. Valid values: An integer from
     * 0 to 43,200 (12 hours). Default: 30. For more information about the visibility timeout, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     * >server-side-encryption</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed customer master key (CMK) for Amazon SQS
     * or a custom CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     * >Key Terms</a>. While the alias of the Amazon Web Services managed CMK for Amazon SQS is always
     * <code>alias/aws/sqs</code>, the alias of a custom CMK can, for example, be <code>alias/<i>MyAlias</i> </code>.
     * For more examples, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >KeyId</a> in the <i>Key Management Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in seconds, for which Amazon SQS can reuse a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data key</a> to encrypt or
     * decrypt messages before calling KMS again. An integer representing seconds, between 60 seconds (1 minute) and
     * 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time period provides better security but results
     * in more calls to KMS which might incur charges after Free Tier. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     * >How Does the Data Key Reuse Period Work?</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SqsManagedSseEnabled</code> – Enables server-side queue encryption using SQS owned encryption keys. Only
     * one server-side encryption option is supported per queue (e.g. <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html"
     * >SSE-KMS</a> or <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html"
     * >SSE-SQS</a>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FifoQueue</code> – Designates a queue as FIFO. Valid values are <code>true</code> and <code>false</code>.
     * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue. You can provide
     * this attribute only during queue creation. You can't change it for an existing queue. When you set this
     * attribute, you must also provide the <code>MessageGroupId</code> for your messages explicitly.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-understanding-logic.html"
     * >FIFO queue logic</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> – Enables content-based deduplication. Valid values are <code>true</code>
     * and <code>false</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-exactly-once-processing.html"
     * >Exactly-once processing</a> in the <i>Amazon SQS Developer Guide</i>. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following attributes apply only to <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html">high
     * throughput for FIFO queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or queue
     * level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire queue
     * or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     * <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     * <code>messageGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable high throughput for FIFO queues, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set these attributes to anything other than the values shown for enabling high throughput, normal
     * throughput is in effect and deduplication occurs as specified.
     * </p>
     * <p>
     * For information on throughput quotas, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html">Quotas
     * related to messages</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>CreateQueue</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> – The length of time, in seconds, for which the delivery of all messages in the
     *        queue is delayed. Valid values: An integer from 0 to 900 seconds (15 minutes). Default: 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> – The limit of how many bytes a message can contain before Amazon SQS
     *        rejects it. Valid values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144
     *        (256 KiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> – The length of time, in seconds, for which Amazon SQS retains a
     *        message. Valid values: An integer from 60 seconds (1 minute) to 1,209,600 seconds (14 days). Default:
     *        345,600 (4 days).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – The queue's policy. A valid Amazon Web Services policy. For more information about
     *        policy structure, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of Amazon Web
     *        Services IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> – The length of time, in seconds, for which a
     *        <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: An integer from 0
     *        to 20 (seconds). Default: 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> – The string that includes the parameters for the dead-letter queue
     *        functionality of the source queue as a JSON object. For more information about the redrive policy and
     *        dead-letter queues, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deadLetterTargetArn</code> – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon
     *        SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maxReceiveCount</code> – The number of times a message is delivered to the source queue before being
     *        moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the
     *        <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a
     *        standard queue must also be a standard queue.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> – The visibility timeout for the queue, in seconds. Valid values: An
     *        integer from 0 to 43,200 (12 hours). Default: 30. For more information about the visibility timeout, see
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html"
     *        >server-side-encryption</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services managed customer master key (CMK) for
     *        Amazon SQS or a custom CMK. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms"
     *        >Key Terms</a>. While the alias of the Amazon Web Services managed CMK for Amazon SQS is always
     *        <code>alias/aws/sqs</code>, the alias of a custom CMK can, for example, be
     *        <code>alias/<i>MyAlias</i> </code>. For more examples, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *        >KeyId</a> in the <i>Key Management Service API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsDataKeyReusePeriodSeconds</code> – The length of time, in seconds, for which Amazon SQS can reuse
     *        a <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data key</a> to
     *        encrypt or decrypt messages before calling KMS again. An integer representing seconds, between 60 seconds
     *        (1 minute) and 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time period provides better
     *        security but results in more calls to KMS which might incur charges after Free Tier. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work"
     *        >How Does the Data Key Reuse Period Work?</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SqsManagedSseEnabled</code> – Enables server-side queue encryption using SQS owned encryption keys.
     *        Only one server-side encryption option is supported per queue (e.g. <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html"
     *        >SSE-KMS</a> or <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html"
     *        >SSE-SQS</a>).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FifoQueue</code> – Designates a queue as FIFO. Valid values are <code>true</code> and
     *        <code>false</code>. If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a
     *        standard queue. You can provide this attribute only during queue creation. You can't change it for an
     *        existing queue. When you set this attribute, you must also provide the <code>MessageGroupId</code> for
     *        your messages explicitly.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-understanding-logic.html"
     *        >FIFO queue logic</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> – Enables content-based deduplication. Valid values are
     *        <code>true</code> and <code>false</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-exactly-once-processing.html"
     *        >Exactly-once processing</a> in the <i>Amazon SQS Developer Guide</i>. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every message must have a unique <code>MessageDeduplicationId</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You may provide a <code>MessageDeduplicationId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *        <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *        <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *        <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *        overrides the generated one.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *        deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *        a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *        <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *        message is delivered.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes apply only to <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html"
     *        >high throughput for FIFO queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeduplicationScope</code> – Specifies whether message deduplication occurs at the message group or
     *        queue level. Valid values are <code>messageGroup</code> and <code>queue</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FifoThroughputLimit</code> – Specifies whether the FIFO queue throughput quota applies to the entire
     *        queue or per message group. Valid values are <code>perQueue</code> and <code>perMessageGroupId</code>. The
     *        <code>perMessageGroupId</code> value is allowed only when the value for <code>DeduplicationScope</code> is
     *        <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable high throughput for FIFO queues, do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set <code>DeduplicationScope</code> to <code>messageGroup</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set <code>FifoThroughputLimit</code> to <code>perMessageGroupId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you set these attributes to anything other than the values shown for enabling high throughput, normal
     *        throughput is in effect and deduplication occurs as specified.
     *        </p>
     *        <p>
     *        For information on throughput quotas, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html"
     *        >Quotas related to messages</a> in the <i>Amazon SQS Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see CreateQueueRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html">Tagging
     * Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Quotas related to queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the <code>sqs:CreateQueue</code> and
     * <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a user name</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return Add cost allocation tags to the specified Amazon SQS queue. For an overview, see <a
     *         href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     *         >Tagging Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.</p>
     *         <p>
     *         When you use queue tags, keep the following guidelines in mind:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Adding more than 50 tags to a queue isn't recommended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tags are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A new tag with a key identical to that of an existing tag overwrites the existing tag.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a full list of tag restrictions, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     *         >Quotas related to queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         To be able to tag a queue on creation, you must have the <code>sqs:CreateQueue</code> and
     *         <code>sqs:TagQueue</code> permissions.
     *         </p>
     *         <p>
     *         Cross-account permissions don't apply to this action. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     *         >Grant cross-account permissions to a role and a user name</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html">Tagging
     * Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Quotas related to queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the <code>sqs:CreateQueue</code> and
     * <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a user name</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param tags
     *        Add cost allocation tags to the specified Amazon SQS queue. For an overview, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     *        >Tagging Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.</p>
     *        <p>
     *        When you use queue tags, keep the following guidelines in mind:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Adding more than 50 tags to a queue isn't recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tags are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A new tag with a key identical to that of an existing tag overwrites the existing tag.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a full list of tag restrictions, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     *        >Quotas related to queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        To be able to tag a queue on creation, you must have the <code>sqs:CreateQueue</code> and
     *        <code>sqs:TagQueue</code> permissions.
     *        </p>
     *        <p>
     *        Cross-account permissions don't apply to this action. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     *        >Grant cross-account permissions to a role and a user name</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html">Tagging
     * Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Quotas related to queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To be able to tag a queue on creation, you must have the <code>sqs:CreateQueue</code> and
     * <code>sqs:TagQueue</code> permissions.
     * </p>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a user name</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param tags
     *        Add cost allocation tags to the specified Amazon SQS queue. For an overview, see <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html"
     *        >Tagging Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.</p>
     *        <p>
     *        When you use queue tags, keep the following guidelines in mind:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Adding more than 50 tags to a queue isn't recommended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tags are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A new tag with a key identical to that of an existing tag overwrites the existing tag.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a full list of tag restrictions, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     *        >Quotas related to queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        To be able to tag a queue on creation, you must have the <code>sqs:CreateQueue</code> and
     *        <code>sqs:TagQueue</code> permissions.
     *        </p>
     *        <p>
     *        Cross-account permissions don't apply to this action. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     *        >Grant cross-account permissions to a role and a user name</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateQueueRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest clearTagsEntries() {
        this.tags = null;
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
        if (getQueueName() != null)
            sb.append("QueueName: ").append(getQueueName()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueRequest == false)
            return false;
        CreateQueueRequest other = (CreateQueueRequest) obj;
        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null && other.getQueueName().equals(this.getQueueName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateQueueRequest clone() {
        return (CreateQueueRequest) super.clone();
    }

}
