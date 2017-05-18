package ru.job4j.loop;

/**
* Класс для построения пирамиды.
*/

public class Paint {
	/**
	* Метод который выстраивает пирамидку по параметру высоты.
	* @param h число,обозначает высоту пирамиды.
	* @return z возвращает строку,с пирамидкой.
	*/
	public String piramid(int h) {
		int count = 1;
		StringBuilder s = new StringBuilder();
		for (int a = 1; a <= h; a++) {
			for (int b = 1; b <= count; b++) {
				s.append("^");
			}
			if (a != h) {
				s.append("\r\n\r\n");
			}
			count += 2;
		}
		String z = s.toString();
		return z;
	}
}