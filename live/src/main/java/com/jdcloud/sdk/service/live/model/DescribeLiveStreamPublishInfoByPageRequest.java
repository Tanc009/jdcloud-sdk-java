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

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询推流码率、帧率
 */
public class DescribeLiveStreamPublishInfoByPageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
     * Required:true
     */
    @Required
    private String domainName;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 流名称
     */
    private String streamName;

    /**
     * 起始时间
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z

     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 结束时间:
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 为空,默认为当前时间

     */
    private String endTime;

    /**
     * 页码，起始页码1

     */
    private Integer pageNumber;

    /**
     * 每页最大记录数，取值：[10,1000]，默认：100

     */
    private Integer pageSize;


    /**
     * get 推流域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 推流域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 流名称
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 起始时间
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z

     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 起始时间
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z

     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间:
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 为空,默认为当前时间

     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间:
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 为空,默认为当前时间

     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 页码，起始页码1

     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码，起始页码1

     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页最大记录数，取值：[10,1000]，默认：100

     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页最大记录数，取值：[10,1000]，默认：100

     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * set 推流域名
     *
     * @param domainName
     */
    public DescribeLiveStreamPublishInfoByPageRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public DescribeLiveStreamPublishInfoByPageRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public DescribeLiveStreamPublishInfoByPageRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 起始时间
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z

     *
     * @param startTime
     */
    public DescribeLiveStreamPublishInfoByPageRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间:
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 为空,默认为当前时间

     *
     * @param endTime
     */
    public DescribeLiveStreamPublishInfoByPageRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 页码，起始页码1

     *
     * @param pageNumber
     */
    public DescribeLiveStreamPublishInfoByPageRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页最大记录数，取值：[10,1000]，默认：100

     *
     * @param pageSize
     */
    public DescribeLiveStreamPublishInfoByPageRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}