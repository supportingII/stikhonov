package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
* Test.
*
* @author Slava Tikhonov (mailto:slavikman@bk.ru)
* @version $Id$
* @since 0.1
*/
public class TriangleTest {

/**
* Тестирование класса площадь треугольника.
*/
@Test
public void whenAplusBplusCThenS() {
Point a = new Point(2, -4);
Point b = new Point(1, 1);
Point c = new Point(-6, 5);

Triangle triangle = new Triangle(a, b, c);

double result = triangle.area();
double expected = 15.50D;
assertThat(result, is(expected));


}

}