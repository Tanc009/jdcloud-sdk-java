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
 * 监控项相关接口
 * 监控项相关接口，提供可用监控项列表查询和监控数据查询等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询某资源下指定tag key的tag value
 */
public class DescribeTagValuesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tagValues
     */
    private List<String> tagValues;


    /**
     * get tagValues
     *
     * @return
     */
    public List<String> getTagValues() {
        return tagValues;
    }

    /**
     * set tagValues
     *
     * @param tagValues
     */
    public void setTagValues(List<String> tagValues) {
        this.tagValues = tagValues;
    }


    /**
     * set tagValues
     *
     * @param tagValues
     */
    public DescribeTagValuesResult tagValues(List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }


    /**
     * add item to tagValues
     *
     * @param tagValue
     */
    public void addTagValue(String tagValue) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValue);
    }

}