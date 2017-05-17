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
public class CounterTest {

	/**
	* Тестирование класса Counter, метод - add.
	*/
	@Test
	public void whenCycleOneByTenThenSummaEven() {
		Counter cycle = new Counter();
		int result = cycle.add(1, 10);
		int expected = 30;
		assertThat(result, is(expected));
	}
}