package ch.hslu.wi.stock;

import ch.hslu.wi.stock.business.Warehouse;
import ch.hslu.wi.stock.business.goods.Product;
import ch.hslu.wi.stock.business.Rack;
import ch.hslu.wi.stock.business.goods.Dimension;

/**
* Hauptklasse der Lagerverwaltung.
* @author eip
*
*/
public class StockHandler {
	
	public void showWeights(Warehouse display,
		Product one,
		Product tow,
		Product three) {
		
		Dimension OneSize = one.getSize();
	
		display.showNews("Gewicht von p1: "+one.getWeight());
		display.showNews("Gewicht von p2: "+tow.getWeight());
		display.showNews("Gewicht von p3: "+three.getWeight());
		display.showNews("Laenge: "+OneSize.getWidth()+" Tiefe: "+OneSize.getDepth()+" Höhe:n"+OneSize.getHeight());
	}
	/**
	* Hauptmethode für die Lagerverwaltung
	*/
	public void execute() {
		
		Warehouse myStock = WarehouseFactory.getWarehouse();
				
		Product p1 = WarehouseFactory.newProduct();
		Product p2 = WarehouseFactory.newProduct();
		Product p3 = p1;
		
		p1.setWeight(10);
		p2.setWeight(20);
		p3.setWeight(30);		
		
		p1.setSize(50,20,10);
		
		this.showWeights(myStock, p1, p2, p3);
		
		p1 = WarehouseFactory.newProduct();
		
		p1.setWeight(40);
		this.showWeights(myStock, p1, p2, p3);
		
		Rack Rack2 = myStock.getRack(2);
		Rack2.addProduct(p1);
		
		System.out.println("Hier war ich");
	}
}