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

/**
 * oneClickAlarmOption
 */
public class OneClickAlarmOption  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 通知的联系人
in: body
     */
    private List<BaseContact> contacts;

    /**
     * 资源维度(vm-gpu、mongos-shard)
     */
    private String dimension;

    /**
     * 资源维度名称
     */
    private String dimensionName;

    /**
     * 是否启用, 1表示启用规则，0表示禁用规则
     */
    private Long enabled;

    /**
     * 一键报警规则下的报警规则id
     */
    private String policyId;

    /**
     * 资源类型(vm、database、db_ro……)
     */
    private String product;

    /**
     * 资源类型名称
     */
    private String productName;

    /**
     * ruleOption
     */
    private RuleOptionDetail ruleOption;


    /**
     * get 通知的联系人
in: body
     *
     * @return
     */
    public List<BaseContact> getContacts() {
        return contacts;
    }

    /**
     * set 通知的联系人
in: body
     *
     * @param contacts
     */
    public void setContacts(List<BaseContact> contacts) {
        this.contacts = contacts;
    }

    /**
     * get 资源维度(vm-gpu、mongos-shard)
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 资源维度(vm-gpu、mongos-shard)
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 资源维度名称
     *
     * @return
     */
    public String getDimensionName() {
        return dimensionName;
    }

    /**
     * set 资源维度名称
     *
     * @param dimensionName
     */
    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * get 是否启用, 1表示启用规则，0表示禁用规则
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get 一键报警规则下的报警规则id
     *
     * @return
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * set 一键报警规则下的报警规则id
     *
     * @param policyId
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * get 资源类型(vm、database、db_ro……)
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 资源类型(vm、database、db_ro……)
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get 资源类型名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 资源类型名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get ruleOption
     *
     * @return
     */
    public RuleOptionDetail getRuleOption() {
        return ruleOption;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public void setRuleOption(RuleOptionDetail ruleOption) {
        this.ruleOption = ruleOption;
    }


    /**
     * set 通知的联系人
in: body
     *
     * @param contacts
     */
    public OneClickAlarmOption contacts(List<BaseContact> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * set 资源维度(vm-gpu、mongos-shard)
     *
     * @param dimension
     */
    public OneClickAlarmOption dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 资源维度名称
     *
     * @param dimensionName
     */
    public OneClickAlarmOption dimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则
     *
     * @param enabled
     */
    public OneClickAlarmOption enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 一键报警规则下的报警规则id
     *
     * @param policyId
     */
    public OneClickAlarmOption policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * set 资源类型(vm、database、db_ro……)
     *
     * @param product
     */
    public OneClickAlarmOption product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set 资源类型名称
     *
     * @param productName
     */
    public OneClickAlarmOption productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public OneClickAlarmOption ruleOption(RuleOptionDetail ruleOption) {
        this.ruleOption = ruleOption;
        return this;
    }


    /**
     * add item to 通知的联系人
in: body
     *
     * @param contact
     */
    public void addContact(BaseContact contact) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        this.contacts.add(contact);
    }

}