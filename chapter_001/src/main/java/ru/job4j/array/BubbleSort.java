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
		int a, x;
		for (boolean b = true; b;) {
			x = 0;
			for (int index = 1; index <= array.length - 1; index++) {
				if (array[index - 1] > array[index]) {
					a = array[index - 1];
					array[index - 1] = array[index];
					array[index] = a;
					x++;
				}
				if (x == 0) {
					b = false;
				}
			}
		}
		return array;
	}
}