package com.github;

/**
* Created with IntelliJ IDEA.
* User: pmontgom
* Date: 3/20/13
* Time: 10:54 PM
* To change this template use File | Settings | File Templates.
*/
public class ForeignKeyRelationship {
    String parentTable;
    String parentColumn;

    String childTable;
    String childColumn;

    ForeignKeyRelationship(String parentTable, String parentColumn, String childTable, String childColumn) {
        this.parentTable = parentTable;
        this.parentColumn = parentColumn;
        this.childTable = childTable;
        this.childColumn = childColumn;
    }
}
