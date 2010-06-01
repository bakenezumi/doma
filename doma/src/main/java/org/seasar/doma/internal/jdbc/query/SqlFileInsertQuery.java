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
package org.seasar.doma.internal.jdbc.query;

import static org.seasar.doma.internal.util.AssertionUtil.*;

import java.sql.Statement;

import org.seasar.doma.jdbc.SqlKind;
import org.seasar.doma.jdbc.entity.EntityType;

/**
 * @author taedium
 * 
 */
public class SqlFileInsertQuery extends SqlFileModifyQuery implements
        InsertQuery {

    protected EntityHandler<?> entityHandler;

    public SqlFileInsertQuery() {
        super(SqlKind.INSERT);
    }

    public void prepare() {
        assertNotNull(config, sqlFilePath, callerClassName, callerMethodName);
        preInsert();
        prepareOptions();
        prepareSql();
        assertNotNull(sql);
    }

    protected void preInsert() {
        if (entityHandler != null) {
            entityHandler.preInsert();
        }
    }

    @Override
    public void generateId(Statement statement) {
    }

    @Override
    public <E> void setEntityAndEntityType(E entity, EntityType<E> entityType) {
        entityHandler = new EntityHandler<E>(entity, entityType);
    }

    protected class EntityHandler<E> {

        protected E entity;

        protected EntityType<E> entityType;

        protected EntityHandler(E entity, EntityType<E> entityType) {
            assertNotNull(entity, entityType);
            this.entity = entity;
            this.entityType = entityType;
        }

        protected void preInsert() {
            entityType.preInsert(entity);
        }

    }
}
