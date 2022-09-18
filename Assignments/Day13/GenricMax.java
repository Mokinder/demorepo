package Assignment1;

class Maximum<T>
{
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; 
	    if (y.compareTo(max) > 0)
	      max = y; 

	    if (z.compareTo(max) > 0)
	      max = z; 

	    return max;
	  } 
	
}
public class GenricMax<T> {  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum m=new Maximum();
		// UC 1
		System.out.println("Maximum value is "+m.maximum(4,3,2));
		System.out.println("Maximum value is "+m.maximum(3,5,2));
		System.out.println("Maximum value is "+m.maximum(2,3,6));
		//UC 2
		System.out.println("Maximum value is "+m.maximum(7.6f,4.5f,2.5f));
		System.out.println("Maximum value is "+m.maximum(7.6f,9.5f,2.5f));
		System.out.println("Maximum value is "+m.maximum(7.6f,4.5f,11.5f));
		// UC 3
		System.out.println("Maximum value is "+m.maximum("CCC","BBB","AAA"));
		System.out.println("Maximum value is "+m.maximum("AAA","JJJ","CCH"));
		System.out.println("Maximum value is "+m.maximum("AAA","Bmd","PPP"));

	}

}
