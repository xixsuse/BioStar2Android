/*
 * Copyright 2015 Suprema(biostar2@suprema.co.kr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.supremainc.biostar2.sdk.models.v2.login;

import com.google.gson.annotations.SerializedName;
import com.supremainc.biostar2.sdk.models.v2.device.BaseDevice;

import java.io.Serializable;
public class DeviceNotification implements Cloneable, Serializable {
    public static final String TAG = DeviceNotification.class.getSimpleName();
    private static final long serialVersionUID = -8413287596496311241L;
    @SerializedName("device")
    public BaseDevice device;
    @SerializedName("message")
    public String message;
    @SerializedName("request_timestamp")
    public String request_timestamp;
    @SerializedName("title")
    public String title;

    public DeviceNotification clone() throws CloneNotSupportedException {
        DeviceNotification target = (DeviceNotification) super.clone();
        if (device != null) {
            target.device = device.clone();
        }
        return target;
    }
}