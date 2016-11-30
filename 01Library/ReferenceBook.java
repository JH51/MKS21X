public class ReferenceBook extends LibraryBook {

    String collection;

/*
    public ReferenceBook() {
	super();
	this.collection = "";
    }
*/

    public ReferenceBook(String author, String title, String ISBN, String callNumber, String collection) {
	super(author, title, ISBN, callNumber);
	this.collection = collection;
    }

     public String getAuthor() {
        return super.getAuthor();
    }

    public String getTitle() {
	return super.getTitle();
    }

    public String getISBN() {
	return super.getISBN();
    }

    public String getCallNumber() {
	return super.getCallNumber();
    }

    public String getCollection() {
	return this.collection;
    }

    public void setAuthor(String author) {
        this.setAuthor(author);
    }

    public void setTitle(String title) {
	super.setTitle(title);
    }

    public void setISBN(String ISBN) {
        super.setISBN(ISBN);
    }

    public void setCallNumber(String callNumber) {
	super.setCallNumber(callNumber);
    }

    public void setCollection(String collection) {
	this.collection = collection;
    }

    public void checkout(String patron, String due) {
	//throw new CheckoutNotAllowedException();
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    public void returned() {
	//throw new ReturnedNotAllowedException();
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    public String circulationStatus() {
	return "non-circulating reference book";
    }

    public String toString() {
	return super.toString() + this.collection + "\n";
    }

}
