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
 * DataSource
 * 敏感数据保护-数据源相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除数据源-表
 */
public class DeleteDataSourceTableRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 数据源 ID
     * Required:true
     */
    @Required
    private String dataSourceId;

    /**
     * 表-名称
     * Required:true
     */
    @Required
    private String tableName;


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
     * get 数据源 ID
     *
     * @return
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源 ID
     *
     * @param dataSourceId
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * get 表-名称
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表-名称
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteDataSourceTableRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 数据源 ID
     *
     * @param dataSourceId
     */
    public DeleteDataSourceTableRequest dataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * set 表-名称
     *
     * @param tableName
     */
    public DeleteDataSourceTableRequest tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


}