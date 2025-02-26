package pertemuan3;

public class Node {
	private int data;
	private Node next ;
	
	// inisialisasi Node
	public Node (int data) {
			this.data = data;
	}
	
	// setter & getter
	public void setdata (int data) {this.data = data;}
	public int getdata() {return data;}
	
	public void setNext (Node next) {this.next = next;}
	public Node getNext() {return next;}

}
