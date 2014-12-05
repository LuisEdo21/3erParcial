package domain;

class SaleLineItem {
  int	quantity;
  private	ProductSpecification	productSpec;

   public SaleLineItem(ProductSpecification spec, int quantity )
	{
		this.productSpec = spec;
		this.quantity = quantity;
	}

	/**
	 * @deprecated Use {@link domain.ProductSpecification#subtotal(domain.SaleLineItem)} instead
	 */
	public float subtotal() {
		return productSpec.subtotal(this);
	}

}
