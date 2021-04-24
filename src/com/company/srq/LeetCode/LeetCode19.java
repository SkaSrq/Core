package com.company.srq.LeetCode;

public class LeetCode19 {
    static Node head = null;
    static class Node
    {
        int val;
        Node next;
        Node(){}
        public Node(int val)
        {
            this.val = val;
            next = null;
        }
    }
    static void insertLinkedList(int val)
    {
     if(head == null)
     {
       head = new Node(val);
     }
     else
         {
             Node current = head;
             while(current.next!=null)
             {
                 current = current.next;
             }
             current.next = new Node(val);
         }
    }

    static void printLinkedList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void deleteLinkedList(int n)
    {
        Node fast = head;
        Node slow = head;
        int count = 0;
        while (fast.next!= null)
        {
          count++;
          fast = fast.next;
          if (count > n)
          {
                slow = slow.next;
          }

        }
        if(fast == null)
            head = head.next;

        slow.next = slow.next.next;
    }
    public static void main(String... args)
    {
        LeetCode19 head  = new LeetCode19();
        insertLinkedList(1);
        insertLinkedList(2);
//        insertLinkedList(3);
//        insertLinkedList(4);
//        insertLinkedList(5);

        printLinkedList();

        deleteLinkedList(1);
        printLinkedList();

    }
}
