package com.psl.training.inventory.data;

public class OrderItem 
{
	private StockItem stockItem;
	private int numberOfItems;
	
	
	public OrderItem(int numberOfitems, StockItem stItem) {
		super();
		this.numberOfItems = numberOfitems;
		this.stockItem = stItem;
	}
	
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	
	public int cost() {
		return (int) (numberOfItems * stockItem.getItemPrice());
	}

	//Sales
	public String printQuantity(){
		return("Quantity:"+numberOfItems +", ProductName:"+ stockItem.printDescription());
	}
	//Invoice
	public String OrderInvoice() {
		return(stockItem.StockInvoice()+" \nQuantity:"+this.numberOfItems );
	}
	

}
