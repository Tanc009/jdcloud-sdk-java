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
 * Vi Job
 * 视频审查作业相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iv.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询视频审查作业摘要
 */
public class GetViJobSummaryRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业ID，路径参数
     * Required:true
     */
    @Required
    private String jobId;


    /**
     * get 作业ID，路径参数
     *
     * @return
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * set 作业ID，路径参数
     *
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }


    /**
     * set 作业ID，路径参数
     *
     * @param jobId
     */
    public GetViJobSummaryRequest jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }


}