package org.akk.zz_new_features.java14.records;

///  RECORD Class
record User(int id, String name){

    static int num; // OK
    // int empId; // ERROR

    /// Approach 1 - Canonical Constructor
   /* public User(int id, String name){
            if(id <0 || name == null){
                throw new IllegalArgumentException();
            }
            this.id = id;
            this.name = name;
        }*/

    /// Approach 2 - Compact Canonical Constructor
    public User{
        if(id == 0){
            throw new IllegalArgumentException("Id cannot be 0");
        }
    }


    //  We can create methods inside records [Instance Method and static method]
    public void display(){
        System.out.println("Hello i am " + name);
    }

    public static void testMethod(){
        System.out.println("this is a static test method");
    }

}


public class Ex1Record {
    public static void main(String[] args) {
        User user = new User(1001, "Ashwani");
        System.out.println(user);

        ///  there is no getter methods, we can fetch data as follow
        System.out.println("ID : " + user.id());
        System.out.println("Name : " + user.name());

        ///  Methods inside records
        user.display();
        User.testMethod();
    }
}





/// Traditional Approach to carry data using "Data Carrier Class"
/*class User {
    private int id;
    private String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}*/