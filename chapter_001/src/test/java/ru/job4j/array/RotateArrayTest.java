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
public class RotateArrayTest {
	/**
	*
	*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        int[][] a = {{1, 2}, {3, 4}};
		RotateArray array = new RotateArray();
		int[][] result = array.rotate(a);
		int[][] expected = {{3, 1}, {4, 2}};
		assertThat(result, is(expected));
    }
	/**
	*
	*/
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		RotateArray array = new RotateArray();
		int[][] result = array.rotate(a);
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(result, is(expected));
    }
}