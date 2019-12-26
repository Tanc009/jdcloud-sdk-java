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
 * yunding-rds
 * 云鼎-云数据库管理相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量查询云数据库实例列表信息&lt;br&gt;此接口支持分页查询，默认每页20条。
 */
public class DescribeRdsInstancesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页;
     */
    private Integer pageNumber;

    /**
     * 每页显示的数据条数，默认为100，取值范围：[10,100]，用于查询列表的接口
     */
    private Integer pageSize;

    /**
     * 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
instanceId, 支持operator选项：eq
instanceName, 支持operator选项：eq
engine, 支持operator选项：eq
engineVersion, 支持operator选项：eq
instanceStatus, 支持operator选项：eq
chargeMode, 支持operator选项：eq
vpcId, 支持operator选项：eq

     */
    private List<Filter> filters;

    /**
     * 资源类型，MySQL：1，SqlServer：2
     */
    private Integer type;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页;
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页;
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页显示的数据条数，默认为100，取值范围：[10,100]，用于查询列表的接口
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，默认为100，取值范围：[10,100]，用于查询列表的接口
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
instanceId, 支持operator选项：eq
instanceName, 支持operator选项：eq
engine, 支持operator选项：eq
engineVersion, 支持operator选项：eq
instanceStatus, 支持operator选项：eq
chargeMode, 支持operator选项：eq
vpcId, 支持operator选项：eq

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
instanceId, 支持operator选项：eq
instanceName, 支持operator选项：eq
engine, 支持operator选项：eq
engineVersion, 支持operator选项：eq
instanceStatus, 支持operator选项：eq
chargeMode, 支持operator选项：eq
vpcId, 支持operator选项：eq

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 资源类型，MySQL：1，SqlServer：2
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 资源类型，MySQL：1，SqlServer：2
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页;
     *
     * @param pageNumber
     */
    public DescribeRdsInstancesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页显示的数据条数，默认为100，取值范围：[10,100]，用于查询列表的接口
     *
     * @param pageSize
     */
    public DescribeRdsInstancesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
instanceId, 支持operator选项：eq
instanceName, 支持operator选项：eq
engine, 支持operator选项：eq
engineVersion, 支持operator选项：eq
instanceStatus, 支持operator选项：eq
chargeMode, 支持operator选项：eq
vpcId, 支持operator选项：eq

     *
     * @param filters
     */
    public DescribeRdsInstancesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 资源类型，MySQL：1，SqlServer：2
     *
     * @param type
     */
    public DescribeRdsInstancesRequest type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DescribeRdsInstancesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 过滤参数，多个过滤参数之间的关系为“与”(and)
支持以下属性的过滤：
instanceId, 支持operator选项：eq
instanceName, 支持operator选项：eq
engine, 支持operator选项：eq
engineVersion, 支持operator选项：eq
instanceStatus, 支持operator选项：eq
chargeMode, 支持operator选项：eq
vpcId, 支持operator选项：eq

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