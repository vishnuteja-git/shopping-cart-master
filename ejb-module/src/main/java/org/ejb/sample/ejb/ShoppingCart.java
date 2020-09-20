package org.ejb.sample.ejb;

import org.ejb.sample.model.Product;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ShoppingCart {

	void addProduct(Product product);
	
	void completePurchase();

	List<String> getProducts();

	List<Product> getCartProducts();
}
