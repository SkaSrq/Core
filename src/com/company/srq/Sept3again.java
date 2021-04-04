package com.company.srq;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Sept3again {
    static class Pair {
        int index;
        float time;

        public Pair(int v, float t) {
            index = v;
            time = t;
        }
    }
    public static void main(String... args){
        Queue<Pair> q;
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        while(T-- > 0) {
            int N = Integer.parseInt(scan.nextLine());
            int[] arr = new int[N];
            int min = Integer.MAX_VALUE;
            String[] temp = scan.nextLine().split(" ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(temp[i]);
            }
            boolean[] visited = new boolean[N];
            for(int i=0; i<N; i++){
                q = new LinkedList<Pair>();
                helper(arr,i,q,visited);
            }
        }
    }
    public static void helper(int[] arr, int index, Queue<Pair> q,boolean[] visited){
        int left = index;
        int right = index;
        int n = arr.length;
//        boolean[] visit = new boolean[n];
        visited[index] = true;
        while(left-->0){
            if(arr[left]>arr[index]){
                visited[left] = true;
                float t = ((right-index)/Math.abs(arr[index]-arr[right]));
                Pair p = new Pair(index, t);
                q.add(p);
            }
        }
        while(right++<n){
            if(arr[index]>arr[right]){
                visited[right] = true;
                float t= ((right-index)/Math.abs(arr[index]-arr[right]));
                Pair p = new Pair(index, t);
                q.add(p);
            }
        }
        Iterator itr = q.iterator();
        while(itr.hasNext()){
            Pair current = q.poll();
            
        }
    }
}
