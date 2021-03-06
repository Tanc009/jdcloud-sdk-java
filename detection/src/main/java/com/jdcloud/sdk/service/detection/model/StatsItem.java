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

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;

/**
 * statsItem
 */
public class StatsItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * aggregateFunc
     */
    private String aggregateFunc;

    /**
     * aggregateIntervalMin
     */
    private Integer aggregateIntervalMin;

    /**
     * calculateUnit
     */
    private String calculateUnit;

    /**
     * dps
     */
    private List<DataPoint> dps;

    /**
     * metric
     */
    private String metric;

    /**
     * metricName
     */
    private String metricName;

    /**
     * resource
     */
    private Resource resource;

    /**
     * tags
     */
    private Object tags;


    /**
     * get aggregateFunc
     *
     * @return
     */
    public String getAggregateFunc() {
        return aggregateFunc;
    }

    /**
     * set aggregateFunc
     *
     * @param aggregateFunc
     */
    public void setAggregateFunc(String aggregateFunc) {
        this.aggregateFunc = aggregateFunc;
    }

    /**
     * get aggregateIntervalMin
     *
     * @return
     */
    public Integer getAggregateIntervalMin() {
        return aggregateIntervalMin;
    }

    /**
     * set aggregateIntervalMin
     *
     * @param aggregateIntervalMin
     */
    public void setAggregateIntervalMin(Integer aggregateIntervalMin) {
        this.aggregateIntervalMin = aggregateIntervalMin;
    }

    /**
     * get calculateUnit
     *
     * @return
     */
    public String getCalculateUnit() {
        return calculateUnit;
    }

    /**
     * set calculateUnit
     *
     * @param calculateUnit
     */
    public void setCalculateUnit(String calculateUnit) {
        this.calculateUnit = calculateUnit;
    }

    /**
     * get dps
     *
     * @return
     */
    public List<DataPoint> getDps() {
        return dps;
    }

    /**
     * set dps
     *
     * @param dps
     */
    public void setDps(List<DataPoint> dps) {
        this.dps = dps;
    }

    /**
     * get metric
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set metric
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get metricName
     *
     * @return
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * set metricName
     *
     * @param metricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * get resource
     *
     * @return
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * set resource
     *
     * @param resource
     */
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * get tags
     *
     * @return
     */
    public Object getTags() {
        return tags;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }


    /**
     * set aggregateFunc
     *
     * @param aggregateFunc
     */
    public StatsItem aggregateFunc(String aggregateFunc) {
        this.aggregateFunc = aggregateFunc;
        return this;
    }

    /**
     * set aggregateIntervalMin
     *
     * @param aggregateIntervalMin
     */
    public StatsItem aggregateIntervalMin(Integer aggregateIntervalMin) {
        this.aggregateIntervalMin = aggregateIntervalMin;
        return this;
    }

    /**
     * set calculateUnit
     *
     * @param calculateUnit
     */
    public StatsItem calculateUnit(String calculateUnit) {
        this.calculateUnit = calculateUnit;
        return this;
    }

    /**
     * set dps
     *
     * @param dps
     */
    public StatsItem dps(List<DataPoint> dps) {
        this.dps = dps;
        return this;
    }

    /**
     * set metric
     *
     * @param metric
     */
    public StatsItem metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set metricName
     *
     * @param metricName
     */
    public StatsItem metricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * set resource
     *
     * @param resource
     */
    public StatsItem resource(Resource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public StatsItem tags(Object tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to dps
     *
     * @param dp
     */
    public void addDp(DataPoint dp) {
        if (this.dps == null) {
            this.dps = new ArrayList<>();
        }
        this.dps.add(dp);
    }

}