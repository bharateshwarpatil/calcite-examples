package com.calcite.visit.visitor;

public class Test {

    public static void main(String[] args) throws Exception {
        SqlVisitorCustom sqlVisitorCustom = new SqlVisitorCustom();
        System.out.println(sqlVisitorCustom.parseTableName("select * from employee as emp ,Department dep where dep.xy=emp.xy" ).tableNames);
    }
}
