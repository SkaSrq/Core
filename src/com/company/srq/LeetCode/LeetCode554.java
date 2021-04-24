package com.company.srq.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode554 {
    public static void main(String... args)
    {
        List<List<Integer>> flist = new ArrayList<List<Integer>>();
        flist.add(Arrays.asList(100000000));
        flist.add(Arrays.asList(100000000));
        flist.add(Arrays.asList(100000000));
        System.out.println(leastBricks(flist));
    }
    public static int leastBricks(List<List<Integer>> wall) {
        int m = 0;
        for(int sum : wall.get(0))
            m+=sum;
        if(wall.get(0).size()==1 && m==1)
            return wall.size();

        int[][] dp = new int[wall.size()][m-1];
        for(int i=0; i<wall.size(); i++)
        {
            int count = 0;
            int mysum = 0;
            for(int j=0; j<wall.get(i).size(); j++)
            {
                int val = wall.get(i).get(j);
                mysum+=val;
                int temp = 0;
                while(count<m-1 && temp<val)
                {
                    dp[i][count] = mysum;
                    ++count;
                    ++temp;
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i=0; i<m-1; i++)
        {
            int check = i+1;
            int count = 0;
            int temp =0;
            while(temp<wall.size())
            {
                if(check!=dp[temp][i])
                    count++;
                temp++;
            }
            if(count<result)
                result = count;
        }
        return result;

    }
}
