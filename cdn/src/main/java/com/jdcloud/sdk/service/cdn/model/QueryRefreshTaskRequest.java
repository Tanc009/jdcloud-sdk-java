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

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询刷新预热任务
 */
public class QueryRefreshTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String startTime;

    /**
     * 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String endTime;

    /**
     * url或者目录的模糊查询关键字
     */
    private String keyword;

    /**
     * 任务id
     */
    private String taskId;

    /**
     * null
     */
    private String taskStatus;

    /**
     * null
     */
    private String taskType;

    /**
     * 分页页数,默认值1
     */
    private Integer pageNumber;

    /**
     * 分页页面大小,默认值50
     */
    private Integer pageSize;


    /**
     * get 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get url或者目录的模糊查询关键字
     *
     * @return
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * set url或者目录的模糊查询关键字
     *
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * get 任务id
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务id
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get null
     *
     * @return
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * set null
     *
     * @param taskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * get null
     *
     * @return
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * set null
     *
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * get 分页页数,默认值1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 分页页数,默认值1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页页面大小,默认值50
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页页面大小,默认值50
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public QueryRefreshTaskRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public QueryRefreshTaskRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set url或者目录的模糊查询关键字
     *
     * @param keyword
     */
    public QueryRefreshTaskRequest keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * set 任务id
     *
     * @param taskId
     */
    public QueryRefreshTaskRequest taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set null
     *
     * @param taskStatus
     */
    public QueryRefreshTaskRequest taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * set null
     *
     * @param taskType
     */
    public QueryRefreshTaskRequest taskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * set 分页页数,默认值1
     *
     * @param pageNumber
     */
    public QueryRefreshTaskRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页页面大小,默认值50
     *
     * @param pageSize
     */
    public QueryRefreshTaskRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}