/*
 *
 *
 *  * Copyright (c) 2017 Leo Lee(lichl.1980@163.com).
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License. You may obtain a copy
 *  * of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *
 */

package org.sunyata.quark.client.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leo on 16/11/7.
 */
public enum ContinueTypeEnum {
    Succeed("Succeed"),//成功才能继续
    Anyway("anyway");//无论如何都继续

    /**
     * 描述
     */
    private String label;

    private ContinueTypeEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public static List<Map<String, Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        ContinueTypeEnum[] val = ContinueTypeEnum.values();
        for (ContinueTypeEnum e : val) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("label", e.getLabel());
            map.put("name", e.name());
            list.add(map);
        }
        return list;
    }

    public static ContinueTypeEnum getEnum(String name) {
        ContinueTypeEnum resultEnum = null;
        ContinueTypeEnum[] enumAry = ContinueTypeEnum.values();
        for (int i = 0; i < enumAry.length; i++) {
            if (enumAry[i].name().equals(name)) {
                resultEnum = enumAry[i];
                break;
            }
        }
        return resultEnum;
    }

}
