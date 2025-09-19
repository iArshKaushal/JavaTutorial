package org.akk.oop2_advance.e_anonymous_objects;


class UserService {
    public void registerUser(UserDTO user) {
        System.out.println("Registering user: " + user.getName());
    }
}

class UserDTO {
    private String name;
    private String email;

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}




public class AnonymousObjectEx1 {
    public static void main(String[] args) {
        new UserService().registerUser(new UserDTO("Ashwani Kumar", "ashwani@example.com"));
    }
}
