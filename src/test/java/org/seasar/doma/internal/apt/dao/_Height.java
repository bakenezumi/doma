/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
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
package org.seasar.doma.internal.apt.dao;

import org.seasar.doma.jdbc.domain.AbstractDomainType;

/**
 * @author taedium
 * 
 */
public class _Height<T> extends AbstractDomainType<Integer, Height<T>> {

    private _Height() {
        super(() -> new org.seasar.doma.wrapper.IntegerWrapper());
    }

    @Override
    public Height<T> newDomain(Integer value) {
        return null;
    }

    @Override
    public Integer getBasicValue(Height<T> domain) {
        return null;
    }

    public Class<Integer> getBasicClass() {
        return Integer.class;
    }

    @SuppressWarnings("unchecked")
    public Class<Height<T>> getDomainClass() {
        Class<?> clazz = Height.class;
        return (Class<Height<T>>) clazz;
    }

    public static <T> _Height<T> getSingletonInternal() {
        return null;
    }

}
