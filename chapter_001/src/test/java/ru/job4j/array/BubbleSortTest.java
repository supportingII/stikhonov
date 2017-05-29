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
public class BubbleSortTest {

	/**
	*
	*/
	@Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		int[] a = {5, 1, 2, 7, 3};
		BubbleSort array = new BubbleSort();
		int[] result = array.sort(a);
		int[] expected = {1, 2, 3, 5, 7};
		assertThat(result, is(expected));
	}

	/**
	*
	*/
	@Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
		int[] a = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		BubbleSort array = new BubbleSort();
		int[] result = array.sort(a);
		int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(result, is(expected));
	}
}