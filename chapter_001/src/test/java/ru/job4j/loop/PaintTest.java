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
public class PaintTest {

/**
*
*/
@Test
	public void whenPaintPiramideWithHeightTwoThenStringPiramide() {
		final String line = System.getProperty("line.separator");
		Paint piramide = new Paint();
		String result = piramide.piramid(2);
		String expected = String.format("^%s%s^^^", line, line);
		assertThat(result, is(expected));
	}
}