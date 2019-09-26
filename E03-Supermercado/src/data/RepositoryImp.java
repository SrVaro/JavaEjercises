package data;

import java.util.HashMap;
import java.util.Map;
import model.Product;

public class RepositoryImp implements RepositoryI {

	Map<Integer, Product> productList = new HashMap<>();

	public void addProduct(Product p) {
		productList.put(p.getCode(), p);
	}

	public void deleteProduct(int p) {
		productList.remove(p);
	}

	public void listProducts() {
		productList.forEach((p, c) -> System.out.println(c));
	}

	public void listProductsName() {
		productList.forEach((p, c) -> System.out.println(c.getName()));
	}

	public void getStock(int p) {
		System.out.println(productList.get(p).getStock());
	}

	public void getProductsMinItems() {

		for (Map.Entry<Integer, Product> p : productList.entrySet()) {
			// Integer key = p.getKey();
			Product value = p.getValue();

			if (value.getStock() >= 5)
				System.out.println(value.getStock());
		}

	}

}
