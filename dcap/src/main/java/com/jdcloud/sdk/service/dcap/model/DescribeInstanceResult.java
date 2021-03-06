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
 * Instance
 * 敏感数据保护-实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取实例详情
 */
public class DescribeInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 实例类型-规格 1-&gt;网关版本, 2-&gt;插件版本
     */
    private Integer instanceType;

    /**
     * 区域
     */
    private String insRegion;

    /**
     * 可用区
     */
    private String insZone;

    /**
     * 是否为透传模式
     */
    private Boolean isBypass;

    /**
     * 实例运行状态: 1-&gt;创建中, 2-&gt;运行中, 3-&gt;欠费停服
     */
    private Integer status;

    /**
     * 保护的数据源ID
     */
    private String dataSourceId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 域名（网关版本）
     */
    private String domain;

    /**
     * AccessKey
     */
    private String accessKey;

    /**
     * SecretKey
     */
    private String secretKey;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例类型-规格 1-&gt;网关版本, 2-&gt;插件版本
     *
     * @return
     */
    public Integer getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型-规格 1-&gt;网关版本, 2-&gt;插件版本
     *
     * @param instanceType
     */
    public void setInstanceType(Integer instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 区域
     *
     * @return
     */
    public String getInsRegion() {
        return insRegion;
    }

    /**
     * set 区域
     *
     * @param insRegion
     */
    public void setInsRegion(String insRegion) {
        this.insRegion = insRegion;
    }

    /**
     * get 可用区
     *
     * @return
     */
    public String getInsZone() {
        return insZone;
    }

    /**
     * set 可用区
     *
     * @param insZone
     */
    public void setInsZone(String insZone) {
        this.insZone = insZone;
    }

    /**
     * get 是否为透传模式
     *
     * @return
     */
    public Boolean getIsBypass() {
        return isBypass;
    }

    /**
     * set 是否为透传模式
     *
     * @param isBypass
     */
    public void setIsBypass(Boolean isBypass) {
        this.isBypass = isBypass;
    }

    /**
     * get 实例运行状态: 1-&gt;创建中, 2-&gt;运行中, 3-&gt;欠费停服
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 实例运行状态: 1-&gt;创建中, 2-&gt;运行中, 3-&gt;欠费停服
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 保护的数据源ID
     *
     * @return
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 保护的数据源ID
     *
     * @param dataSourceId
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
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
     * get 域名（网关版本）
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名（网关版本）
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get AccessKey
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set AccessKey
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * get SecretKey
     *
     * @return
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * set SecretKey
     *
     * @param secretKey
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public DescribeInstanceResult instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public DescribeInstanceResult instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例类型-规格 1-&gt;网关版本, 2-&gt;插件版本
     *
     * @param instanceType
     */
    public DescribeInstanceResult instanceType(Integer instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 区域
     *
     * @param insRegion
     */
    public DescribeInstanceResult insRegion(String insRegion) {
        this.insRegion = insRegion;
        return this;
    }

    /**
     * set 可用区
     *
     * @param insZone
     */
    public DescribeInstanceResult insZone(String insZone) {
        this.insZone = insZone;
        return this;
    }

    /**
     * set 是否为透传模式
     *
     * @param isBypass
     */
    public DescribeInstanceResult isBypass(Boolean isBypass) {
        this.isBypass = isBypass;
        return this;
    }

    /**
     * set 实例运行状态: 1-&gt;创建中, 2-&gt;运行中, 3-&gt;欠费停服
     *
     * @param status
     */
    public DescribeInstanceResult status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 保护的数据源ID
     *
     * @param dataSourceId
     */
    public DescribeInstanceResult dataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DescribeInstanceResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public DescribeInstanceResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 域名（网关版本）
     *
     * @param domain
     */
    public DescribeInstanceResult domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set AccessKey
     *
     * @param accessKey
     */
    public DescribeInstanceResult accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * set SecretKey
     *
     * @param secretKey
     */
    public DescribeInstanceResult secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }


}