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
 * ConsumerGroup相关 API
 * 流数据总线ConsumerGroup相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streambus.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除consumerGroupName
 */
public class DeleteConsumerGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主题ID
     * Required:true
     */
    @Required
    private Long topicId;

    /**
     * 消费组ID
     * Required:true
     */
    @Required
    private Long consumerGroupId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 主题ID
     *
     * @return
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * set 主题ID
     *
     * @param topicId
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * get 消费组ID
     *
     * @return
     */
    public Long getConsumerGroupId() {
        return consumerGroupId;
    }

    /**
     * set 消费组ID
     *
     * @param consumerGroupId
     */
    public void setConsumerGroupId(Long consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 主题ID
     *
     * @param topicId
     */
    public DeleteConsumerGroupRequest topicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * set 消费组ID
     *
     * @param consumerGroupId
     */
    public DeleteConsumerGroupRequest consumerGroupId(Long consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteConsumerGroupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}