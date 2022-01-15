import java.util.Arrays;
public class SecondSmallestNumber 
{
   public static void main(String args[]){
      int array[] = {10, 29, 25, 63, 96, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[1];
      System.out.println("2nd smallest element is ::"+res);
   }
}
