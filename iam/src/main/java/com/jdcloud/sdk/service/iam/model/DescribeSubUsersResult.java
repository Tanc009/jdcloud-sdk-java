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
 * SubUser Management
 * SubUser Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iam.model.SubUser;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询子用户列表
 */
public class DescribeSubUsersResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * subUsers
     */
    private List<SubUser> subUsers;

    /**
     * total
     */
    private Integer total;


    /**
     * get subUsers
     *
     * @return
     */
    public List<SubUser> getSubUsers() {
        return subUsers;
    }

    /**
     * set subUsers
     *
     * @param subUsers
     */
    public void setSubUsers(List<SubUser> subUsers) {
        this.subUsers = subUsers;
    }

    /**
     * get total
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set total
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }


    /**
     * set subUsers
     *
     * @param subUsers
     */
    public DescribeSubUsersResult subUsers(List<SubUser> subUsers) {
        this.subUsers = subUsers;
        return this;
    }

    /**
     * set total
     *
     * @param total
     */
    public DescribeSubUsersResult total(Integer total) {
        this.total = total;
        return this;
    }


    /**
     * add item to subUsers
     *
     * @param subUser
     */
    public void addSubUser(SubUser subUser) {
        if (this.subUsers == null) {
            this.subUsers = new ArrayList<>();
        }
        this.subUsers.add(subUser);
    }

}