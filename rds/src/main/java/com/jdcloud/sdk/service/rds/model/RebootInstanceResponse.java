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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 重启RDS实例，例如修改了一些配置参数后，需要重启实例才能生效。可以结合主备切换的功能，轮流重启备机，降低对业务的影响&lt;br&gt;**注意：如果实例正在进行备份，那么重启主实例将会终止备份操作。** 可以查看备份策略中的备份开始时间确认是否有备份正在运行。如果确实需要在实例备份时重启主实例，建议重启后，手工进行一次实例的全备。
 */
public class RebootInstanceResponse extends JdcloudResponse<RebootInstanceResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}