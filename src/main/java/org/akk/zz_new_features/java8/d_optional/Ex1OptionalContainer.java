package org.akk.zz_new_features.java8.d_optional;

import java.util.Optional;




public class Ex1OptionalContainer {

    public static Optional<String> findUserNameById(int id) {
        if (id == 1) {
            return Optional.of("Alice");
        } else {
            return Optional.empty(); // No user found for this ID
        }
    }

    public static void main(String[] args) {
        Optional<String> user1 = findUserNameById(1);
        user1.ifPresent(name -> System.out.println("User found: " + name)); // Prints "User found: Alice"

        Optional<String> user2 = findUserNameById(2);
        String defaultName = user2.orElse("Guest");
        System.out.println("User for ID 2: " + defaultName); // Prints "User for ID 2: Guest"
    }
}
