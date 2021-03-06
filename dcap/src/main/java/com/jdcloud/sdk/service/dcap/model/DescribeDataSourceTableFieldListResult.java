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
 * DataSource
 * 敏感数据保护-数据源相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dcap.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dcap.model.FieldDesc;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取元数据-表-字段 列表
 */
public class DescribeDataSourceTableFieldListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * list
     */
    private List<FieldDesc> list;

    /**
     * 总数量
     */
    private Integer totalCount;


    /**
     * get list
     *
     * @return
     */
    public List<FieldDesc> getList() {
        return list;
    }

    /**
     * set list
     *
     * @param list
     */
    public void setList(List<FieldDesc> list) {
        this.list = list;
    }

    /**
     * get 总数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set list
     *
     * @param list
     */
    public DescribeDataSourceTableFieldListResult list(List<FieldDesc> list) {
        this.list = list;
        return this;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeDataSourceTableFieldListResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to list
     *
     * @param list
     */
    public void addList(FieldDesc list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }

}