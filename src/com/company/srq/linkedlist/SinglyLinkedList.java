package com.company.srq.linkedlist;

public class SinglyLinkedList {
   static Node head;
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }

    }
    public static void main(String... args){
        SinglyLinkedList a = new SinglyLinkedList();

    }
}
