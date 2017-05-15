package ru.job4j.condition;

/**
* Класс для вычисления точки в функции.
* @author Vyacheslav Tikhonov (mailto:slavikman@bk.ru)
* @since 03.05.2017
* @version 1.0
*/
public class Point {
/**
*Переменные класса.
*/
  private int x, y;

/**
* Метод присваивания переменных класса.
* @param x первое число.
* @param y второе число.
*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

/**
* Метод возвращает значение параметра класса x.
* @return x число.
*/
	public int getX() {
		return this.x;
	}
/**
* Метод возвращает значение параметра класса y.
* @return y число.
*/
	public int getY() {
		return this.y;
	}
/**
* Метод возвращает значение параметра класса y.
* @param a число.
* @param b число.
* @return булево.
*/
	public boolean is(int a, int b) {
		return this.y == a * this.x + b ? true : false;
}
}