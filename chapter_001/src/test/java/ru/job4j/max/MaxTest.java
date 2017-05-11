package ru.job4j.max;

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
public class MaxTest {

	/**
	* Тестирование класса Max - большее число.
	*/
	@Test
	public void whenOneThenTwo() {
	Max number = new Max();
	int result = number.max(2, 4);
	int expected = 4;
	assertThat(result, is(expected));
}

}