package ru.job4j.max;
/**
* Класс для вычисления большего числа.
* @author Vyacheslav Tikhonov (mailto:slavikman@bk.ru)
* @since 11.05.2017
* @version 1.0
*/
public class Max {
/**
* Метод вычисления большего из двух чисел.
* @param first первое число.
* @param second второе число.
* @return number наибольшее число.
*/
public int max(int first, int second) {
	//int number = first > second ? first : second;
	//return number;
	return first > second ? first : second;
}

/**
* Метод для вычисления максимального из трех чисел.
* @param first первое число.
* @param second первое число.
* @param third первое число.
* @return возвращает максимальное число.
*/
public int max(int first, int second, int third) {
	int number = max(first, second);
	return max(number, third);
}

}