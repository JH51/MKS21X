public class Barcode implements Comparable<Barcode> {

    private String _zip;
    private int _checkDigit;

    public Barcode(String zip) {
	try {
	    this._zip = zip;
	    this._checkDigit = 0;
	    for (int index = 0; index < this._zip.length(); index += 1) {
		this._checkDigit += Integer.parseInt(this._zip.charAt(index));
	    }
	    this._checkDigit %= 10;
	}
	catch (StringIndexOutOfBoundsException e) {
	    throw new RuntimeException("Zip is not the correct length");
	}
	catch (NumberFormatException e) {
	    throw new RuntimeException("Zip contains a non digit");
	}
    }

    public Barcode clone() {
	
    }
    
