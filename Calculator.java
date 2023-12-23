import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator
{
  public static void main(String[] args)
  {
   int num1, num2, c, ch;
   Scanner s = new Scanner(System.in);

    while (true)
   {
    try
   {
     System.out.println("Enter Two Numbers...");
     num1 = s.nextInt();
     num2 = s.nextInt();

     System.out.println("Enter Your Choice...");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

         ch = s.nextInt();

         switch (ch) {
                
                 case 1:
                      c = num1 + num2;
                      System.out.println("Addition: " + c);
                      break;

                 case 2:
                       c = num1 - num2;
                       System.out.println("Subtraction: " + c);
                       break;

                  case 3:
                       c = num1 * num2;
                       System.out.println("Multiplication: " + c);
                       break;

                  case 4:
                       if (num2 != 0) {
                           c = num1 / num2;
                           System.out.println("Division: " + c);
                       } else {
                           System.out.println("Error: Cannot divide by zero");
                       }
                       break;

                   default:
                        System.out.println("Invalid choice..!");
                }
            }
             catch (InputMismatchException e)
            {
                System.out.println("Invalid input. Please enter a valid number.");
                s.nextLine(); 
            }
            catch (ArithmeticException e) 
            {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String continueCalculation = s.next().toLowerCase();
            if (!continueCalculation.equals("yes")) 
            {
                break;
            }
        }
        s.close();
    }
}









