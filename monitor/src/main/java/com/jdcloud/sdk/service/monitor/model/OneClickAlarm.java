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

import java.util.List;
import java.util.ArrayList;

/**
 * oneClickAlarm
 */
public class OneClickAlarm  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 一键报警规则ID
     */
    private String alarmId;

    /**
     * 一键告警规则配置
in: body
     */
    private List<OneClickAlarmOption> alarmOptions;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否开启, 1表示打开，0表示关闭
     */
    private Long enabled;

    /**
     * 是否由系统规则刚刚创建的，0代表是刚刚创建的，1代表由用户操作过的
     */
    private Long indeed;

    /**
     * 产品线标识
     */
    private String serviceCode;

    /**
     * 产品线名称
     */
    private String serviceName;

    /**
     * 更新时间
     */
    private String updateTime;


    /**
     * get 一键报警规则ID
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 一键报警规则ID
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * get 一键告警规则配置
in: body
     *
     * @return
     */
    public List<OneClickAlarmOption> getAlarmOptions() {
        return alarmOptions;
    }

    /**
     * set 一键告警规则配置
in: body
     *
     * @param alarmOptions
     */
    public void setAlarmOptions(List<OneClickAlarmOption> alarmOptions) {
        this.alarmOptions = alarmOptions;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 是否开启, 1表示打开，0表示关闭
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 是否开启, 1表示打开，0表示关闭
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get 是否由系统规则刚刚创建的，0代表是刚刚创建的，1代表由用户操作过的
     *
     * @return
     */
    public Long getIndeed() {
        return indeed;
    }

    /**
     * set 是否由系统规则刚刚创建的，0代表是刚刚创建的，1代表由用户操作过的
     *
     * @param indeed
     */
    public void setIndeed(Long indeed) {
        this.indeed = indeed;
    }

    /**
     * get 产品线标识
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线标识
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 产品线名称
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set 产品线名称
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 一键报警规则ID
     *
     * @param alarmId
     */
    public OneClickAlarm alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * set 一键告警规则配置
in: body
     *
     * @param alarmOptions
     */
    public OneClickAlarm alarmOptions(List<OneClickAlarmOption> alarmOptions) {
        this.alarmOptions = alarmOptions;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public OneClickAlarm createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public OneClickAlarm description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 是否开启, 1表示打开，0表示关闭
     *
     * @param enabled
     */
    public OneClickAlarm enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 是否由系统规则刚刚创建的，0代表是刚刚创建的，1代表由用户操作过的
     *
     * @param indeed
     */
    public OneClickAlarm indeed(Long indeed) {
        this.indeed = indeed;
        return this;
    }

    /**
     * set 产品线标识
     *
     * @param serviceCode
     */
    public OneClickAlarm serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 产品线名称
     *
     * @param serviceName
     */
    public OneClickAlarm serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public OneClickAlarm updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to 一键告警规则配置
in: body
     *
     * @param alarmOption
     */
    public void addAlarmOption(OneClickAlarmOption alarmOption) {
        if (this.alarmOptions == null) {
            this.alarmOptions = new ArrayList<>();
        }
        this.alarmOptions.add(alarmOption);
    }

}