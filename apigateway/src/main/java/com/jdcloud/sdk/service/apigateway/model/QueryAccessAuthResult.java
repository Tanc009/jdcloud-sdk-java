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
 * 访问授权
 * 关于访问授权管理和查看的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.service.apigateway.model.AccessAuth;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询单个访问授权
 */
public class QueryAccessAuthResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * accessAuth
     */
    private AccessAuth accessAuth;


    /**
     * get accessAuth
     *
     * @return
     */
    public AccessAuth getAccessAuth() {
        return accessAuth;
    }

    /**
     * set accessAuth
     *
     * @param accessAuth
     */
    public void setAccessAuth(AccessAuth accessAuth) {
        this.accessAuth = accessAuth;
    }


    /**
     * set accessAuth
     *
     * @param accessAuth
     */
    public QueryAccessAuthResult accessAuth(AccessAuth accessAuth) {
        this.accessAuth = accessAuth;
        return this;
    }


}