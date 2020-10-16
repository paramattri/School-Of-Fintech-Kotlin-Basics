package day4;

public class JavaToKotlin {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static  void  main(String args[]){

    }

    public static String fun(String name, String city){

        return "My name is "+name+" And I live in "+city;
    }
}
