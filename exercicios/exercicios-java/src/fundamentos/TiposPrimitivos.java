package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos númericos
		
		byte var1 = 127;
		short var2 = 32767;
		int var3 = 1713802250;
		long var4 = 3105384915L; //Quando passa dos 200000000 é preciso inserir o L;
		
		float var5 = 1.0000000000088065061297f; //n+
		double var6 = 9234343325335468786756800000000000.0000000000176130122594; //n+
		boolean var7 = true; //false;
		char var8 = 'A'; // Ou exemplo: '\u0001';
		
		var6 = var5;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
