/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.doma.copy;

import org.seasar.doma.message.MessageCode;

/**
 * @author taedium
 * 
 */
public class PropertyCopyException extends CopyException {

    private static final long serialVersionUID = 1L;

    protected final String srcClassName;

    protected final String srcPropertyName;

    protected final Object srcPropertyValue;

    public PropertyCopyException(String srcClassName, String srcPropertyName,
            Object srcPropertyValue, Throwable cause) {
        super(MessageCode.DOMA7001, cause, srcClassName, srcPropertyName,
                srcPropertyValue, cause);
        this.srcClassName = srcClassName;
        this.srcPropertyName = srcPropertyName;
        this.srcPropertyValue = srcPropertyValue;
    }

    public String getSrcClassName() {
        return srcClassName;
    }

    public String getSrcPropertyName() {
        return srcPropertyName;
    }

    public Object getSrcPropertyValue() {
        return srcPropertyValue;
    }

}