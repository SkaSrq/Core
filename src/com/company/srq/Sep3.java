package com.company.srq;

import java.util.*;

public class Sep3 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        while(T-- > 0){
            int N =  Integer.parseInt(scan.nextLine());
            int[] arr = new int[N];
            int min = Integer.MAX_VALUE;
            String[] temp = scan.nextLine().split(" ");
            for(int i=0; i<N;i++) {
                arr[i] = Integer.parseInt(temp[i]);
            }
            Map<Integer,HashSet<Integer>> map = new HashMap<Integer,HashSet<Integer>>();
            int m=0;
            for(int i=0; i<N; i++){
               m = helper(arr,i,map,min);
            }
            System.out.println(map);
            System.out.println(m);
            Iterator itr = map.entrySet().iterator();
            while(itr.hasNext()){
                Map.Entry e = (Map.Entry)itr.next();
                HashSet<Integer> set = (HashSet<Integer>) e.getValue();
                for(int element:set){
                    int a = element;
                }
            }


        }
    }
    public static int helper(int[] arr, int index, Map<Integer,HashSet<Integer>> map, int min){
        HashSet<Integer> set = new HashSet<Integer>();
        int left = index;
        int right = index;
        int n = arr.length;
        while(left-->0){
            if(arr[left]>arr[index])
                set.add(left);
        }
        while(right++<n-1){
            if(arr[index]>arr[right])
                set.add(right);
        }
        int tempmin = set.size();
        map.put(index,set);
        return Math.min(min,tempmin)+1;
    }
    public void dfs(int a[], int length){

    }

}
