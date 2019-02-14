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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jcq.model;


/**
 * message
 */
public class Message  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 消息id
     */
    private String messageId;

    /**
     * 内容
     */
    private String body;

    /**
     * tag以逗号隔开
     */
    private String tags;

    /**
     * 用户设置的属性json字符串
     */
    private String properties;

    /**
     * 消息的存储时间
     */
    private Number storeTime;


    /**
     * get 消息id
     *
     * @return
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * set 消息id
     *
     * @param messageId
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * get 内容
     *
     * @return
     */
    public String getBody() {
        return body;
    }

    /**
     * set 内容
     *
     * @param body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * get tag以逗号隔开
     *
     * @return
     */
    public String getTags() {
        return tags;
    }

    /**
     * set tag以逗号隔开
     *
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * get 用户设置的属性json字符串
     *
     * @return
     */
    public String getProperties() {
        return properties;
    }

    /**
     * set 用户设置的属性json字符串
     *
     * @param properties
     */
    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * get 消息的存储时间
     *
     * @return
     */
    public Number getStoreTime() {
        return storeTime;
    }

    /**
     * set 消息的存储时间
     *
     * @param storeTime
     */
    public void setStoreTime(Number storeTime) {
        this.storeTime = storeTime;
    }


    /**
     * set 消息id
     *
     * @param messageId
     */
    public Message messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * set 内容
     *
     * @param body
     */
    public Message body(String body) {
        this.body = body;
        return this;
    }

    /**
     * set tag以逗号隔开
     *
     * @param tags
     */
    public Message tags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 用户设置的属性json字符串
     *
     * @param properties
     */
    public Message properties(String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * set 消息的存储时间
     *
     * @param storeTime
     */
    public Message storeTime(Number storeTime) {
        this.storeTime = storeTime;
        return this;
    }


}