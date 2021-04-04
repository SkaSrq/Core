package com.company.srq.linkedlist;

import java.util.Scanner;

public class SinglyLinkedList {
   static Node head = null;
   static Node tail = null;
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void addLastNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }

   private void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("Empty List");
            return;
        }
       System.out.println("Node of Linked List are :");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
       System.out.println();

    }
    public static void main(String... args){
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scan = new Scanner(System.in);
        boolean exit = true;
        do{
            System.out.println("*************************  Main Menu  *************************");
            System.out.println("\t\t1.Insert at Last");
            System.out.println("\t\t2.Display");
            System.out.println("\t\t3.Exit");
            int option = scan.nextInt();
            if(option>0 && option <3) {
                switch (option) {
                    case 1:
                        System.out.println("Enter Number to Add.");
                        int temp = scan.nextInt();
                        list.addLastNode(temp);
                        break;
                    case 2:
                        list.display();
                        break;
                    case 3:
                        exit = false;
                        break;

                }
            }
            else{
                System.out.println("Please Enter Correct Option.");
            }
        }while(exit);

    }
}
