public class Barcode implements Comparable<Barcode> {

    private String _zip;
    private int _checkDigit;
    public String[] symbols;

    symbols = new String[10];
    symbols[0] = "||:::";
    symbols[1] = ":::||";
    symbols[2] = "::|:|";
    symbols[3] = "::||:";
    symbols[4] = ":|::|";
    symbols[5] = ":|:|:";
    symbols[6] = ":||::";
    symbols[7] = "|:::|";
    symbols[8] = "|::|:";
    symbols[9] = "|:|::";
    
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

    public static String toBarcode(String zip) {
	String barcode = "|";
	while (zip.length() > 0) {
	    barcode += symbols[Integer.parseInt(zip.substring(0,1))];
	    zip = zip.substring(1);
	}
	barcode += "|";
	return barcode;
    }
    
}
