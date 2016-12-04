public class SuperArray implements Iterable<String> {
    
    private String[] data;
    private int size;

    public SuperArray(String[] array) {
	data = array;
	size = array.length;
    }
    
    public SuperArray() {
	data = new String[10];
	size = 0;
    }

    public SuperArray(int initialCapacity) {
	if (initialCapacity < 0){
	    throw new IllegalArgumentException();
	}
	data = new String[initialCapacity];
    }
    
    public SuperArray(String[] newArray, int newSize) {
	data = newArray;
	size = newSize;
    }

    public int size() {
	return size;
    }

    public String[] data() {
	return data;
    }

    public void add(String element) {
	size += 1;
	if (size > data.length) this.grow();
	data[size - 1] = element;
    }

    public void add(int index, String element) {
	if (index < 0) {
	    throw new IndexOutOfBoundsException();
	}
	if (index >= size) {
	    this.add(element);
	}
	else {
	    grow();
	    for (int i = size; i > index; i -= 1) data[i] = data[i - 1];
	    data[index] = element;
	    size += 1;
	}
    }

    public String remove(int index) {
	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException();
	}
	String temp = data[index];
	for (int i = index; i < size - 1; i += 1) {
	    data[i] = data[i + 1];
	}
	size -= 1;
	return temp;
    }

    private void grow() {
	String[] newArray;
	newArray = new String[data.length + 1];
	for (int i = 0; i < data.length; i += 1) {
	    newArray[i] = data[i];
	}
	data = newArray;
    }

    public String toString() {
	String string = "[";
	for (int i = 0; i < size - 1; i += 1)
	    string += (" " + data[i] + ",");
        string += (" " + data[size() - 1] + "]");
	return string;
    }

    public String toStringDebug() {
        String string = "[";
	for (int i = 0; i < data.length - 1; i += 1) {
	    if (i <= size - 1)
		string += (" " + data[i] + ",");
	    else
		string += (" _,");
	}
	string += (size != data.length) ? " _]" : " " + data[size] + "]";
	return string;
    }

    public void clear() {
	size = 0;
    }

    public boolean isEmpty() {
	return size == 0;
    }

    public String get(int index) {
	if (index < 0 || index >= size)
	    throw new IndexOutOfBoundsException();
	else
	    return data[index];
    }
    
    public String set(int index, String element) {
	String temp = "";
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	else {
	    temp = data[index];
	    data[index] = element;
	}
	return temp;
    } 	    
    
    public String[] toArray() {
	String[] array;
	array = new String[size];
	for (int i = 0; i < size; i += 1) {
	    array[i] = data[i];
	}
	return array;
    }

    public int indexOf(String element) {
	int index = 0;
	while (index < size && !(data[index].equals(element))) {
	    index += 1;
	}
	return (index >= size) ? -1 : index;
    }

    public int lastIndexOf(String element) {
	int index = size - 1;
	while (index >= 0 && !(data[index].equals(element))) {
	    index -= 1;
	}
	return (index < 0) ? -1 : index;
    }

    public SuperArrayIterator iterator() {
	return new SuperArrayIterator(this);
    }

}
