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
 * 云鼎短信服务-应用通用设置相关接口
 * 云鼎短信服务-应用通用设置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ydsms.model.GeneralSettings;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询应用通用设置列表
 */
public class ListSmsAppGeneralSettingsUsingGETResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appGeneralSettings
     */
    private List<GeneralSettings> appGeneralSettings;


    /**
     * get appGeneralSettings
     *
     * @return
     */
    public List<GeneralSettings> getAppGeneralSettings() {
        return appGeneralSettings;
    }

    /**
     * set appGeneralSettings
     *
     * @param appGeneralSettings
     */
    public void setAppGeneralSettings(List<GeneralSettings> appGeneralSettings) {
        this.appGeneralSettings = appGeneralSettings;
    }


    /**
     * set appGeneralSettings
     *
     * @param appGeneralSettings
     */
    public ListSmsAppGeneralSettingsUsingGETResult appGeneralSettings(List<GeneralSettings> appGeneralSettings) {
        this.appGeneralSettings = appGeneralSettings;
        return this;
    }


    /**
     * add item to appGeneralSettings
     *
     * @param appGeneralSetting
     */
    public void addAppGeneralSetting(GeneralSettings appGeneralSetting) {
        if (this.appGeneralSettings == null) {
            this.appGeneralSettings = new ArrayList<>();
        }
        this.appGeneralSettings.add(appGeneralSetting);
    }

}