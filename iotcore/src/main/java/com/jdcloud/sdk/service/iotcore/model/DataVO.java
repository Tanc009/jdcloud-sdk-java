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

package com.jdcloud.sdk.service.iotcore.model;


/**
 * dataVO
 */
public class DataVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 系统流水号
     */
    private String id;

    /**
     * 实例名称
     */
    private String name;

    /**
     * 子网编号
     */
    private String subNetId;

    /**
     * 子网名称
     */
    private String subNetName;

    /**
     * VPC编号
     */
    private String vpcId;

    /**
     * VPC名称
     */
    private String vpcName;

    /**
     * 可用区名称
     */
    private String azName;

    /**
     * 公网域名
     */
    private String pubDomain;

    /**
     * 内网域名
     */
    private String priDomain;

    /**
     * IoT Hub实例状态[10~100为创建中,0或1-运行中,2-欠费停服,3-待删除]
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 实例到期时间
     */
    private Integer endTime;

    /**
     * 最大在线设备数
     */
    private Integer maxDevices;

    /**
     * 最大消息条数
     */
    private Integer maxMessage;

    /**
     * 实例编号
     */
    private String instanceId;

    /**
     * 实例类型[0-独享，1-共享]
     */
    private String instanceType;


    /**
     * get 系统流水号
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 系统流水号
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 子网编号
     *
     * @return
     */
    public String getSubNetId() {
        return subNetId;
    }

    /**
     * set 子网编号
     *
     * @param subNetId
     */
    public void setSubNetId(String subNetId) {
        this.subNetId = subNetId;
    }

    /**
     * get 子网名称
     *
     * @return
     */
    public String getSubNetName() {
        return subNetName;
    }

    /**
     * set 子网名称
     *
     * @param subNetName
     */
    public void setSubNetName(String subNetName) {
        this.subNetName = subNetName;
    }

    /**
     * get VPC编号
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPC编号
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get VPC名称
     *
     * @return
     */
    public String getVpcName() {
        return vpcName;
    }

    /**
     * set VPC名称
     *
     * @param vpcName
     */
    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    /**
     * get 可用区名称
     *
     * @return
     */
    public String getAzName() {
        return azName;
    }

    /**
     * set 可用区名称
     *
     * @param azName
     */
    public void setAzName(String azName) {
        this.azName = azName;
    }

    /**
     * get 公网域名
     *
     * @return
     */
    public String getPubDomain() {
        return pubDomain;
    }

    /**
     * set 公网域名
     *
     * @param pubDomain
     */
    public void setPubDomain(String pubDomain) {
        this.pubDomain = pubDomain;
    }

    /**
     * get 内网域名
     *
     * @return
     */
    public String getPriDomain() {
        return priDomain;
    }

    /**
     * set 内网域名
     *
     * @param priDomain
     */
    public void setPriDomain(String priDomain) {
        this.priDomain = priDomain;
    }

    /**
     * get IoT Hub实例状态[10~100为创建中,0或1-运行中,2-欠费停服,3-待删除]
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set IoT Hub实例状态[10~100为创建中,0或1-运行中,2-欠费停服,3-待删除]
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * get 实例到期时间
     *
     * @return
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * set 实例到期时间
     *
     * @param endTime
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * get 最大在线设备数
     *
     * @return
     */
    public Integer getMaxDevices() {
        return maxDevices;
    }

    /**
     * set 最大在线设备数
     *
     * @param maxDevices
     */
    public void setMaxDevices(Integer maxDevices) {
        this.maxDevices = maxDevices;
    }

    /**
     * get 最大消息条数
     *
     * @return
     */
    public Integer getMaxMessage() {
        return maxMessage;
    }

    /**
     * set 最大消息条数
     *
     * @param maxMessage
     */
    public void setMaxMessage(Integer maxMessage) {
        this.maxMessage = maxMessage;
    }

    /**
     * get 实例编号
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例编号
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例类型[0-独享，1-共享]
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型[0-独享，1-共享]
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
     * set 系统流水号
     *
     * @param id
     */
    public DataVO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param name
     */
    public DataVO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 子网编号
     *
     * @param subNetId
     */
    public DataVO subNetId(String subNetId) {
        this.subNetId = subNetId;
        return this;
    }

    /**
     * set 子网名称
     *
     * @param subNetName
     */
    public DataVO subNetName(String subNetName) {
        this.subNetName = subNetName;
        return this;
    }

    /**
     * set VPC编号
     *
     * @param vpcId
     */
    public DataVO vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set VPC名称
     *
     * @param vpcName
     */
    public DataVO vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set 可用区名称
     *
     * @param azName
     */
    public DataVO azName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set 公网域名
     *
     * @param pubDomain
     */
    public DataVO pubDomain(String pubDomain) {
        this.pubDomain = pubDomain;
        return this;
    }

    /**
     * set 内网域名
     *
     * @param priDomain
     */
    public DataVO priDomain(String priDomain) {
        this.priDomain = priDomain;
        return this;
    }

    /**
     * set IoT Hub实例状态[10~100为创建中,0或1-运行中,2-欠费停服,3-待删除]
     *
     * @param status
     */
    public DataVO status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DataVO createTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 实例到期时间
     *
     * @param endTime
     */
    public DataVO endTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 最大在线设备数
     *
     * @param maxDevices
     */
    public DataVO maxDevices(Integer maxDevices) {
        this.maxDevices = maxDevices;
        return this;
    }

    /**
     * set 最大消息条数
     *
     * @param maxMessage
     */
    public DataVO maxMessage(Integer maxMessage) {
        this.maxMessage = maxMessage;
        return this;
    }

    /**
     * set 实例编号
     *
     * @param instanceId
     */
    public DataVO instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例类型[0-独享，1-共享]
     *
     * @param instanceType
     */
    public DataVO instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


}