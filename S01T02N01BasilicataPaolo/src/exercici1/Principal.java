package exercici1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Producte samarreta = new Producte("Samarreta", 12.99f);
		Venda.llistaProductes.add(samarreta);
		Producte pantalons = new Producte("Samarreta", 19.98f);
		Venda.llistaProductes.add(pantalons);
		Producte camisa = new Producte("Samarreta", 14.99f);
		Venda.llistaProductes.add(camisa);
		try {
			Venda.calcularTotal();
			System.out.println(Venda.preuTotal);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		String[] str = {"java","c++","python"};
		try {
			String last = str[3];
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Tipus d'excepció: "+ e.getClass() + " motiu: " + e.getMessage());
		}
		
	}

}
