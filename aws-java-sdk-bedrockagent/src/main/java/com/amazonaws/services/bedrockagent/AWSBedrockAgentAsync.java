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
package com.amazonaws.services.bedrockagent;

import javax.annotation.Generated;

import com.amazonaws.services.bedrockagent.model.*;

/**
 * Interface for accessing Agents for Amazon Bedrock asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockagent.AbstractAWSBedrockAgentAsync} instead.
 * </p>
 * <p>
 * <p>
 * Describes the API operations for creating and managing Amazon Bedrock agents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBedrockAgentAsync extends AWSBedrockAgent {

    /**
     * <p>
     * Associates a knowledge base with an agent. If a knowledge base is associated and its <code>indexState</code> is
     * set to <code>Enabled</code>, the agent queries the knowledge base for information to augment its response to the
     * user.
     * </p>
     * 
     * @param associateAgentKnowledgeBaseRequest
     * @return A Java Future containing the result of the AssociateAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.AssociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AssociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAgentKnowledgeBaseResult> associateAgentKnowledgeBaseAsync(
            AssociateAgentKnowledgeBaseRequest associateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Associates a knowledge base with an agent. If a knowledge base is associated and its <code>indexState</code> is
     * set to <code>Enabled</code>, the agent queries the knowledge base for information to augment its response to the
     * user.
     * </p>
     * 
     * @param associateAgentKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.AssociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AssociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAgentKnowledgeBaseResult> associateAgentKnowledgeBaseAsync(
            AssociateAgentKnowledgeBaseRequest associateAgentKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAgentKnowledgeBaseRequest, AssociateAgentKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Creates an agent that orchestrates interactions between foundation models, data sources, software applications,
     * user conversations, and APIs to carry out tasks to help customers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following fields for security purposes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>agentResourceRoleArn</code> – The Amazon Resource Name (ARN) of the role with permissions to invoke API
     * operations on an agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>customerEncryptionKeyArn</code> – The Amazon Resource Name (ARN) of a KMS key to encrypt the
     * creation of the agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>idleSessionTTLinSeconds</code> – Specify the number of seconds for which the agent should
     * maintain session information. After this time expires, the subsequent <code>InvokeAgent</code> request begins a
     * new session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To enable your agent to retain conversational context across multiple sessions, include a
     * <code>memoryConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-configure-memory.html">Configure memory</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To override the default prompt behavior for agent orchestration and to use advanced prompts, include a
     * <code>promptOverrideConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you agent fails to be created, the response returns a list of <code>failureReasons</code> alongside a list of
     * <code>recommendedActions</code> for you to troubleshoot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAgentRequest
     * @return A Java Future containing the result of the CreateAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest createAgentRequest);

    /**
     * <p>
     * Creates an agent that orchestrates interactions between foundation models, data sources, software applications,
     * user conversations, and APIs to carry out tasks to help customers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following fields for security purposes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>agentResourceRoleArn</code> – The Amazon Resource Name (ARN) of the role with permissions to invoke API
     * operations on an agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>customerEncryptionKeyArn</code> – The Amazon Resource Name (ARN) of a KMS key to encrypt the
     * creation of the agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>idleSessionTTLinSeconds</code> – Specify the number of seconds for which the agent should
     * maintain session information. After this time expires, the subsequent <code>InvokeAgent</code> request begins a
     * new session.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To enable your agent to retain conversational context across multiple sessions, include a
     * <code>memoryConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-configure-memory.html">Configure memory</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To override the default prompt behavior for agent orchestration and to use advanced prompts, include a
     * <code>promptOverrideConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you agent fails to be created, the response returns a list of <code>failureReasons</code> alongside a list of
     * <code>recommendedActions</code> for you to troubleshoot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAgentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest createAgentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgentRequest, CreateAgentResult> asyncHandler);

    /**
     * <p>
     * Creates an action group for an agent. An action group represents the actions that an agent can carry out for the
     * customer by defining the APIs that an agent can call and the logic for calling them.
     * </p>
     * <p>
     * To allow your agent to request the user for additional information when trying to complete a task, add an action
     * group with the <code>parentActionGroupSignature</code> field set to <code>AMAZON.UserInput</code>.
     * </p>
     * <p>
     * To allow your agent to generate, run, and troubleshoot code when trying to complete a task, add an action group
     * with the <code>parentActionGroupSignature</code> field set to <code>AMAZON.CodeInterpreter</code>.
     * </p>
     * <p>
     * You must leave the <code>description</code>, <code>apiSchema</code>, and <code>actionGroupExecutor</code> fields
     * blank for this action group. During orchestration, if your agent determines that it needs to invoke an API in an
     * action group, but doesn't have enough information to complete the API request, it will invoke this action group
     * instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param createAgentActionGroupRequest
     * @return A Java Future containing the result of the CreateAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentActionGroupResult> createAgentActionGroupAsync(CreateAgentActionGroupRequest createAgentActionGroupRequest);

    /**
     * <p>
     * Creates an action group for an agent. An action group represents the actions that an agent can carry out for the
     * customer by defining the APIs that an agent can call and the logic for calling them.
     * </p>
     * <p>
     * To allow your agent to request the user for additional information when trying to complete a task, add an action
     * group with the <code>parentActionGroupSignature</code> field set to <code>AMAZON.UserInput</code>.
     * </p>
     * <p>
     * To allow your agent to generate, run, and troubleshoot code when trying to complete a task, add an action group
     * with the <code>parentActionGroupSignature</code> field set to <code>AMAZON.CodeInterpreter</code>.
     * </p>
     * <p>
     * You must leave the <code>description</code>, <code>apiSchema</code>, and <code>actionGroupExecutor</code> fields
     * blank for this action group. During orchestration, if your agent determines that it needs to invoke an API in an
     * action group, but doesn't have enough information to complete the API request, it will invoke this action group
     * instead and return an <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Observation.html">Observation</a>
     * reprompting the user for more information.
     * </p>
     * 
     * @param createAgentActionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentActionGroupResult> createAgentActionGroupAsync(CreateAgentActionGroupRequest createAgentActionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgentActionGroupRequest, CreateAgentActionGroupResult> asyncHandler);

    /**
     * <p>
     * Creates an alias of an agent that can be used to deploy the agent.
     * </p>
     * 
     * @param createAgentAliasRequest
     * @return A Java Future containing the result of the CreateAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentAliasResult> createAgentAliasAsync(CreateAgentAliasRequest createAgentAliasRequest);

    /**
     * <p>
     * Creates an alias of an agent that can be used to deploy the agent.
     * </p>
     * 
     * @param createAgentAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentAliasResult> createAgentAliasAsync(CreateAgentAliasRequest createAgentAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgentAliasRequest, CreateAgentAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a data source connector for a knowledge base.
     * </p>
     * <important>
     * <p>
     * You can't change the <code>chunkingConfiguration</code> after you create the data source connector.
     * </p>
     * </important>
     * 
     * @param createDataSourceRequest
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates a data source connector for a knowledge base.
     * </p>
     * <important>
     * <p>
     * You can't change the <code>chunkingConfiguration</code> after you create the data source connector.
     * </p>
     * </important>
     * 
     * @param createDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Creates a prompt flow that you can use to send an input through various steps to yield an output. Configure
     * nodes, each of which corresponds to a step of the flow, and create connections between the nodes to create paths
     * to different outputs. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html">How it works</a> and <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-create.html">Create a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createFlowRequest
     * @return A Java Future containing the result of the CreateFlow operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest createFlowRequest);

    /**
     * <p>
     * Creates a prompt flow that you can use to send an input through various steps to yield an output. Configure
     * nodes, each of which corresponds to a step of the flow, and create connections between the nodes to create paths
     * to different outputs. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html">How it works</a> and <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-create.html">Create a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFlow operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest createFlowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFlowRequest, CreateFlowResult> asyncHandler);

    /**
     * <p>
     * Creates an alias of a flow for deployment. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createFlowAliasRequest
     * @return A Java Future containing the result of the CreateFlowAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowAliasResult> createFlowAliasAsync(CreateFlowAliasRequest createFlowAliasRequest);

    /**
     * <p>
     * Creates an alias of a flow for deployment. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createFlowAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFlowAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowAliasResult> createFlowAliasAsync(CreateFlowAliasRequest createFlowAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFlowAliasRequest, CreateFlowAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a version of the flow that you can deploy. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createFlowVersionRequest
     * @return A Java Future containing the result of the CreateFlowVersion operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlowVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowVersionResult> createFlowVersionAsync(CreateFlowVersionRequest createFlowVersionRequest);

    /**
     * <p>
     * Creates a version of the flow that you can deploy. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createFlowVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFlowVersion operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlowVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowVersionResult> createFlowVersionAsync(CreateFlowVersionRequest createFlowVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFlowVersionRequest, CreateFlowVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a knowledge base that contains data sources from which information can be queried and used by LLMs. To
     * create a knowledge base, you must first set up your data sources and configure a supported vector store. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup.html">Set up
     * your data for ingestion</a>.
     * </p>
     * <note>
     * <p>
     * If you prefer to let Amazon Bedrock create and manage a vector store for you in Amazon OpenSearch Service, use
     * the console. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-create">Create a knowledge base</a>.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * Provide the <code>name</code> and an optional <code>description</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the Amazon Resource Name (ARN) with permissions to create a knowledge base in the <code>roleArn</code>
     * field.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the embedding model to use in the <code>embeddingModelArn</code> field in the
     * <code>knowledgeBaseConfiguration</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the configuration for your vector store in the <code>storageConfiguration</code> object.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Amazon OpenSearch Service database, use the <code>opensearchServerlessConfiguration</code> object. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-oss.html">Create a vector store
     * in Amazon OpenSearch Service</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon Aurora database, use the <code>RdsConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector store
     * in Amazon Aurora</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Pinecone database, use the <code>pineconeConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-pinecone.html">Create a vector
     * store in Pinecone</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Redis Enterprise Cloud database, use the <code>redisEnterpriseCloudConfiguration</code> object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-redis.html">Create a vector store
     * in Redis Enterprise Cloud</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createKnowledgeBaseRequest
     * @return A Java Future containing the result of the CreateKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(CreateKnowledgeBaseRequest createKnowledgeBaseRequest);

    /**
     * <p>
     * Creates a knowledge base that contains data sources from which information can be queried and used by LLMs. To
     * create a knowledge base, you must first set up your data sources and configure a supported vector store. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup.html">Set up
     * your data for ingestion</a>.
     * </p>
     * <note>
     * <p>
     * If you prefer to let Amazon Bedrock create and manage a vector store for you in Amazon OpenSearch Service, use
     * the console. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-create">Create a knowledge base</a>.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * Provide the <code>name</code> and an optional <code>description</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the Amazon Resource Name (ARN) with permissions to create a knowledge base in the <code>roleArn</code>
     * field.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the embedding model to use in the <code>embeddingModelArn</code> field in the
     * <code>knowledgeBaseConfiguration</code> object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the configuration for your vector store in the <code>storageConfiguration</code> object.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Amazon OpenSearch Service database, use the <code>opensearchServerlessConfiguration</code> object. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-oss.html">Create a vector store
     * in Amazon OpenSearch Service</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon Aurora database, use the <code>RdsConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector store
     * in Amazon Aurora</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Pinecone database, use the <code>pineconeConfiguration</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-pinecone.html">Create a vector
     * store in Pinecone</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Redis Enterprise Cloud database, use the <code>redisEnterpriseCloudConfiguration</code> object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-redis.html">Create a vector store
     * in Redis Enterprise Cloud</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(CreateKnowledgeBaseRequest createKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKnowledgeBaseRequest, CreateKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Creates a prompt in your prompt library that you can add to a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html">Prompt management in Amazon
     * Bedrock</a>, <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-create.html">Create
     * a prompt using Prompt management</a> and <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows.html">Prompt flows in Amazon Bedrock</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createPromptRequest
     * @return A Java Future containing the result of the CreatePrompt operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePromptResult> createPromptAsync(CreatePromptRequest createPromptRequest);

    /**
     * <p>
     * Creates a prompt in your prompt library that you can add to a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html">Prompt management in Amazon
     * Bedrock</a>, <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-create.html">Create
     * a prompt using Prompt management</a> and <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows.html">Prompt flows in Amazon Bedrock</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createPromptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePrompt operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePromptResult> createPromptAsync(CreatePromptRequest createPromptRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePromptRequest, CreatePromptResult> asyncHandler);

    /**
     * <p>
     * Creates a static snapshot of your prompt that can be deployed to production. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html">Deploy prompts using
     * Prompt management by creating versions</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createPromptVersionRequest
     * @return A Java Future containing the result of the CreatePromptVersion operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreatePromptVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreatePromptVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePromptVersionResult> createPromptVersionAsync(CreatePromptVersionRequest createPromptVersionRequest);

    /**
     * <p>
     * Creates a static snapshot of your prompt that can be deployed to production. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html">Deploy prompts using
     * Prompt management by creating versions</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createPromptVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePromptVersion operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreatePromptVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreatePromptVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePromptVersionResult> createPromptVersionAsync(CreatePromptVersionRequest createPromptVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePromptVersionRequest, CreatePromptVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes an agent.
     * </p>
     * 
     * @param deleteAgentRequest
     * @return A Java Future containing the result of the DeleteAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest deleteAgentRequest);

    /**
     * <p>
     * Deletes an agent.
     * </p>
     * 
     * @param deleteAgentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest deleteAgentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentRequest, DeleteAgentResult> asyncHandler);

    /**
     * <p>
     * Deletes an action group in an agent.
     * </p>
     * 
     * @param deleteAgentActionGroupRequest
     * @return A Java Future containing the result of the DeleteAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentActionGroupResult> deleteAgentActionGroupAsync(DeleteAgentActionGroupRequest deleteAgentActionGroupRequest);

    /**
     * <p>
     * Deletes an action group in an agent.
     * </p>
     * 
     * @param deleteAgentActionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentActionGroupResult> deleteAgentActionGroupAsync(DeleteAgentActionGroupRequest deleteAgentActionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentActionGroupRequest, DeleteAgentActionGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an alias of an agent.
     * </p>
     * 
     * @param deleteAgentAliasRequest
     * @return A Java Future containing the result of the DeleteAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentAliasResult> deleteAgentAliasAsync(DeleteAgentAliasRequest deleteAgentAliasRequest);

    /**
     * <p>
     * Deletes an alias of an agent.
     * </p>
     * 
     * @param deleteAgentAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentAliasResult> deleteAgentAliasAsync(DeleteAgentAliasRequest deleteAgentAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentAliasRequest, DeleteAgentAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a version of an agent.
     * </p>
     * 
     * @param deleteAgentVersionRequest
     * @return A Java Future containing the result of the DeleteAgentVersion operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentVersionResult> deleteAgentVersionAsync(DeleteAgentVersionRequest deleteAgentVersionRequest);

    /**
     * <p>
     * Deletes a version of an agent.
     * </p>
     * 
     * @param deleteAgentVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgentVersion operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentVersionResult> deleteAgentVersionAsync(DeleteAgentVersionRequest deleteAgentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentVersionRequest, DeleteAgentVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes a data source from a knowledge base.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes a data source from a knowledge base.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a flow.
     * </p>
     * 
     * @param deleteFlowRequest
     * @return A Java Future containing the result of the DeleteFlow operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest deleteFlowRequest);

    /**
     * <p>
     * Deletes a flow.
     * </p>
     * 
     * @param deleteFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFlow operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest deleteFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowRequest, DeleteFlowResult> asyncHandler);

    /**
     * <p>
     * Deletes an alias of a flow.
     * </p>
     * 
     * @param deleteFlowAliasRequest
     * @return A Java Future containing the result of the DeleteFlowAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowAliasResult> deleteFlowAliasAsync(DeleteFlowAliasRequest deleteFlowAliasRequest);

    /**
     * <p>
     * Deletes an alias of a flow.
     * </p>
     * 
     * @param deleteFlowAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFlowAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowAliasResult> deleteFlowAliasAsync(DeleteFlowAliasRequest deleteFlowAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowAliasRequest, DeleteFlowAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a version of a flow.
     * </p>
     * 
     * @param deleteFlowVersionRequest
     * @return A Java Future containing the result of the DeleteFlowVersion operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlowVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowVersionResult> deleteFlowVersionAsync(DeleteFlowVersionRequest deleteFlowVersionRequest);

    /**
     * <p>
     * Deletes a version of a flow.
     * </p>
     * 
     * @param deleteFlowVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFlowVersion operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlowVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowVersionResult> deleteFlowVersionAsync(DeleteFlowVersionRequest deleteFlowVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowVersionRequest, DeleteFlowVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes a knowledge base. Before deleting a knowledge base, you should disassociate the knowledge base from any
     * agents that it is associated with by making a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_DisassociateAgentKnowledgeBase.html"
     * >DisassociateAgentKnowledgeBase</a> request.
     * </p>
     * 
     * @param deleteKnowledgeBaseRequest
     * @return A Java Future containing the result of the DeleteKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest);

    /**
     * <p>
     * Deletes a knowledge base. Before deleting a knowledge base, you should disassociate the knowledge base from any
     * agents that it is associated with by making a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_DisassociateAgentKnowledgeBase.html"
     * >DisassociateAgentKnowledgeBase</a> request.
     * </p>
     * 
     * @param deleteKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKnowledgeBaseRequest, DeleteKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Deletes a prompt or a prompt version from the Prompt management tool. For more information, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-delete.html"
     * >Delete prompts from the Prompt management tool</a> and <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html#prompt-management-versions-delete.html"
     * >Delete a version of a prompt from the Prompt management tool</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param deletePromptRequest
     * @return A Java Future containing the result of the DeletePrompt operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeletePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeletePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePromptResult> deletePromptAsync(DeletePromptRequest deletePromptRequest);

    /**
     * <p>
     * Deletes a prompt or a prompt version from the Prompt management tool. For more information, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-delete.html"
     * >Delete prompts from the Prompt management tool</a> and <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html#prompt-management-versions-delete.html"
     * >Delete a version of a prompt from the Prompt management tool</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param deletePromptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePrompt operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeletePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeletePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePromptResult> deletePromptAsync(DeletePromptRequest deletePromptRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePromptRequest, DeletePromptResult> asyncHandler);

    /**
     * <p>
     * Disassociates a knowledge base from an agent.
     * </p>
     * 
     * @param disassociateAgentKnowledgeBaseRequest
     * @return A Java Future containing the result of the DisassociateAgentKnowledgeBase operation returned by the
     *         service.
     * @sample AWSBedrockAgentAsync.DisassociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DisassociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAgentKnowledgeBaseResult> disassociateAgentKnowledgeBaseAsync(
            DisassociateAgentKnowledgeBaseRequest disassociateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Disassociates a knowledge base from an agent.
     * </p>
     * 
     * @param disassociateAgentKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAgentKnowledgeBase operation returned by the
     *         service.
     * @sample AWSBedrockAgentAsyncHandler.DisassociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DisassociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAgentKnowledgeBaseResult> disassociateAgentKnowledgeBaseAsync(
            DisassociateAgentKnowledgeBaseRequest disassociateAgentKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAgentKnowledgeBaseRequest, DisassociateAgentKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Gets information about an agent.
     * </p>
     * 
     * @param getAgentRequest
     * @return A Java Future containing the result of the GetAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAgentResult> getAgentAsync(GetAgentRequest getAgentRequest);

    /**
     * <p>
     * Gets information about an agent.
     * </p>
     * 
     * @param getAgentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAgentResult> getAgentAsync(GetAgentRequest getAgentRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentRequest, GetAgentResult> asyncHandler);

    /**
     * <p>
     * Gets information about an action group for an agent.
     * </p>
     * 
     * @param getAgentActionGroupRequest
     * @return A Java Future containing the result of the GetAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentActionGroupResult> getAgentActionGroupAsync(GetAgentActionGroupRequest getAgentActionGroupRequest);

    /**
     * <p>
     * Gets information about an action group for an agent.
     * </p>
     * 
     * @param getAgentActionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentActionGroupResult> getAgentActionGroupAsync(GetAgentActionGroupRequest getAgentActionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentActionGroupRequest, GetAgentActionGroupResult> asyncHandler);

    /**
     * <p>
     * Gets information about an alias of an agent.
     * </p>
     * 
     * @param getAgentAliasRequest
     * @return A Java Future containing the result of the GetAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentAliasResult> getAgentAliasAsync(GetAgentAliasRequest getAgentAliasRequest);

    /**
     * <p>
     * Gets information about an alias of an agent.
     * </p>
     * 
     * @param getAgentAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentAliasResult> getAgentAliasAsync(GetAgentAliasRequest getAgentAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentAliasRequest, GetAgentAliasResult> asyncHandler);

    /**
     * <p>
     * Gets information about a knowledge base associated with an agent.
     * </p>
     * 
     * @param getAgentKnowledgeBaseRequest
     * @return A Java Future containing the result of the GetAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentKnowledgeBaseResult> getAgentKnowledgeBaseAsync(GetAgentKnowledgeBaseRequest getAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Gets information about a knowledge base associated with an agent.
     * </p>
     * 
     * @param getAgentKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentKnowledgeBaseResult> getAgentKnowledgeBaseAsync(GetAgentKnowledgeBaseRequest getAgentKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentKnowledgeBaseRequest, GetAgentKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Gets details about a version of an agent.
     * </p>
     * 
     * @param getAgentVersionRequest
     * @return A Java Future containing the result of the GetAgentVersion operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentVersionResult> getAgentVersionAsync(GetAgentVersionRequest getAgentVersionRequest);

    /**
     * <p>
     * Gets details about a version of an agent.
     * </p>
     * 
     * @param getAgentVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgentVersion operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentVersionResult> getAgentVersionAsync(GetAgentVersionRequest getAgentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentVersionRequest, GetAgentVersionResult> asyncHandler);

    /**
     * <p>
     * Gets information about a data source.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Gets information about a data source.
     * </p>
     * 
     * @param getDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-manage.html">Manage a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowRequest
     * @return A Java Future containing the result of the GetFlow operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFlowResult> getFlowAsync(GetFlowRequest getFlowRequest);

    /**
     * <p>
     * Retrieves information about a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-manage.html">Manage a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFlow operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFlowResult> getFlowAsync(GetFlowRequest getFlowRequest,
            com.amazonaws.handlers.AsyncHandler<GetFlowRequest, GetFlowResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowAliasRequest
     * @return A Java Future containing the result of the GetFlowAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlowAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFlowAliasResult> getFlowAliasAsync(GetFlowAliasRequest getFlowAliasRequest);

    /**
     * <p>
     * Retrieves information about a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFlowAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlowAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFlowAliasResult> getFlowAliasAsync(GetFlowAliasRequest getFlowAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetFlowAliasRequest, GetFlowAliasResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a version of a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowVersionRequest
     * @return A Java Future containing the result of the GetFlowVersion operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlowVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFlowVersionResult> getFlowVersionAsync(GetFlowVersionRequest getFlowVersionRequest);

    /**
     * <p>
     * Retrieves information about a version of a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFlowVersion operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlowVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFlowVersionResult> getFlowVersionAsync(GetFlowVersionRequest getFlowVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFlowVersionRequest, GetFlowVersionResult> asyncHandler);

    /**
     * <p>
     * Gets information about a ingestion job, in which a data source is added to a knowledge base.
     * </p>
     * 
     * @param getIngestionJobRequest
     * @return A Java Future containing the result of the GetIngestionJob operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetIngestionJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIngestionJobResult> getIngestionJobAsync(GetIngestionJobRequest getIngestionJobRequest);

    /**
     * <p>
     * Gets information about a ingestion job, in which a data source is added to a knowledge base.
     * </p>
     * 
     * @param getIngestionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIngestionJob operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetIngestionJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIngestionJobResult> getIngestionJobAsync(GetIngestionJobRequest getIngestionJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetIngestionJobRequest, GetIngestionJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a knoweldge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return A Java Future containing the result of the GetKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(GetKnowledgeBaseRequest getKnowledgeBaseRequest);

    /**
     * <p>
     * Gets information about a knoweldge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(GetKnowledgeBaseRequest getKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetKnowledgeBaseRequest, GetKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a prompt or a version of it. For more information, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-view.html"
     * >View information about prompts using Prompt management</a> and <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html#prompt-management-versions-view.html"
     * >View information about a version of your prompt</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getPromptRequest
     * @return A Java Future containing the result of the GetPrompt operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetPrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetPrompt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPromptResult> getPromptAsync(GetPromptRequest getPromptRequest);

    /**
     * <p>
     * Retrieves information about a prompt or a version of it. For more information, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-view.html"
     * >View information about prompts using Prompt management</a> and <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html#prompt-management-versions-view.html"
     * >View information about a version of your prompt</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getPromptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPrompt operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetPrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetPrompt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPromptResult> getPromptAsync(GetPromptRequest getPromptRequest,
            com.amazonaws.handlers.AsyncHandler<GetPromptRequest, GetPromptResult> asyncHandler);

    /**
     * <p>
     * Lists the action groups for an agent and information about each one.
     * </p>
     * 
     * @param listAgentActionGroupsRequest
     * @return A Java Future containing the result of the ListAgentActionGroups operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgentActionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentActionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentActionGroupsResult> listAgentActionGroupsAsync(ListAgentActionGroupsRequest listAgentActionGroupsRequest);

    /**
     * <p>
     * Lists the action groups for an agent and information about each one.
     * </p>
     * 
     * @param listAgentActionGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentActionGroups operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgentActionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentActionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentActionGroupsResult> listAgentActionGroupsAsync(ListAgentActionGroupsRequest listAgentActionGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentActionGroupsRequest, ListAgentActionGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the aliases of an agent and information about each one.
     * </p>
     * 
     * @param listAgentAliasesRequest
     * @return A Java Future containing the result of the ListAgentAliases operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgentAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentAliasesResult> listAgentAliasesAsync(ListAgentAliasesRequest listAgentAliasesRequest);

    /**
     * <p>
     * Lists the aliases of an agent and information about each one.
     * </p>
     * 
     * @param listAgentAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentAliases operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgentAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentAliasesResult> listAgentAliasesAsync(ListAgentAliasesRequest listAgentAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentAliasesRequest, ListAgentAliasesResult> asyncHandler);

    /**
     * <p>
     * Lists knowledge bases associated with an agent and information about each one.
     * </p>
     * 
     * @param listAgentKnowledgeBasesRequest
     * @return A Java Future containing the result of the ListAgentKnowledgeBases operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgentKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentKnowledgeBasesResult> listAgentKnowledgeBasesAsync(ListAgentKnowledgeBasesRequest listAgentKnowledgeBasesRequest);

    /**
     * <p>
     * Lists knowledge bases associated with an agent and information about each one.
     * </p>
     * 
     * @param listAgentKnowledgeBasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentKnowledgeBases operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgentKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentKnowledgeBasesResult> listAgentKnowledgeBasesAsync(ListAgentKnowledgeBasesRequest listAgentKnowledgeBasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentKnowledgeBasesRequest, ListAgentKnowledgeBasesResult> asyncHandler);

    /**
     * <p>
     * Lists the versions of an agent and information about each version.
     * </p>
     * 
     * @param listAgentVersionsRequest
     * @return A Java Future containing the result of the ListAgentVersions operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentVersionsResult> listAgentVersionsAsync(ListAgentVersionsRequest listAgentVersionsRequest);

    /**
     * <p>
     * Lists the versions of an agent and information about each version.
     * </p>
     * 
     * @param listAgentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentVersions operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentVersionsResult> listAgentVersionsAsync(ListAgentVersionsRequest listAgentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentVersionsRequest, ListAgentVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the agents belonging to an account and information about each agent.
     * </p>
     * 
     * @param listAgentsRequest
     * @return A Java Future containing the result of the ListAgents operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest listAgentsRequest);

    /**
     * <p>
     * Lists the agents belonging to an account and information about each agent.
     * </p>
     * 
     * @param listAgentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgents operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest listAgentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentsRequest, ListAgentsResult> asyncHandler);

    /**
     * <p>
     * Lists the data sources in a knowledge base and information about each one.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Lists the data sources in a knowledge base and information about each one.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of aliases for a flow.
     * </p>
     * 
     * @param listFlowAliasesRequest
     * @return A Java Future containing the result of the ListFlowAliases operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListFlowAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlowAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFlowAliasesResult> listFlowAliasesAsync(ListFlowAliasesRequest listFlowAliasesRequest);

    /**
     * <p>
     * Returns a list of aliases for a flow.
     * </p>
     * 
     * @param listFlowAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFlowAliases operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListFlowAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlowAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFlowAliasesResult> listFlowAliasesAsync(ListFlowAliasesRequest listFlowAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFlowAliasesRequest, ListFlowAliasesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of information about each flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFlowVersionsRequest
     * @return A Java Future containing the result of the ListFlowVersions operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListFlowVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlowVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFlowVersionsResult> listFlowVersionsAsync(ListFlowVersionsRequest listFlowVersionsRequest);

    /**
     * <p>
     * Returns a list of information about each flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFlowVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFlowVersions operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListFlowVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlowVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFlowVersionsResult> listFlowVersionsAsync(ListFlowVersionsRequest listFlowVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFlowVersionsRequest, ListFlowVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of flows and information about each flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-manage.html">Manage a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFlowsRequest
     * @return A Java Future containing the result of the ListFlows operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest listFlowsRequest);

    /**
     * <p>
     * Returns a list of flows and information about each flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-manage.html">Manage a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFlowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFlows operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest listFlowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFlowsRequest, ListFlowsResult> asyncHandler);

    /**
     * <p>
     * Lists the ingestion jobs for a data source and information about each of them.
     * </p>
     * 
     * @param listIngestionJobsRequest
     * @return A Java Future containing the result of the ListIngestionJobs operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionJobsResult> listIngestionJobsAsync(ListIngestionJobsRequest listIngestionJobsRequest);

    /**
     * <p>
     * Lists the ingestion jobs for a data source and information about each of them.
     * </p>
     * 
     * @param listIngestionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIngestionJobs operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionJobsResult> listIngestionJobsAsync(ListIngestionJobsRequest listIngestionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIngestionJobsRequest, ListIngestionJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the knowledge bases in an account and information about each of them.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return A Java Future containing the result of the ListKnowledgeBases operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(ListKnowledgeBasesRequest listKnowledgeBasesRequest);

    /**
     * <p>
     * Lists the knowledge bases in an account and information about each of them.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKnowledgeBases operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(ListKnowledgeBasesRequest listKnowledgeBasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKnowledgeBasesRequest, ListKnowledgeBasesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of prompts from the Prompt management tool and information about each prompt. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-view.html"
     * >View information about prompts using Prompt management</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listPromptsRequest
     * @return A Java Future containing the result of the ListPrompts operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest listPromptsRequest);

    /**
     * <p>
     * Returns a list of prompts from the Prompt management tool and information about each prompt. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-view.html"
     * >View information about prompts using Prompt management</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listPromptsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrompts operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest listPromptsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPromptsRequest, ListPromptsResult> asyncHandler);

    /**
     * <p>
     * List all the tags for the resource you specify.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List all the tags for the resource you specify.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>DRAFT</code> version of the agent that can be used for internal testing.
     * </p>
     * 
     * @param prepareAgentRequest
     * @return A Java Future containing the result of the PrepareAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.PrepareAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PrepareAgentResult> prepareAgentAsync(PrepareAgentRequest prepareAgentRequest);

    /**
     * <p>
     * Creates a <code>DRAFT</code> version of the agent that can be used for internal testing.
     * </p>
     * 
     * @param prepareAgentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PrepareAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.PrepareAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PrepareAgentResult> prepareAgentAsync(PrepareAgentRequest prepareAgentRequest,
            com.amazonaws.handlers.AsyncHandler<PrepareAgentRequest, PrepareAgentResult> asyncHandler);

    /**
     * <p>
     * Prepares the <code>DRAFT</code> version of a flow so that it can be invoked. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-test.html">Test a flow in Amazon Bedrock</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param prepareFlowRequest
     * @return A Java Future containing the result of the PrepareFlow operation returned by the service.
     * @sample AWSBedrockAgentAsync.PrepareFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PrepareFlowResult> prepareFlowAsync(PrepareFlowRequest prepareFlowRequest);

    /**
     * <p>
     * Prepares the <code>DRAFT</code> version of a flow so that it can be invoked. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-test.html">Test a flow in Amazon Bedrock</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param prepareFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PrepareFlow operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.PrepareFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PrepareFlowResult> prepareFlowAsync(PrepareFlowRequest prepareFlowRequest,
            com.amazonaws.handlers.AsyncHandler<PrepareFlowRequest, PrepareFlowResult> asyncHandler);

    /**
     * <p>
     * Begins an ingestion job, in which a data source is added to a knowledge base.
     * </p>
     * 
     * @param startIngestionJobRequest
     * @return A Java Future containing the result of the StartIngestionJob operation returned by the service.
     * @sample AWSBedrockAgentAsync.StartIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StartIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartIngestionJobResult> startIngestionJobAsync(StartIngestionJobRequest startIngestionJobRequest);

    /**
     * <p>
     * Begins an ingestion job, in which a data source is added to a knowledge base.
     * </p>
     * 
     * @param startIngestionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartIngestionJob operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.StartIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StartIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartIngestionJobResult> startIngestionJobAsync(StartIngestionJobRequest startIngestionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartIngestionJobRequest, StartIngestionJobResult> asyncHandler);

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Tagging resources</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBedrockAgentAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Tagging resources</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBedrockAgentAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an agent.
     * </p>
     * 
     * @param updateAgentRequest
     * @return A Java Future containing the result of the UpdateAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest updateAgentRequest);

    /**
     * <p>
     * Updates the configuration of an agent.
     * </p>
     * 
     * @param updateAgentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest updateAgentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentRequest, UpdateAgentResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration for an action group for an agent.
     * </p>
     * 
     * @param updateAgentActionGroupRequest
     * @return A Java Future containing the result of the UpdateAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentActionGroupResult> updateAgentActionGroupAsync(UpdateAgentActionGroupRequest updateAgentActionGroupRequest);

    /**
     * <p>
     * Updates the configuration for an action group for an agent.
     * </p>
     * 
     * @param updateAgentActionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentActionGroupResult> updateAgentActionGroupAsync(UpdateAgentActionGroupRequest updateAgentActionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentActionGroupRequest, UpdateAgentActionGroupResult> asyncHandler);

    /**
     * <p>
     * Updates configurations for an alias of an agent.
     * </p>
     * 
     * @param updateAgentAliasRequest
     * @return A Java Future containing the result of the UpdateAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentAliasResult> updateAgentAliasAsync(UpdateAgentAliasRequest updateAgentAliasRequest);

    /**
     * <p>
     * Updates configurations for an alias of an agent.
     * </p>
     * 
     * @param updateAgentAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentAliasResult> updateAgentAliasAsync(UpdateAgentAliasRequest updateAgentAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentAliasRequest, UpdateAgentAliasResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration for a knowledge base that has been associated with an agent.
     * </p>
     * 
     * @param updateAgentKnowledgeBaseRequest
     * @return A Java Future containing the result of the UpdateAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentKnowledgeBaseResult> updateAgentKnowledgeBaseAsync(UpdateAgentKnowledgeBaseRequest updateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Updates the configuration for a knowledge base that has been associated with an agent.
     * </p>
     * 
     * @param updateAgentKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentKnowledgeBaseResult> updateAgentKnowledgeBaseAsync(UpdateAgentKnowledgeBaseRequest updateAgentKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentKnowledgeBaseRequest, UpdateAgentKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Updates the configurations for a data source connector.
     * </p>
     * <important>
     * <p>
     * You can't change the <code>chunkingConfiguration</code> after you create the data source connector. Specify the
     * existing <code>chunkingConfiguration</code>.
     * </p>
     * </important>
     * 
     * @param updateDataSourceRequest
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates the configurations for a data source connector.
     * </p>
     * <important>
     * <p>
     * You can't change the <code>chunkingConfiguration</code> after you create the data source connector. Specify the
     * existing <code>chunkingConfiguration</code>.
     * </p>
     * </important>
     * 
     * @param updateDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Modifies a flow. Include both fields that you want to keep and fields that you want to change. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html">How it
     * works</a> and <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-create.html">Create a flow in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateFlowRequest
     * @return A Java Future containing the result of the UpdateFlow operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest updateFlowRequest);

    /**
     * <p>
     * Modifies a flow. Include both fields that you want to keep and fields that you want to change. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html">How it
     * works</a> and <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-create.html">Create a flow in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlow operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest updateFlowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowRequest, UpdateFlowResult> asyncHandler);

    /**
     * <p>
     * Modifies the alias of a flow. Include both fields that you want to keep and ones that you want to change. For
     * more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a
     * flow in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateFlowAliasRequest
     * @return A Java Future containing the result of the UpdateFlowAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowAliasResult> updateFlowAliasAsync(UpdateFlowAliasRequest updateFlowAliasRequest);

    /**
     * <p>
     * Modifies the alias of a flow. Include both fields that you want to keep and ones that you want to change. For
     * more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a
     * flow in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateFlowAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlowAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowAliasResult> updateFlowAliasAsync(UpdateFlowAliasRequest updateFlowAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowAliasRequest, UpdateFlowAliasResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of a knowledge base with the fields that you specify. Because all fields will be
     * overwritten, you must include the same values for fields that you want to keep the same.
     * </p>
     * <p>
     * You can change the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>roleArn</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change the <code>knowledgeBaseConfiguration</code> or <code>storageConfiguration</code> fields, so you
     * must specify the same configurations as when you created the knowledge base. You can send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetKnowledgeBase.html"
     * >GetKnowledgeBase</a> request and copy the same configurations.
     * </p>
     * 
     * @param updateKnowledgeBaseRequest
     * @return A Java Future containing the result of the UpdateKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKnowledgeBaseResult> updateKnowledgeBaseAsync(UpdateKnowledgeBaseRequest updateKnowledgeBaseRequest);

    /**
     * <p>
     * Updates the configuration of a knowledge base with the fields that you specify. Because all fields will be
     * overwritten, you must include the same values for fields that you want to keep the same.
     * </p>
     * <p>
     * You can change the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>roleArn</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change the <code>knowledgeBaseConfiguration</code> or <code>storageConfiguration</code> fields, so you
     * must specify the same configurations as when you created the knowledge base. You can send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetKnowledgeBase.html"
     * >GetKnowledgeBase</a> request and copy the same configurations.
     * </p>
     * 
     * @param updateKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKnowledgeBaseResult> updateKnowledgeBaseAsync(UpdateKnowledgeBaseRequest updateKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKnowledgeBaseRequest, UpdateKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Modifies a prompt in your prompt library. Include both fields that you want to keep and fields that you want to
     * replace. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html">Prompt management in Amazon
     * Bedrock</a> and <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-edit">Edit
     * prompts in your prompt library</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updatePromptRequest
     * @return A Java Future containing the result of the UpdatePrompt operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePromptResult> updatePromptAsync(UpdatePromptRequest updatePromptRequest);

    /**
     * <p>
     * Modifies a prompt in your prompt library. Include both fields that you want to keep and fields that you want to
     * replace. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html">Prompt management in Amazon
     * Bedrock</a> and <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-edit">Edit
     * prompts in your prompt library</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updatePromptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePrompt operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePromptResult> updatePromptAsync(UpdatePromptRequest updatePromptRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePromptRequest, UpdatePromptResult> asyncHandler);

}
