package Assignment1;

import java.util.LinkedList;

public class LinkedlistAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UC 2
		LinkedList<Integer> linklist1 = new <Integer>LinkedList();
		linklist1.add(70);
		linklist1.add(30);
		linklist1.add(56);
		System.out.println("Linkedlist 1 : " + linklist1);
		
		// UC 3
		LinkedList<Integer> linklist2 = new <Integer>LinkedList();
		linklist2.add(56);
		linklist2.add(30);
		linklist2.add(70);
		System.out.println("Linkedlist 2 : " + linklist2);
		
		// UC 4
		LinkedList<Integer> linklist3 = new <Integer>LinkedList();
		linklist3.add(56);
		linklist3.add(70);
		linklist3.add(1, 30);
		System.out.println("Linkedlist 3 : " + linklist3);
		
		// UC 5
		linklist3.pop();
		System.out.println("Linkedlist 3 : " + linklist3);
		
		// UC 6
		linklist2.removeLast();
		System.out.println("LinkedList 2 : " + linklist2);
		linklist2.add(56);
		
		// UC 7
		int search = 30;
		for (int i = 0; i < linklist1.size(); i++) {
			if (linklist1.get(i) == 30) {
				System.out.println("30 is present in " + (i + 1) + " position in linklist 1");
			}
		}
		
		// UC 8
		linklist2.add(2, 40);
		System.out.println("Linklist 2 elements after 40 insertion is " + linklist2);
		
		// UC 9
		linklist2.remove(2);
		System.out.println("Linklist 2 elements after removal of 40 is " + linklist2);
		System.out.println("linkedlist 2 size is " + linklist2.size());
		linklist2.add(2, 40);
		
		//UC 10
		LinkedList<Integer> linklist4 = new <Integer>LinkedList();
		int temp=0;
		linklist4.add(56);
		linklist4.add(30);
		linklist4=swap(linklist4);
		linklist4.add(40);
		linklist4=swap(linklist4);
		linklist4.add(70);
		linklist4=swap(linklist4);
		System.out.println("Ordered linklist4 in ascending order : "+linklist4);
	}

    static LinkedList<Integer> swap(LinkedList<Integer> linklist4) {
		// TODO Auto-generated method stub
    	int temp=0;
    	for(int i=0;i<linklist4.size();i++)
		{
			for(int j=i;j<linklist4.size();j++)
			{
				if(linklist4.get(i)>linklist4.get(j))
				{
					temp=linklist4.get(i);
					linklist4.set(i, linklist4.get(j));
					linklist4.set(j,temp);
				}
			}
		}
		return linklist4;
	}
}
