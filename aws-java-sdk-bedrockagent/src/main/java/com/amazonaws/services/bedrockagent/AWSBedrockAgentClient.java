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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.bedrockagent.AWSBedrockAgentClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.services.bedrockagent.model.transform.*;

/**
 * Client for accessing Agents for Amazon Bedrock. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Describes the API operations for creating and managing Amazon Bedrock agents.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBedrockAgentClient extends AmazonWebServiceClient implements AWSBedrockAgent {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSBedrockAgent.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "bedrock";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrockagent.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrockagent.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrockagent.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrockagent.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrockagent.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrockagent.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.bedrockagent.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.bedrockagent.model.AWSBedrockAgentException.class));

    public static AWSBedrockAgentClientBuilder builder() {
        return AWSBedrockAgentClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Agents for Amazon Bedrock using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBedrockAgentClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Agents for Amazon Bedrock using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBedrockAgentClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("bedrock-agent.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/bedrockagent/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/bedrockagent/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a knowledge base with an agent. If a knowledge base is associated and its <code>indexState</code> is
     * set to <code>Enabled</code>, the agent queries the knowledge base for information to augment its response to the
     * user.
     * </p>
     * 
     * @param associateAgentKnowledgeBaseRequest
     * @return Result of the AssociateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.AssociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AssociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateAgentKnowledgeBaseResult associateAgentKnowledgeBase(AssociateAgentKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAgentKnowledgeBase(request);
    }

    @SdkInternalApi
    final AssociateAgentKnowledgeBaseResult executeAssociateAgentKnowledgeBase(AssociateAgentKnowledgeBaseRequest associateAgentKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAgentKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAgentKnowledgeBaseRequest> request = null;
        Response<AssociateAgentKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAgentKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateAgentKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAgentKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateAgentKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateAgentKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the CreateAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAgentResult createAgent(CreateAgentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAgent(request);
    }

    @SdkInternalApi
    final CreateAgentResult executeCreateAgent(CreateAgentRequest createAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(createAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAgentRequest> request = null;
        Response<CreateAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the CreateAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAgentActionGroupResult createAgentActionGroup(CreateAgentActionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAgentActionGroup(request);
    }

    @SdkInternalApi
    final CreateAgentActionGroupResult executeCreateAgentActionGroup(CreateAgentActionGroupRequest createAgentActionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createAgentActionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAgentActionGroupRequest> request = null;
        Response<CreateAgentActionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAgentActionGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAgentActionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAgentActionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAgentActionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAgentActionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias of an agent that can be used to deploy the agent.
     * </p>
     * 
     * @param createAgentAliasRequest
     * @return Result of the CreateAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAgentAliasResult createAgentAlias(CreateAgentAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAgentAlias(request);
    }

    @SdkInternalApi
    final CreateAgentAliasResult executeCreateAgentAlias(CreateAgentAliasRequest createAgentAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createAgentAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAgentAliasRequest> request = null;
        Response<CreateAgentAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAgentAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAgentAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAgentAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAgentAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAgentAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDataSourceResult createDataSource(CreateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSource(request);
    }

    @SdkInternalApi
    final CreateDataSourceResult executeCreateDataSource(CreateDataSourceRequest createDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceRequest> request = null;
        Response<CreateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the CreateFlow operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFlowResult createFlow(CreateFlowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFlow(request);
    }

    @SdkInternalApi
    final CreateFlowResult executeCreateFlow(CreateFlowRequest createFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(createFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFlowRequest> request = null;
        Response<CreateFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias of a flow for deployment. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createFlowAliasRequest
     * @return Result of the CreateFlowAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateFlowAliasResult createFlowAlias(CreateFlowAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFlowAlias(request);
    }

    @SdkInternalApi
    final CreateFlowAliasResult executeCreateFlowAlias(CreateFlowAliasRequest createFlowAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createFlowAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFlowAliasRequest> request = null;
        Response<CreateFlowAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFlowAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFlowAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFlowAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFlowAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFlowAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a version of the flow that you can deploy. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createFlowVersionRequest
     * @return Result of the CreateFlowVersion operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlowVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFlowVersionResult createFlowVersion(CreateFlowVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFlowVersion(request);
    }

    @SdkInternalApi
    final CreateFlowVersionResult executeCreateFlowVersion(CreateFlowVersionRequest createFlowVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createFlowVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFlowVersionRequest> request = null;
        Response<CreateFlowVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFlowVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFlowVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFlowVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFlowVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFlowVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the CreateKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateKnowledgeBaseResult createKnowledgeBase(CreateKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateKnowledgeBase(request);
    }

    @SdkInternalApi
    final CreateKnowledgeBaseResult executeCreateKnowledgeBase(CreateKnowledgeBaseRequest createKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKnowledgeBaseRequest> request = null;
        Response<CreateKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the CreatePrompt operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePromptResult createPrompt(CreatePromptRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePrompt(request);
    }

    @SdkInternalApi
    final CreatePromptResult executeCreatePrompt(CreatePromptRequest createPromptRequest) {

        ExecutionContext executionContext = createExecutionContext(createPromptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePromptRequest> request = null;
        Response<CreatePromptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePromptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPromptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePrompt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePromptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePromptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a static snapshot of your prompt that can be deployed to production. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html">Deploy prompts using
     * Prompt management by creating versions</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param createPromptVersionRequest
     * @return Result of the CreatePromptVersion operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.CreatePromptVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreatePromptVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePromptVersionResult createPromptVersion(CreatePromptVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePromptVersion(request);
    }

    @SdkInternalApi
    final CreatePromptVersionResult executeCreatePromptVersion(CreatePromptVersionRequest createPromptVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createPromptVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePromptVersionRequest> request = null;
        Response<CreatePromptVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePromptVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPromptVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePromptVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePromptVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePromptVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an agent.
     * </p>
     * 
     * @param deleteAgentRequest
     * @return Result of the DeleteAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAgentResult deleteAgent(DeleteAgentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAgent(request);
    }

    @SdkInternalApi
    final DeleteAgentResult executeDeleteAgent(DeleteAgentRequest deleteAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAgentRequest> request = null;
        Response<DeleteAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an action group in an agent.
     * </p>
     * 
     * @param deleteAgentActionGroupRequest
     * @return Result of the DeleteAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAgentActionGroupResult deleteAgentActionGroup(DeleteAgentActionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAgentActionGroup(request);
    }

    @SdkInternalApi
    final DeleteAgentActionGroupResult executeDeleteAgentActionGroup(DeleteAgentActionGroupRequest deleteAgentActionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAgentActionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAgentActionGroupRequest> request = null;
        Response<DeleteAgentActionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAgentActionGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAgentActionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAgentActionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAgentActionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAgentActionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alias of an agent.
     * </p>
     * 
     * @param deleteAgentAliasRequest
     * @return Result of the DeleteAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.DeleteAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAgentAliasResult deleteAgentAlias(DeleteAgentAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAgentAlias(request);
    }

    @SdkInternalApi
    final DeleteAgentAliasResult executeDeleteAgentAlias(DeleteAgentAliasRequest deleteAgentAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAgentAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAgentAliasRequest> request = null;
        Response<DeleteAgentAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAgentAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAgentAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAgentAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAgentAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAgentAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a version of an agent.
     * </p>
     * 
     * @param deleteAgentVersionRequest
     * @return Result of the DeleteAgentVersion operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAgentVersionResult deleteAgentVersion(DeleteAgentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAgentVersion(request);
    }

    @SdkInternalApi
    final DeleteAgentVersionResult executeDeleteAgentVersion(DeleteAgentVersionRequest deleteAgentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAgentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAgentVersionRequest> request = null;
        Response<DeleteAgentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAgentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAgentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAgentVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAgentVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAgentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a data source from a knowledge base.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataSource(request);
    }

    @SdkInternalApi
    final DeleteDataSourceResult executeDeleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSourceRequest> request = null;
        Response<DeleteDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a flow.
     * </p>
     * 
     * @param deleteFlowRequest
     * @return Result of the DeleteFlow operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFlowResult deleteFlow(DeleteFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFlow(request);
    }

    @SdkInternalApi
    final DeleteFlowResult executeDeleteFlow(DeleteFlowRequest deleteFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFlowRequest> request = null;
        Response<DeleteFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alias of a flow.
     * </p>
     * 
     * @param deleteFlowAliasRequest
     * @return Result of the DeleteFlowAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteFlowAliasResult deleteFlowAlias(DeleteFlowAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFlowAlias(request);
    }

    @SdkInternalApi
    final DeleteFlowAliasResult executeDeleteFlowAlias(DeleteFlowAliasRequest deleteFlowAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFlowAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFlowAliasRequest> request = null;
        Response<DeleteFlowAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFlowAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFlowAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFlowAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFlowAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFlowAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a version of a flow.
     * </p>
     * 
     * @param deleteFlowVersionRequest
     * @return Result of the DeleteFlowVersion operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlowVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFlowVersionResult deleteFlowVersion(DeleteFlowVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFlowVersion(request);
    }

    @SdkInternalApi
    final DeleteFlowVersionResult executeDeleteFlowVersion(DeleteFlowVersionRequest deleteFlowVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFlowVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFlowVersionRequest> request = null;
        Response<DeleteFlowVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFlowVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFlowVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFlowVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFlowVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFlowVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a knowledge base. Before deleting a knowledge base, you should disassociate the knowledge base from any
     * agents that it is associated with by making a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_DisassociateAgentKnowledgeBase.html"
     * >DisassociateAgentKnowledgeBase</a> request.
     * </p>
     * 
     * @param deleteKnowledgeBaseRequest
     * @return Result of the DeleteKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteKnowledgeBaseResult deleteKnowledgeBase(DeleteKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKnowledgeBase(request);
    }

    @SdkInternalApi
    final DeleteKnowledgeBaseResult executeDeleteKnowledgeBase(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKnowledgeBaseRequest> request = null;
        Response<DeleteKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the DeletePrompt operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DeletePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeletePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePromptResult deletePrompt(DeletePromptRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePrompt(request);
    }

    @SdkInternalApi
    final DeletePromptResult executeDeletePrompt(DeletePromptRequest deletePromptRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePromptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePromptRequest> request = null;
        Response<DeletePromptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePromptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePromptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePrompt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePromptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePromptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a knowledge base from an agent.
     * </p>
     * 
     * @param disassociateAgentKnowledgeBaseRequest
     * @return Result of the DisassociateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.DisassociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DisassociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateAgentKnowledgeBaseResult disassociateAgentKnowledgeBase(DisassociateAgentKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateAgentKnowledgeBase(request);
    }

    @SdkInternalApi
    final DisassociateAgentKnowledgeBaseResult executeDisassociateAgentKnowledgeBase(DisassociateAgentKnowledgeBaseRequest disassociateAgentKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateAgentKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAgentKnowledgeBaseRequest> request = null;
        Response<DisassociateAgentKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAgentKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateAgentKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateAgentKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateAgentKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateAgentKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an agent.
     * </p>
     * 
     * @param getAgentRequest
     * @return Result of the GetAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAgentResult getAgent(GetAgentRequest request) {
        request = beforeClientExecution(request);
        return executeGetAgent(request);
    }

    @SdkInternalApi
    final GetAgentResult executeGetAgent(GetAgentRequest getAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(getAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAgentRequest> request = null;
        Response<GetAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAgentResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an action group for an agent.
     * </p>
     * 
     * @param getAgentActionGroupRequest
     * @return Result of the GetAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAgentActionGroupResult getAgentActionGroup(GetAgentActionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetAgentActionGroup(request);
    }

    @SdkInternalApi
    final GetAgentActionGroupResult executeGetAgentActionGroup(GetAgentActionGroupRequest getAgentActionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getAgentActionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAgentActionGroupRequest> request = null;
        Response<GetAgentActionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAgentActionGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAgentActionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAgentActionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAgentActionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAgentActionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an alias of an agent.
     * </p>
     * 
     * @param getAgentAliasRequest
     * @return Result of the GetAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAgentAliasResult getAgentAlias(GetAgentAliasRequest request) {
        request = beforeClientExecution(request);
        return executeGetAgentAlias(request);
    }

    @SdkInternalApi
    final GetAgentAliasResult executeGetAgentAlias(GetAgentAliasRequest getAgentAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(getAgentAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAgentAliasRequest> request = null;
        Response<GetAgentAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAgentAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAgentAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAgentAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAgentAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAgentAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a knowledge base associated with an agent.
     * </p>
     * 
     * @param getAgentKnowledgeBaseRequest
     * @return Result of the GetAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAgentKnowledgeBaseResult getAgentKnowledgeBase(GetAgentKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetAgentKnowledgeBase(request);
    }

    @SdkInternalApi
    final GetAgentKnowledgeBaseResult executeGetAgentKnowledgeBase(GetAgentKnowledgeBaseRequest getAgentKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getAgentKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAgentKnowledgeBaseRequest> request = null;
        Response<GetAgentKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAgentKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAgentKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAgentKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAgentKnowledgeBaseResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetAgentKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a version of an agent.
     * </p>
     * 
     * @param getAgentVersionRequest
     * @return Result of the GetAgentVersion operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAgentVersionResult getAgentVersion(GetAgentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetAgentVersion(request);
    }

    @SdkInternalApi
    final GetAgentVersionResult executeGetAgentVersion(GetAgentVersionRequest getAgentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getAgentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAgentVersionRequest> request = null;
        Response<GetAgentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAgentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAgentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAgentVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAgentVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAgentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a data source.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDataSourceResult getDataSource(GetDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataSource(request);
    }

    @SdkInternalApi
    final GetDataSourceResult executeGetDataSource(GetDataSourceRequest getDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSourceRequest> request = null;
        Response<GetDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-manage.html">Manage a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowRequest
     * @return Result of the GetFlow operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFlowResult getFlow(GetFlowRequest request) {
        request = beforeClientExecution(request);
        return executeGetFlow(request);
    }

    @SdkInternalApi
    final GetFlowResult executeGetFlow(GetFlowRequest getFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(getFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFlowRequest> request = null;
        Response<GetFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowAliasRequest
     * @return Result of the GetFlowAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlowAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFlowAliasResult getFlowAlias(GetFlowAliasRequest request) {
        request = beforeClientExecution(request);
        return executeGetFlowAlias(request);
    }

    @SdkInternalApi
    final GetFlowAliasResult executeGetFlowAlias(GetFlowAliasRequest getFlowAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(getFlowAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFlowAliasRequest> request = null;
        Response<GetFlowAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFlowAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFlowAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFlowAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFlowAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFlowAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a version of a flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param getFlowVersionRequest
     * @return Result of the GetFlowVersion operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetFlowVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetFlowVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetFlowVersionResult getFlowVersion(GetFlowVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetFlowVersion(request);
    }

    @SdkInternalApi
    final GetFlowVersionResult executeGetFlowVersion(GetFlowVersionRequest getFlowVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getFlowVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFlowVersionRequest> request = null;
        Response<GetFlowVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFlowVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFlowVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFlowVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFlowVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFlowVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a ingestion job, in which a data source is added to a knowledge base.
     * </p>
     * 
     * @param getIngestionJobRequest
     * @return Result of the GetIngestionJob operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetIngestionJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetIngestionJobResult getIngestionJob(GetIngestionJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetIngestionJob(request);
    }

    @SdkInternalApi
    final GetIngestionJobResult executeGetIngestionJob(GetIngestionJobRequest getIngestionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getIngestionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIngestionJobRequest> request = null;
        Response<GetIngestionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIngestionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIngestionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIngestionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIngestionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIngestionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a knoweldge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return Result of the GetKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetKnowledgeBaseResult getKnowledgeBase(GetKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetKnowledgeBase(request);
    }

    @SdkInternalApi
    final GetKnowledgeBaseResult executeGetKnowledgeBase(GetKnowledgeBaseRequest getKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKnowledgeBaseRequest> request = null;
        Response<GetKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the GetPrompt operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.GetPrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetPrompt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPromptResult getPrompt(GetPromptRequest request) {
        request = beforeClientExecution(request);
        return executeGetPrompt(request);
    }

    @SdkInternalApi
    final GetPromptResult executeGetPrompt(GetPromptRequest getPromptRequest) {

        ExecutionContext executionContext = createExecutionContext(getPromptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPromptRequest> request = null;
        Response<GetPromptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPromptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPromptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPrompt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPromptResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPromptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the action groups for an agent and information about each one.
     * </p>
     * 
     * @param listAgentActionGroupsRequest
     * @return Result of the ListAgentActionGroups operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListAgentActionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentActionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAgentActionGroupsResult listAgentActionGroups(ListAgentActionGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListAgentActionGroups(request);
    }

    @SdkInternalApi
    final ListAgentActionGroupsResult executeListAgentActionGroups(ListAgentActionGroupsRequest listAgentActionGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAgentActionGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAgentActionGroupsRequest> request = null;
        Response<ListAgentActionGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAgentActionGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAgentActionGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAgentActionGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAgentActionGroupsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAgentActionGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the aliases of an agent and information about each one.
     * </p>
     * 
     * @param listAgentAliasesRequest
     * @return Result of the ListAgentAliases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListAgentAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAgentAliasesResult listAgentAliases(ListAgentAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListAgentAliases(request);
    }

    @SdkInternalApi
    final ListAgentAliasesResult executeListAgentAliases(ListAgentAliasesRequest listAgentAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAgentAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAgentAliasesRequest> request = null;
        Response<ListAgentAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAgentAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAgentAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAgentAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAgentAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAgentAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists knowledge bases associated with an agent and information about each one.
     * </p>
     * 
     * @param listAgentKnowledgeBasesRequest
     * @return Result of the ListAgentKnowledgeBases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListAgentKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAgentKnowledgeBasesResult listAgentKnowledgeBases(ListAgentKnowledgeBasesRequest request) {
        request = beforeClientExecution(request);
        return executeListAgentKnowledgeBases(request);
    }

    @SdkInternalApi
    final ListAgentKnowledgeBasesResult executeListAgentKnowledgeBases(ListAgentKnowledgeBasesRequest listAgentKnowledgeBasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAgentKnowledgeBasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAgentKnowledgeBasesRequest> request = null;
        Response<ListAgentKnowledgeBasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAgentKnowledgeBasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAgentKnowledgeBasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAgentKnowledgeBases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAgentKnowledgeBasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAgentKnowledgeBasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the versions of an agent and information about each version.
     * </p>
     * 
     * @param listAgentVersionsRequest
     * @return Result of the ListAgentVersions operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAgentVersionsResult listAgentVersions(ListAgentVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListAgentVersions(request);
    }

    @SdkInternalApi
    final ListAgentVersionsResult executeListAgentVersions(ListAgentVersionsRequest listAgentVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAgentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAgentVersionsRequest> request = null;
        Response<ListAgentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAgentVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAgentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAgentVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAgentVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAgentVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the agents belonging to an account and information about each agent.
     * </p>
     * 
     * @param listAgentsRequest
     * @return Result of the ListAgents operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSBedrockAgent.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAgentsResult listAgents(ListAgentsRequest request) {
        request = beforeClientExecution(request);
        return executeListAgents(request);
    }

    @SdkInternalApi
    final ListAgentsResult executeListAgents(ListAgentsRequest listAgentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAgentsRequest> request = null;
        Response<ListAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAgentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAgents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAgentsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAgentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the data sources in a knowledge base and information about each one.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDataSourcesResult listDataSources(ListDataSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSources(request);
    }

    @SdkInternalApi
    final ListDataSourcesResult executeListDataSources(ListDataSourcesRequest listDataSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourcesRequest> request = null;
        Response<ListDataSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of aliases for a flow.
     * </p>
     * 
     * @param listFlowAliasesRequest
     * @return Result of the ListFlowAliases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListFlowAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlowAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFlowAliasesResult listFlowAliases(ListFlowAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListFlowAliases(request);
    }

    @SdkInternalApi
    final ListFlowAliasesResult executeListFlowAliases(ListFlowAliasesRequest listFlowAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFlowAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowAliasesRequest> request = null;
        Response<ListFlowAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFlowAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFlowAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFlowAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFlowAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of information about each flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFlowVersionsRequest
     * @return Result of the ListFlowVersions operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListFlowVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlowVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFlowVersionsResult listFlowVersions(ListFlowVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListFlowVersions(request);
    }

    @SdkInternalApi
    final ListFlowVersionsResult executeListFlowVersions(ListFlowVersionsRequest listFlowVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFlowVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowVersionsRequest> request = null;
        Response<ListFlowVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFlowVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFlowVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFlowVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFlowVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of flows and information about each flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-manage.html">Manage a flow in Amazon Bedrock</a>
     * in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listFlowsRequest
     * @return Result of the ListFlows operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSBedrockAgent.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFlowsResult listFlows(ListFlowsRequest request) {
        request = beforeClientExecution(request);
        return executeListFlows(request);
    }

    @SdkInternalApi
    final ListFlowsResult executeListFlows(ListFlowsRequest listFlowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowsRequest> request = null;
        Response<ListFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFlows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFlowsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFlowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the ingestion jobs for a data source and information about each of them.
     * </p>
     * 
     * @param listIngestionJobsRequest
     * @return Result of the ListIngestionJobs operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIngestionJobsResult listIngestionJobs(ListIngestionJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListIngestionJobs(request);
    }

    @SdkInternalApi
    final ListIngestionJobsResult executeListIngestionJobs(ListIngestionJobsRequest listIngestionJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIngestionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIngestionJobsRequest> request = null;
        Response<ListIngestionJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIngestionJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIngestionJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIngestionJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIngestionJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIngestionJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the knowledge bases in an account and information about each of them.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return Result of the ListKnowledgeBases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AWSBedrockAgent.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListKnowledgeBasesResult listKnowledgeBases(ListKnowledgeBasesRequest request) {
        request = beforeClientExecution(request);
        return executeListKnowledgeBases(request);
    }

    @SdkInternalApi
    final ListKnowledgeBasesResult executeListKnowledgeBases(ListKnowledgeBasesRequest listKnowledgeBasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listKnowledgeBasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKnowledgeBasesRequest> request = null;
        Response<ListKnowledgeBasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKnowledgeBasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listKnowledgeBasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKnowledgeBases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKnowledgeBasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListKnowledgeBasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of prompts from the Prompt management tool and information about each prompt. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-manage.html#prompt-management-view.html"
     * >View information about prompts using Prompt management</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param listPromptsRequest
     * @return Result of the ListPrompts operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPromptsResult listPrompts(ListPromptsRequest request) {
        request = beforeClientExecution(request);
        return executeListPrompts(request);
    }

    @SdkInternalApi
    final ListPromptsResult executeListPrompts(ListPromptsRequest listPromptsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPromptsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPromptsRequest> request = null;
        Response<ListPromptsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPromptsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPromptsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPrompts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPromptsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPromptsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all the tags for the resource you specify.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>DRAFT</code> version of the agent that can be used for internal testing.
     * </p>
     * 
     * @param prepareAgentRequest
     * @return Result of the PrepareAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.PrepareAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PrepareAgentResult prepareAgent(PrepareAgentRequest request) {
        request = beforeClientExecution(request);
        return executePrepareAgent(request);
    }

    @SdkInternalApi
    final PrepareAgentResult executePrepareAgent(PrepareAgentRequest prepareAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(prepareAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PrepareAgentRequest> request = null;
        Response<PrepareAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PrepareAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(prepareAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PrepareAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PrepareAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PrepareAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Prepares the <code>DRAFT</code> version of a flow so that it can be invoked. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-test.html">Test a flow in Amazon Bedrock</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param prepareFlowRequest
     * @return Result of the PrepareFlow operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.PrepareFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PrepareFlowResult prepareFlow(PrepareFlowRequest request) {
        request = beforeClientExecution(request);
        return executePrepareFlow(request);
    }

    @SdkInternalApi
    final PrepareFlowResult executePrepareFlow(PrepareFlowRequest prepareFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(prepareFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PrepareFlowRequest> request = null;
        Response<PrepareFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PrepareFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(prepareFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PrepareFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PrepareFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PrepareFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Begins an ingestion job, in which a data source is added to a knowledge base.
     * </p>
     * 
     * @param startIngestionJobRequest
     * @return Result of the StartIngestionJob operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.StartIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StartIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartIngestionJobResult startIngestionJob(StartIngestionJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartIngestionJob(request);
    }

    @SdkInternalApi
    final StartIngestionJobResult executeStartIngestionJob(StartIngestionJobRequest startIngestionJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startIngestionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartIngestionJobRequest> request = null;
        Response<StartIngestionJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartIngestionJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startIngestionJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartIngestionJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartIngestionJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartIngestionJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Tagging resources</a> in the
     * Amazon Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @sample AWSBedrockAgent.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an agent.
     * </p>
     * 
     * @param updateAgentRequest
     * @return Result of the UpdateAgent operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAgentResult updateAgent(UpdateAgentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAgent(request);
    }

    @SdkInternalApi
    final UpdateAgentResult executeUpdateAgent(UpdateAgentRequest updateAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAgentRequest> request = null;
        Response<UpdateAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration for an action group for an agent.
     * </p>
     * 
     * @param updateAgentActionGroupRequest
     * @return Result of the UpdateAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAgentActionGroupResult updateAgentActionGroup(UpdateAgentActionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAgentActionGroup(request);
    }

    @SdkInternalApi
    final UpdateAgentActionGroupResult executeUpdateAgentActionGroup(UpdateAgentActionGroupRequest updateAgentActionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAgentActionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAgentActionGroupRequest> request = null;
        Response<UpdateAgentActionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAgentActionGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAgentActionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAgentActionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAgentActionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAgentActionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates configurations for an alias of an agent.
     * </p>
     * 
     * @param updateAgentAliasRequest
     * @return Result of the UpdateAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAgentAliasResult updateAgentAlias(UpdateAgentAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAgentAlias(request);
    }

    @SdkInternalApi
    final UpdateAgentAliasResult executeUpdateAgentAlias(UpdateAgentAliasRequest updateAgentAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAgentAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAgentAliasRequest> request = null;
        Response<UpdateAgentAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAgentAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAgentAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAgentAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAgentAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAgentAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration for a knowledge base that has been associated with an agent.
     * </p>
     * 
     * @param updateAgentKnowledgeBaseRequest
     * @return Result of the UpdateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.UpdateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAgentKnowledgeBaseResult updateAgentKnowledgeBase(UpdateAgentKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAgentKnowledgeBase(request);
    }

    @SdkInternalApi
    final UpdateAgentKnowledgeBaseResult executeUpdateAgentKnowledgeBase(UpdateAgentKnowledgeBaseRequest updateAgentKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAgentKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAgentKnowledgeBaseRequest> request = null;
        Response<UpdateAgentKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAgentKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAgentKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAgentKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAgentKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAgentKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSource(request);
    }

    @SdkInternalApi
    final UpdateDataSourceResult executeUpdateDataSource(UpdateDataSourceRequest updateDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourceRequest> request = null;
        Response<UpdateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a flow. Include both fields that you want to keep and fields that you want to change. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html">How it
     * works</a> and <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-create.html">Create a flow in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateFlowRequest
     * @return Result of the UpdateFlow operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFlowResult updateFlow(UpdateFlowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlow(request);
    }

    @SdkInternalApi
    final UpdateFlowResult executeUpdateFlow(UpdateFlowRequest updateFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowRequest> request = null;
        Response<UpdateFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the alias of a flow. Include both fields that you want to keep and ones that you want to change. For
     * more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-deploy.html">Deploy a
     * flow in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param updateFlowAliasRequest
     * @return Result of the UpdateFlowAlias operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdateFlowAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlowAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFlowAliasResult updateFlowAlias(UpdateFlowAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlowAlias(request);
    }

    @SdkInternalApi
    final UpdateFlowAliasResult executeUpdateFlowAlias(UpdateFlowAliasRequest updateFlowAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowAliasRequest> request = null;
        Response<UpdateFlowAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlowAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFlowAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the UpdateKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @sample AWSBedrockAgent.UpdateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateKnowledgeBaseResult updateKnowledgeBase(UpdateKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateKnowledgeBase(request);
    }

    @SdkInternalApi
    final UpdateKnowledgeBaseResult executeUpdateKnowledgeBase(UpdateKnowledgeBaseRequest updateKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateKnowledgeBaseRequest> request = null;
        Response<UpdateKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the UpdatePrompt operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ConflictException
     *         There was a conflict performing an operation.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgent.UpdatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePromptResult updatePrompt(UpdatePromptRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePrompt(request);
    }

    @SdkInternalApi
    final UpdatePromptResult executeUpdatePrompt(UpdatePromptRequest updatePromptRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePromptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePromptRequest> request = null;
        Response<UpdatePromptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePromptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePromptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Bedrock Agent");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePrompt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePromptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePromptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
