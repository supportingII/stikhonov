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
	public static int[] back(int[] array) {
            int a, b;
            int maxIndex = array.length - 1;
            for (int index = 0; index <= maxIndex; index++) {
                if ((index == maxIndex - index) || (index > maxIndex - index)) {
                    break;
                } else {
                    a = array[index];
                    b = array[maxIndex - index];

                    array[index] = b;
                    array[maxIndex - index] = a;
                }
            }
    return array;
    }
}