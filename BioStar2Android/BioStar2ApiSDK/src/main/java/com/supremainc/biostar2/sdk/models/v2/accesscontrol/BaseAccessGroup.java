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


package com.supremainc.biostar2.sdk.models.v2.accesscontrol;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class BaseAccessGroup implements Cloneable, Serializable {
    public static final String TAG = BaseAccessGroup.class.getSimpleName();
    private static final long serialVersionUID = -4934827676407718433L;
    @SerializedName("status_code")
    public String status_code;
    @SerializedName("message")
    public String message;

    @SerializedName("id")
    public String id;
    @SerializedName("name")
    public String name;
    @SerializedName("description")
    public String description;

    public BaseAccessGroup() {

    }

    public BaseAccessGroup clone() throws CloneNotSupportedException {
        BaseAccessGroup target = (BaseAccessGroup) super.clone();
        return target;
    }
}
