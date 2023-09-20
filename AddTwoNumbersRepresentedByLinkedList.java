package github;

// Importa classes de coleções do Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
                // Converte um ArrayList para uma Array e imprime
		System.out.println("Converte ArrayList para Array: ");
		String[] item = list.toArray(new String[list.size()]);
		for (String s : item) {
			System.out.println(s);
		}
                // Converte um array para uma ArrayList e imprime
		System.out.println("Coverte Array para ArrayList: ");
		List<String> list2 = new ArrayList<>();
		list2 = Arrays.asList(item);
		System.out.println(list2);
	}
}
