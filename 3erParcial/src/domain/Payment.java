package domain;

import java.util.Enumeration;

class Payment {
  private float amount;

  public Payment(float cashTendered) {
    this.amount = cashTendered;
  }

  public float getAmount() {
    return amount;
  }

public float total(Sale sale)
{
	float total = 0;
	Enumeration	e = sale.lineItems.elements();

	while( e.hasMoreElements() )
		{
		total += ( (SaleLineItem) e.nextElement() ).subtotal();
		}
	return total;
}

}
