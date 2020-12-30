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
 * 云物理服务器后端服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询后端服务器列表
 */
public class DescribeServersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[20, 100]
     */
    private Integer pageSize;

    /**
     * 监听器Id
     */
    private String listenerId;

    /**
     * serverId - 后端服务器ID，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 地域ID，可调用接口（describeCPSLBRegions）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 服务器组ID
     * Required:true
     */
    @Required
    private String serverGroupId;


    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为20；取值范围[20, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 监听器Id
     *
     * @return
     */
    public String getListenerId() {
        return listenerId;
    }

    /**
     * set 监听器Id
     *
     * @param listenerId
     */
    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    /**
     * get serverId - 后端服务器ID，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set serverId - 后端服务器ID，精确匹配，支持多个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID，可调用接口（describeCPSLBRegions）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 服务器组ID
     *
     * @return
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    /**
     * set 服务器组ID
     *
     * @param serverGroupId
     */
    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }


    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeServersRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public DescribeServersRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 监听器Id
     *
     * @param listenerId
     */
    public DescribeServersRequest listenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * set serverId - 后端服务器ID，精确匹配，支持多个

     *
     * @param filters
     */
    public DescribeServersRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public DescribeServersRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 服务器组ID
     *
     * @param serverGroupId
     */
    public DescribeServersRequest serverGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }


    /**
     * add item to serverId - 后端服务器ID，精确匹配，支持多个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}