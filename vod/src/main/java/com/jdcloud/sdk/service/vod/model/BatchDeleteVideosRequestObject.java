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

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 批量删除视频请求
 */
public class BatchDeleteVideosRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 视频ID集合
     * Required:true
     */
    @Required
    private List<String> videoIds;


    /**
     * get 视频ID集合
     *
     * @return
     */
    public List<String> getVideoIds() {
        return videoIds;
    }

    /**
     * set 视频ID集合
     *
     * @param videoIds
     */
    public void setVideoIds(List<String> videoIds) {
        this.videoIds = videoIds;
    }


    /**
     * set 视频ID集合
     *
     * @param videoIds
     */
    public BatchDeleteVideosRequestObject videoIds(List<String> videoIds) {
        this.videoIds = videoIds;
        return this;
    }


    /**
     * add item to 视频ID集合
     *
     * @param videoId
     */
    public void addVideoId(String videoId) {
        if (this.videoIds == null) {
            this.videoIds = new ArrayList<>();
        }
        this.videoIds.add(videoId);
    }

}