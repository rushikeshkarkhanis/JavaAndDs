import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArraySortStringProgram {

	private static Scanner sc;

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Rushi", "Somya", "Mayur", "Nandini", "Prasad", "Mandar", "Somya", "Diptesh",
				"Nandini", "Rushi", "Isan", "Akash", "Saurabh", "Shivi", "Mummy", "Pappa", "Akash");

		System.out.println(list);

		Set<String> uniqueList = new TreeSet<String>(list);

		System.out.println(uniqueList);

		// Collections.sort(list);

		String s;
		sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s = sc.nextLine();
		System.out.println("You entered String " + s);

		for (String string : uniqueList) {
			if (s.equalsIgnoreCase(string)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

	}

}
