package com.company.srq.test;

import java.util.ArrayList;
import java.util.List;

class Friends{
    String friendname;
    String ownername;

    public Friends(String friendname, String ownername) {
        this.friendname = friendname;
        this.ownername = ownername;
    }

    public String getFriendname() {
        return friendname;
    }

    public String getOwnername() {
        return ownername;
    }
}
public class ListTest {
    public static void main(String[] args){
        Friends friends1 = new Friends("Sharique","aman");
        Friends friends2 = new Friends("Sharique","hero");
        List<Friends> list1 = new ArrayList<Friends>();
        list1.add(friends1);
        list1.add(friends2);
        System.out.println(list1.size());
        for(int i=0; i<list1.size();i++){
            System.out.println(list1.get(i).ownername);
        }

    }
}
