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
		int temp; //Параметр для хранения первого значения
		for (int z = 0; z < array.length / 2; z++) {
			int	u = array.length - 1 - z; //Изменяемый(в цикле)
			int x = array.length - 1 - z; //Статичный (в цикле)
			int m = 0 + z; //Статичный (в цикле)
			int a = 0 + z; //Изменяемый(в цикле)
			for (; a <= array.length - 2 - z; a++) {
				temp = array[m][a];
				array[m][a] = array[u][m];
				array[u][m] = array[x][u];
				array[x][u] = array[a][x];
				array[a][x] = temp;
				u--;
			}
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

	public class RotateArray {
	public int[][] rotate(int[][] array) {
		int temp; //Параметр для хранения первого значения
		int x = array.length - 1; //Статичные параметры
		int	u = array.length - 1; //Изменяемые параметры
			for (int a = 0; a <= array.length - 2; a++) {
				temp = array[0][a];
				array[0][a] = array[u][0];
				array[u][0] = array[x][u];
				array[x][u] = array[a][x];
				array[a][x] = temp;
				u--;
			}
		return array;
	}
}

	*/