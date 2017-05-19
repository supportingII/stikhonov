package ru.job4j.loop;
/**
* Класс рисующий шахматную доску из х.
*/
public class Board {
	/**
	* Метод в который передаются значения для построения шахматной доски по ширине, высоте.
	* @param width значение ширины
	* @param height значение высоты
	* @return s тип строка, возвращаем готовую доску
	*/
	public String paint(int width, int height) {
		StringBuilder s = new StringBuilder();
		for (int a = 1; a <= height; a++) {
			for (int b = 1; b <= width; b++) {
				if ((a + b) % 2 == 0) {
					s.append("x");
						} else {
						s.append(" ");
						}
				}
				s.append("\r\n");
				}
	String x = s.toString();
	return x;
	}
}
/**if (a % 2 != 0) {
if (b % 2 == 0) {
s.append(" ");
} else {
s.append("x");
}
} else {
if (b % 2 == 0) {
s.append("x");
} else {
s.append(" ");
}*/