class BookListing{
  
  private Book bookInListing;
  private double price;

  public BookListing(Book b,double p){
    bookInListing=b;
    price=p;
  }

  public void printDescription(){
    bookInListing.printBookInfo();
    System.out.printf(", $"+price);
  }
}