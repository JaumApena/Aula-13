public class Main{
	public static void main(String[] args) {
		
		Carro carro = new Carro("Ford", "Mustang", 2);
		System.out.println("Marca: " + carro.getMarca() + "\nModelo: " + carro.getModelo() 
		+ "\nNumero de portas: " + carro.getnumeroPortas());
		
		Moto moto = new Moto("Yamaha", "YZF-R1", 998);
		System.out.println("\nMarca: " + moto.getMarca() + "\nModelo: " + moto.getModelo()
		+ "\nCilindragem: " + moto.getCilindrada());
	}
}