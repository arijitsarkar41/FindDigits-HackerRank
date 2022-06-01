import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
	static int k=0;

    // Complete the findDigits function below.
    static int findDigits(int n)
    {//n=1012
    	k=n; //k=1012
    	int count =0;
    	while(k>0)
    	{
    		int m=k%10; //m=2,1
    		k=k/10; //k=101,10,1
    		if(m==0)
    			continue;
    		if(n%m==0)
    			count++; //count=1,2,3
    		
    	}
    	
    	return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
