package Assignment1;

import java.util.HashMap;

public class HashTableAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// UC 1 :
		HashMap<String, Integer> hashtab = new <String, Integer>HashMap();
		String str = "To be or not to be";
		String s[] = str.split(" ");
		for (String st : s) {
			if (hashtab.containsKey(st)) {
				hashtab.put(st, 1 + hashtab.get(st));
			} else {
				hashtab.put(st, 1);
			}
			System.out.println(hashtab);
		}

		// UC 2 :
		HashMap<String, Integer> hashtab1 = new <String, Integer>HashMap();
		String str1 = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String s1[] = str1.split(" ");
		for (String st1 : s1) {
			if (hashtab1.containsKey(st1)) {
				hashtab1.put(st1, 1 + hashtab1.get(st1));
			} else {
				hashtab1.put(st1, 1);
			}
			System.out.println(hashtab1);
		}

		// UC 3 :
		hashtab1.remove("avoidable");
		System.out.println(hashtab1);

	}

}
