import java.util.Scanner;


public class PracticeProblem {


   public static void main(String args[]) {
       q1();
       q2();
       q3();
       q4();
       q5();
       q6();
   }


   public static void q1() {
       //Write question 1 code here
       Scanner input = new Scanner(System.in);
       boolean boot = true;


       System.out.print("Input a boolean: ");
       boot = input.nextBoolean();
       System.out.println(boot);


   }


   public static void q2() {
       //Write question 2 code here
       Scanner input = new Scanner (System.in);


       int num;
       num = 0;


       System.out.print("Input an integer: ");
       num = input.nextInt();


       boolean sum = num > 5;
       System.out.println(sum);


   }


   public static void q3() {
       //Write question 3 code here


       Scanner input = new Scanner(System.in);


       System.out.print("Input pizza: ");
       String bird;
       bird = input.nextLine();
       System.out.println(bird.equals("pizza"));




   }


   public static void q4() {


       Scanner input = new Scanner(System.in);


       System.out.print("Input a number: ");
       double num = input.nextDouble();
       boolean answer = (num == 0);
       System.out.println(answer);


   }


   public static void q5() {
       //Write question 5 code here
       Scanner input = new Scanner(System.in);
       System.out.print("Input an integer: ");
       double num = input.nextDouble();
       boolean answer = !(num == 0);
       System.out.println(answer);
      


   }


   public static void q6() {
       Scanner input = new Scanner(System.in);
       System.out.print("Input a word earlier than google: ");
       String old = input.nextLine();
      
       boolean answer = old.compareTo("google") < 0;
       System.out.println(answer);
      
       input.close();


   }


}
