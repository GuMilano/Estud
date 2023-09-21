package github;
/**
 * Algoritmo de ordenação por Bubble Sort que funciona trocando repetidamente 
 * os elementos se eles estiverem na ordem errada.
 **/



public class BubbleSort {
        /**
        1.método main() é responsável por criar um objeto da classe BubbleSort 
        e chamar o método bubbleSort() para ordenar a lista arr
        2.Cria um objeto da classe BubbleSort.
        3.Declara uma lista de inteiros.
        4.Chama o método bubbleSort() para ordenar a lista arr.
        5.Imprime a mensagem "Sorted Array" para o console.
        6.Chama o método printArray() para imprimir a lista ordenada para o console.
        **/    
        public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		obj.bubbleSort(arr);
                obj.printArray(arr);
		System.out.println("Matriz ordenada");

	}
        
        
        
        /**O método bubbleSort() funciona da seguinte forma:

        1.Declara a variável n, que armazena o tamanho da lista.
        2.Declara a variável tmp, que é usada para armazenar um valor temporário
        * durante as trocas de elementos.
        3.Percorre todos os elementos da lista, exceto o último elemento.
        4.Para cada elemento, ele compara o elemento atual com o elemento 
        * anterior. Se o elemento atual for maior que o elemento anterior, 
        * os dois elementos são trocados.
        5.O método repete esse processo até que todos os elementos estejam na 
        * ordem correta.

        **/
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		int tmp = 0;
		for (int i = 0; i < n ; i++) {
			for (int j = 1; j < n-1; j++) {
				if (arr[j-1] > arr[j]) {
					tmp = arr[j - 1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

        
        
        /*
        1.Declara o método printArray(), que imprime uma lista de inteiros para o console.
        2.Este laço for percorre todos os elementos da lista.
        3.Imprime o elemento atual da lista para o console, seguido de um espaço.
        4.Imprime uma nova linha para o console.
        */
	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}


}