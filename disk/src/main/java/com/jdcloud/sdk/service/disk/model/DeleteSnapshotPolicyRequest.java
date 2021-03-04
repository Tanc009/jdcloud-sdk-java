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
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除快照策略
 */
public class DeleteSnapshotPolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 策略ID
     * Required:true
     */
    @Required
    private String policyId;


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
     * get 策略ID
     *
     * @return
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * set 策略ID
     *
     * @param policyId
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DeleteSnapshotPolicyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 策略ID
     *
     * @param policyId
     */
    public DeleteSnapshotPolicyRequest policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }


}