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

package com.jdcloud.sdk.service.disk.model;


/**
 * 快照策略与云硬盘绑定关系
 */
public class DescSnapshotRelationsData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘ID
     */
    private String diskId;

    /**
     * 云硬盘地域ID
     */
    private String diskRegion;

    /**
     * 快照策略ID
     */
    private String policyId;

    /**
     * 绑定时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     */
    private String createTime;


    /**
     * get 云硬盘ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * get 云硬盘地域ID
     *
     * @return
     */
    public String getDiskRegion() {
        return diskRegion;
    }

    /**
     * set 云硬盘地域ID
     *
     * @param diskRegion
     */
    public void setDiskRegion(String diskRegion) {
        this.diskRegion = diskRegion;
    }

    /**
     * get 快照策略ID
     *
     * @return
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * set 快照策略ID
     *
     * @param policyId
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * get 绑定时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 绑定时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public DescSnapshotRelationsData diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * set 云硬盘地域ID
     *
     * @param diskRegion
     */
    public DescSnapshotRelationsData diskRegion(String diskRegion) {
        this.diskRegion = diskRegion;
        return this;
    }

    /**
     * set 快照策略ID
     *
     * @param policyId
     */
    public DescSnapshotRelationsData policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * set 绑定时间。格式&#x60;YYYY-MM-DDTHH:mm:ss+xx:xx&#x60;。如&#x60;2020-02-02T20:02:00+08:00&#x60;
     *
     * @param createTime
     */
    public DescSnapshotRelationsData createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}