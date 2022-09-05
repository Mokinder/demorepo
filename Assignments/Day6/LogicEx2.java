package Assignments;

public class LogicEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,3,2,4,3,2,5,4,6,7,5,7,9,4,7,2};
		int array1[]=new int [array.length];
		int count=1;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=1+i;j<array.length-1;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					array[j]=0;
				}				
			}
			if(array1[i]!=0) {
				array1[i]=count;
			}
			count=1;
		}
		for(int j=0;j<array.length-1;j++)
		{
			
			System.out.println(array[j]+" = "+array1[j]);
		}
	}

}
