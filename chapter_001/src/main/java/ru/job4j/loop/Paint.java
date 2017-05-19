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
        int whitespace = h;
        StringBuilder s = new StringBuilder();
        for (int a = 1; a <= h; h--) {
            for (int b = 1; b <= count;) {
                if (whitespace != 1) {
                    s.append(" ");
                    whitespace--;
                } else {
                    s.append("^");
                    b++;
                }
            }
            if (a != h) {
                s.append("\r\n");
            }
            whitespace = h - 1;
            count += 2;
        }
        String z = s.toString();
        return z;
    }
}