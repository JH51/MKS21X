public class Driver extends Sorts {
    
    public static void main(String[] args) {
	int[] a = {7,3,1,4,5,4};
	bubbleSort(a);
	for (int i : a) System.out.print(i + " ");
	System.out.println("");
	int[] b = {18989,654,6546,43,786,23};
	insertionSort(b);
	for (int i : b) System.out.print(i + " ");
	System.out.println("");
	int[] c = {3};
	bubbleSort(c);
	for (int i : c) System.out.print(i + " ");
    }

}
