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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.live.model.DescribeLiveTranscodeStreamBandwidthResponse;

/**
 * 查询转码流播放带宽
- 查询1分钟粒度的数据时，时间跨度不超过7天，其他粒度时时间跨度不超过30天

 */
class DescribeLiveTranscodeStreamBandwidthExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/describeLiveTranscodeStreamBandwidth";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DescribeLiveTranscodeStreamBandwidthResponse.class;
    }
}
