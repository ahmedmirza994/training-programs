package OOP;

public class Students {
    String firstName;
    Gender gender;
    public Students( String firstName, Gender gender ) {
        this.firstName = firstName;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Students st = new Students("Ahmed Mirza",Gender.Male);
        System.out.println(st.firstName);
        System.out.println(st.gender);
    }
}
