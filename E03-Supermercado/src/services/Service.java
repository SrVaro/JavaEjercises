package services;

import data.RepositoryImp;
import model.Product;
import test.DataTest;

public class Service {

	private static RepositoryImp r = new RepositoryImp();
	
	public static void fillWithData() {
		DataTest.test(r);
	}

	public static void addProduct(Product p) {
		r.addProduct(p);
	}

	public static void deleteProduct(int p) {
		r.deleteProduct(p);
	}

	public static void listProducts() {
		r.listProducts();
	}

	public static void getStock(int p) {
		r.getStock(p);
	}

	public static void getProductsMinItems() {
		r.getProductsMinItems();
	}
	
	public static void listProductsName() {
		r.listProductsName();
	}

}
