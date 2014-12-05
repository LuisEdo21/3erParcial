package domain;

public class ProductSpecification {
	private int    precioUnitario         = 0;
	private float  precio       = 0;
	private String descripcion = "";

	public ProductSpecification( int upc, float price, String description )
		{
		this.precioUnitario         = upc;
		this.precio       = price;
		this.descripcion = description;
		}

	public int getUPC() { return precioUnitario;	}
	public float getPrice() { return precio; }
	public String getDescription() { return descripcion; }
}
