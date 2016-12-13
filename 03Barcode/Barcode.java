import java.util.*;

public class Barcode implements Comparable<Barcode> {

    private String _zip;
    private int _checkDigit;
    public List<String> symbols = new ArrayList<String>();

    symbols.add("||:::");
    symbols.add(":::||");
    symbols.add("::|:|");
    symbols.add("::||:");
    symbols.add(":|::|");
    symbols.add(":|:|:");
    symbols.add(":||::");
    symbols.add("|:::|");
    symbols.add("|::|:");
    symbols.add("|:|::");
    
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

    public String toString() {
	System.out.println(this._zip + this._checkDigit() + toCode(this.zip));
    }

    public int compareTo(Barcode other) {
	return Integer.parseInt(this._zip) - Integer.parseInt(other._zip);
    }

    private static int checkSum() {
	int checkSum = 0;
	for (int index = 0; index < this._zip.length(); index += 1) {
	    checkSum += Integer.parseInt(this._zip.charAt(index));
	}
	checkSum %= 10;
	return checkSum;
    }

    public static String toCode(String zip) {
	String barcode = "|";
	while (zip.length() > 0) {
	    barcode += symbols.get(Integer.parseInt(barcode.substring(0,1)));
	    zip = zip.substring(1);
	}
	barcode += "|";
	return barcode;
    }

    public static String toZip(String barcode) {
	String zip = "";
	barcode = barcode.substring(1, barcode.length() - 1);
	while (barcode.length() > 0) {
	    zip += symbols.indexOf(barcode.substring(0,5));
	    barcode = barcode.substring(0,5);
	}
	return zip;
    }
    
}
