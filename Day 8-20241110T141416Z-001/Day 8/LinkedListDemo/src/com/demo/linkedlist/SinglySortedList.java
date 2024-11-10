package com.demo.linkedlist;

import com.demo.linkedlist.SinglyLinkedList.Node;

public class SinglySortedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}
		
	}
    Node head;
	public SinglySortedList() {
		
			head=null;
	}
	public void deletByValue(int val) {
		Node temp=head;
		//to check whether to delete the head node
		if(head.data==val) {
			head=temp.next;
			//nullify the temp , so that garbage collector will release the memory
			temp.next=null;
			temp=null;
		}else {
			Node prev=null;
			while(temp!=null && temp.data<val) {
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null && temp.data==val ) {
				prev.next=temp.next;
				temp.next=null;
				temp=null;
			}else {
				System.out.println("data not found"+val);
			}
		}
		
	}
	
	
	public void addInSortedOrder(int val) {
		Node newnode=new Node(val);
		//if the list is empty
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head,prev=null;
			//add before first node
			if(head.data>val) {
				newnode.next=head;
				head=newnode;
			}else {
				//add in between or at the end
				while(temp!=null && temp.data<val) {
					prev=temp;
					temp=temp.next;
				}
				newnode.next=prev.next;
				prev.next=newnode;
			}
		}
			
					
		
	}
	
	//to display values of all nodes
		public void displaydata() {
			if(head==null) {
				System.out.println("list is empty");
			}else {
				Node temp=head;
				while(temp!=null) {
					System.out.println(temp.data+"  ");
					temp=temp.next;
				}
				System.out.println("------------------------------------------");
			}
		}
}
