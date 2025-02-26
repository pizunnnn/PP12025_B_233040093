package pertemuan3;

import pertemuan2.Node;

public class strukturlist {
private Node HEAD;
	
	public boolean isEmpty() {
        return HEAD == null; // Mengembalikan true jika HEAD adalah null
    }

	public void addTail (int data)
	{
		Node posNode=null, curNode;
		
		Node newNode = new Node(data);
		if (isEmpty())
		{
			HEAD = newNode;
		}
		else
		{
			curNode = HEAD;
			while (curNode != null)
			{
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext (newNode);
		}
	}
	
	public void addMid (int data, int position) {
		Node curNode = null;
		Node posNode = null;
		int i;
		Node newNode = new Node(data);
		if (HEAD == null) {
			HEAD = newNode;
			
		}else {
			curNode = HEAD;
			if (position ==1) {
				newNode.Next = curNode;
				HEAD = newNode;
			}else {
				i = 1;
				while(curNode != null && i < position) {
					posNode = curNode;
					curNode = curNode.Next;
					i++;
				}
				posNode.Next = newNode;
				newNode.Next = curNode;
			}
			
		}
			
		
			}
	    
		public void displayElement () {
			Node curNode = HEAD;
			while (curNode != null) {
				System.out.print(curNode.getdata () + "");
				curNode = curNode.getNext();
				
			}
		}
			
			public void addHead (int data) {
				Node newNode = new Node (data);
				if (isEmpty ()) {
					HEAD = newNode;
				}
				else {
					newNode.setNext (HEAD);
					HEAD = newNode;
				}
			}
}


