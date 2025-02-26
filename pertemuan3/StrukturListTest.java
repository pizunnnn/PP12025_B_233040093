package pertemuan3;

public class StrukturListTest {
	
public static void main (String[] args) {
		
		strukturlist list = new strukturlist ();
		
		list.addTail(3);
		list.addTail(4);
		list.addMid(7,2);
		list.addMid(8,2);
		list.addHead(5);
		
		
		System.out.println("Elemen: ");
		list.displayElement();

	}
}
