/*
 * Copyright (C) 2015 Peter Gregus for GravityBox Project (C3C076@xda)
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
package com.ceco.marshmallow.gravitybox.quicksettings;

import de.robv.android.xposed.XSharedPreferences;

public class MtkMobileDataTile extends AospTile {
    public static final String AOSP_KEY = "dataconnection";

    protected MtkMobileDataTile(Object host, Object tile, XSharedPreferences prefs, 
            QsTileEventDistributor eventDistributor) throws Throwable {
        super(host, "mtk_tile_mobile_data", tile, prefs, eventDistributor);
    }

    @Override
    public String getAospKey() {
        return AOSP_KEY;
    }
}
