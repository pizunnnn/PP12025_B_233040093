package pertemuan2;

public class list {
	
	
	public static void main (String[] args) {
		
		strukturlist list = new strukturlist ();
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		
		System.out.println("Elemen: ");
		list.displayElement();

	}
	
	//tes 1 A
public static void main (String[] args) {
		
		strukturlist list = new strukturlist ();
		list.addTail(3);
		list.addTail(2);
		list.addTail(1);
		
		System.out.println("Elemen: ");
		list.displayElement();

	}

	//tes 1 B
	public static void main (String[] args) {
		
		strukturlist list = new strukturlist ();
		list.addTail(1);
		list.addTail(4);
		list.addTail(5);
		list.addTail(7);

		
		System.out.println("Elemen: ");
		list.displayElement();

	}

}
