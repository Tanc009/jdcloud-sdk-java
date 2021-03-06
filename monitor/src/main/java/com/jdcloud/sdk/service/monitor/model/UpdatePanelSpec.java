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
import com.jdcloud.sdk.annotation.Required;

/**
 * updatePanelSpec
 */
public class UpdatePanelSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 要更新panel所属dashboard的uid
     * Required:true
     */
    @Required
    private String dashboardUid;

    /**
     * 要更新panel所属维度
     */
    private String dimension;

    /**
     * 要更新panel包含的metric
     * Required:true
     */
    @Required
    private List<PanelMetricForCreate> panelMetrics;

    /**
     * 要更新panel的名字
     */
    private String panelName;

    /**
     * 资源id列表,与标签服务互斥,且资源id列表与标签服务列表至少传一个
     */
    private List<PanelResource> panelResources;

    /**
     * 标签服务列表,与资源id列表互斥,且资源id列表与标签服务列表至少传一个
     */
    private List<PanelTagResource> panelTagResources;

    /**
     * topN的数量，图表类型为3(topN表格)时必填
     */
    private Long panelTopNum;

    /**
     * 要更新panel的类型，1-折线图(明细);2-折线图(汇总);3-topN表格
     * Required:true
     */
    @Required
    private Long panelType;

    /**
     * 要更新panel的uuid
     * Required:true
     */
    @Required
    private String panelUid;

    /**
     * 要更新panel所属产品
     * Required:true
     */
    @Required
    private String product;

    /**
     * 依据tag过滤(维度)
     */
    private List<TagFilter> tags;


    /**
     * get 要更新panel所属dashboard的uid
     *
     * @return
     */
    public String getDashboardUid() {
        return dashboardUid;
    }

    /**
     * set 要更新panel所属dashboard的uid
     *
     * @param dashboardUid
     */
    public void setDashboardUid(String dashboardUid) {
        this.dashboardUid = dashboardUid;
    }

    /**
     * get 要更新panel所属维度
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 要更新panel所属维度
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 要更新panel包含的metric
     *
     * @return
     */
    public List<PanelMetricForCreate> getPanelMetrics() {
        return panelMetrics;
    }

    /**
     * set 要更新panel包含的metric
     *
     * @param panelMetrics
     */
    public void setPanelMetrics(List<PanelMetricForCreate> panelMetrics) {
        this.panelMetrics = panelMetrics;
    }

    /**
     * get 要更新panel的名字
     *
     * @return
     */
    public String getPanelName() {
        return panelName;
    }

    /**
     * set 要更新panel的名字
     *
     * @param panelName
     */
    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    /**
     * get 资源id列表,与标签服务互斥,且资源id列表与标签服务列表至少传一个
     *
     * @return
     */
    public List<PanelResource> getPanelResources() {
        return panelResources;
    }

    /**
     * set 资源id列表,与标签服务互斥,且资源id列表与标签服务列表至少传一个
     *
     * @param panelResources
     */
    public void setPanelResources(List<PanelResource> panelResources) {
        this.panelResources = panelResources;
    }

    /**
     * get 标签服务列表,与资源id列表互斥,且资源id列表与标签服务列表至少传一个
     *
     * @return
     */
    public List<PanelTagResource> getPanelTagResources() {
        return panelTagResources;
    }

    /**
     * set 标签服务列表,与资源id列表互斥,且资源id列表与标签服务列表至少传一个
     *
     * @param panelTagResources
     */
    public void setPanelTagResources(List<PanelTagResource> panelTagResources) {
        this.panelTagResources = panelTagResources;
    }

    /**
     * get topN的数量，图表类型为3(topN表格)时必填
     *
     * @return
     */
    public Long getPanelTopNum() {
        return panelTopNum;
    }

    /**
     * set topN的数量，图表类型为3(topN表格)时必填
     *
     * @param panelTopNum
     */
    public void setPanelTopNum(Long panelTopNum) {
        this.panelTopNum = panelTopNum;
    }

    /**
     * get 要更新panel的类型，1-折线图(明细);2-折线图(汇总);3-topN表格
     *
     * @return
     */
    public Long getPanelType() {
        return panelType;
    }

    /**
     * set 要更新panel的类型，1-折线图(明细);2-折线图(汇总);3-topN表格
     *
     * @param panelType
     */
    public void setPanelType(Long panelType) {
        this.panelType = panelType;
    }

    /**
     * get 要更新panel的uuid
     *
     * @return
     */
    public String getPanelUid() {
        return panelUid;
    }

    /**
     * set 要更新panel的uuid
     *
     * @param panelUid
     */
    public void setPanelUid(String panelUid) {
        this.panelUid = panelUid;
    }

    /**
     * get 要更新panel所属产品
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 要更新panel所属产品
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get 依据tag过滤(维度)
     *
     * @return
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
     * set 依据tag过滤(维度)
     *
     * @param tags
     */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }


    /**
     * set 要更新panel所属dashboard的uid
     *
     * @param dashboardUid
     */
    public UpdatePanelSpec dashboardUid(String dashboardUid) {
        this.dashboardUid = dashboardUid;
        return this;
    }

    /**
     * set 要更新panel所属维度
     *
     * @param dimension
     */
    public UpdatePanelSpec dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 要更新panel包含的metric
     *
     * @param panelMetrics
     */
    public UpdatePanelSpec panelMetrics(List<PanelMetricForCreate> panelMetrics) {
        this.panelMetrics = panelMetrics;
        return this;
    }

    /**
     * set 要更新panel的名字
     *
     * @param panelName
     */
    public UpdatePanelSpec panelName(String panelName) {
        this.panelName = panelName;
        return this;
    }

    /**
     * set 资源id列表,与标签服务互斥,且资源id列表与标签服务列表至少传一个
     *
     * @param panelResources
     */
    public UpdatePanelSpec panelResources(List<PanelResource> panelResources) {
        this.panelResources = panelResources;
        return this;
    }

    /**
     * set 标签服务列表,与资源id列表互斥,且资源id列表与标签服务列表至少传一个
     *
     * @param panelTagResources
     */
    public UpdatePanelSpec panelTagResources(List<PanelTagResource> panelTagResources) {
        this.panelTagResources = panelTagResources;
        return this;
    }

    /**
     * set topN的数量，图表类型为3(topN表格)时必填
     *
     * @param panelTopNum
     */
    public UpdatePanelSpec panelTopNum(Long panelTopNum) {
        this.panelTopNum = panelTopNum;
        return this;
    }

    /**
     * set 要更新panel的类型，1-折线图(明细);2-折线图(汇总);3-topN表格
     *
     * @param panelType
     */
    public UpdatePanelSpec panelType(Long panelType) {
        this.panelType = panelType;
        return this;
    }

    /**
     * set 要更新panel的uuid
     *
     * @param panelUid
     */
    public UpdatePanelSpec panelUid(String panelUid) {
        this.panelUid = panelUid;
        return this;
    }

    /**
     * set 要更新panel所属产品
     *
     * @param product
     */
    public UpdatePanelSpec product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set 依据tag过滤(维度)
     *
     * @param tags
     */
    public UpdatePanelSpec tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 要更新panel包含的metric
     *
     * @param panelMetric
     */
    public void addPanelMetric(PanelMetricForCreate panelMetric) {
        if (this.panelMetrics == null) {
            this.panelMetrics = new ArrayList<>();
        }
        this.panelMetrics.add(panelMetric);
    }

    /**
     * add item to 资源id列表,与标签服务互斥,且资源id列表与标签服务列表至少传一个
     *
     * @param panelResource
     */
    public void addPanelResource(PanelResource panelResource) {
        if (this.panelResources == null) {
            this.panelResources = new ArrayList<>();
        }
        this.panelResources.add(panelResource);
    }

    /**
     * add item to 标签服务列表,与资源id列表互斥,且资源id列表与标签服务列表至少传一个
     *
     * @param panelTagResource
     */
    public void addPanelTagResource(PanelTagResource panelTagResource) {
        if (this.panelTagResources == null) {
            this.panelTagResources = new ArrayList<>();
        }
        this.panelTagResources.add(panelTagResource);
    }

    /**
     * add item to 依据tag过滤(维度)
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}