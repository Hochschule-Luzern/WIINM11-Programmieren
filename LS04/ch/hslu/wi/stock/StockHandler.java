package ch.hslu.wi.stock;

import ch.hslu.wi.stock.business.Warehouse;
import ch.hslu.wi.stock.business.WarehouseFactory;
import ch.hslu.wi.stock.business.areas.Area;
import ch.hslu.wi.stock.business.Rack;
import ch.hslu.wi.stock.business.goods.Product;

public class StockHandler {
	
	private void showAreaState(Warehouse Warehouse1, Area Area1){
		
		Warehouse1.showMessage("AreaID: "+Area1.getId());
		Warehouse1.showMessage("MaxRacks: "+Area1.maxRacks());
		Warehouse1.showMessage("MaxShelves: "+Area1.getMaxNumberOfShelves());
		Warehouse1.showMessage("Typ: "+Area1.getAreaTyp());		
	}

	private void showRackState(Warehouse Warehouse1, Rack Rack1){
		
		Warehouse1.showMessage("RackID: "+Rack1.getId());
		Warehouse1.showMessage("Max Weight: "+Rack1.getMaxWeight());
		Warehouse1.showMessage("Number Shelf: "+Rack1.getNumberShelf());	
	}

	private void showProductState(Warehouse Warehouse1, Product Product1){
		
		Warehouse1.showMessage("ProductID: "+Product1.getIdentifier());
		Warehouse1.showMessage("Weight: "+Product1.getWeight());
	}
	
	public void execute() {
		
		Warehouse Warehouse1 = WarehouseFactory.getWarehouse();
		
		Area Area1 = new Area();
		
		this.showAreaState(Warehouse1, Area1);
		
		Warehouse1.addArea(Area1);
		
		Area Area2 = new Area(3,4);
		
		this.showAreaState(Warehouse1, Area2);
		
		Rack Rack1 = new Rack();
		Rack Rack2 = new Rack(5);
		Rack Rack3 = new Rack(5,4);
		
		this.showRackState(Warehouse1, Rack1);
		this.showRackState(Warehouse1, Rack2);
		this.showRackState(Warehouse1, Rack3);
		
		Area1.addRack(Rack1);
		Area1.addRack(Rack2);
		Area1.addRack(Rack3);
		
		Product Product1 = new Product();
		Product Product2 = new Product(4);
		
		// Keine Kontrolle von minus Werten
		Product1.setWeight(5);
		
		this.showProductState(Warehouse1, Product1);
		this.showProductState(Warehouse1, Product2);
		
		Rack1.addProduct(Product1);
		Rack3.addProduct(Product2);
	}
}