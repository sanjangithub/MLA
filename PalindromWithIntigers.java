import java.util.Scanner;

public class PalindromWithIntigers
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = sc.nextInt();
        System.out.println(userInput);

        int Remainder; int StoreValue; int Sum = 0;

        StoreValue = userInput;
        while(userInput!=0)
        {
            Remainder = userInput%10; 
            Sum = (Sum*10)+Remainder;
            userInput = userInput/10;
        }
        if(StoreValue==Sum)
        {
            System.out.println("The number is palindrome number.");
        }
        else
        {
            System.out.println("The number is not palindrome number.");
        }
    }
}


