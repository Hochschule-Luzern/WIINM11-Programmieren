package ch.hslu.wi.stock.business.goods;

import ch.hslu.wi.stock.gui.ProductView;
import ch.hslu.wi.stock.business.goods.Dimension;

public class Product {
	
	private int identifier;
	private double weight;
	private ProductView view;
	private Dimension size;
	
	/**
	* @return the identifier
	*/
	public int getIdentifier() {
		return identifier;
	}
	
	/**
	* @param identifier the identifier to set
	*/
	public void setIdentifier(int identifier) {
		this. identifier = identifier;
	}
	
	/**
	* @return the weight
	*/
	public double getWeight() {
		return weight;
	}
	
	/**
	* @param weight the weight to set
	*/
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	* @return the myView
	*/
	public ProductView getView() {
		return view;
	}
	
	/**
	* @param view the myView to set
	*/
	public void setView(ProductView view) {
		this.view = view;
	}
	
	public void setSize(int width, int depth, int height) {
		this.size = new Dimension();
		
		size.setWidth(width);
		size.setDepth(depth);
		size.setHeight(height);
	}
	
	public Dimension getSize() {
		return size;
	}
}