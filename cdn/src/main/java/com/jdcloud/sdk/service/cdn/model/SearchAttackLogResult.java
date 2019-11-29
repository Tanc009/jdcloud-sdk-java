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
 * SCDN相关接口
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
import com.jdcloud.sdk.service.cdn.model.AttackLogRecord;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 攻击记录查询
 */
public class SearchAttackLogResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 记录数
     */
    private Integer currentCount;

    /**
     * dataList
     */
    private List<AttackLogRecord> dataList;

    /**
     * 总记录数
     */
    private Integer totalCount;

    /**
     * 总页数
     */
    private Integer totalPage;


    /**
     * get 记录数
     *
     * @return
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * set 记录数
     *
     * @param currentCount
     */
    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * get dataList
     *
     * @return
     */
    public List<AttackLogRecord> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<AttackLogRecord> dataList) {
        this.dataList = dataList;
    }

    /**
     * get 总记录数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 总页数
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }


    /**
     * set 记录数
     *
     * @param currentCount
     */
    public SearchAttackLogResult currentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public SearchAttackLogResult dataList(List<AttackLogRecord> dataList) {
        this.dataList = dataList;
        return this;
    }

    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public SearchAttackLogResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public SearchAttackLogResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(AttackLogRecord dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}