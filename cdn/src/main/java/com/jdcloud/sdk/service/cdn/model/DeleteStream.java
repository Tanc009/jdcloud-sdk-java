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


/**
 * deleteStream
 */
public class DeleteStream  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 禁播流
     */
    private String stream;

    /**
     * 封禁推流的app
     */
    private String app;

    /**
     * publishIp
     */
    private String publishIp;


    /**
     * get 禁播流
     *
     * @return
     */
    public String getStream() {
        return stream;
    }

    /**
     * set 禁播流
     *
     * @param stream
     */
    public void setStream(String stream) {
        this.stream = stream;
    }

    /**
     * get 封禁推流的app
     *
     * @return
     */
    public String getApp() {
        return app;
    }

    /**
     * set 封禁推流的app
     *
     * @param app
     */
    public void setApp(String app) {
        this.app = app;
    }

    /**
     * get publishIp
     *
     * @return
     */
    public String getPublishIp() {
        return publishIp;
    }

    /**
     * set publishIp
     *
     * @param publishIp
     */
    public void setPublishIp(String publishIp) {
        this.publishIp = publishIp;
    }


    /**
     * set 禁播流
     *
     * @param stream
     */
    public DeleteStream stream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * set 封禁推流的app
     *
     * @param app
     */
    public DeleteStream app(String app) {
        this.app = app;
        return this;
    }

    /**
     * set publishIp
     *
     * @param publishIp
     */
    public DeleteStream publishIp(String publishIp) {
        this.publishIp = publishIp;
        return this;
    }


}