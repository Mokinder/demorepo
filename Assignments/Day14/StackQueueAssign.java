package Assignment1;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueueAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UC 1:
		LinkedList <Integer> stack1=new <Integer> LinkedList();
		stack1.push(70);
		stack1.push(30);
		stack1.push(56);
		System.out.println("Stack 1 elements : "+stack1);
		
		//UC 2:
		for(int i=stack1.size()-1;i>=0;i--)
		{
			System.out.println("Stack 1 peek element is "+stack1.peek());
			System.out.println("Stack 1 pop element is "+stack1.pop());		
		}
		System.out.println("Stack 1 elements : "+stack1);
		
		//UC 3 :
		Queue <Integer> queue1 =new <Integer> LinkedList();
		queue1.add(56);
		queue1.add(30);
		queue1.add(70);
		System.out.println("Queue 1 Elements are "+queue1);
		
		//UC 4 :
		for(int i=queue1.size()-1;i>=0;i--)
		{
			System.out.println("Queue 1 Dequeue element is "+queue1.poll());		
		}
		System.out.println("Queue 1 elements : "+queue1);
		

	}

}
