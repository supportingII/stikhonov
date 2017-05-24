package ru.job4j.array;

/**
* Класс переворачивающий массив.
*/
public class Turn {
	/**
	* Метод для переворачивания массива.
	* @param array массив чисел.
	* @return array возвращаем перевернутый массив.
	*/
	public int[] back(int[] array) {
		int a, b;
		int maxNum = array.length;
		for (int index = 0; index <= maxNum; index++) {
			if ((index == maxNum - index) || (index > maxNum - index)) {
					break;
			} else {
				a = array[index];
				b = array[maxNum - index];

				array[index] = b;
				array[maxNum - index] = a;
			}
		}
		return array;
	}
}