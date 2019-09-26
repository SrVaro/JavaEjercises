package control;

import gui.UI;
import model.ProductFactory;
import services.Service;
import utility.Writer;

public class Controller {

	public static void startProgram() {

		Service.fillWithData();

		UI.showMenu();

		int n = Writer.readInt();

		while (n != -1) {

			switch (n) {
			case 1:
				Service.addProduct(ProductFactory.readProduct());
				break;
			case 2:
				Service.deleteProduct(Writer.readInt());
				break;
			case 3:
				Service.listProducts();
				break;
			case 4:
				Service.listProductsName();
				Service.getStock(Writer.readInt());
				break;
			case 5:
				Service.getProductsMinItems();
				break;
			}

			UI.waitMsg();

			Writer.readString();

			UI.showMenu();
			n = Writer.readInt();

		}

	}

}
