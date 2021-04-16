package com.company.srq.Techgig;
import java.util.*;
public class Problem1 {


        public static void main(String... args )
        {
            Scanner scan = new Scanner(System.in);
            String V = scan.nextLine();
            int lenV = V.length();
            int N = scan.nextInt();
            scan.nextLine();
            while(N-->0){
                String B = scan.nextLine();
                int lenB = B.length();
                boolean bool = isSubSequence(B,V,lenB,lenV);
                if(bool)
                    System.out.println("POSITIVE");
                else
                    System.out.println("NEGATIVE");
            }


        }

        static boolean isSubSequence(String str1, String str2,
                                     int m, int n)
        {
            int j = 0;
            for (int i = 0; i < n && j < m; i++)
                if (str1.charAt(j) == str2.charAt(i))
                    j++;
            return (j == m);
        }


}
