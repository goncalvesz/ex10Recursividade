package controller;
/*
 * O máximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou
mais números inteiros. Para calcular o máximo divisor comum (MDC) entre números, devemos realizar a
fatoração por meio da decomposição em fatores primos dos números indicados.

O máximo divisor comum (MDC) de dois números inteiros x e y pode ser calculado usando-se uma
definição recursiva:
• MDC(x, y) = MDC(x − y, y), se x > y
• MDC(x,y) = MDC(y,x)
• MDC(x,x) = x
Fazer uma função recursiva que receba 2 números inteiros posi�vos e apresente o MDC desses números.
 */
public class RecursividadeController {

	public RecursividadeController(){
		
	}
	
	public int maximoMultiploComum(int x, int y) {
		
		if (x<y) {
			return maximoMultiploComum(y,x);
		}
		if (x>y) {
			return maximoMultiploComum(x-y,y);
		}
		else {
			return x;
		}
	}
}
