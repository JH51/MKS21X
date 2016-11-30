public class CirculatingBook extends LibraryBook {

    String currentHolder;
    String dueDate;

    public CirculatingBook() {
	super();
	this.currentHolder = "";
	this.dueDate = "";
    }

    public CirculatingBook(String author, String title, String ISBN, String callNumber) {
	super();
	this.currentHolder = "";
	this.dueDate = "";
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

    public String getCurrentHolder() {
	return this.currentHolder;
    }

    public String getDueDate() {
	return this.dueDate;
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

    public void setCurrentHolder(String currentHolder) {
	this.currentHolder = currentHolder;
    }

    public void setDueDate(String dueDate) {
	this.dueDate = dueDate;
    }

    public void checkout(String patron, String due) {
	this.setCurrentHolder(patron);
	this.setDueDate(due);
    }

    public void returned() {
        this.setCurrentHolder("");
	this.setDueDate("");
    }

    public String circulationStatus() {
	return (this.currentHolder.equals("") && this.dueDate.equals("")) ? this.currentHolder + "\n" + this.dueDate + "\n" : "book available on shelves";
    }

    public String toString() {
	return super.toString() + "\n" + this.circulationStatus() + "\n";
    }

}
