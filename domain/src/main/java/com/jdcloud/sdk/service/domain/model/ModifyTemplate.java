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

package com.jdcloud.sdk.service.domain.model;


/**
 * modifyTemplate
 */
public class ModifyTemplate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 国家及地区（中文）
     */
    private String nationCodeCh;

    /**
     * 国家及地区（英文）中国：china
     */
    private String nationCodeEn;

    /**
     * 省份（中文）
     */
    private String provinceCodeCh;

    /**
     * 省份（英文）
     */
    private String provinceCodeEn;

    /**
     * 城市（中文）
     */
    private String cityCodeCh;

    /**
     * 城市（英文）
     */
    private String cityCodeEn;

    /**
     * 通信地址（中文）
     */
    private String addressCh;

    /**
     * 通信地址（英文）
     */
    private String addressEn;

    /**
     * 邮编 6位数字
     */
    private String zipCode;

    /**
     * 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     */
    private String phone;

    /**
     * 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     */
    private String fax;

    /**
     * 邮件
     */
    private String email;

    /**
     * 所有者类型  1个人 2企业
     */
    private Integer ownerType;


    /**
     * get 国家及地区（中文）
     *
     * @return
     */
    public String getNationCodeCh() {
        return nationCodeCh;
    }

    /**
     * set 国家及地区（中文）
     *
     * @param nationCodeCh
     */
    public void setNationCodeCh(String nationCodeCh) {
        this.nationCodeCh = nationCodeCh;
    }

    /**
     * get 国家及地区（英文）中国：china
     *
     * @return
     */
    public String getNationCodeEn() {
        return nationCodeEn;
    }

    /**
     * set 国家及地区（英文）中国：china
     *
     * @param nationCodeEn
     */
    public void setNationCodeEn(String nationCodeEn) {
        this.nationCodeEn = nationCodeEn;
    }

    /**
     * get 省份（中文）
     *
     * @return
     */
    public String getProvinceCodeCh() {
        return provinceCodeCh;
    }

    /**
     * set 省份（中文）
     *
     * @param provinceCodeCh
     */
    public void setProvinceCodeCh(String provinceCodeCh) {
        this.provinceCodeCh = provinceCodeCh;
    }

    /**
     * get 省份（英文）
     *
     * @return
     */
    public String getProvinceCodeEn() {
        return provinceCodeEn;
    }

    /**
     * set 省份（英文）
     *
     * @param provinceCodeEn
     */
    public void setProvinceCodeEn(String provinceCodeEn) {
        this.provinceCodeEn = provinceCodeEn;
    }

    /**
     * get 城市（中文）
     *
     * @return
     */
    public String getCityCodeCh() {
        return cityCodeCh;
    }

    /**
     * set 城市（中文）
     *
     * @param cityCodeCh
     */
    public void setCityCodeCh(String cityCodeCh) {
        this.cityCodeCh = cityCodeCh;
    }

    /**
     * get 城市（英文）
     *
     * @return
     */
    public String getCityCodeEn() {
        return cityCodeEn;
    }

    /**
     * set 城市（英文）
     *
     * @param cityCodeEn
     */
    public void setCityCodeEn(String cityCodeEn) {
        this.cityCodeEn = cityCodeEn;
    }

    /**
     * get 通信地址（中文）
     *
     * @return
     */
    public String getAddressCh() {
        return addressCh;
    }

    /**
     * set 通信地址（中文）
     *
     * @param addressCh
     */
    public void setAddressCh(String addressCh) {
        this.addressCh = addressCh;
    }

    /**
     * get 通信地址（英文）
     *
     * @return
     */
    public String getAddressEn() {
        return addressEn;
    }

    /**
     * set 通信地址（英文）
     *
     * @param addressEn
     */
    public void setAddressEn(String addressEn) {
        this.addressEn = addressEn;
    }

    /**
     * get 邮编 6位数字
     *
     * @return
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * set 邮编 6位数字
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * get 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * get 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @return
     */
    public String getFax() {
        return fax;
    }

    /**
     * set 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * get 邮件
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮件
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get 所有者类型  1个人 2企业
     *
     * @return
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * set 所有者类型  1个人 2企业
     *
     * @param ownerType
     */
    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * set 国家及地区（中文）
     *
     * @param nationCodeCh
     */
    public ModifyTemplate nationCodeCh(String nationCodeCh) {
        this.nationCodeCh = nationCodeCh;
        return this;
    }

    /**
     * set 国家及地区（英文）中国：china
     *
     * @param nationCodeEn
     */
    public ModifyTemplate nationCodeEn(String nationCodeEn) {
        this.nationCodeEn = nationCodeEn;
        return this;
    }

    /**
     * set 省份（中文）
     *
     * @param provinceCodeCh
     */
    public ModifyTemplate provinceCodeCh(String provinceCodeCh) {
        this.provinceCodeCh = provinceCodeCh;
        return this;
    }

    /**
     * set 省份（英文）
     *
     * @param provinceCodeEn
     */
    public ModifyTemplate provinceCodeEn(String provinceCodeEn) {
        this.provinceCodeEn = provinceCodeEn;
        return this;
    }

    /**
     * set 城市（中文）
     *
     * @param cityCodeCh
     */
    public ModifyTemplate cityCodeCh(String cityCodeCh) {
        this.cityCodeCh = cityCodeCh;
        return this;
    }

    /**
     * set 城市（英文）
     *
     * @param cityCodeEn
     */
    public ModifyTemplate cityCodeEn(String cityCodeEn) {
        this.cityCodeEn = cityCodeEn;
        return this;
    }

    /**
     * set 通信地址（中文）
     *
     * @param addressCh
     */
    public ModifyTemplate addressCh(String addressCh) {
        this.addressCh = addressCh;
        return this;
    }

    /**
     * set 通信地址（英文）
     *
     * @param addressEn
     */
    public ModifyTemplate addressEn(String addressEn) {
        this.addressEn = addressEn;
        return this;
    }

    /**
     * set 邮编 6位数字
     *
     * @param zipCode
     */
    public ModifyTemplate zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * set 联系电话，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param phone
     */
    public ModifyTemplate phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * set 传真，国家区号-地区区号(或手机号码前3位)-电话号码（或手机号码后8位) 例:86-138-12345678
     *
     * @param fax
     */
    public ModifyTemplate fax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * set 邮件
     *
     * @param email
     */
    public ModifyTemplate email(String email) {
        this.email = email;
        return this;
    }

    /**
     * set 所有者类型  1个人 2企业
     *
     * @param ownerType
     */
    public ModifyTemplate ownerType(Integer ownerType) {
        this.ownerType = ownerType;
        return this;
    }


}