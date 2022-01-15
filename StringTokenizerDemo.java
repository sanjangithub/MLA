import java.util.Scanner;
import java.util.StringTokenizer;

class StrinTokenizerDemo
{
    public static void main(String[] args) 
    {
        int n; int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers with gap: ");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens())
        {
            String sanjan = st.nextToken();
            n= Integer.parseInt(sanjan);
            System.out.println(n);
            sum = sum+n;
        }
        System.out.println("sum of the numbers is: "+sum);
        sc.close();

    }
}