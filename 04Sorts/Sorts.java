public class Sorts {

    public static String name(){
      return "09.Huang.Jonathan"; 
    }

    private static boolean sorted(int [] data) {
	boolean sorted = true;
	for (int i = 1; i < data.length && sorted; i += 1) {
	    sorted = data[i] >= data[i - 1];
	}
	return sorted;
    }	    

    private static void swap(int[] data, int a, int b) {
	int A = data[a];
	int B = data[b];
	data[a] = B;
	data[b] = A;
    }
    
    public static void selectionSort(int[] data) {	
	int index = 0;
	int place = 0;
	int minimum = data[index];
	while (! sorted(data)) {	    
	    for (int j = 0; j < data.length; j += 1) {
		if (data[j] < minimum) {
		    minimum = data[j];
		    index = j;
		}
	    }
	    swap(data, index, place);
	    place += 1;
	}
    }
    
    public static void main(String[] args) {
	int[] data = new int[5];
	data[0] = 64;
	data[1] = 25;
	data[2] = 12;
	data[3] = 22;
	data[4] = 11;
	selectionSort(data);
	for (int e : data) {
	    System.out.println(e);
	}
    }

}
