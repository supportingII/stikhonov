package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Slava Tikhonov (mailto:slavikman@bk.ru)
* @version $Id$
* @since 0.1
*/

public class PointTest {
/**
*Тестирование класса.
*/
@Test
public void whenAddNumberABThenBooleanTrueFalse() {
Point point = new Point(2, 2);
boolean result = point.is(3, 3);
boolean expected = false;
assertThat(result, is(expected));
}
}