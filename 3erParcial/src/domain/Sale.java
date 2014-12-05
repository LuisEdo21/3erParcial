package domain;

import java.util.*;

public class Sale {
	Vector lineItems = new Vector();
	private Date date = new Date();
	private boolean isComplete = false;
	private Payment payment;

	public float getBalance()
	{
		return payment.getAmount() - total();
	}

	public void becomeComplete()
	{
		isComplete = true;
	}

	public boolean isComplete() { return isComplete; }

	public void makeLineItem( ProductSpecification spec, int quantity )
	{
		lineItems.addElement( new SaleLineItem( spec, quantity ) );
	}

	/**
	 * @deprecated Use {@link domain.Payment#total(domain.Sale)} instead
	 */
	public float total()
	{
		return payment.total(this);
	}

	public void makePayment( float cashTendered )
	{
		payment = new Payment( cashTendered );
	}
}
