package ru.job4j.array;

import java.util.Arrays;
/**
* Класс обрезает массив от дублей.
*/

public class ArrayDuplicate {
	/**
	* Метод обрезает от дублей.
	* @param array принимаемый одномерный массив.
	* @return array возвращает готовый массив.
	*/
	public String[] remove(String[] array) {
		int maxIndex = array.length - 1;
		for (int a = 0; a < array.length; a++) {
			String temp = array[a];
			for (int b = a + 1; b <= maxIndex; b++) {
				if (temp.equals(array[b])) {
						String remember = array[maxIndex];
						array[maxIndex] = array[b];
						array[b] = remember;
						maxIndex--;
				}
			}
		}
	return Arrays.copyOf(array, maxIndex + 1);
	}
}