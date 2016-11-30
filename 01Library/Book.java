public class Book {

    String author;
    String title;
    String ISBN;

    public Book() {
	this.author = "";
	this.title = "";
	this.ISBN = "";
    }

    public Book(String author, String title, String ISBN) {
	this.author = author;
	this.title = title;
	this.ISBN = ISBN;
    }

    public String getAuthor() {
	return this.author;
    }

    public String getTitle() {
	return this.title;
    }

    public String getISBN() {
	return this.ISBN;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public void setISBN(String ISBN) {
	this.ISBN = ISBN;
    }

    public String toString() {
	return this.title + "\n" + this.author + "\n" + this.ISBN + "\n";
    }

}
