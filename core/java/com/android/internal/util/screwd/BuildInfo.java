/*
* Copyright (C) 2014 SlimRoms Project
* Copyright (C) 2014 Screw'd Android Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.android.internal.util.screwd;

import android.os.SystemProperties;

public class BuildInfo {

    private static final String BUILD_TYPE_PROP = "ro.screwd.buildtype";
    private static final String SCREWD_VERSION_PROP = "ro.screwd.version";

    public static String getScrewdBuildType() {
        return SystemProperties.get(BUILD_TYPE_PROP, "");
    }

    public static String getScrewdVersion() {
        return SystemProperties.get(SCREWD_VERSION_PROP, "");
    }
}
