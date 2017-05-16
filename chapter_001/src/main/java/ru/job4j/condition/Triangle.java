package ru.job4j.condition;
/**
* Класс для вычисления площади треугольника.
* @author Vyacheslav Tikhonov (mailto:slavikman@bk.ru)
* @since 03.05.2017
* @version 1.0
*/
public class Triangle {
/**
* Параметры класса.
*/
private Point a, b, c;
	/**
	* Метод присваивания значений переменным класса.
	* @param a число.
	* @param b число.
	* @param c число.
	*/
public Triangle(Point a, Point b, Point c) {
this.a = a;
this.b = b;
this.c = c;
}
/**
* Метод расчета площади.
* @return возвращает площадь треугольника.
*/
public double area() {
return (double) ((this.a.getX() - this.c.getX()) * (this.b.getY() - this.c.getY()) - (this.b.getX() - this.c.getX()) * (this.a.getY() - this.c.getY())) / 2;
}
}