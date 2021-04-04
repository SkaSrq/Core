package com.company.srq;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {
    private final int V;
    private LinkedList<Integer> arr[] ;
    DFSGraph(int v)
    {
        V = v;
        arr = new LinkedList[V];
        for(int i=0; i<V;i++)
        {
            arr[i] = new LinkedList<Integer>();
        }
    }

    public void add(int s, int d)
    {
        arr[s].add(d);
        arr[d].add(s);
    }

    public void DFS()
    {
        boolean[] vis = new boolean[V];

        for(int i=0; i<V; i++) // for disjoint graph
        {
          if(!vis[i])
          {
              DFSUtil(i,vis);
          }
        }
    }
    public void DFSUtil(int s, boolean[] vis)
    {
        vis[s] = true;
        System.out.println(s+" ");

        Iterator<Integer> itr = arr[s].listIterator();
        while(itr.hasNext())
        {
            int n = itr.next();
            if(!vis[n])
            {
                DFSUtil(n,vis);
            }
        }
    }

    public static void main(String[] args)
    {
        DFSGraph mygraph = new DFSGraph(5);
        mygraph.add(1,2);
        mygraph.add(1,4);
        mygraph.add(3,4);
        mygraph.add(4,0);
        mygraph.add(0,2);
        mygraph.DFS();
    }
}
