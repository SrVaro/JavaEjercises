package model;

import com.github.javafaker.Faker;
import gui.UI;
import utility.Writer;

public class ProductFactory {

	private static int autoIncrement = 0;

	public static Product CreateRandomProduct() {

		autoIncrement++;

		Faker faker = new Faker();

		int code = autoIncrement;
		String name = faker.pokemon().name();
		Category category = null;

		switch ((int) Math.ceil(Math.random() * 4)) {
		case 1:
			category = Category.DAIRY;
			break;
		case 2:
			category = Category.FRUIT;
			break;
		case 3:
			category = Category.MEAT;
			break;
		case 4:
			category = Category.VEGETABLE;
			break;
		}

		int stock = (int) (Math.random() * 10);

		return new Product(code, name, category, stock);
	}

	public static Product readProduct() {

		autoIncrement++;

		int code = autoIncrement;

		UI.dataMsg("nombre", "producto");
		String name = Writer.readString();

		Category category = null;

		System.out.println("¿Que tipo de producto es?\n\n" + "1)Lacteo\n" + "2)Fruta\n" + "3)Carne\n" + "4)Verdura\n");

		int n = Writer.readInt();
		while (n < 1 || n > 4) {

			switch (n) {
			case 1:
				category = Category.DAIRY;
				break;
			case 2:
				category = Category.FRUIT;
				break;
			case 3:
				category = Category.MEAT;
				break;
			case 4:
				category = Category.VEGETABLE;
				break;
			}
			UI.wrongData();
			n = Writer.readInt();
		}
		int stock = (int) (Math.random() * 10);

		return new Product(code, name, category, stock);
	}

}
