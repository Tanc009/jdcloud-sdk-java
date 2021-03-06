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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 创建存储桶
 */
public class DeploymentBucket  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 存储桶名称
     */
    private String name;

    /**
     * 访问控制，private,public-read,public-read-write
     */
    private String acl;


    /**
     * get 存储桶名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 存储桶名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 访问控制，private,public-read,public-read-write
     *
     * @return
     */
    public String getAcl() {
        return acl;
    }

    /**
     * set 访问控制，private,public-read,public-read-write
     *
     * @param acl
     */
    public void setAcl(String acl) {
        this.acl = acl;
    }


    /**
     * set 存储桶名称
     *
     * @param name
     */
    public DeploymentBucket name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 访问控制，private,public-read,public-read-write
     *
     * @param acl
     */
    public DeploymentBucket acl(String acl) {
        this.acl = acl;
        return this;
    }


}