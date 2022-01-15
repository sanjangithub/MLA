import java.util.*; 
 
public class ReverseIntegerArray 
{ 
 
    static void reverse(Integer myArray[]) 
    { 
        Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Reversed Array:" + Arrays.asList(myArray)); 
    } 
 
     public static void main(String[] args) 
    { 
        Integer [] myArray = {132151,5654654,56565,654654646}; 
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray); 
    } 
}
