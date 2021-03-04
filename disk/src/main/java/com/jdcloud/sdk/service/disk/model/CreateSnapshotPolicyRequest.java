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
 * 快照策略相关接口
 * 云硬盘相关接口，快照策略的创建，更新，删除，查询，绑定/解绑磁盘等接口。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.disk.model.ContactInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建快照策略
 */
public class CreateSnapshotPolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 策略执行周期，单位:秒，不小于12小时
     * Required:true
     */
    @Required
    private Integer interval;

    /**
     * 策略生效时间，格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     * Required:true
     */
    @Required
    private String effectiveTime;

    /**
     * 快照保留时间，单位:秒，0:表示不删除
     * Required:true
     */
    @Required
    private Integer snapshotLifecycle;

    /**
     * 联系人信息
     */
    private ContactInfo contactInfo;

    /**
     * 策略状态。1:启用 2:禁用
     * Required:true
     */
    @Required
    private Integer status;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 策略名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 策略名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 策略执行周期，单位:秒，不小于12小时
     *
     * @return
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * set 策略执行周期，单位:秒，不小于12小时
     *
     * @param interval
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * get 策略生效时间，格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @return
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * set 策略生效时间，格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param effectiveTime
     */
    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * get 快照保留时间，单位:秒，0:表示不删除
     *
     * @return
     */
    public Integer getSnapshotLifecycle() {
        return snapshotLifecycle;
    }

    /**
     * set 快照保留时间，单位:秒，0:表示不删除
     *
     * @param snapshotLifecycle
     */
    public void setSnapshotLifecycle(Integer snapshotLifecycle) {
        this.snapshotLifecycle = snapshotLifecycle;
    }

    /**
     * get 联系人信息
     *
     * @return
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * set 联系人信息
     *
     * @param contactInfo
     */
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * get 策略状态。1:启用 2:禁用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 策略状态。1:启用 2:禁用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 策略名称
     *
     * @param name
     */
    public CreateSnapshotPolicyRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 策略执行周期，单位:秒，不小于12小时
     *
     * @param interval
     */
    public CreateSnapshotPolicyRequest interval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * set 策略生效时间，格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param effectiveTime
     */
    public CreateSnapshotPolicyRequest effectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * set 快照保留时间，单位:秒，0:表示不删除
     *
     * @param snapshotLifecycle
     */
    public CreateSnapshotPolicyRequest snapshotLifecycle(Integer snapshotLifecycle) {
        this.snapshotLifecycle = snapshotLifecycle;
        return this;
    }

    /**
     * set 联系人信息
     *
     * @param contactInfo
     */
    public CreateSnapshotPolicyRequest contactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    /**
     * set 策略状态。1:启用 2:禁用
     *
     * @param status
     */
    public CreateSnapshotPolicyRequest status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateSnapshotPolicyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}