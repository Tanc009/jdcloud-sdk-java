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

package com.jdcloud.sdk.service.resourcetag.model;

import java.util.List;
import java.util.ArrayList;

/**
 * resourceReqVo
 */
public class ResourceReqVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     */
    private List<String> serviceCodes;

    /**
     * 资源id列表
     */
    private List<String> resourceIds;

    /**
     * 标签过滤列表
     */
    private List<TagFilter> tagFilters;

    /**
     * 排序依据
     */
    private String orderCondition;

    /**
     * 排序方向, 取值为ASC, DESC
     */
    private String descOrAsc;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    /**
     * 当前页码
     */
    private Integer currentPage;


    /**
     * get 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     *
     * @return
     */
    public List<String> getServiceCodes() {
        return serviceCodes;
    }

    /**
     * set 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     *
     * @param serviceCodes
     */
    public void setServiceCodes(List<String> serviceCodes) {
        this.serviceCodes = serviceCodes;
    }

    /**
     * get 资源id列表
     *
     * @return
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * set 资源id列表
     *
     * @param resourceIds
     */
    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    /**
     * get 标签过滤列表
     *
     * @return
     */
    public List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * set 标签过滤列表
     *
     * @param tagFilters
     */
    public void setTagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
    }

    /**
     * get 排序依据
     *
     * @return
     */
    public String getOrderCondition() {
        return orderCondition;
    }

    /**
     * set 排序依据
     *
     * @param orderCondition
     */
    public void setOrderCondition(String orderCondition) {
        this.orderCondition = orderCondition;
    }

    /**
     * get 排序方向, 取值为ASC, DESC
     *
     * @return
     */
    public String getDescOrAsc() {
        return descOrAsc;
    }

    /**
     * set 排序方向, 取值为ASC, DESC
     *
     * @param descOrAsc
     */
    public void setDescOrAsc(String descOrAsc) {
        this.descOrAsc = descOrAsc;
    }

    /**
     * get 每页记录数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页记录数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 当前页码
     *
     * @return
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * set 当前页码
     *
     * @param currentPage
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }


    /**
     * set 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     *
     * @param serviceCodes
     */
    public ResourceReqVo serviceCodes(List<String> serviceCodes) {
        this.serviceCodes = serviceCodes;
        return this;
    }

    /**
     * set 资源id列表
     *
     * @param resourceIds
     */
    public ResourceReqVo resourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    /**
     * set 标签过滤列表
     *
     * @param tagFilters
     */
    public ResourceReqVo tagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    /**
     * set 排序依据
     *
     * @param orderCondition
     */
    public ResourceReqVo orderCondition(String orderCondition) {
        this.orderCondition = orderCondition;
        return this;
    }

    /**
     * set 排序方向, 取值为ASC, DESC
     *
     * @param descOrAsc
     */
    public ResourceReqVo descOrAsc(String descOrAsc) {
        this.descOrAsc = descOrAsc;
        return this;
    }

    /**
     * set 每页记录数
     *
     * @param pageSize
     */
    public ResourceReqVo pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 当前页码
     *
     * @param currentPage
     */
    public ResourceReqVo currentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }


    /**
     * add item to 产品线名称列表
标签系统支持的产品线名称如下
- vm               disk        sqlserver  es          mongodb               ip
- memcached        redis       drds       rds         database              db_ro
- percona          percona_ro  mariadb    mariadb_ro  pg                    cdn
- nativecontainer  pod         zfs        jqs         kubernetesNodegroup   jcq

     *
     * @param serviceCode
     */
    public void addServiceCode(String serviceCode) {
        if (this.serviceCodes == null) {
            this.serviceCodes = new ArrayList<>();
        }
        this.serviceCodes.add(serviceCode);
    }

    /**
     * add item to 资源id列表
     *
     * @param resourceId
     */
    public void addResourceId(String resourceId) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceId);
    }

    /**
     * add item to 标签过滤列表
     *
     * @param tagFilter
     */
    public void addTagFilter(TagFilter tagFilter) {
        if (this.tagFilters == null) {
            this.tagFilters = new ArrayList<>();
        }
        this.tagFilters.add(tagFilter);
    }

}