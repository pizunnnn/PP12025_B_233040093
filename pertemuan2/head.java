package pertemuan2;

public class head {

public static void main (String[] args) {
		
		strukturlist list = new strukturlist ();
		list.addHead(5);
		list.addHead(4);
		list.addHead(3);

		System.out.println("Elemen: ");
		list.displayElement();

	}

//tes 3 a

public static void main (String[] args) {
	
	strukturlist list = new strukturlist ();
	list.addHead(1);
	list.addHead(2);
	list.addHead(3);

	System.out.println("Elemen: ");
	list.displayElement();

}

//tes 3 b
public static void main (String[] args) {
	
	strukturlist list = new strukturlist ();
	list.addHead(1);
	list.addHead(4);
	list.addHead(5);
	list.addHead(7);

	System.out.println("Elemen: ");
	list.displayElement();

}

}
