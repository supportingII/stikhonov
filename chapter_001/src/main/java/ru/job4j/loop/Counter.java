package ru.job4j.loop;
/**
* Класс для подсчета суммы четных чисел.
* @author Vyacheslav Tikhonov (mailto:slavikman@bk.ru)
* @since 17.05.2017
* @version 1.0
*/
public class Counter {
	/**
	* ћетод подсчитывает сумму четных чисел от по.
	* @param start число начала цикла.
	* @param finish число конца цикла.
	* @return summa сумма четных чисел.
	*/
public int add(int start, int finish) {
		int summa = 0;
		for ( ; start <= finish; start++) {
			if (start % 2 == 0) {
				summa = summa + start;
			}
	}
	return summa;
}
}