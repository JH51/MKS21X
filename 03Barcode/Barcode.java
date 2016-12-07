public class Barcode implements Comparable<Barcode> {

    private String _zip;
    private int _checkDigit;

    public Barcode(String zip) {
	try {
	    this._zip = zip;
	    this._checkDigit = this._zip.checkSum();
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

    private int checkSum() {
	int checkSum = 0;
	for (int index = 0; index < this._zip.length(); index += 1) {
	    checkSum += Integer.parseInt(this._zip.charAt(index));
	}
	checkSum %= 10;
	return checkSum;
    }
