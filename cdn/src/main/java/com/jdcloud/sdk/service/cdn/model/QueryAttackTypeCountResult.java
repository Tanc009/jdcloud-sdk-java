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
import com.jdcloud.sdk.service.cdn.model.AttackTypeCount;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 攻击类型统计接口
 */
public class QueryAttackTypeCountResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * attackTypeCounts
     */
    private List<AttackTypeCount> attackTypeCounts;


    /**
     * get attackTypeCounts
     *
     * @return
     */
    public List<AttackTypeCount> getAttackTypeCounts() {
        return attackTypeCounts;
    }

    /**
     * set attackTypeCounts
     *
     * @param attackTypeCounts
     */
    public void setAttackTypeCounts(List<AttackTypeCount> attackTypeCounts) {
        this.attackTypeCounts = attackTypeCounts;
    }


    /**
     * set attackTypeCounts
     *
     * @param attackTypeCounts
     */
    public QueryAttackTypeCountResult attackTypeCounts(List<AttackTypeCount> attackTypeCounts) {
        this.attackTypeCounts = attackTypeCounts;
        return this;
    }


    /**
     * add item to attackTypeCounts
     *
     * @param attackTypeCount
     */
    public void addAttackTypeCount(AttackTypeCount attackTypeCount) {
        if (this.attackTypeCounts == null) {
            this.attackTypeCounts = new ArrayList<>();
        }
        this.attackTypeCounts.add(attackTypeCount);
    }

}