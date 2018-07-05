/*
 * Copyright 2018-2025 JDCLOUD.COM
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
 * instance相关接口
 * API related to MONGODB instances
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mongodb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 变更实例规格
 */
public class ModifyInstanceSpecRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格，包年包月不允许小于当前规格。
     * Required:true
     */
    @Required
    private String instanceClass;

    /**
     * 存储空间，包年包月不允许小于当前规格。
     * Required:true
     */
    @Required
    private Integer instanceStorageGB;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Instance ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 实例规格，包年包月不允许小于当前规格。
     *
     * @return
     */
    public String getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 实例规格，包年包月不允许小于当前规格。
     *
     * @param instanceClass
     */
    public void setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get 存储空间，包年包月不允许小于当前规格。
     *
     * @return
     */
    public Integer getInstanceStorageGB() {
        return instanceStorageGB;
    }

    /**
     * set 存储空间，包年包月不允许小于当前规格。
     *
     * @param instanceStorageGB
     */
    public void setInstanceStorageGB(Integer instanceStorageGB) {
        this.instanceStorageGB = instanceStorageGB;
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
     * get Instance ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 实例规格，包年包月不允许小于当前规格。
     *
     * @param instanceClass
     */
    public ModifyInstanceSpecRequest instanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set 存储空间，包年包月不允许小于当前规格。
     *
     * @param instanceStorageGB
     */
    public ModifyInstanceSpecRequest instanceStorageGB(Integer instanceStorageGB) {
        this.instanceStorageGB = instanceStorageGB;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyInstanceSpecRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public ModifyInstanceSpecRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}