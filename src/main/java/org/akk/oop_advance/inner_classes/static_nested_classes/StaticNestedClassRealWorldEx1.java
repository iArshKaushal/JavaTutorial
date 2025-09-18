package org.akk.oop_advance.inner_classes.static_nested_classes;


class Database {
    private static String dbName = "MySQL_DB";

    // Static nested class
    static class DBUtils {
        public static void connect() {
            System.out.println("Connecting to database: " + dbName);
        }
    }
}


public class StaticNestedClassRealWorldEx1 {
    public static void main(String[] args) {
        Database.DBUtils.connect();
    }
}
