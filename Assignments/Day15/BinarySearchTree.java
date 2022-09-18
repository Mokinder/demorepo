package Assignment1;

import java.util.Scanner;
import java.util.TreeSet;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		// UC 1 :
		TreeSet<Integer> tree = new <Integer>TreeSet();
		tree.add(56);
		tree.add(30);
		tree.add(70);

		// UC 2 :
		tree.add(40);
		tree.add(22);
		tree.add(11);
		tree.add(3);
		tree.add(16);
		tree.add(60);
		tree.add(95);
		tree.add(65);
		tree.add(63);
		tree.add(67);
		System.out.println(tree);

		// UC 3 :
		int Search;
		System.out.println("Enter the element :");
		Search = s.nextInt();
		if (tree.contains(Search) == true) {
			System.out.println(Search + " Element is present ");
		} else {
			System.out.println(Search + " Element is not present");
		}
	}
}
