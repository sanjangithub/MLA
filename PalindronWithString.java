import java.util.Scanner;

public class PalindronWithString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userString = sc.nextLine();
        System.out.println(userString);

        String Reverse = " ";

        for(int i=userString.length()-1;i>=0;i--)
        {
            Reverse = Reverse+userString.charAt(i);
        }
        if(userString==Reverse)
        {
            System.out.println("This is a palindrom word.");
        }
        if(userString!=Reverse)
        {
            System.out.println("This is not a palindrom word.");
        }
    }
}
