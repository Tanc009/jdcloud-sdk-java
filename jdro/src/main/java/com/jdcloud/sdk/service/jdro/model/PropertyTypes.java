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

package com.jdcloud.sdk.service.jdro.model;


/**
 * 资源属性参数定义
 */
public class PropertyTypes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * documentation
     */
    private String documentation;

    /**
     * properties
     */
    private Object properties;


    /**
     * get documentation
     *
     * @return
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * set documentation
     *
     * @param documentation
     */
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    /**
     * get properties
     *
     * @return
     */
    public Object getProperties() {
        return properties;
    }

    /**
     * set properties
     *
     * @param properties
     */
    public void setProperties(Object properties) {
        this.properties = properties;
    }


    /**
     * set documentation
     *
     * @param documentation
     */
    public PropertyTypes documentation(String documentation) {
        this.documentation = documentation;
        return this;
    }

    /**
     * set properties
     *
     * @param properties
     */
    public PropertyTypes properties(Object properties) {
        this.properties = properties;
        return this;
    }


}