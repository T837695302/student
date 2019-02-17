package com.product.bean;
/**
 * 商品注文
 * @author HTJ
 *
 */
public class Product {
//商品番号
private int	id;
//商品名
private String	productname;
//産地
private String	supplier;
//商品種類
private String	type;
//注文日付
private String	indate;
//価格
private int	price;
//量
private int	amount;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getSupplier() {
	return supplier;
}
public void setSupplier(String supplier) {
	this.supplier = supplier;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getIndate() {
	return indate;
}
public void setIndate(String indate) {
	this.indate = indate;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "product [id=" + id + ", productname=" + productname + ", supplier=" + supplier + ", type=" + type
			+ ", indate=" + indate + ", price=" + price + ", amount=" + amount + "]";
}
public Product(int id, String productname, String supplier, String type, String indate, int price, int amount) {
	super();
	this.id = id;
	this.productname = productname;
	this.supplier = supplier;
	this.type = type;
	this.indate = indate;
	this.price = price;
	this.amount = amount;
}
public Product() {
	super();
	// TODO 自動生成されたコンストラクター・スタブ
}


}

