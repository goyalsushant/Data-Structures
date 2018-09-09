//Main Class
class LearnList
{
	Node start;
	//Inner Class Node
	static class Node
	{
		int data;
		Node next;
		Node(int key)
		{
			data=key;
			next=null;
		}
	}
	//To print the nodes
	public void print()
	{
		Node n=start;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	//to insert node after a given node
	public void insertafter(Node previous,int key)
	{
		if(previous==null)
		{
			System.out.println("The node can not be null");
			return;
		}
		Node newNode=new Node(key);
		newNode.next=previous.next;
		previous.next=newNode;
	}
	//to insert node at the start
	public void first(int key)
	{
		Node newNode=new Node(key);
		newNode.next=start;
		start=newNode;
		return;
	}
	//to append the node , to add node at last position
	public void last(int key)
	{
		Node newNode=new Node(key);
		if(start==null)
		{
			start=new Node(key);
			return;
		}
		newNode.next=null;
		Node end=start;
		while(end.next!=null)
		{
			end=end.next;
		}
		end.next=newNode;
		return;
	}
	public static void main(String... args)
	{
		LearnList n1=new LearnList();
		n1.start=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(4);
		Node n4=new Node(5);
		
		n1.start.next=n2;
		n2.next=n3;
		n3.next=n4;
		n1.insertafter(n1.start.next,3);
		n1.first(0);
		n1.last(6);
		n1.print();
	}
}
