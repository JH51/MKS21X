abstract class LibraryBook extends Book implements Comparable<LibraryBook> {

    String callNumber;

    public LibraryBook(String author, String title, String ISBN, String callNumber) {
	super(author, title, ISBN);
	this.callNumber = callNumber;
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
	return this.callNumber;
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
	this.callNumber = callNumber;
    }

    abstract void checkout(String patron, String due);

    abstract void returned();

    abstract String circulationStatus();

    public int compareTo(LibraryBook other) {
	return this.getCallNumber().compareTo(other.getCallNumber());
    }

    public String toString() {
	return super.toString() + "\n" + this.callNumber + "\n";
    }
    
}
