package pertemuan2;

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
	//latihan 3
	public void displayElement () {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getdata () + "");
			curNode = curNode.getNext();
			
		}
	}
		
	//latihan 4
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
