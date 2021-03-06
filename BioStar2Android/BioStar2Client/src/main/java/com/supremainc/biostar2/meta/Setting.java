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
package com.supremainc.biostar2.meta;

import com.supremainc.biostar2.BuildConfig;


public class Setting {
    public static final String ACTION_NOTIFICATION_START = "com.suprema.basic.NotificationStart";
    public static final String ACTION_RESTART = "com.suprema.basic.Restart";
    public static final String BROADCAST_ACCESS_GROUP = "com.suprema.basic.ListAccessGorup";
    public static final String BROADCAST_ACCESS_LEVEL = "com.suprema.basic.AccessLevel";
    public static final String BROADCAST_ALARM_UPDATE = "com.suprema.basic.Alarm";
    public static final String BROADCAST_ALL_CLEAR = "com.suprema.basic.AllClear";
    public static final String BROADCAST_CLEAR = "com.suprema.basic.Clear";
    public static final String BROADCAST_DOOR_COUNT = "com.suprema.basic.DoorCount";
    public static final String BROADCAST_PREFRENCE_REFRESH = "com.suprema.basic.PrefrenceRefresh";
    public static final String BROADCAST_PUSH_TOKEN_UPDATE = "com.suprema.basic.TokenRefresh";
    public static final String BROADCAST_REROGIN = "com.suprema.basic.ReLogin";
    public static final String BROADCAST_BLE_ERROR = "com.suprema.basic.BleError";
    public static final String BROADCAST_BLE_SUCESS = "com.suprema.basic.BleSucess";
    public static final String BROADCAST_BLE_ERROR_CONNECT = "com.suprema.basic.BleErrorConnect";
    public static final String BROADCAST_BLE_ERROR_DEVICE = "com.suprema.basic.BleErrorData";
    public static final String BROADCAST_BLE_ERROR_RESULT = "com.suprema.basic.BleErrorResult";

    public static final String BROADCAST_BLE_CONNECT = "com.suprema.basic.BleConnect";
    public static final String BROADCAST_NFC_CONNECT = "com.suprema.basic.NfcConnect";

    public static final String BROADCAST_UPDATE_CARD = "com.suprema.basic.UpdateCard";
    public static final String BROADCAST_UPDATE_FACE = "com.suprema.basic.UpdateFAce";
    public static final String BROADCAST_UPDATE_DOOR = "com.suprema.basic.UpdateDoor";
    public static final String BROADCAST_UPDATE_FINGER = "com.suprema.basic.UpdateFinger";
    public static final String BROADCAST_UPDATE_PERMISSION = "com.suprema.basic.UpdatePermission";
    public static final String BROADCAST_UPDATE_USER_ACCESS_GROUP = "com.suprema.basic.UpdateUserAccessGroup";
    public static final String BROADCAST_GOTO_ALARMLIST = "com.suprema.basic.AlarmList";

    public static final String BROADCAST_USER = "com.suprema.basic.User";
    public static final String BROADCAST_USER_COUNT = "com.suprema.basic.UserCount";
    public static final String DISABLE_MODIFY = "disable_modify";

    public static final String NONE_ITEM = "NONE";
    public static final String TOTAL_COUNT = "total_count";

    public static final boolean IS_AUTO_LOG_SCROLL = false;
    public static final boolean IS_DELETE_ALL_USER = false;
    public static final boolean IS_FAKE_PUSH_DATA = false;
    public static final boolean IS_GOOGPLAY_SERVICE = true;
    public static final boolean IS_TEST_OPEN_DOOR_REQUEST = false;
    public static final boolean IS_CRASH_REPORT = true;
    public static final boolean IS_AT_THE_SAME_BLE_NFC = false;
    public static final String UPDATE_CANCEL_VERSION = "update_cancel";
    public static final int REQUEST_EXTERNAL_STORAGE = 200;
    public static final int REQUEST_READ_PHONE_STATE = 201;
    public static final int REQUEST_LOCATION = 202;

    public static final int USER_PROFILE_IMAGE_SIZE = 400;
    public static final int USER_PROFILE_IMAGE_SIZE_BYTE = 16000;
    public static final int LIMIT_USER_ACCESS_GROUP_SIZE = 16;


    public static String getDebugFlag() {
        String result = "";
        if (IS_AUTO_LOG_SCROLL) {
            result = result + "IS_AUTO_LOG_SCROLL\n";
        }
        if (IS_TEST_OPEN_DOOR_REQUEST) {
            result = result + "IS_TEST_OPEN_DOOR_REQUEST\n";
        }
        if (IS_FAKE_PUSH_DATA) {
            result = result + "IS_FAKE_PUSH_DATA\n";
        }
        if (BuildConfig.DEBUG) {
            result = result + "DEBUG BUILD\n";
        }
        return result;
    }
}