package estruturas_de_controle;

public class Repeticoes {
	public static void main(String[] args) {
		
		int contador = 0;
		while (contador < 10) { //usado para repeti��es indefinidas.
			System.out.println("9 itera��es");
			contador++; //=+ 1
		}
		
		//usado para repeti��es com tamanho definido.
		for (int i = 0; i < contador; i++) {
			System.out.println("9 itera��es tamb�m");
		}
		
		do { //usado para repeti��es indefinidas.
			System.out.println("9 itera��es de novo");
			contador++;
		} while (contador < 10);
	}
}

