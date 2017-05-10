package ru.job4j;

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

public class CalculateTest {

	/**
	* Тестирование класса сложение.
	*/
	@Test
    public void whenAddOnePlusOneThenTwo() {
        Calculate calc = new Calculate();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

	/**
	* Тестирование класса вычитание.
	*/
	@Test
    public void whenAddOneMinusOneThenTwo() {
        Calculate calc = new Calculate();
        calc.deduct(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

		/**
	* Тестирование класса деление.
	*/
	@Test
    public void whenAddOneDivideOneThenTwo() {
        Calculate calc = new Calculate();
        calc.devide(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

		/**
	* Тестирование класса умножение.
	*/
	@Test
    public void whenAddOneMultiplyOneThenTwo() {
        Calculate calc = new Calculate();
        calc.multiply(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}