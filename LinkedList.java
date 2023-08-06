package practice;

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class LinkedList {
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static void insertBeg(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public static void insertAt(int pos,int data){
        Node new_node=new Node(data);
        Node n=head;
        for(int i=0;i<pos-1;i++){
            n=n.next;
        }
        n.next=new_node;
    }
    Node reverse(Node node){
        Node prev=null;
        Node curr=node;
        Node coming=null;
        while(curr!=null){
            coming=curr.next;
            curr.next=prev;
            prev=curr;
            curr=coming;
        } 
        node=prev;
        return node;
    }
   
    public static void printlist(){
        Node node =head;
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        //System.out.print(node.data);
    }
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int n=sc.nextInt();
		LinkedList list=new LinkedList();
		for(int i=0;i<n;i++){
		    list.insert(sc.nextInt());
		}
		list.insertBeg(23);
		list.insertAt(3,150);
		System.out.println("Before reversing");
		list.printlist();
		System.out.println();
		head=list.reverse(head);
		System.out.println("After reversing");
		list.printlist();
	}
	public static void insert(int data) {
		Node new_node=new Node(data);
		if(head==null) {
			head=new_node;
			}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=new_node;
		}
	}
}