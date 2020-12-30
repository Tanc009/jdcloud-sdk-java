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


/**
 * aliasIpInfo
 */
public class AliasIpInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主CIDR或次要CIDR id
     */
    private String id;

    /**
     * cidr段
     */
    private String cidr;


    /**
     * get 主CIDR或次要CIDR id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 主CIDR或次要CIDR id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get cidr段
     *
     * @return
     */
    public String getCidr() {
        return cidr;
    }

    /**
     * set cidr段
     *
     * @param cidr
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }


    /**
     * set 主CIDR或次要CIDR id
     *
     * @param id
     */
    public AliasIpInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set cidr段
     *
     * @param cidr
     */
    public AliasIpInfo cidr(String cidr) {
        this.cidr = cidr;
        return this;
    }


}