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
 * 云物理服务器负载均衡实例操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 解绑弹性公网IP
 */
public class DisassociateElasticIpLBResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 解绑结果
     */
    private Boolean success;


    /**
     * get 解绑结果
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 解绑结果
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }


    /**
     * set 解绑结果
     *
     * @param success
     */
    public DisassociateElasticIpLBResult success(Boolean success) {
        this.success = success;
        return this;
    }


}