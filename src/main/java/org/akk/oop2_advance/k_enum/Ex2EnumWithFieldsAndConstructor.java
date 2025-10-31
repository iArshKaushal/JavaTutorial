package org.akk.oop2_advance.k_enum;

enum Status{
    NEW(0), IN_PROGRESS(1), COMPLETED(2);

    private final int code;

    /// Enum constructor (always private)
    Status(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}



public class Ex2EnumWithFieldsAndConstructor {
    public static void main(String[] args) {

        Status status = Status.IN_PROGRESS;
        System.out.println("Status: " + status);
        System.out.println("Status Code: " + status.getCode());

        /// ✅ Each constant (NEW, IN_PROGRESS, COMPLETED) behaves like an instance of the enum class.
    }
}
