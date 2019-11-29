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
 * 统计查询类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.StatisticsGroupSumDataItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询统计数据并进行汇总加和
 */
public class QueryLiveTrafficGroupSumResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * startTime
     */
    private String startTime;

    /**
     * endTime
     */
    private String endTime;

    /**
     * domain
     */
    private String domain;

    /**
     * statistics
     */
    private List<StatisticsGroupSumDataItem> statistics;


    /**
     * get startTime
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set startTime
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get endTime
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get statistics
     *
     * @return
     */
    public List<StatisticsGroupSumDataItem> getStatistics() {
        return statistics;
    }

    /**
     * set statistics
     *
     * @param statistics
     */
    public void setStatistics(List<StatisticsGroupSumDataItem> statistics) {
        this.statistics = statistics;
    }


    /**
     * set startTime
     *
     * @param startTime
     */
    public QueryLiveTrafficGroupSumResult startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public QueryLiveTrafficGroupSumResult endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public QueryLiveTrafficGroupSumResult domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set statistics
     *
     * @param statistics
     */
    public QueryLiveTrafficGroupSumResult statistics(List<StatisticsGroupSumDataItem> statistics) {
        this.statistics = statistics;
        return this;
    }


    /**
     * add item to statistics
     *
     * @param statistic
     */
    public void addStatistic(StatisticsGroupSumDataItem statistic) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statistic);
    }

}