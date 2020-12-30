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
 * 云物理服务器IPv6地址操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 修改IPv6公网带宽

 */
public class ModifyIpv6AddressBandwidthResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改带宽是否成功
     */
    private Boolean success;


    /**
     * get 修改带宽是否成功
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 修改带宽是否成功
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }


    /**
     * set 修改带宽是否成功
     *
     * @param success
     */
    public ModifyIpv6AddressBandwidthResult success(Boolean success) {
        this.success = success;
        return this;
    }


}