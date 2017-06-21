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
public class ArrayDuplicateTest {
    /**
	*
	*/
	@Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		String[] a = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        ArrayDuplicate array = new ArrayDuplicate();
		String[] result = array.remove(a);
		String[] expected = {"Привет", "Мир", "Супер"};
		assertThat(result, is(expected));
    }
}