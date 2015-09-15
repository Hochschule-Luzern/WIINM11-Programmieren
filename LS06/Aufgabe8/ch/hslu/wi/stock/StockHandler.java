package ch.hslu.wi.stock;

import java.util.*;
import ch.hslu.wi.stock.business.*;
import ch.hslu.wi.stock.business.areas.*;
import ch.hslu.wi.stock.business.goods.*;

public class StockHandler {
	
	public void execute() {
		
		Warehouse Wh1 = WarehouseFactory.getWarehouse();
		
		Area A1 = new Area(3,6);
		
		Wh1.addArea(A1);
		
		Rack R1 = this.initRack(4,3);
		
		A1.addRack(R1);
		int numProd = this.numberProducts(R1);
		
		Wh1.showMessage("Number of Products in Rack:"+numProd);
		
		this.showProductData(Wh1);
		
	}
	
	public void showProductData(Warehouse Wh1){
	
		Product[] Ps1 = Wh1.getAreaById(1).getRackById(1).products();
		
		for (Product p  : Ps1) {
			Wh1.showMessage("P weight:"+p.getWeight());
	      }
	}
	
	public int numberProducts(Rack R1){
		return R1.products().length;
	}
	
	// Signatur: initRack int int
	public Rack initRack(int Shelves, int Products){
	
		Rack R1 = new Rack(Shelves);
		Random Rand1 = new Random();
		
		for(int i=0;i<Products;i++){
		
			R1.addProduct(new Product(Rand1.nextInt(100)));
		}
		
		return R1;
	}
}