import javax.swing.JOptionPane;

public class ArrayTecladoAPP {

	public static void main(String[] args) {
		
		//INDICAR TAMAÑO DEL ARRAY
		String numTexto = JOptionPane.showInputDialog("Introduce el tamaño del array");
		int num[] = new int[Integer.parseInt(numTexto)];
		
		int ultimoDigito;
		do{
			numTexto = JOptionPane.showInputDialog("Introduce un digito");
			ultimoDigito = Integer.parseInt(numTexto);
		}while(!(ultimoDigito >= 0 && ultimoDigito <= 9));
		
		//RELLENAR ARRAY CON NUMEROS ALEATORIOS
		rellenarArray(num);
		
		//CREAR EL ARRAY QUE CONTENGA LOS NUMEROS TERMINADOS EN EL NUMERO SELECCIONADO
		int terminadosEn[] = numTerminadosEn(num, ultimoDigito);
		
		//MOSTRAR EL RESULTADO
		arrayTerminadosEn(terminadosEn);
			
	}

	public static void rellenarArray(int num[]) {
		
		for(int i = 0; i < num.length; i++) {
			num[i] = ((int) (Math.random() * 300));
		}
	}
	
	public static void arrayTerminadosEn(int lista[]) {
		
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] != 0) {
				System.out.println("El numero " + lista[i] + " acaba en el numero seleccionado");
			}
		}
	}
	
	public static int[] numTerminadosEn(int num[], int ultimoDigito) {
		
		int terminadosEn[] = new int[num.length];
		int numeroFinal = 0;
		
		for(int i = 0; i < terminadosEn.length; i++) {
			numeroFinal = num[i] - (num[i] / 10 * 10);
			if(numeroFinal == ultimoDigito) {
				terminadosEn[i] = num[i];
			}
		}
		return terminadosEn;
	}
}
