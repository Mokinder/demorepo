package Assignment1;

public class MergeSort {
	    public static void main(String[] args) {
	        String[] String1 = { "Kring", "Panda", "Soliel", "Darryl", "Chan" };
	        String[] String2 = { "Minnie", "Kitty", "Madonna", "Miley"};
	        String[] names = new String[String1.length + String2.length];

	        mergeSort(String1);
	        mergeSort(String2);
	        merge(names, String1, String2);
	        mergeSort(names);
	        for (String str : names) {
	            System.out.println(str);
	        }
	    }

	    public static void mergeSort(String[] names) {
	        if (names.length > 2) {
	            String[] left = new String[names.length / 2];
	            String[] right = new String[names.length - names.length / 2];

	            for (int i = 0; i < left.length; i++) {
	                left[i] = names[i];
	            }

	            for (int i = 0; i < right.length; i++) {
	                right[i] = names[i + names.length / 2];
	            }

	            mergeSort(left);
	            mergeSort(right);
	            merge(names, left, right);
	        }
	    }

	    public static void merge(String[] names, String[] left, String[] right) {
	        int n = 0;
	        int m = 0;
	        for (int i = 0; i < names.length; i++) {
	            if (m >= right.length || (n < left.length && left[n].compareToIgnoreCase(right[m]) < 0)) {
	                names[i] = left[m];
	                n++;
	            } else {
	                names[i] = right[m];
	                m++;
	            }
	        }
	    }
}
