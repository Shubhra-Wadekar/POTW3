import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

static boolean ispalindromme(String k,int left,int right){
    while(left<right){
        if(k.charAt(left)!=k.charAt(right)){
            return false;
            
        }
        left++;
        right--;
    }
    return true;
    
}
    public static int palindromeIndex(String s) {
    // Write your code here
   int lastIndex=s.length()-1;
   int firstIndex=0;
   
   while(lastIndex>firstIndex){
    if(s.charAt(firstIndex)==s.charAt(lastIndex)){
        lastIndex--;
        firstIndex++;
    }
    else{
        if(ispalindromme(s,firstIndex+1,lastIndex)){
            return firstIndex;
        }
        else if(ispalindromme(s,firstIndex,lastIndex-1)){
           
            return lastIndex;
        }
    }

   }
       
    return -1;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
