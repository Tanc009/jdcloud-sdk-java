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


/**
 * alertChannel
 */
public class AlertChannel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * created
     */
    private String created;

    /**
     * channel id
     */
    private String uid;

    /**
     * alert channel类型
     */
    private String alertChannelType;

    /**
     * 名称
     */
    private String name;

    /**
     * 详情
     */
    private Object settings;


    /**
     * get created
     *
     * @return
     */
    public String getCreated() {
        return created;
    }

    /**
     * set created
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * get channel id
     *
     * @return
     */
    public String getUid() {
        return uid;
    }

    /**
     * set channel id
     *
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * get alert channel类型
     *
     * @return
     */
    public String getAlertChannelType() {
        return alertChannelType;
    }

    /**
     * set alert channel类型
     *
     * @param alertChannelType
     */
    public void setAlertChannelType(String alertChannelType) {
        this.alertChannelType = alertChannelType;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 详情
     *
     * @return
     */
    public Object getSettings() {
        return settings;
    }

    /**
     * set 详情
     *
     * @param settings
     */
    public void setSettings(Object settings) {
        this.settings = settings;
    }


    /**
     * set created
     *
     * @param created
     */
    public AlertChannel created(String created) {
        this.created = created;
        return this;
    }

    /**
     * set channel id
     *
     * @param uid
     */
    public AlertChannel uid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * set alert channel类型
     *
     * @param alertChannelType
     */
    public AlertChannel alertChannelType(String alertChannelType) {
        this.alertChannelType = alertChannelType;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public AlertChannel name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 详情
     *
     * @param settings
     */
    public AlertChannel settings(Object settings) {
        this.settings = settings;
        return this;
    }


}