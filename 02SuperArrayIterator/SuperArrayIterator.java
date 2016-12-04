import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String> {

    String element;
    SuperArray supAry;

    public SuperArrayIterator(SuperArray supAry) {
	element = "";
	this.supAry = supAry;
    }

    public boolean hasNext() {
	return this.supAry.size() > this.supAry.indexOf(this.element) + 1;
    }

    public String next() {
	if (this.hasNext()) {
	    this.element = this.supAry.get(this.supAry.indexOf(this.element) + 1);
	    return element;
	}
	else return "";//throw new NoSuchElementException();
    }

    public void remove() {
	throw new UnsupportedOperationException();
    }

}
