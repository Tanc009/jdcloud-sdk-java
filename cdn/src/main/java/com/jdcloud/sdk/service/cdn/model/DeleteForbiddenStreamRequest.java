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
 * 直播域名操作类接口
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
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除禁播流
 */
public class DeleteForbiddenStreamRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 要删除的禁播流
     */
    private List<DeleteStream> deleteStreams;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get 要删除的禁播流
     *
     * @return
     */
    public List<DeleteStream> getDeleteStreams() {
        return deleteStreams;
    }

    /**
     * set 要删除的禁播流
     *
     * @param deleteStreams
     */
    public void setDeleteStreams(List<DeleteStream> deleteStreams) {
        this.deleteStreams = deleteStreams;
    }

    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set 要删除的禁播流
     *
     * @param deleteStreams
     */
    public DeleteForbiddenStreamRequest deleteStreams(List<DeleteStream> deleteStreams) {
        this.deleteStreams = deleteStreams;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public DeleteForbiddenStreamRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * add item to 要删除的禁播流
     *
     * @param deleteStream
     */
    public void addDeleteStream(DeleteStream deleteStream) {
        if (this.deleteStreams == null) {
            this.deleteStreams = new ArrayList<>();
        }
        this.deleteStreams.add(deleteStream);
    }

}