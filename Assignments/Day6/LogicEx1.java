package Assignments;

public class LogicEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {1,2,3,4,5,6,7};
		LogicEx1 l=new LogicEx1();
		l.arraycopy(array1);
		

	}

    void arraycopy(int array1[]) {
		// TODO Auto-generated method stub
    	int array2[]=new int[array1.length];
        for(int i=0;i<array1.length-1;i++)
        {
        	array2[i]=array1[i];
        }
        System.out.println("Elements in array1 :");
        for(int i=0;i<array1.length-1;i++)
        {
        	System.out.print(array1[i]+",");
        }
        System.out.println("\n Elements in array2 :");
        for(int i=0;i<array2.length-1;i++)
        {
        	System.out.print(array2[i]+",");
        }
	}

}
