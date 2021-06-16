import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int studentAge;
        double studentGPA;
        String studentFirstName;
        String studentLastName;
        char hasPerfectAttendance;
        char likeToAnswer;
        boolean continueProgram = false;
        Scanner input = new Scanner(System.in);

        while(!continueProgram){
        System.out.println("Please tell me your first name :");
        studentFirstName = input.next();

        System.out.println("Please tell me your last name :");
        studentLastName = input.next();

        System.out.println("Hello "+studentFirstName+" "+studentLastName+" can I ask few questions from you? if yes press 'y' else press 'n' to exit");
        likeToAnswer = input.next().charAt(0);

        if(likeToAnswer=='y'){
            System.out.println("Hello "+studentFirstName+" "+studentLastName+" how old are you ?");
            studentAge = input.nextInt();

            System.out.println("Hello "+studentFirstName+" "+studentLastName+" what is your GPA ?");
            studentGPA = input.nextDouble();

            System.out.println("Did you maintain perfect attendance ? if yes press 'y' else press 'n'");
            hasPerfectAttendance = input.next().charAt(0);

            char studentFirstInitial = studentFirstName.charAt(0);
            char studentLastInitial = studentLastName.charAt(0);

            if(hasPerfectAttendance == 'y'){
                System.out.println(studentFirstInitial+"."+studentLastInitial+" is a "+studentAge+" years old student with "+studentGPA+" GPA. He also has perfect attendance too.");
            }
            else{
                System.out.println(studentFirstInitial+"."+studentLastInitial+" is a "+studentAge+" years old student with "+studentGPA+" GPA. Even his attendance is not perfect");
            }
            continueProgram = true;
        }else if (likeToAnswer=='n'){
            System.out.println("Thank you and Good bye !!");
            continueProgram = true;
        }
        else{
            System.out.println("Invalid input please try again");
        }
        }
    }
}
