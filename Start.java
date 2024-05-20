public class Start{
	public static void main(String[] args)
	{
		Book book1 = new Book("ISBN= 1013","Himu","Humayun Ahmed",20.0,10);
		Book book2 = new Book("ISBN= 1044","ANIMAL","Eraf",15.0,5);
		
		System.out.println("Book 1 : ");
		book1.showDetails();
		
		System.out.println("\nBook 2 : ");
		book2.showDetails();
		
		book1.sellQuantity(6);
		book2.AddQuantity(4);
		
		System.out.println("\nAfter selling 3 copies of Book 1 and 2 copies added on Book 2 :");
		
		book1.showDetails();
		book2.showDetails();
		
	}
}