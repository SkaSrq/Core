package com.company.srq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Temp2 {
    public static void main (String[] args) {
        FastInput fastInput = new FastInput();
        int T = fastInput.nextInt();
        while(T-->0){
            int N = fastInput.nextInt();
            int[] arr = new int[N];
            int sum =0;
            for(int i=0; i<N; i++){
                arr[i] = fastInput.nextInt();
                sum+=arr[i];
            }
            if(N%2==0){
                System.out.println(sum/2);
            }
            else{
                int mysum = sum-arr[N-1];
                if(mysum>arr[N-1]){
                    System.out.println(mysum);
                }
                else{
                    System.out.println(arr[N-1]);
                }
            }
        }

    }

}
class FastInput{
    BufferedReader bufferedReader;
    StringTokenizer stringTokenizer;

    public FastInput(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }
    String next(){
        while(stringTokenizer == null|| !stringTokenizer.hasMoreElements()){
            try{
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
}
