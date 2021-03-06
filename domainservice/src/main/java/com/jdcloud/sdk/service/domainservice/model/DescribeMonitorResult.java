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
 * 网站监控
 * 云解析OpenAPI网站监控接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domainservice.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.domainservice.model.Monitor;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看主域名的监控项的配置以及状态
 */
public class DescribeMonitorResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页面网站监控项的个数
     */
    private Integer currentCount;

    /**
     * 所有网站监控项的个数
     */
    private Integer totalCount;

    /**
     * 所有网站监控项的页数
     */
    private Integer totalPage;

    /**
     * dataList
     */
    private List<Monitor> dataList;


    /**
     * get 当前页面网站监控项的个数
     *
     * @return
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * set 当前页面网站监控项的个数
     *
     * @param currentCount
     */
    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * get 所有网站监控项的个数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 所有网站监控项的个数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 所有网站监控项的页数
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set 所有网站监控项的页数
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * get dataList
     *
     * @return
     */
    public List<Monitor> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<Monitor> dataList) {
        this.dataList = dataList;
    }


    /**
     * set 当前页面网站监控项的个数
     *
     * @param currentCount
     */
    public DescribeMonitorResult currentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set 所有网站监控项的个数
     *
     * @param totalCount
     */
    public DescribeMonitorResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 所有网站监控项的页数
     *
     * @param totalPage
     */
    public DescribeMonitorResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public DescribeMonitorResult dataList(List<Monitor> dataList) {
        this.dataList = dataList;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(Monitor dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}