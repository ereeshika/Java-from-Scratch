import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String question = "Which architectural style goal is to achieve Integrability?";
        String choiceOne = "Data Flow Architecture";
        String choiceTwo = "Call and Return Architecture";
        String choiceThree = "Data Centered Architectures";

        String correctAnswer = choiceThree;

        Scanner input = new Scanner(System.in);

        boolean refresh = true;

        while(refresh){
            System.out.println(question);
            System.out.println(choiceOne + ", " + choiceTwo +" or " + choiceThree);
            String answer = input.nextLine();

            if (correctAnswer.equals(answer)) {
                System.out.println("Congratulations !! your answer is correct");
                refresh = false;
            }
            else if (choiceOne.equals(answer)){
                System.out.println("Your answer was "+choiceOne+". It is not hte correct answer. Please try again.");
            }
            else{
                System.out.println("Your answer was "+choiceTwo+". It is not the correct answer. Please try again.");
            }
        }
    }
}