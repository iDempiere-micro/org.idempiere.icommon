package org.idempiere.icommon.model;

// to be used instead of PO
public interface IPO {
    String[] get_KeyColumns();
    String get_TrxName();
    boolean is_new();
    String get_TableName();
    Object get_Value (String columnName);
}