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

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;

/**
 * metricData
 */
public class MetricData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 监控指标数据
     */
    private List<MetricValue> data;

    /**
     * 监控指标标签
     */
    private List<MetricTag> tags;

    /**
     * 监控指标概览
     */
    private MetricInfo metric;


    /**
     * get 监控指标数据
     *
     * @return
     */
    public List<MetricValue> getData() {
        return data;
    }

    /**
     * set 监控指标数据
     *
     * @param data
     */
    public void setData(List<MetricValue> data) {
        this.data = data;
    }

    /**
     * get 监控指标标签
     *
     * @return
     */
    public List<MetricTag> getTags() {
        return tags;
    }

    /**
     * set 监控指标标签
     *
     * @param tags
     */
    public void setTags(List<MetricTag> tags) {
        this.tags = tags;
    }

    /**
     * get 监控指标概览
     *
     * @return
     */
    public MetricInfo getMetric() {
        return metric;
    }

    /**
     * set 监控指标概览
     *
     * @param metric
     */
    public void setMetric(MetricInfo metric) {
        this.metric = metric;
    }


    /**
     * set 监控指标数据
     *
     * @param data
     */
    public MetricData data(List<MetricValue> data) {
        this.data = data;
        return this;
    }

    /**
     * set 监控指标标签
     *
     * @param tags
     */
    public MetricData tags(List<MetricTag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 监控指标概览
     *
     * @param metric
     */
    public MetricData metric(MetricInfo metric) {
        this.metric = metric;
        return this;
    }


    /**
     * add item to 监控指标数据
     *
     * @param data
     */
    public void addData(MetricValue data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

    /**
     * add item to 监控指标标签
     *
     * @param tag
     */
    public void addTag(MetricTag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}