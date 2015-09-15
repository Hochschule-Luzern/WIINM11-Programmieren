package ch.hslu.wi.stock;

import ch.hslu.wi.stock.business.Rack;
import ch.hslu.wi.stock.business.Warehouse;

public class StockHandler extends Object {
	
	public void execute() {
		
		Warehouse theWarehouse;
		theWarehouse = WarehouseFactory.getWarehouse();
		
		Rack aRack;
		aRack = theWarehouse.getFirstRack();
		
		aRack.addProduct();
		aRack.addProduct();
		aRack.addProduct();
		
		Rack anOtherRack = WarehouseFactory.newRack();
		
		Rack bRack = theWarehouse.getRack(2);
		bRack.addProduct();
		
		anOtherRack.addProduct();
		anOtherRack.addProduct();
		
		aRack.removeProduct();
	}
}
	