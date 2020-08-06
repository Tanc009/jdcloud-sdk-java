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

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;

/**
 * domainGroupItem
 */
public class DomainGroupItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名组成员
     */
    private List<String> domains;

    /**
     * 主域名
     */
    private String primaryDomain;

    /**
     * 是否共享缓存
     */
    private String shareCache;

    /**
     * 域名组名称
     */
    private String domainGroupName;

    /**
     * 域名组id
     */
    private Long id;


    /**
     * get 域名组成员
     *
     * @return
     */
    public List<String> getDomains() {
        return domains;
    }

    /**
     * set 域名组成员
     *
     * @param domains
     */
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    /**
     * get 主域名
     *
     * @return
     */
    public String getPrimaryDomain() {
        return primaryDomain;
    }

    /**
     * set 主域名
     *
     * @param primaryDomain
     */
    public void setPrimaryDomain(String primaryDomain) {
        this.primaryDomain = primaryDomain;
    }

    /**
     * get 是否共享缓存
     *
     * @return
     */
    public String getShareCache() {
        return shareCache;
    }

    /**
     * set 是否共享缓存
     *
     * @param shareCache
     */
    public void setShareCache(String shareCache) {
        this.shareCache = shareCache;
    }

    /**
     * get 域名组名称
     *
     * @return
     */
    public String getDomainGroupName() {
        return domainGroupName;
    }

    /**
     * set 域名组名称
     *
     * @param domainGroupName
     */
    public void setDomainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
    }

    /**
     * get 域名组id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 域名组id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * set 域名组成员
     *
     * @param domains
     */
    public DomainGroupItem domains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * set 主域名
     *
     * @param primaryDomain
     */
    public DomainGroupItem primaryDomain(String primaryDomain) {
        this.primaryDomain = primaryDomain;
        return this;
    }

    /**
     * set 是否共享缓存
     *
     * @param shareCache
     */
    public DomainGroupItem shareCache(String shareCache) {
        this.shareCache = shareCache;
        return this;
    }

    /**
     * set 域名组名称
     *
     * @param domainGroupName
     */
    public DomainGroupItem domainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
        return this;
    }

    /**
     * set 域名组id
     *
     * @param id
     */
    public DomainGroupItem id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * add item to 域名组成员
     *
     * @param domain
     */
    public void addDomain(String domain) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domain);
    }

}