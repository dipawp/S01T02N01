package exercici1;

import java.util.ArrayList;
import java.util.Iterator;

public class Venda{
	
	
	public static ArrayList<Producte> llistaProductes = new ArrayList<Producte>();
	//private static 

	public static float preuTotal = 0.0f; 



	public Venda() {}
	
	
	public static void calcularTotal() throws VendaBuidaException{
		
		if (Venda.llistaProductes.isEmpty()) {
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
		}else {
			Iterator<Producte> it = llistaProductes.iterator();
			
			while(it.hasNext()) {
				Producte prod = it.next();
				preuTotal += prod.getPreu();
				}	
			
//			for(int i = 0; i < llistaProductes.size(); i++){
//				preuTotal += llistaProductes.get(i).getPreu();
//			}
		}
		//return preuTotal;
	}
	
	

}
