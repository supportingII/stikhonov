package ru.job4j.loop;
/**
* Класс для вычисления факториала.
*/
public class Factorial {
	/**
	* Метод принимает число и вычисляет факторил.
	* @param n переданное число.
	* @return summ посчитанное значение.
	*/
	public int calc(int n) {
		int summ = 1;
		for (int a = 1; a <= n; a++) {
			summ *= a;
		}
		return summ;
	}
}