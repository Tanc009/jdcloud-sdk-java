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


/**
 * panelMetric
 */
public class PanelMetric  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推荐聚合方式
     */
    private String aggregator;

    /**
     * 推荐采样方式
     */
    private String downsample;

    /**
     * metric标识
     */
    private String metric;

    /**
     * metric名字
     */
    private String metricName;

    /**
     * 单位
     */
    private String unit;


    /**
     * get 推荐聚合方式
     *
     * @return
     */
    public String getAggregator() {
        return aggregator;
    }

    /**
     * set 推荐聚合方式
     *
     * @param aggregator
     */
    public void setAggregator(String aggregator) {
        this.aggregator = aggregator;
    }

    /**
     * get 推荐采样方式
     *
     * @return
     */
    public String getDownsample() {
        return downsample;
    }

    /**
     * set 推荐采样方式
     *
     * @param downsample
     */
    public void setDownsample(String downsample) {
        this.downsample = downsample;
    }

    /**
     * get metric标识
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set metric标识
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get metric名字
     *
     * @return
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * set metric名字
     *
     * @param metricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * get 单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * set 推荐聚合方式
     *
     * @param aggregator
     */
    public PanelMetric aggregator(String aggregator) {
        this.aggregator = aggregator;
        return this;
    }

    /**
     * set 推荐采样方式
     *
     * @param downsample
     */
    public PanelMetric downsample(String downsample) {
        this.downsample = downsample;
        return this;
    }

    /**
     * set metric标识
     *
     * @param metric
     */
    public PanelMetric metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set metric名字
     *
     * @param metricName
     */
    public PanelMetric metricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * set 单位
     *
     * @param unit
     */
    public PanelMetric unit(String unit) {
        this.unit = unit;
        return this;
    }


}