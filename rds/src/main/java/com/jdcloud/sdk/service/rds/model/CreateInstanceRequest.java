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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.rds.model.DBInstanceSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建数据库集群实例&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：支持
 */
public class CreateInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新建实例规格
     * Required:true
     */
    @Required
    private DBInstanceSpec instanceSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 新建实例规格
     *
     * @return
     */
    public DBInstanceSpec getInstanceSpec() {
        return instanceSpec;
    }

    /**
     * set 新建实例规格
     *
     * @param instanceSpec
     */
    public void setInstanceSpec(DBInstanceSpec instanceSpec) {
        this.instanceSpec = instanceSpec;
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
     * set 新建实例规格
     *
     * @param instanceSpec
     */
    public CreateInstanceRequest instanceSpec(DBInstanceSpec instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}