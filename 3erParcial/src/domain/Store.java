package domain;

import workflow.*;

public class Store {
	private ProductCatalog productCatalog = new ProductCatalog();
	private POST post = new POST( productCatalog );

	/**
	 * @deprecated Use {@link workflow.POST#getPOST()} instead
	 */
	public POST getPOST() {
		return post.getPOST();
	}
}
