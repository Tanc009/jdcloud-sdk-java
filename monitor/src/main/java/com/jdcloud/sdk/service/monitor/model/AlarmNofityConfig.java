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

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * alarmNofityConfig
 */
public class AlarmNofityConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ark节点
     * Required:true
     */
    @Required
    private String arkNode;

    /**
     * 通知channle名称
     * Required:true
     */
    @Required
    private String channelName;

    /**
     * 通知channle目的地url
     * Required:true
     */
    @Required
    private String channelUrl;


    /**
     * get ark节点
     *
     * @return
     */
    public String getArkNode() {
        return arkNode;
    }

    /**
     * set ark节点
     *
     * @param arkNode
     */
    public void setArkNode(String arkNode) {
        this.arkNode = arkNode;
    }

    /**
     * get 通知channle名称
     *
     * @return
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * set 通知channle名称
     *
     * @param channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * get 通知channle目的地url
     *
     * @return
     */
    public String getChannelUrl() {
        return channelUrl;
    }

    /**
     * set 通知channle目的地url
     *
     * @param channelUrl
     */
    public void setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl;
    }


    /**
     * set ark节点
     *
     * @param arkNode
     */
    public AlarmNofityConfig arkNode(String arkNode) {
        this.arkNode = arkNode;
        return this;
    }

    /**
     * set 通知channle名称
     *
     * @param channelName
     */
    public AlarmNofityConfig channelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * set 通知channle目的地url
     *
     * @param channelUrl
     */
    public AlarmNofityConfig channelUrl(String channelUrl) {
        this.channelUrl = channelUrl;
        return this;
    }


}