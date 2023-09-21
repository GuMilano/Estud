package github;
import java.util.Arrays;
/**
 *O java.util.Arrays usa quicksort para tipos primitivos como int e 
 * mergesort para objetos que implementam Comparable ou usam um Comparator.
 */
public class ArraySort {
     //i se inicia com valor inicial 0
    //Enquanto i for menor que que o comprimento da matriz, executa a saída com os nomes dos países até se encerrar a matriz
	public static void main(String[] args) {
		String[] countries = {"India","United States","Malaysia","Australia","Lundon"};
		Arrays.sort(countries);
		for(int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}
	}
}