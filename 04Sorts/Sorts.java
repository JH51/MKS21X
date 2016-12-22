public class Sorts {

    public static String name(){
      return "09.Huang.Jonathan"; 
    }

    private static boolean sorted(int[] data) {
	boolean booleanSorted = true;
	for (int i = 1; i < data.length && booleanSorted; i += 1) {
	    booleanSorted = data[i] >= data[i - 1];
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
	long start = System.currentTimeMillis();
	int min = data[0];
	int pos1 = 0;
	int pos2 = 0;
	while (! sorted(data) && pos1 < data.length) {
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

	System.out.println(System.currentTimeMillis() - start);
	
    }

    public static void insertionSort(int[] data) {
	long start = System.currentTimeMillis();
	int temp;
	for (int pos1 = 0; pos1 < data.length - 1 && ! sorted(data); pos1 += 1) {
	    int pos2 = pos1 + 1;
	    temp = data[pos2];
	    while (pos2 > 0 && pos2 < data.length){
		if (temp < data[pos2 - 1]) swap(data, pos2, pos2 - 1);
		pos2 -= 1;
	    }
	}

	System.out.println(System.currentTimeMillis() - start);

    }

    public static void bubbleSort(int[] data) {
	long start = System.currentTimeMillis();
	int counter = 1;
	while (! sorted(data)) {
	    for (int i = 0; i < data.length - 1; i += 1) {
		counter = 0;
		if (data[i] > data[i + 1]) {
		    swap(data, i, i + 1);
		    counter += 1;
		}
	    }	
	System.out.println(System.currentTimeMillis() - start);
	}
    }



}

