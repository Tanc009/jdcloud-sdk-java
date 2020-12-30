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
 * Cloud-Physical-Server
 * 云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 绑定弹性公网IP

 */
public class AssociateElasticIpRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     */
    private String clientToken;

    /**
     * 弹性公网IPID
     * Required:true
     */
    @Required
    private String elasticIpId;

    /**
     * 私有IP
     */
    private String targetIp;

    /**
     * 主网口或辅网口的子网ID，多网口实例必填
     */
    private String subnetId;

    /**
     * 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云物理服务器ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get 弹性公网IPID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性公网IPID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }

    /**
     * get 私有IP
     *
     * @return
     */
    public String getTargetIp() {
        return targetIp;
    }

    /**
     * set 私有IP
     *
     * @param targetIp
     */
    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    /**
     * get 主网口或辅网口的子网ID，多网口实例必填
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 主网口或辅网口的子网ID，多网口实例必填
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云物理服务器ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云物理服务器ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @param clientToken
     */
    public AssociateElasticIpRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set 弹性公网IPID
     *
     * @param elasticIpId
     */
    public AssociateElasticIpRequest elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set 私有IP
     *
     * @param targetIp
     */
    public AssociateElasticIpRequest targetIp(String targetIp) {
        this.targetIp = targetIp;
        return this;
    }

    /**
     * set 主网口或辅网口的子网ID，多网口实例必填
     *
     * @param subnetId
     */
    public AssociateElasticIpRequest subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public AssociateElasticIpRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云物理服务器ID
     *
     * @param instanceId
     */
    public AssociateElasticIpRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}