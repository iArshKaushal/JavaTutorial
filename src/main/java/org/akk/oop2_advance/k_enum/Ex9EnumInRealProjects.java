package org.akk.oop2_advance.k_enum;


/// 1. Defining states
enum OrderStatus { NEW, PAID, SHIPPED, DELIVERED, CANCELLED }

/// 2. Error codes
enum ErrorCode {
    NOT_FOUND(404), SERVER_ERROR(500), OK(200);
    private final int code;
    ErrorCode(int code) { this.code = code; }
    public int getCode() { return code; }
}

/// 3. Configuration in Switches / State Machines
enum Mode { AUTO, MANUAL, ECO }


/// 4. Spring Boot / REST APIs
enum Role { ADMIN, USER, GUEST }


public class Ex9EnumInRealProjects {
    public static void main(String[] args) {

    }
}
