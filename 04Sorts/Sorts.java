public class Sorts{

    public static String name(){
      return "09.Huang.Jonathan"; 
    }

    private static boolean sorted(int[] data) {
	boolean booleanSorted = true;
	for (int i = 1; i < data.length && booleanSorted; i += 1) {
	    booleanSorted = data[i] > data[i - 1];
	}
	return booleanSorted;
    }

    private static void swap(int[] data, int a, int b) {
	int A = data[a];
	int B = data[b];
	data[a] = B;
	data[b] = A;
    }
    
    public static void selectionSort(int[] data) {
	int min = data[0];
	int pos1 = 0;
	int pos2 = 0;
	while (! sorted(data) && pos1 < data.length) {
	    
	    //for (int i : data) System.out.print(i + " ");
	    //System.out.println(" ");

	    min = data[data.length - 1];
	    for (int i = pos1; i < data.length; i += 1) {
		if (data[i] <= min) {
		    min = data[i];
		    pos2 = i;
		}
	    }
	    swap(data, pos1, pos2);
	    pos1 += 1;
	}

	System.out.println(System.currentTimeMillis());
	
    }

    public static void insertionSort(int[] data) {
	int temp;
	for (int pos1 = 0; pos1 < data.length - 1 && ! sorted(data); pos1 += 1) {
	    
	    //for (int i : data) System.out.print(i + " ");
	    //System.out.println("");
	    
	    int pos2 = pos1 + 1;
	    temp = data[pos2];
	    while (pos2 > 0 && pos2 < data.length){
		if (temp < data[pos2 - 1]) swap(data, pos2, pos2 - 1);
		pos2 -= 1;
	    }
	}

	System.out.println(System.currentTimeMillis());

    }

    public static void bubbleSort(int[] data) {
	while (! sorted(data)) {
	    for (int i = 0; i < data.length - 1; i += 1) {
		int counter = 0;
		if (data[i] > data[i + 1]) {
		    swap(data, i, i + 1);
		    counter += 1;
		}
		if (counter == 0) break;
		
		for (int j : data) System.out.print(j + " ");
		System.out.println(sorted(data) + "");

	    }
	}

	System.currentTimeMillis();

    }


    public static void main(String[] args) {
	int[] a = {7,3,1,4,5,4};
	bubbleSort(a);
	for (int i : a) System.out.print(i + " ");
	System.out.println("");
	int[] b = {18989,654,6546,43,786,23};
	insertionSort(b);
	//for (int i : b) System.out.print(i + " ");
    }
    

}

