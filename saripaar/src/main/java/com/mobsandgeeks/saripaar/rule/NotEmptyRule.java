/*
 * Copyright (C) 2014 Mobs and Geeks
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/**
 * @author Ragunath Jawahar {@literal <rj@mobsandgeeks.com>}
 */
public class NotEmptyRule extends AnnotationRule<NotEmpty, String> {

    protected NotEmptyRule(NotEmpty notEmpty) {
        super(notEmpty);
    }

    @Override
    public boolean isValid(String data) {
        return data != null
            && (mRuleAnnotation.trim() ? data.trim().length() > 0 : data.length() > 0);
    }
}
