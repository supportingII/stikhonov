package ru.job4j.array;

/**
* Класс который переворачивает грани двумерного массива 2х2,3х3,4х4 и т.д.
*/

public class RotateArray {
	/**
	* Метод переворачивает массив.
	* @param array принимаемый двумерный массив.
	* @return array возвращаем перевернутый массив.
	*/
	public int[][] rotate(int[][] array) {		
		for (int z = 0; z < array.length / 2; z++) {
			int	u = array.length - 1 - z; //Изменяемый(в цикле)
			int x = array.length - 1 - z; //Статичный (в цикле)
			int m = 0 + z; //Статичный (в цикле)
			int a = 0 + z; //Изменяемый(в цикле)
			for (; a <= array.length - 2 - z; a++) {
				int temp = array[m][a];
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
