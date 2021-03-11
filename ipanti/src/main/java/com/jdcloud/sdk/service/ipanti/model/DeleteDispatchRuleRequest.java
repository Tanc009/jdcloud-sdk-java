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
 * Anti DDos Pro Dispatch Rule
 * Anti DDos Pro Dispatch Rule Configuration APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除防护调度规则
 */
public class DeleteDispatchRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 高防实例 Id
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 防护调度规则 Id
     * Required:true
     */
    @Required
    private String dispatchRuleId;


    /**
     * get 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 高防实例 Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 高防实例 Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 防护调度规则 Id
     *
     * @return
     */
    public String getDispatchRuleId() {
        return dispatchRuleId;
    }

    /**
     * set 防护调度规则 Id
     *
     * @param dispatchRuleId
     */
    public void setDispatchRuleId(String dispatchRuleId) {
        this.dispatchRuleId = dispatchRuleId;
    }


    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public DeleteDispatchRuleRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 高防实例 Id
     *
     * @param instanceId
     */
    public DeleteDispatchRuleRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 防护调度规则 Id
     *
     * @param dispatchRuleId
     */
    public DeleteDispatchRuleRequest dispatchRuleId(String dispatchRuleId) {
        this.dispatchRuleId = dispatchRuleId;
        return this;
    }


}