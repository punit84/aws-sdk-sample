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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configurations for a node in your flow. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html">Node types in Amazon Bedrock works</a>
 * in the Amazon Bedrock User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowNodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowNodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains configurations for an agent node in your flow. Invokes an alias of an agent and returns the response.
     * </p>
     */
    private AgentFlowNodeConfiguration agent;
    /**
     * <p>
     * Contains configurations for a collector node in your flow. Collects an iteration of inputs and consolidates them
     * into an array of outputs.
     * </p>
     */
    private CollectorFlowNodeConfiguration collector;
    /**
     * <p>
     * Contains configurations for a Condition node in your flow. Defines conditions that lead to different branches of
     * the flow.
     * </p>
     */
    private ConditionFlowNodeConfiguration condition;
    /**
     * <p>
     * Contains configurations for an input flow node in your flow. The first node in the flow. <code>inputs</code>
     * can't be specified for this node.
     * </p>
     */
    private InputFlowNodeConfiguration input;
    /**
     * <p>
     * Contains configurations for an iterator node in your flow. Takes an input that is an array and iteratively sends
     * each item of the array as an output to the following node. The size of the array is also returned in the output.
     * </p>
     * <p>
     * The output flow node at the end of the flow iteration will return a response for each member of the array. To
     * return only one response, you can include a collector node downstream from the iterator node.
     * </p>
     */
    private IteratorFlowNodeConfiguration iterator;
    /**
     * <p>
     * Contains configurations for a knowledge base node in your flow. Queries a knowledge base and returns the
     * retrieved results or generated response.
     * </p>
     */
    private KnowledgeBaseFlowNodeConfiguration knowledgeBase;
    /**
     * <p>
     * Contains configurations for a Lambda function node in your flow. Invokes an Lambda function.
     * </p>
     */
    private LambdaFunctionFlowNodeConfiguration lambdaFunction;
    /**
     * <p>
     * Contains configurations for a Lex node in your flow. Invokes an Amazon Lex bot to identify the intent of the
     * input and return the intent as the output.
     * </p>
     */
    private LexFlowNodeConfiguration lex;
    /**
     * <p>
     * Contains configurations for an output flow node in your flow. The last node in the flow. <code>outputs</code>
     * can't be specified for this node.
     * </p>
     */
    private OutputFlowNodeConfiguration output;
    /**
     * <p>
     * Contains configurations for a prompt node in your flow. Runs a prompt and generates the model response as the
     * output. You can use a prompt from Prompt management or you can configure one in this node.
     * </p>
     */
    private PromptFlowNodeConfiguration prompt;
    /**
     * <p>
     * Contains configurations for a Retrieval node in your flow. Retrieves data from an Amazon S3 location and returns
     * it as the output.
     * </p>
     */
    private RetrievalFlowNodeConfiguration retrieval;
    /**
     * <p>
     * Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location.
     * </p>
     */
    private StorageFlowNodeConfiguration storage;

    /**
     * <p>
     * Contains configurations for an agent node in your flow. Invokes an alias of an agent and returns the response.
     * </p>
     * 
     * @param agent
     *        Contains configurations for an agent node in your flow. Invokes an alias of an agent and returns the
     *        response.
     */

    public void setAgent(AgentFlowNodeConfiguration agent) {
        this.agent = agent;
    }

    /**
     * <p>
     * Contains configurations for an agent node in your flow. Invokes an alias of an agent and returns the response.
     * </p>
     * 
     * @return Contains configurations for an agent node in your flow. Invokes an alias of an agent and returns the
     *         response.
     */

    public AgentFlowNodeConfiguration getAgent() {
        return this.agent;
    }

    /**
     * <p>
     * Contains configurations for an agent node in your flow. Invokes an alias of an agent and returns the response.
     * </p>
     * 
     * @param agent
     *        Contains configurations for an agent node in your flow. Invokes an alias of an agent and returns the
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withAgent(AgentFlowNodeConfiguration agent) {
        setAgent(agent);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a collector node in your flow. Collects an iteration of inputs and consolidates them
     * into an array of outputs.
     * </p>
     * 
     * @param collector
     *        Contains configurations for a collector node in your flow. Collects an iteration of inputs and
     *        consolidates them into an array of outputs.
     */

    public void setCollector(CollectorFlowNodeConfiguration collector) {
        this.collector = collector;
    }

    /**
     * <p>
     * Contains configurations for a collector node in your flow. Collects an iteration of inputs and consolidates them
     * into an array of outputs.
     * </p>
     * 
     * @return Contains configurations for a collector node in your flow. Collects an iteration of inputs and
     *         consolidates them into an array of outputs.
     */

    public CollectorFlowNodeConfiguration getCollector() {
        return this.collector;
    }

    /**
     * <p>
     * Contains configurations for a collector node in your flow. Collects an iteration of inputs and consolidates them
     * into an array of outputs.
     * </p>
     * 
     * @param collector
     *        Contains configurations for a collector node in your flow. Collects an iteration of inputs and
     *        consolidates them into an array of outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withCollector(CollectorFlowNodeConfiguration collector) {
        setCollector(collector);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a Condition node in your flow. Defines conditions that lead to different branches of
     * the flow.
     * </p>
     * 
     * @param condition
     *        Contains configurations for a Condition node in your flow. Defines conditions that lead to different
     *        branches of the flow.
     */

    public void setCondition(ConditionFlowNodeConfiguration condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * Contains configurations for a Condition node in your flow. Defines conditions that lead to different branches of
     * the flow.
     * </p>
     * 
     * @return Contains configurations for a Condition node in your flow. Defines conditions that lead to different
     *         branches of the flow.
     */

    public ConditionFlowNodeConfiguration getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * Contains configurations for a Condition node in your flow. Defines conditions that lead to different branches of
     * the flow.
     * </p>
     * 
     * @param condition
     *        Contains configurations for a Condition node in your flow. Defines conditions that lead to different
     *        branches of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withCondition(ConditionFlowNodeConfiguration condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * Contains configurations for an input flow node in your flow. The first node in the flow. <code>inputs</code>
     * can't be specified for this node.
     * </p>
     * 
     * @param input
     *        Contains configurations for an input flow node in your flow. The first node in the flow.
     *        <code>inputs</code> can't be specified for this node.
     */

    public void setInput(InputFlowNodeConfiguration input) {
        this.input = input;
    }

    /**
     * <p>
     * Contains configurations for an input flow node in your flow. The first node in the flow. <code>inputs</code>
     * can't be specified for this node.
     * </p>
     * 
     * @return Contains configurations for an input flow node in your flow. The first node in the flow.
     *         <code>inputs</code> can't be specified for this node.
     */

    public InputFlowNodeConfiguration getInput() {
        return this.input;
    }

    /**
     * <p>
     * Contains configurations for an input flow node in your flow. The first node in the flow. <code>inputs</code>
     * can't be specified for this node.
     * </p>
     * 
     * @param input
     *        Contains configurations for an input flow node in your flow. The first node in the flow.
     *        <code>inputs</code> can't be specified for this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withInput(InputFlowNodeConfiguration input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Contains configurations for an iterator node in your flow. Takes an input that is an array and iteratively sends
     * each item of the array as an output to the following node. The size of the array is also returned in the output.
     * </p>
     * <p>
     * The output flow node at the end of the flow iteration will return a response for each member of the array. To
     * return only one response, you can include a collector node downstream from the iterator node.
     * </p>
     * 
     * @param iterator
     *        Contains configurations for an iterator node in your flow. Takes an input that is an array and iteratively
     *        sends each item of the array as an output to the following node. The size of the array is also returned in
     *        the output.</p>
     *        <p>
     *        The output flow node at the end of the flow iteration will return a response for each member of the array.
     *        To return only one response, you can include a collector node downstream from the iterator node.
     */

    public void setIterator(IteratorFlowNodeConfiguration iterator) {
        this.iterator = iterator;
    }

    /**
     * <p>
     * Contains configurations for an iterator node in your flow. Takes an input that is an array and iteratively sends
     * each item of the array as an output to the following node. The size of the array is also returned in the output.
     * </p>
     * <p>
     * The output flow node at the end of the flow iteration will return a response for each member of the array. To
     * return only one response, you can include a collector node downstream from the iterator node.
     * </p>
     * 
     * @return Contains configurations for an iterator node in your flow. Takes an input that is an array and
     *         iteratively sends each item of the array as an output to the following node. The size of the array is
     *         also returned in the output.</p>
     *         <p>
     *         The output flow node at the end of the flow iteration will return a response for each member of the
     *         array. To return only one response, you can include a collector node downstream from the iterator node.
     */

    public IteratorFlowNodeConfiguration getIterator() {
        return this.iterator;
    }

    /**
     * <p>
     * Contains configurations for an iterator node in your flow. Takes an input that is an array and iteratively sends
     * each item of the array as an output to the following node. The size of the array is also returned in the output.
     * </p>
     * <p>
     * The output flow node at the end of the flow iteration will return a response for each member of the array. To
     * return only one response, you can include a collector node downstream from the iterator node.
     * </p>
     * 
     * @param iterator
     *        Contains configurations for an iterator node in your flow. Takes an input that is an array and iteratively
     *        sends each item of the array as an output to the following node. The size of the array is also returned in
     *        the output.</p>
     *        <p>
     *        The output flow node at the end of the flow iteration will return a response for each member of the array.
     *        To return only one response, you can include a collector node downstream from the iterator node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withIterator(IteratorFlowNodeConfiguration iterator) {
        setIterator(iterator);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a knowledge base node in your flow. Queries a knowledge base and returns the
     * retrieved results or generated response.
     * </p>
     * 
     * @param knowledgeBase
     *        Contains configurations for a knowledge base node in your flow. Queries a knowledge base and returns the
     *        retrieved results or generated response.
     */

    public void setKnowledgeBase(KnowledgeBaseFlowNodeConfiguration knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }

    /**
     * <p>
     * Contains configurations for a knowledge base node in your flow. Queries a knowledge base and returns the
     * retrieved results or generated response.
     * </p>
     * 
     * @return Contains configurations for a knowledge base node in your flow. Queries a knowledge base and returns the
     *         retrieved results or generated response.
     */

    public KnowledgeBaseFlowNodeConfiguration getKnowledgeBase() {
        return this.knowledgeBase;
    }

    /**
     * <p>
     * Contains configurations for a knowledge base node in your flow. Queries a knowledge base and returns the
     * retrieved results or generated response.
     * </p>
     * 
     * @param knowledgeBase
     *        Contains configurations for a knowledge base node in your flow. Queries a knowledge base and returns the
     *        retrieved results or generated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withKnowledgeBase(KnowledgeBaseFlowNodeConfiguration knowledgeBase) {
        setKnowledgeBase(knowledgeBase);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a Lambda function node in your flow. Invokes an Lambda function.
     * </p>
     * 
     * @param lambdaFunction
     *        Contains configurations for a Lambda function node in your flow. Invokes an Lambda function.
     */

    public void setLambdaFunction(LambdaFunctionFlowNodeConfiguration lambdaFunction) {
        this.lambdaFunction = lambdaFunction;
    }

    /**
     * <p>
     * Contains configurations for a Lambda function node in your flow. Invokes an Lambda function.
     * </p>
     * 
     * @return Contains configurations for a Lambda function node in your flow. Invokes an Lambda function.
     */

    public LambdaFunctionFlowNodeConfiguration getLambdaFunction() {
        return this.lambdaFunction;
    }

    /**
     * <p>
     * Contains configurations for a Lambda function node in your flow. Invokes an Lambda function.
     * </p>
     * 
     * @param lambdaFunction
     *        Contains configurations for a Lambda function node in your flow. Invokes an Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withLambdaFunction(LambdaFunctionFlowNodeConfiguration lambdaFunction) {
        setLambdaFunction(lambdaFunction);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a Lex node in your flow. Invokes an Amazon Lex bot to identify the intent of the
     * input and return the intent as the output.
     * </p>
     * 
     * @param lex
     *        Contains configurations for a Lex node in your flow. Invokes an Amazon Lex bot to identify the intent of
     *        the input and return the intent as the output.
     */

    public void setLex(LexFlowNodeConfiguration lex) {
        this.lex = lex;
    }

    /**
     * <p>
     * Contains configurations for a Lex node in your flow. Invokes an Amazon Lex bot to identify the intent of the
     * input and return the intent as the output.
     * </p>
     * 
     * @return Contains configurations for a Lex node in your flow. Invokes an Amazon Lex bot to identify the intent of
     *         the input and return the intent as the output.
     */

    public LexFlowNodeConfiguration getLex() {
        return this.lex;
    }

    /**
     * <p>
     * Contains configurations for a Lex node in your flow. Invokes an Amazon Lex bot to identify the intent of the
     * input and return the intent as the output.
     * </p>
     * 
     * @param lex
     *        Contains configurations for a Lex node in your flow. Invokes an Amazon Lex bot to identify the intent of
     *        the input and return the intent as the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withLex(LexFlowNodeConfiguration lex) {
        setLex(lex);
        return this;
    }

    /**
     * <p>
     * Contains configurations for an output flow node in your flow. The last node in the flow. <code>outputs</code>
     * can't be specified for this node.
     * </p>
     * 
     * @param output
     *        Contains configurations for an output flow node in your flow. The last node in the flow.
     *        <code>outputs</code> can't be specified for this node.
     */

    public void setOutput(OutputFlowNodeConfiguration output) {
        this.output = output;
    }

    /**
     * <p>
     * Contains configurations for an output flow node in your flow. The last node in the flow. <code>outputs</code>
     * can't be specified for this node.
     * </p>
     * 
     * @return Contains configurations for an output flow node in your flow. The last node in the flow.
     *         <code>outputs</code> can't be specified for this node.
     */

    public OutputFlowNodeConfiguration getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Contains configurations for an output flow node in your flow. The last node in the flow. <code>outputs</code>
     * can't be specified for this node.
     * </p>
     * 
     * @param output
     *        Contains configurations for an output flow node in your flow. The last node in the flow.
     *        <code>outputs</code> can't be specified for this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withOutput(OutputFlowNodeConfiguration output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a prompt node in your flow. Runs a prompt and generates the model response as the
     * output. You can use a prompt from Prompt management or you can configure one in this node.
     * </p>
     * 
     * @param prompt
     *        Contains configurations for a prompt node in your flow. Runs a prompt and generates the model response as
     *        the output. You can use a prompt from Prompt management or you can configure one in this node.
     */

    public void setPrompt(PromptFlowNodeConfiguration prompt) {
        this.prompt = prompt;
    }

    /**
     * <p>
     * Contains configurations for a prompt node in your flow. Runs a prompt and generates the model response as the
     * output. You can use a prompt from Prompt management or you can configure one in this node.
     * </p>
     * 
     * @return Contains configurations for a prompt node in your flow. Runs a prompt and generates the model response as
     *         the output. You can use a prompt from Prompt management or you can configure one in this node.
     */

    public PromptFlowNodeConfiguration getPrompt() {
        return this.prompt;
    }

    /**
     * <p>
     * Contains configurations for a prompt node in your flow. Runs a prompt and generates the model response as the
     * output. You can use a prompt from Prompt management or you can configure one in this node.
     * </p>
     * 
     * @param prompt
     *        Contains configurations for a prompt node in your flow. Runs a prompt and generates the model response as
     *        the output. You can use a prompt from Prompt management or you can configure one in this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withPrompt(PromptFlowNodeConfiguration prompt) {
        setPrompt(prompt);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a Retrieval node in your flow. Retrieves data from an Amazon S3 location and returns
     * it as the output.
     * </p>
     * 
     * @param retrieval
     *        Contains configurations for a Retrieval node in your flow. Retrieves data from an Amazon S3 location and
     *        returns it as the output.
     */

    public void setRetrieval(RetrievalFlowNodeConfiguration retrieval) {
        this.retrieval = retrieval;
    }

    /**
     * <p>
     * Contains configurations for a Retrieval node in your flow. Retrieves data from an Amazon S3 location and returns
     * it as the output.
     * </p>
     * 
     * @return Contains configurations for a Retrieval node in your flow. Retrieves data from an Amazon S3 location and
     *         returns it as the output.
     */

    public RetrievalFlowNodeConfiguration getRetrieval() {
        return this.retrieval;
    }

    /**
     * <p>
     * Contains configurations for a Retrieval node in your flow. Retrieves data from an Amazon S3 location and returns
     * it as the output.
     * </p>
     * 
     * @param retrieval
     *        Contains configurations for a Retrieval node in your flow. Retrieves data from an Amazon S3 location and
     *        returns it as the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withRetrieval(RetrievalFlowNodeConfiguration retrieval) {
        setRetrieval(retrieval);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location.
     * </p>
     * 
     * @param storage
     *        Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location.
     */

    public void setStorage(StorageFlowNodeConfiguration storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location.
     * </p>
     * 
     * @return Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location.
     */

    public StorageFlowNodeConfiguration getStorage() {
        return this.storage;
    }

    /**
     * <p>
     * Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location.
     * </p>
     * 
     * @param storage
     *        Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeConfiguration withStorage(StorageFlowNodeConfiguration storage) {
        setStorage(storage);
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
        if (getAgent() != null)
            sb.append("Agent: ").append(getAgent()).append(",");
        if (getCollector() != null)
            sb.append("Collector: ").append(getCollector()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getIterator() != null)
            sb.append("Iterator: ").append(getIterator()).append(",");
        if (getKnowledgeBase() != null)
            sb.append("KnowledgeBase: ").append(getKnowledgeBase()).append(",");
        if (getLambdaFunction() != null)
            sb.append("LambdaFunction: ").append(getLambdaFunction()).append(",");
        if (getLex() != null)
            sb.append("Lex: ").append(getLex()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getPrompt() != null)
            sb.append("Prompt: ").append(getPrompt()).append(",");
        if (getRetrieval() != null)
            sb.append("Retrieval: ").append(getRetrieval()).append(",");
        if (getStorage() != null)
            sb.append("Storage: ").append(getStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowNodeConfiguration == false)
            return false;
        FlowNodeConfiguration other = (FlowNodeConfiguration) obj;
        if (other.getAgent() == null ^ this.getAgent() == null)
            return false;
        if (other.getAgent() != null && other.getAgent().equals(this.getAgent()) == false)
            return false;
        if (other.getCollector() == null ^ this.getCollector() == null)
            return false;
        if (other.getCollector() != null && other.getCollector().equals(this.getCollector()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getIterator() == null ^ this.getIterator() == null)
            return false;
        if (other.getIterator() != null && other.getIterator().equals(this.getIterator()) == false)
            return false;
        if (other.getKnowledgeBase() == null ^ this.getKnowledgeBase() == null)
            return false;
        if (other.getKnowledgeBase() != null && other.getKnowledgeBase().equals(this.getKnowledgeBase()) == false)
            return false;
        if (other.getLambdaFunction() == null ^ this.getLambdaFunction() == null)
            return false;
        if (other.getLambdaFunction() != null && other.getLambdaFunction().equals(this.getLambdaFunction()) == false)
            return false;
        if (other.getLex() == null ^ this.getLex() == null)
            return false;
        if (other.getLex() != null && other.getLex().equals(this.getLex()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getPrompt() == null ^ this.getPrompt() == null)
            return false;
        if (other.getPrompt() != null && other.getPrompt().equals(this.getPrompt()) == false)
            return false;
        if (other.getRetrieval() == null ^ this.getRetrieval() == null)
            return false;
        if (other.getRetrieval() != null && other.getRetrieval().equals(this.getRetrieval()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgent() == null) ? 0 : getAgent().hashCode());
        hashCode = prime * hashCode + ((getCollector() == null) ? 0 : getCollector().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getIterator() == null) ? 0 : getIterator().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBase() == null) ? 0 : getKnowledgeBase().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunction() == null) ? 0 : getLambdaFunction().hashCode());
        hashCode = prime * hashCode + ((getLex() == null) ? 0 : getLex().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getPrompt() == null) ? 0 : getPrompt().hashCode());
        hashCode = prime * hashCode + ((getRetrieval() == null) ? 0 : getRetrieval().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        return hashCode;
    }

    @Override
    public FlowNodeConfiguration clone() {
        try {
            return (FlowNodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowNodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
