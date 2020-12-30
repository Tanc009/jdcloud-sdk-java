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
 * 云物理服务器别名IP操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.cps.model.DeleteAliasIpResponse;

/**
 * 删除别名IP
 */
class DeleteAliasIpExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "DELETE";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/aliasIps/{aliasIpId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DeleteAliasIpResponse.class;
    }
}
