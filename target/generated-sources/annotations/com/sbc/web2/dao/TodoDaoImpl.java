package com.sbc.web2.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.12.0" }, date = "2017-03-01T21:17:35.141+0900")
public class TodoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sbc.web2.dao.TodoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.12.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.web2.dao.TodoDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.web2.dao.TodoDao.class, "selectById", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.web2.dao.TodoDao.class, "update", com.sbc.web2.entity.TodoEntity.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.web2.dao.TodoDao.class, "deleteById", java.lang.String.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public TodoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.sbc.web2.entity.TodoEntity> selectAll() {
        entering("com.sbc.web2.dao.TodoDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/web2/dao/TodoDao/selectAll.sql");
            __query.setEntityType(com.sbc.web2.entity._TodoEntity.getSingletonInternal());
            __query.setCallerClassName("com.sbc.web2.dao.TodoDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.sbc.web2.entity.TodoEntity>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.sbc.web2.entity.TodoEntity>(com.sbc.web2.entity._TodoEntity.getSingletonInternal()));
            java.util.List<com.sbc.web2.entity.TodoEntity> __result = __command.execute();
            __query.complete();
            exiting("com.sbc.web2.dao.TodoDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.web2.dao.TodoDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public com.sbc.web2.entity.TodoEntity selectById(java.lang.String id) {
        entering("com.sbc.web2.dao.TodoDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/web2/dao/TodoDao/selectById.sql");
            __query.setEntityType(com.sbc.web2.entity._TodoEntity.getSingletonInternal());
            __query.addParameter("id", java.lang.String.class, id);
            __query.setCallerClassName("com.sbc.web2.dao.TodoDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.sbc.web2.entity.TodoEntity> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.sbc.web2.entity.TodoEntity>(com.sbc.web2.entity._TodoEntity.getSingletonInternal()));
            com.sbc.web2.entity.TodoEntity __result = __command.execute();
            __query.complete();
            exiting("com.sbc.web2.dao.TodoDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.web2.dao.TodoDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.sbc.web2.entity.TodoEntity entity) {
        entering("com.sbc.web2.dao.TodoDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/web2/dao/TodoDao/update.sql");
            __query.addParameter("entity", com.sbc.web2.entity.TodoEntity.class, entity);
            __query.setCallerClassName("com.sbc.web2.dao.TodoDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("entity", entity, com.sbc.web2.entity._TodoEntity.getSingletonInternal());
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sbc.web2.dao.TodoDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.web2.dao.TodoDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int deleteById(java.lang.String id) {
        entering("com.sbc.web2.dao.TodoDaoImpl", "deleteById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/web2/dao/TodoDao/deleteById.sql");
            __query.addParameter("id", java.lang.String.class, id);
            __query.setCallerClassName("com.sbc.web2.dao.TodoDaoImpl");
            __query.setCallerMethodName("deleteById");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sbc.web2.dao.TodoDaoImpl", "deleteById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.web2.dao.TodoDaoImpl", "deleteById", __e);
            throw __e;
        }
    }

}
