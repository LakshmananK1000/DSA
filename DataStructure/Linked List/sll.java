import java.util.Scanner;
public class sll{
public class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public Node head = null;
public Node tail = null;

public void addNodeFirst(int data)
{
	Node nn = new Node(data);
		if(head==null)
		{
			head = nn;
			tail = nn;
		}
		else
		{
			nn.next =head;
			head = nn;
		}
}
public void addNodeLast(int data)
{
	Node nn = new Node(data);
	if(tail==null)
	{
		tail = nn;
		nn.next = null;
	}
	else
	{
		tail.next = nn;
		tail = nn;
		tail.next =null;
	}
}
public void addNodeMiddle(int data, int pos)
{
	Node temp =head;
	if(pos==0){
		addNodeFirst(data);
		return;
	}
	else
	{
		for(int i=1;i<pos;i++)
		{
			temp = temp.next;
		}
		Node nn = new Node(data);
		temp.next=nn;
		return;
		
	}
}
public void display()
{
	Node temp = head;
	
	if(head == null)
	{
		System.out.println("List is Empty");
		return;
	}
	System.out.println("Nodes of Singly Linked list");
	while(temp!=null)
	{
		System.out.print(temp.data+"--->");
		temp=temp.next;
		}
	
	{
		System.out.print("End");
	}
	System.out.println();
}

public static void main(String[] args)
{
	sll list = new sll();
	list.addNodeFirst(1);
	list.addNodeLast(10);
	list.addNodeFirst(0);
	list.addNodeMiddle(3,2);
	list.addNodeMiddle(4,3);
	list.addNodeMiddle(5,4);
	list.display();
	}
}