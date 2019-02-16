
public class SmartPhone {
	
	String marca = "Asus";
	String modelo = "Zenfone 5 selfie";
	String processador = "4x 1.4 GHz Cortex-A53 + 4x 1.1 GHz Cortex-A53";
	String nucleos = "Octa-core";
	String resolucao = "1080 x 2160 pixels";
	String ram = "4 GB";
	String armazenamento = "64 GB";
	String cor = "Vermelho";

		
	public void mostrarAtributos() {
		
		System.out.println("Marca:" +marca);
		System.out.println("Modelo:" +modelo);
		System.out.println("Processador:" +processador);
		System.out.println("Núcleos:" +nucleos);
		System.out.println("Resolução:" +resolucao);
		System.out.println("Ram:" +ram);
		System.out.println("Armazenamento:" +armazenamento);
		System.out.println("Cor:" +cor);
		
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone cel = new SmartPhone();
		cel.mostrarAtributos();
			
		}
		
		
	}


