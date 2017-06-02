package ru.job4j.array;

/**
* Класс который переворачивает грани двумерного массива 2х2,3х3,4х4 и т.д.
*/
public class RotateArray {
	/**
	* Метод переворачивает массива.
	* @param array принимаемый двумерный массив.
	* @return array возвращаем перевернутый массив.
	*/
	public int[][] rotate(int[][] array) {
		int temp;
		int z = 0, x = array.length - 1, y = 0, u = array.length - 1 ;
			for (int b = 1; b <= array.length - 1; b++) {
				temp = array[z][y];
				array[z][y] = array[u][z];
				array[u][z] = array[x][u];
				array[x][u] = array[y][x];
				array[y][x] = temp;
				y++;
				u--;
			}
		return array;
	}
}


/**
	public int[][] rotate(int[][] array) {
		int rememberOne = 0, rememberTwo = 0, z;
        boolean first;
		// Цикл определяющий кол-во проходов по всему массиву.
		// Проход делаем по часовой стрелке.
        for (int a = 1; a <= array.length - 1; a++) {
            first  = true;
            z = 0;
			// Цикл отвечающий за верхнюю грань и первый проход
            for (int b = 0; b <= array.length - 2; b++) {
                rememberOne = rememberTwo;
                rememberTwo = array[z][b + 1];
                if (first) {
                    array[z][b + 1] = array[z][b];
                    first  = false;
                } else {
                    array[z][b + 1] = rememberOne;
                }
            }
			// Цикл отвечающий за правую грань
            z = array.length - 1;
            for (int b = 1; b <= array.length - 1; b++) {
                rememberOne = rememberTwo;
                rememberTwo = array[b][z];
                array[b][z] = rememberOne;
            }
			// Цикл отвечающий за нижнюю грань
            z = array.length - 1;
            for (int b = array.length - 2; b >= 0; b--) {
                rememberOne = rememberTwo;
                rememberTwo = array[z][b];
                array[z][b] = rememberOne;
            }
			// Цикл отвечающий за левую грань
            z = 0;
            for (int b = array.length - 2; b >= 0; b--) {
                rememberOne = rememberTwo;
                rememberTwo = array[b][z];
                array[b][z] = rememberOne;
            }
        }
        return array;
	}
	*/