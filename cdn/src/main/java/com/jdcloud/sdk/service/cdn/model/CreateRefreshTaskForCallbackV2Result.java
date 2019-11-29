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
 * CDN刷新预热类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建刷新预热回调任务
 */
public class CreateRefreshTaskForCallbackV2Result extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 失败任务的个数
     */
    private Integer errorCount;

    /**
     * 任务的id
     */
    private String taskId;


    /**
     * get 失败任务的个数
     *
     * @return
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * set 失败任务的个数
     *
     * @param errorCount
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * get 任务的id
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务的id
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * set 失败任务的个数
     *
     * @param errorCount
     */
    public CreateRefreshTaskForCallbackV2Result errorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * set 任务的id
     *
     * @param taskId
     */
    public CreateRefreshTaskForCallbackV2Result taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


}