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
 * ruleCount
 */
public class RuleCount  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 处于报警状态的规则个数  status:2
     */
    private Long alarmRuleCount;

    /**
     * 规则类型,resourceMonitor-资源监控 customMetric-自定义监控
     */
    private String ruleType;

    /**
     * 处于数据不足状态的规则 个数  status:4
     */
    private Long unknownRuleCount;


    /**
     * get 处于报警状态的规则个数  status:2
     *
     * @return
     */
    public Long getAlarmRuleCount() {
        return alarmRuleCount;
    }

    /**
     * set 处于报警状态的规则个数  status:2
     *
     * @param alarmRuleCount
     */
    public void setAlarmRuleCount(Long alarmRuleCount) {
        this.alarmRuleCount = alarmRuleCount;
    }

    /**
     * get 规则类型,resourceMonitor-资源监控 customMetric-自定义监控
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型,resourceMonitor-资源监控 customMetric-自定义监控
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get 处于数据不足状态的规则 个数  status:4
     *
     * @return
     */
    public Long getUnknownRuleCount() {
        return unknownRuleCount;
    }

    /**
     * set 处于数据不足状态的规则 个数  status:4
     *
     * @param unknownRuleCount
     */
    public void setUnknownRuleCount(Long unknownRuleCount) {
        this.unknownRuleCount = unknownRuleCount;
    }


    /**
     * set 处于报警状态的规则个数  status:2
     *
     * @param alarmRuleCount
     */
    public RuleCount alarmRuleCount(Long alarmRuleCount) {
        this.alarmRuleCount = alarmRuleCount;
        return this;
    }

    /**
     * set 规则类型,resourceMonitor-资源监控 customMetric-自定义监控
     *
     * @param ruleType
     */
    public RuleCount ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set 处于数据不足状态的规则 个数  status:4
     *
     * @param unknownRuleCount
     */
    public RuleCount unknownRuleCount(Long unknownRuleCount) {
        this.unknownRuleCount = unknownRuleCount;
        return this;
    }


}