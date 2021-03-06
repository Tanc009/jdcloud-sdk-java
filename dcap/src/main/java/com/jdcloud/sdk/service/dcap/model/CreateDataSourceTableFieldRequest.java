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
import com.jdcloud.sdk.service.dcap.model.FieldSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 新建数据源-表-字段
 */
public class CreateDataSourceTableFieldRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新建字段需要的信息
     * Required:true
     */
    @Required
    private FieldSpec fieldSpec;

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
     * get 新建字段需要的信息
     *
     * @return
     */
    public FieldSpec getFieldSpec() {
        return fieldSpec;
    }

    /**
     * set 新建字段需要的信息
     *
     * @param fieldSpec
     */
    public void setFieldSpec(FieldSpec fieldSpec) {
        this.fieldSpec = fieldSpec;
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
     * set 新建字段需要的信息
     *
     * @param fieldSpec
     */
    public CreateDataSourceTableFieldRequest fieldSpec(FieldSpec fieldSpec) {
        this.fieldSpec = fieldSpec;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateDataSourceTableFieldRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 数据源 ID
     *
     * @param dataSourceId
     */
    public CreateDataSourceTableFieldRequest dataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * set 表-名称
     *
     * @param tableName
     */
    public CreateDataSourceTableFieldRequest tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


}