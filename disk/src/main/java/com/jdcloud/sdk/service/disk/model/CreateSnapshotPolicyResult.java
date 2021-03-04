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

import com.jdcloud.sdk.service.disk.model.ContactInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建快照策略
 */
public class CreateSnapshotPolicyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否发送短信。0:不发送 1:发送
     */
    private String id;

    /**
     * 是否发送短信。0:不发送 1:发送
     */
    private String name;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 策略执行间隔，单位:秒
     */
    private Integer interval;

    /**
     * 策略生效时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     */
    private String effectiveTime;

    /**
     * 策略上次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     */
    private String lastTriggerTime;

    /**
     * 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     */
    private String nextTriggerTime;

    /**
     * 快照保留时间。单位:秒。0：永久保留
     */
    private Integer snapshotLifecycle;

    /**
     * 联系人信息
     */
    private ContactInfo contactInfo;

    /**
     * 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     */
    private String createTime;

    /**
     * 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     */
    private String updateTime;

    /**
     * 策略状态。1：启用 2：禁用
     */
    private Integer status;

    /**
     * 策略绑定的disk数量
     */
    private Integer diskCount;


    /**
     * get 是否发送短信。0:不发送 1:发送
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 是否发送短信。0:不发送 1:发送
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 是否发送短信。0:不发送 1:发送
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 是否发送短信。0:不发送 1:发送
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 策略执行间隔，单位:秒
     *
     * @return
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * set 策略执行间隔，单位:秒
     *
     * @param interval
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * get 策略生效时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @return
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * set 策略生效时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param effectiveTime
     */
    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * get 策略上次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @return
     */
    public String getLastTriggerTime() {
        return lastTriggerTime;
    }

    /**
     * set 策略上次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param lastTriggerTime
     */
    public void setLastTriggerTime(String lastTriggerTime) {
        this.lastTriggerTime = lastTriggerTime;
    }

    /**
     * get 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @return
     */
    public String getNextTriggerTime() {
        return nextTriggerTime;
    }

    /**
     * set 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param nextTriggerTime
     */
    public void setNextTriggerTime(String nextTriggerTime) {
        this.nextTriggerTime = nextTriggerTime;
    }

    /**
     * get 快照保留时间。单位:秒。0：永久保留
     *
     * @return
     */
    public Integer getSnapshotLifecycle() {
        return snapshotLifecycle;
    }

    /**
     * set 快照保留时间。单位:秒。0：永久保留
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
     * get 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 策略状态。1：启用 2：禁用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 策略状态。1：启用 2：禁用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 策略绑定的disk数量
     *
     * @return
     */
    public Integer getDiskCount() {
        return diskCount;
    }

    /**
     * set 策略绑定的disk数量
     *
     * @param diskCount
     */
    public void setDiskCount(Integer diskCount) {
        this.diskCount = diskCount;
    }


    /**
     * set 是否发送短信。0:不发送 1:发送
     *
     * @param id
     */
    public CreateSnapshotPolicyResult id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 是否发送短信。0:不发送 1:发送
     *
     * @param name
     */
    public CreateSnapshotPolicyResult name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public CreateSnapshotPolicyResult pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 策略执行间隔，单位:秒
     *
     * @param interval
     */
    public CreateSnapshotPolicyResult interval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * set 策略生效时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param effectiveTime
     */
    public CreateSnapshotPolicyResult effectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * set 策略上次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param lastTriggerTime
     */
    public CreateSnapshotPolicyResult lastTriggerTime(String lastTriggerTime) {
        this.lastTriggerTime = lastTriggerTime;
        return this;
    }

    /**
     * set 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param nextTriggerTime
     */
    public CreateSnapshotPolicyResult nextTriggerTime(String nextTriggerTime) {
        this.nextTriggerTime = nextTriggerTime;
        return this;
    }

    /**
     * set 快照保留时间。单位:秒。0：永久保留
     *
     * @param snapshotLifecycle
     */
    public CreateSnapshotPolicyResult snapshotLifecycle(Integer snapshotLifecycle) {
        this.snapshotLifecycle = snapshotLifecycle;
        return this;
    }

    /**
     * set 联系人信息
     *
     * @param contactInfo
     */
    public CreateSnapshotPolicyResult contactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    /**
     * set 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param createTime
     */
    public CreateSnapshotPolicyResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 策略下次执行时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param updateTime
     */
    public CreateSnapshotPolicyResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 策略状态。1：启用 2：禁用
     *
     * @param status
     */
    public CreateSnapshotPolicyResult status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 策略绑定的disk数量
     *
     * @param diskCount
     */
    public CreateSnapshotPolicyResult diskCount(Integer diskCount) {
        this.diskCount = diskCount;
        return this;
    }


}