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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * describeGrafanaTemplatesSpec
 */
public class DescribeGrafanaTemplatesSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板uid列表或数据源类型
templateUids-模板uids，精确匹配，支持多个;
datasourceType-数据源类型，精确匹配，支持多个（云监控:cloudmonitor，hawkeye:hawkeye，deeplog:deeplog）
     */
    private List<Filter> filters;

    /**
     * 当前所在页，默认为1
in: query
     */
    private Long pageNumber;

    /**
     * 页面大小，默认为20；取值范围[1, 100]
in: query
     */
    private Long pageSize;

    /**
     * 模板类型，0表示系统、1表示自定义，默认为0
     */
    private Long templateType;


    /**
     * get 模板uid列表或数据源类型
templateUids-模板uids，精确匹配，支持多个;
datasourceType-数据源类型，精确匹配，支持多个（云监控:cloudmonitor，hawkeye:hawkeye，deeplog:deeplog）
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 模板uid列表或数据源类型
templateUids-模板uids，精确匹配，支持多个;
datasourceType-数据源类型，精确匹配，支持多个（云监控:cloudmonitor，hawkeye:hawkeye，deeplog:deeplog）
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 当前所在页，默认为1
in: query
     *
     * @return
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前所在页，默认为1
in: query
     *
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 页面大小，默认为20；取值范围[1, 100]
in: query
     *
     * @return
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
in: query
     *
     * @param pageSize
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 模板类型，0表示系统、1表示自定义，默认为0
     *
     * @return
     */
    public Long getTemplateType() {
        return templateType;
    }

    /**
     * set 模板类型，0表示系统、1表示自定义，默认为0
     *
     * @param templateType
     */
    public void setTemplateType(Long templateType) {
        this.templateType = templateType;
    }


    /**
     * set 模板uid列表或数据源类型
templateUids-模板uids，精确匹配，支持多个;
datasourceType-数据源类型，精确匹配，支持多个（云监控:cloudmonitor，hawkeye:hawkeye，deeplog:deeplog）
     *
     * @param filters
     */
    public DescribeGrafanaTemplatesSpec filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 当前所在页，默认为1
in: query
     *
     * @param pageNumber
     */
    public DescribeGrafanaTemplatesSpec pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
in: query
     *
     * @param pageSize
     */
    public DescribeGrafanaTemplatesSpec pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 模板类型，0表示系统、1表示自定义，默认为0
     *
     * @param templateType
     */
    public DescribeGrafanaTemplatesSpec templateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }


    /**
     * add item to 模板uid列表或数据源类型
templateUids-模板uids，精确匹配，支持多个;
datasourceType-数据源类型，精确匹配，支持多个（云监控:cloudmonitor，hawkeye:hawkeye，deeplog:deeplog）
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