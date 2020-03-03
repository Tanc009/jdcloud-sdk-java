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
 * Transcode
 * 视频转码任务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 提交转码作业
 */
public class SubmitTranscodeJobResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 转码作业ID
     */
    private String jobId;

    /**
     * 转码任务ID集合
     */
    private List<String> taskIds;


    /**
     * get 转码作业ID
     *
     * @return
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * set 转码作业ID
     *
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * get 转码任务ID集合
     *
     * @return
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    /**
     * set 转码任务ID集合
     *
     * @param taskIds
     */
    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }


    /**
     * set 转码作业ID
     *
     * @param jobId
     */
    public SubmitTranscodeJobResult jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * set 转码任务ID集合
     *
     * @param taskIds
     */
    public SubmitTranscodeJobResult taskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }


    /**
     * add item to 转码任务ID集合
     *
     * @param taskId
     */
    public void addTaskId(String taskId) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskId);
    }

}