public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int studentAge = 15;
        double studentGPA = 3.7;
        String studentFirstName = "Moditha";
        String studentLastName = "Punchihewa";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        System.out.println(studentFirstInitial+"."+studentLastInitial+" is a "+studentAge+" years old student with "+studentGPA+" GPA.");
        if (hasPerfectAttendance){
            System.out.println("He also has perfect attendance too.");
        }else{
            System.out.println("Even his attendance is not perfect");
        }
    }
}
