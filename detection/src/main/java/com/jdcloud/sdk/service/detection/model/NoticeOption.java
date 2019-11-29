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
 * noticeOption
 */
public class NoticeOption  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 生效截止时间，默认值:23:59
     */
    private String effectiveIntervalEnd;

    /**
     * 生效起始时间，默认值:00:00
     */
    private String effectiveIntervalStart;

    /**
     * 通知条件 1-告警 2-数据不足3-告警恢复
     */
    private List<Long> noticeCondition;

    /**
     * 通知沉默周期,单位:分钟，默认值：24小时,目前支持的取值“24小时、12小时、6小时、3小时、1小时、30分钟、15分钟、10分钟、5分钟”
     */
    private Long noticePeriod;

    /**
     * 通知方法    1-短信 2-邮件
     */
    private List<Long> noticeWay;


    /**
     * get 生效截止时间，默认值:23:59
     *
     * @return
     */
    public String getEffectiveIntervalEnd() {
        return effectiveIntervalEnd;
    }

    /**
     * set 生效截止时间，默认值:23:59
     *
     * @param effectiveIntervalEnd
     */
    public void setEffectiveIntervalEnd(String effectiveIntervalEnd) {
        this.effectiveIntervalEnd = effectiveIntervalEnd;
    }

    /**
     * get 生效起始时间，默认值:00:00
     *
     * @return
     */
    public String getEffectiveIntervalStart() {
        return effectiveIntervalStart;
    }

    /**
     * set 生效起始时间，默认值:00:00
     *
     * @param effectiveIntervalStart
     */
    public void setEffectiveIntervalStart(String effectiveIntervalStart) {
        this.effectiveIntervalStart = effectiveIntervalStart;
    }

    /**
     * get 通知条件 1-告警 2-数据不足3-告警恢复
     *
     * @return
     */
    public List<Long> getNoticeCondition() {
        return noticeCondition;
    }

    /**
     * set 通知条件 1-告警 2-数据不足3-告警恢复
     *
     * @param noticeCondition
     */
    public void setNoticeCondition(List<Long> noticeCondition) {
        this.noticeCondition = noticeCondition;
    }

    /**
     * get 通知沉默周期,单位:分钟，默认值：24小时,目前支持的取值“24小时、12小时、6小时、3小时、1小时、30分钟、15分钟、10分钟、5分钟”
     *
     * @return
     */
    public Long getNoticePeriod() {
        return noticePeriod;
    }

    /**
     * set 通知沉默周期,单位:分钟，默认值：24小时,目前支持的取值“24小时、12小时、6小时、3小时、1小时、30分钟、15分钟、10分钟、5分钟”
     *
     * @param noticePeriod
     */
    public void setNoticePeriod(Long noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    /**
     * get 通知方法    1-短信 2-邮件
     *
     * @return
     */
    public List<Long> getNoticeWay() {
        return noticeWay;
    }

    /**
     * set 通知方法    1-短信 2-邮件
     *
     * @param noticeWay
     */
    public void setNoticeWay(List<Long> noticeWay) {
        this.noticeWay = noticeWay;
    }


    /**
     * set 生效截止时间，默认值:23:59
     *
     * @param effectiveIntervalEnd
     */
    public NoticeOption effectiveIntervalEnd(String effectiveIntervalEnd) {
        this.effectiveIntervalEnd = effectiveIntervalEnd;
        return this;
    }

    /**
     * set 生效起始时间，默认值:00:00
     *
     * @param effectiveIntervalStart
     */
    public NoticeOption effectiveIntervalStart(String effectiveIntervalStart) {
        this.effectiveIntervalStart = effectiveIntervalStart;
        return this;
    }

    /**
     * set 通知条件 1-告警 2-数据不足3-告警恢复
     *
     * @param noticeCondition
     */
    public NoticeOption noticeCondition(List<Long> noticeCondition) {
        this.noticeCondition = noticeCondition;
        return this;
    }

    /**
     * set 通知沉默周期,单位:分钟，默认值：24小时,目前支持的取值“24小时、12小时、6小时、3小时、1小时、30分钟、15分钟、10分钟、5分钟”
     *
     * @param noticePeriod
     */
    public NoticeOption noticePeriod(Long noticePeriod) {
        this.noticePeriod = noticePeriod;
        return this;
    }

    /**
     * set 通知方法    1-短信 2-邮件
     *
     * @param noticeWay
     */
    public NoticeOption noticeWay(List<Long> noticeWay) {
        this.noticeWay = noticeWay;
        return this;
    }


    /**
     * add item to 通知条件 1-告警 2-数据不足3-告警恢复
     *
     * @param noticeCondition
     */
    public void addNoticeCondition(Long noticeCondition) {
        if (this.noticeCondition == null) {
            this.noticeCondition = new ArrayList<>();
        }
        this.noticeCondition.add(noticeCondition);
    }

    /**
     * add item to 通知方法    1-短信 2-邮件
     *
     * @param noticeWay
     */
    public void addNoticeWay(Long noticeWay) {
        if (this.noticeWay == null) {
            this.noticeWay = new ArrayList<>();
        }
        this.noticeWay.add(noticeWay);
    }

}