package services;

import data.RepositoryImp;
import model.ProductFactory;
import test.DataTest;
import utility.Writer;

public class Service {

	private static RepositoryImp r = new RepositoryImp();

	public static void fillWithData() {
		DataTest.test(r);
	}

	public static void addProduct() {
		r.addProduct(ProductFactory.readProduct());
	}

	public static void deleteProduct() {
		r.deleteProduct(Writer.readInt());
	}

	public static void listProducts() {
		r.listProducts();
	}

	public static void getStock() {
		r.getStock(Writer.readInt());
	}

	public static void getProductsMinItems() {
		r.getProductsMinItems();
	}

	public static void listProductsName() {
		r.listProductsName();
	}

}
