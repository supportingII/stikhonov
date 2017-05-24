package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* @author Slava Tikhonov (mailto:slavikman@bk.ru)
* @version $Id$
* @since 0.1
*/
public class TurnTest {

	/**
	*
	*/
	@Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		int[] a = {1, 2, 3, 4, 5};
		Turn array = new Turn();
		int[] result = array.back(a);
		int[] expected = {5, 4, 3, 2, 1};
		assertThat(result, is(expected));
	}
}