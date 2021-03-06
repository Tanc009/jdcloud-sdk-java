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

package com.jdcloud.sdk.service.censor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * feedbackTaskInfo
 */
public class FeedbackTaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * taskId, describeDataResults中获取
     * Required:true
     */
    @Required
    private String taskId;

    /**
     * describeDataResults中的logTime
     * Required:true
     */
    @Required
    private String time;

    /**
     * 文本时必须，文本的md5值
     */
    private String contentMd5;

    /**
     * 文本时必须，文本的具体内容
     */
    private String content;


    /**
     * get taskId, describeDataResults中获取
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set taskId, describeDataResults中获取
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get describeDataResults中的logTime
     *
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * set describeDataResults中的logTime
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * get 文本时必须，文本的md5值
     *
     * @return
     */
    public String getContentMd5() {
        return contentMd5;
    }

    /**
     * set 文本时必须，文本的md5值
     *
     * @param contentMd5
     */
    public void setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
    }

    /**
     * get 文本时必须，文本的具体内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 文本时必须，文本的具体内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * set taskId, describeDataResults中获取
     *
     * @param taskId
     */
    public FeedbackTaskInfo taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set describeDataResults中的logTime
     *
     * @param time
     */
    public FeedbackTaskInfo time(String time) {
        this.time = time;
        return this;
    }

    /**
     * set 文本时必须，文本的md5值
     *
     * @param contentMd5
     */
    public FeedbackTaskInfo contentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }

    /**
     * set 文本时必须，文本的具体内容
     *
     * @param content
     */
    public FeedbackTaskInfo content(String content) {
        this.content = content;
        return this;
    }


}