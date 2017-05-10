package ru.job4j;

/**
* Класс для арифмитических вычислений.
* @author Vyacheslav Tikhonov (mailto:slavikman@bk.ru)
* @since 03.05.2017
* @version 1.0
*/

public class Calculate {
/**
*Вывод текста.
* @param args - args
*/
private double result;

/**
* Метод сложения.
* @param first первое число.
* @param second второе число.
*/
public void add(double first, double second) {
	this.result = first + second;
}

/**
* Метод вычитания.
* @param first первое число.
* @param second второе число.
*/
public void deduct(double first, double second) {
	this.result = first - second;
}

/**
* Метод деления.
* @param first первое число.
* @param second второе число.
*/
public void devide(double first, double second) {
	this.result = first / second;
}

/**
* Метод умножения.
* @param first первое число.
* @param second второе число.
*/
public void multiply(double first, double second) {
	this.result = first * second;
}

/**
* Метод возвращает значение.
* @return число.
*/
public double getResult() {
	return this.result;
}



}