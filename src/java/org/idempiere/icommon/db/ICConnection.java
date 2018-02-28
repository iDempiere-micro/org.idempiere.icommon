package org.idempiere.icommon.db;

public interface ICConnection {

    String getDbHost();

    int getDbPort();

    String getDbName();

    String getDbUid();

    String getDbPwd();
}