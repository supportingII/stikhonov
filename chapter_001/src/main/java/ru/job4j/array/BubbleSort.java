package ru.job4j.array;

/**
* Класс сортировка пузырьковым методом.
*/
public class BubbleSort {
	/**
	* Метод для переворачивания массива.
	* @param array массив чисел.
	* @return array возвращаем перевернутый массив.
	*/
	public int[] sort(int[] array) {
		int a, x = 0;
		boolean notReady = true;
		while (notReady) {
			notReady = false;
			for (int index = 0; index <= array.length - x - 2; index++) {
				if (array[index] > array[index + 1]) {
					a = array[index];
					array[index] = array[index + 1];
					array[index + 1] = a;
					notReady = true;
				}
			}
			x++;
		}
		return array;
	}
}