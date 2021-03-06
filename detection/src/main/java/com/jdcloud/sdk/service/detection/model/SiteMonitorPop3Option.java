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

import com.jdcloud.sdk.annotation.Required;

/**
 * siteMonitorPop3Option
 */
public class SiteMonitorPop3Option  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * passwd
     * Required:true
     */
    @Required
    private String passwd;

    /**
     * 协议类型，可选值：pop3、pop3s
     * Required:true
     */
    @Required
    private String protocol;

    /**
     * timeout
     */
    private Long timeout;

    /**
     * user
     * Required:true
     */
    @Required
    private String user;


    /**
     * get passwd
     *
     * @return
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * set passwd
     *
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * get 协议类型，可选值：pop3、pop3s
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 协议类型，可选值：pop3、pop3s
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * get timeout
     *
     * @return
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * set timeout
     *
     * @param timeout
     */
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    /**
     * get user
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * set user
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }


    /**
     * set passwd
     *
     * @param passwd
     */
    public SiteMonitorPop3Option passwd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    /**
     * set 协议类型，可选值：pop3、pop3s
     *
     * @param protocol
     */
    public SiteMonitorPop3Option protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set timeout
     *
     * @param timeout
     */
    public SiteMonitorPop3Option timeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * set user
     *
     * @param user
     */
    public SiteMonitorPop3Option user(String user) {
        this.user = user;
        return this;
    }


}