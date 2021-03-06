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

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * instanceSpec
 */
public class InstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名称,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     * Required:true
     */
    @Required
    private String instanceName;

    /**
     * 实例类型-规格 1-&gt;网关版本, 2-&gt;插件版本
     * Required:true
     */
    @Required
    private Integer instanceType;

    /**
     * 实例副本数量
     * Required:true
     */
    @Required
    private Integer replicas;

    /**
     * 数据源ID
     * Required:true
     */
    @Required
    private String dataSourceId;

    /**
     * AccessKey
     * Required:true
     */
    @Required
    private String accessKey;

    /**
     * SecretKey
     * Required:true
     */
    @Required
    private String secretKey;


    /**
     * get 实例名称,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
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
     * get 实例副本数量
     *
     * @return
     */
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * set 实例副本数量
     *
     * @param replicas
     */
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * get 数据源ID
     *
     * @return
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源ID
     *
     * @param dataSourceId
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
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
     * set 实例名称,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     *
     * @param instanceName
     */
    public InstanceSpec instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例类型-规格 1-&gt;网关版本, 2-&gt;插件版本
     *
     * @param instanceType
     */
    public InstanceSpec instanceType(Integer instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 实例副本数量
     *
     * @param replicas
     */
    public InstanceSpec replicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * set 数据源ID
     *
     * @param dataSourceId
     */
    public InstanceSpec dataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * set AccessKey
     *
     * @param accessKey
     */
    public InstanceSpec accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * set SecretKey
     *
     * @param secretKey
     */
    public InstanceSpec secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }


}