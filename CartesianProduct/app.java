package CartesianProduct;
import java.io.*;
import java.util.*;
 
class GFG {
 
    static void findCart(char arr1[], char arr2[], char n,
                         char n1)
    {
        for (char i = 0; i < n; i++)
            for (char j = 0; j < n1; j++)
                System.out.print("{" + arr1[i] + ", "
                                 + arr2[j] + "}, ");
    }
    // Driver code
    public static void main(String[] args)
    {
 
        // first set
        char arr1[] = { 'a', 'd', 'e', 'f', 'k' };
 
        // second set
        char arr2[] = {  } ;
 
        char n1 = (char) arr1.length;
        char n2 = (char) arr2.length;
        findCart(arr1, arr2, n1, n2);
    }
}