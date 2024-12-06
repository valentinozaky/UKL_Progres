    import java.util.Random;
    import java.util.Scanner;
    
    public class SoalSedang3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            boolean continueQuiz = true;
            int hasil = 0;    
            System.out.println("Welcome to the Math Quiz!");   
             while (continueQuiz) {
                int num1 = rand.nextInt(100) + 1;
                int num2 = rand.nextInt(99) + 1;
                int operators = rand.nextInt(3) + 1; ;
                String operator = "";
                switch (operators) {
                    case 1:
                        operator = "*";
                        hasil = num1 * num2;
                        break;
                    case 2:
                        operator = "/";
                        hasil = num1 / num2;
                        break;
                    case 3:
                        operator = "%";
                        hasil = num1 % num2;
                        break;
                    default: 
                        break;
                }
                System.out.println("Question: " + num1 + " " + operator + " " + num2 + " = ?");
                System.out.print("Answer: ");
                int userAnswer = input.nextInt();
    
                if (userAnswer == hasil) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is " + hasil);
                }
                continueQuiz = false;
                System.out.println("Continue the quiz? (yes/no)");
                String choice = input.next();
                if (choice.equals("yes")) {
                    continueQuiz = true;
                }
            }
            System.out.println("Thanks for playing Quiz!");
        }
    }