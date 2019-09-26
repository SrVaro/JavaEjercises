package test;

import data.RepositoryImp;
import model.ProductFactory;
public class DataTest {

	public static void test(RepositoryImp r) {
		
		r.addProduct(ProductFactory.CreateRandomProduct());
		r.addProduct(ProductFactory.CreateRandomProduct());
		r.addProduct(ProductFactory.CreateRandomProduct());
		r.addProduct(ProductFactory.CreateRandomProduct());
		r.addProduct(ProductFactory.CreateRandomProduct());
		r.addProduct(ProductFactory.CreateRandomProduct());


	}

}
