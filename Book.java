public class Book{
	private String isbn;
	private String bookName;
	private String authorName;
	private double price;
	private int publicationYear;
	private int availableQuantity;
	
	public Book(String isbn,String bookName,String authorName, double price, int availableQuantity)
	{
		this.isbn = isbn;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	
		this.availableQuantity = availableQuantity;
	}
	 
	 public String getIsbn(){
		 return isbn;
	 }
	 
	 public void setIsbn(String isbn){
		 this.isbn = isbn;
	 }
	 
	  public String getBookName(){
		 return bookName;
	 }
	 
	 public void setBookName(String bookName){
		 this.bookName = bookName;
	 }
	 
	 	  public String getAuthorName(){
		 return authorName;
	 }
	 
	 public void setAuthorName(String authorName){
		 this.authorName = authorName;
	 }
	 
	 
	 	  public double getPrice(){
		 return price;
	 }
	 
	 public void setPrice(double price){
		 this.price = price;
	 }
	 
	 
	 
	 
	 
	 
	 	  public int getAvailableQuantity (){
		 return availableQuantity;
	 }
	 
	 public void setAvailableQuantity(int availableQuantity){
		 this.availableQuantity = availableQuantity;
	 }
	 
	 
	 public void AddQuantity(int amount){
		 this.availableQuantity += amount;
	 }
	 
	  public void sellQuantity(int amount){
		 if(amount <= this.availableQuantity){
			 this.availableQuantity -= amount;
		 }
		 else {
			 System.out.println("Not enoungh copies available to sell");
	 }
	  }
	  
	  public void showDetails(){
		  
	    System.out.println("ISBN : " + isbn);
		System.out.println("Title : " + bookName);
		System.out.println("Author : " + authorName);
		
		System.out.println("Price : " + price);
		System.out.println("Available Quantity : " + availableQuantity);
		
	  }
}