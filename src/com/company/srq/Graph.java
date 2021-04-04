package com.company.srq;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int V;
    LinkedList<Integer>[] adj;
    Graph(int v){
        this.V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++)
            adj[i] = new LinkedList<Integer>();
    }
    void add(int s, int d){
        adj[s].add(d);
        adj[d].add(s);
    }
    void bfs(int s){
        boolean[] vis = new boolean[V];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        vis[s] = true;
        while(queue.size() > 0){
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> itr = adj[s].listIterator();
            while(itr.hasNext()){
                int i = itr.next();
                if(!vis[i]){
                    vis[i] = true;
                    queue.add(i);
                }
            }
        }
    }
    public static void main(String[] args){
        Graph graph = new Graph(5);
        graph.add(0,1);
        graph.add(0,2);
        graph.add(0,3);
        graph.add(2,3);
        graph.add(3,4);
        graph.bfs(2);
    }
}
