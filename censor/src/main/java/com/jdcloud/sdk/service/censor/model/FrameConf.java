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

package com.jdcloud.sdk.service.censor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * frameConf
 */
public class FrameConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 截帧频率
     * Required:true
     */
    @Required
    private Integer frequency;

    /**
     * 最大截帧数
     * Required:true
     */
    @Required
    private Integer maxFrame;

    /**
     * 视频文件大小
     * Required:true
     */
    @Required
    private Integer maxSize;


    /**
     * get 截帧频率
     *
     * @return
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * set 截帧频率
     *
     * @param frequency
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * get 最大截帧数
     *
     * @return
     */
    public Integer getMaxFrame() {
        return maxFrame;
    }

    /**
     * set 最大截帧数
     *
     * @param maxFrame
     */
    public void setMaxFrame(Integer maxFrame) {
        this.maxFrame = maxFrame;
    }

    /**
     * get 视频文件大小
     *
     * @return
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * set 视频文件大小
     *
     * @param maxSize
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }


    /**
     * set 截帧频率
     *
     * @param frequency
     */
    public FrameConf frequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * set 最大截帧数
     *
     * @param maxFrame
     */
    public FrameConf maxFrame(Integer maxFrame) {
        this.maxFrame = maxFrame;
        return this;
    }

    /**
     * set 视频文件大小
     *
     * @param maxSize
     */
    public FrameConf maxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }


}