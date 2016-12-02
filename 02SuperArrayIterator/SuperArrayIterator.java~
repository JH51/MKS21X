import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String> {

    String element;
    SuperArray supAry;

    public superArrayIterator(SuperArray supAry) {
	element = "";
	this.supAry = supAry;
    }

    public boolean hasNext() {
	return this.supAry.size() > this.supAry.indexOf(this.element) + 1;
    }

    public String next() {
	return this.hasNext() ? this.supAry.get(this.supAry.indexOf(element) + 1) : "";
    }

}
