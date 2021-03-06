// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202002;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingSchedule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingSchedule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREPAID"/>
 *     &lt;enumeration value="END_OF_THE_CAMPAIGN"/>
 *     &lt;enumeration value="STRAIGHTLINE"/>
 *     &lt;enumeration value="PRORATED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingSchedule")
@XmlEnum
public enum BillingSchedule {


    /**
     * 
     *                 Charged based on the contracted value after the first month of the campaign.
     *               
     * 
     */
    PREPAID,

    /**
     * 
     *                 Charged based on the contracted value after the last month of the campaign.
     *               
     * 
     */
    END_OF_THE_CAMPAIGN,

    /**
     * 
     *                 Use a billing source of contracted with a billing schedule of straightline to bill your
     *                 advertiser the same amount each month, regardless of the number of days in each month.
     *               
     * 
     */
    STRAIGHTLINE,

    /**
     * 
     *                 Use a billing source of contracted with a billing schedule of prorated to bill your
     *                 advertiser proportionally based on the amount of days in each month.
     *               
     * 
     */
    PRORATED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BillingSchedule fromValue(String v) {
        return valueOf(v);
    }

}
