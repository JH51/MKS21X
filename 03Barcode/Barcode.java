import java.util.*;

public class Barcode implements Comparable<Barcode> {

    private String _zip;
    private int _checkDigit;

    public Barcode(String zip) {
        this._zip = zip;
	this._checkDigit = this.checkSum();
    }

    public String toString() {
	return this._zip + this._checkDigit + " " + toCode(this._zip);
    }

    public int compareTo(Barcode other) {
	return Integer.parseInt(this._zip) - Integer.parseInt(other._zip);
    }

    private int checkSum() {
	int checkSum = 0;
	for (int index = 0; index < this._zip.length(); index += 1) {
	    checkSum += Integer.parseInt(this._zip.charAt(index) + "");
	}
	checkSum %= 10;
	return checkSum;
    }

    public static String toCode(String zip) {
	
	ArrayList<String> symbols = new ArrayList<String>();
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

	String e = "";
	
	boolean correctValues = true;
	for (int i = 0; i < zip.length() && correctValues; i += 1) {
	    correctValues = ((zip.charAt(i) >= '0') && (zip.charAt(i) <= '9'));
	}
	boolean correctLength = (zip.length() == 5);

        if (! correctValues) e = "zip contains a non-digit";
	if (! correctLength) e = "zip is not the correct length";

	if (!e.equals("")) throw (new IllegalArgumentException(e));
	else {
	    int dig = 0;
	    for (int index = 0; index < zip.length() - 1; index += 1) dig += Integer.parseInt(zip.charAt(index) + "");
	    dig %= 10;
	    String barcode = "|";
	    while (zip.length() > 0) {
		barcode += symbols.get(Integer.parseInt(zip.substring(0,1)));
		zip = zip.substring(1);
	    }
	    barcode += symbols.get(dig) + "|";
	    return barcode;
	}
    }

    public static String toZip(Barcode barcode) {
	
	ArrayList<String> symbols = new ArrayList<String>();
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

	String e = "";
	
	boolean correctChkSum = barcode.toString().substring(5,6).equals(barcode.checkSum() + "");
	boolean correctValues = true;
	for (int i = 7; i < barcode.toString().length() && correctValues; i += 1) {
	    correctValues = ((barcode.toString().charAt(i) == '|') || (barcode.toString().charAt(i) == ':'));
	}
	boolean correctLength = barcode.toString().substring(7).length() == 32;
	boolean correctGuards = barcode.toString().charAt(7) == '|' && barcode.toString().charAt(barcode.toString().length() - 1) == '|';

	if (! correctChkSum) e = "checksum is invalid";
	if (! correctValues) e = "non-barcode characters";
	if (! correctLength) e = "length of the barcode is not 32";
	if (! correctGuards) e = "the left and rightmost characters are not '|'";

	if (! e.equals("")) throw new IllegalArgumentException(e);
	else {
	    String zip = "";
	    String code = barcode.toString().substring(8, barcode.toString().length() - 2);
	    while (code.length() >= 5) {
		zip += symbols.indexOf(code.substring(0,5));
		code = code.substring(5);
	    }
	    return zip;
	}
    }

    public Barcode clone() {
	Barcode cloned = new Barcode(this._zip);
	return cloned;
    }
    
}
