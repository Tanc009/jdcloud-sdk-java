/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * DeviceInfo
 * device管理模块
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设备Topic调用
 */
public class InvokeThingTopicRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Topic如/user/{productKey}/{identifier}/topicShortName
不支持系统Topic

     * Required:true
     */
    @Required
    private String topicShortName;

    /**
     * 要发送的消息主体
     * Required:true
     */
    @Required
    private String topicMessage;

    /**
     * 设备归属的实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 设备归属的实例所在区域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 设备唯一标识
     * Required:true
     */
    @Required
    private String identifier;

    /**
     * 产品Key
     * Required:true
     */
    @Required
    private String productKey;


    /**
     * get Topic如/user/{productKey}/{identifier}/topicShortName
不支持系统Topic

     *
     * @return
     */
    public String getTopicShortName() {
        return topicShortName;
    }

    /**
     * set Topic如/user/{productKey}/{identifier}/topicShortName
不支持系统Topic

     *
     * @param topicShortName
     */
    public void setTopicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
    }

    /**
     * get 要发送的消息主体
     *
     * @return
     */
    public String getTopicMessage() {
        return topicMessage;
    }

    /**
     * set 要发送的消息主体
     *
     * @param topicMessage
     */
    public void setTopicMessage(String topicMessage) {
        this.topicMessage = topicMessage;
    }

    /**
     * get 设备归属的实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 设备归属的实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 设备归属的实例所在区域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 设备唯一标识
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set 设备唯一标识
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * get 产品Key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }


    /**
     * set Topic如/user/{productKey}/{identifier}/topicShortName
不支持系统Topic

     *
     * @param topicShortName
     */
    public InvokeThingTopicRequest topicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
        return this;
    }

    /**
     * set 要发送的消息主体
     *
     * @param topicMessage
     */
    public InvokeThingTopicRequest topicMessage(String topicMessage) {
        this.topicMessage = topicMessage;
        return this;
    }

    /**
     * set 设备归属的实例ID
     *
     * @param instanceId
     */
    public InvokeThingTopicRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public InvokeThingTopicRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 设备唯一标识
     *
     * @param identifier
     */
    public InvokeThingTopicRequest identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public InvokeThingTopicRequest productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }


}