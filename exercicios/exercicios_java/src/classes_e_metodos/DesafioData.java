package classes_e_metodos;

public class DesafioData {
	//dados
	private int dia;
	private int mes;
	private int ano;
	
	//construtor com valor default
	public DesafioData() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	//construtor
	public DesafioData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	//métdos
	public String formateData() {
		return String.format("%d-%d-%d" ,dia, mes, ano);
	}
	
	public void exibaDataFormatada() {
		System.out.println(formateData());
	}
}

