package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
* @author Slava Tikhonov (mailto:slavikman@bk.ru)
* @version $Id$
* @since 0.1
*/
public class FactorialTest {
	/**
	* Метод тестирует вычисление факториала класса - Factorial.
	*/
	@Test
	public void whenFactorialNumberThenSumm() {
		Factorial summ = new Factorial();
		int result = summ.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
	}
}