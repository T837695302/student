/**
 *
 */
package com.student.bean;

/**
 * @author xumin
 *
 */
public class AcceptOrder {

	private int ordercode;// 受注番号
	private int customercode;// 顧客コード
	private int productcode;// 受注コード
	private int ordernumber;// 受注個数
	private String deliverydate;// 納品日

	/**
	 * @param ordercode
	 * @param customercode
	 * @param productcode
	 * @param ordernumber
	 * @param deliverydate
	 */
	public AcceptOrder(int ordercode, int customercode, int productcode, int ordernumber, String deliverydate) {
		super();
		this.ordercode = ordercode;
		this.customercode = customercode;
		this.productcode = productcode;
		this.ordernumber = ordernumber;
		this.deliverydate = deliverydate;
	}

	/**
	 * @return ordercode
	 */
	public int getOrdercode() {
		return ordercode;
	}

	/**
	 * @param ordercode
	 *            セットする ordercode
	 */
	public void setOrdercode(int ordercode) {
		this.ordercode = ordercode;
	}

	/**
	 * @return customercode
	 */
	public int getCustomercode() {
		return customercode;
	}

	/**
	 * @param customercode
	 *            セットする customercode
	 */
	public void setCustomercode(int customercode) {
		this.customercode = customercode;
	}

	/**
	 * @return productcode
	 */
	public int getProductcode() {
		return productcode;
	}

	/**
	 * @param productcode
	 *            セットする productcode
	 */
	public void setProductcode(int productcode) {
		this.productcode = productcode;
	}

	/**
	 * @return ordernumber
	 */
	public int getOrdernumber() {
		return ordernumber;
	}

	/**
	 * @param ordernumber
	 *            セットする ordernumber
	 */
	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}

	/**
	 * @return deliverydate
	 */
	public String getDeliverydate() {
		return deliverydate;
	}

	/**
	 * @param deliverydate
	 *            セットする deliverydate
	 */
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override

		public String toString() {
			return "AcceptOrder [ordercode=" + ordercode + ", customercode=" + customercode + ", productcode=" + productcode + ", ordernumber=" + ordernumber + ", deliverydate=" + deliverydate
					+ "]";

	}
}
