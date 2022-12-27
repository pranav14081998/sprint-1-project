package com.shoppingcart.app.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shoppingcart.app.controller.ProductController;
import com.shoppingcart.app.exception.ProductNotFoundException;
import com.shoppingcart.app.model.Product;

@Controller
public class ProductMain {
	@Autowired
	private ProductController productController;
	
	public void productRun() {
		System.out.println("\n Product Entity records :");
		addProducts(createProducts());
	}

	//method to add Product
	private void addProducts(List<Product> products) {
		for(Product product : products) {
			try {
				productController.addProduct(product);
			} 
			catch (ProductNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of Product
	private List<Product> createProducts(){
		List<Product> products = new ArrayList<Product>();
		
		Product p1 = new  Product("sudha Protein Buttermilk",null, "sudha becomes World"
		 		+ "'s 8th Largest Milk Processor", "Vihaan Distributes","sudha Protein"
		 		+ " Buttermilk is refreshing milk based natural drink.",189L,
		 		40.08,40.08, null);
		 
		Product p2 = new Product("Levi's T-shirt", null, "Levis's leads the scale down of"
			 		+ " fashion seasons", "sounddeluxestore", "Levis's", 500L, 200.08, 125.00, null);
			 
		Product p3 = new Product("Hp Laptop", null, "Hp becomes world famous for"
			 		+ " gadgets", "Multi-Vendor", "Hp laptop is well known for better work",
			 		190L, 65000.09, 70080.90, null);
			 
		Product p4 = new Product("Adidas Bag", null, "Free Size", "indiaMART", "Adidas is"
			 		+ " well known for leathers and bags", 156L, 2000.08, 2529.07, null);
			
		Product p5 = new Product("Nike Shoes", null, "Free size", "indiaMART", "Nike is"
			 		+ " well known for leathers and bags", 600L, 1000.08, 1500.07, null);
			
		Product p6 = new Product("Dell Keyboard", null, "Combo of mouse and Keyboard",
					"Flipkart"," well known for leathers and bags", 156L, 600.08, 750.07, null);
			
		Product p7 = new Product("Gucci belt", null, "Reversible leather belt", "versace",
					"Gucci leads the scale down of fashion seasons", 156L, 2000.08, 2529.07, null);
			
		Product p8 = new  Product("Amul Makhna",null, "Amul becomes World's 8th Largest"
					+ " Milk Processor", "Vihaan Distributes","Amul Protein Buttermilk is"
					+ " refreshing milk based natural drink.",50L,10.08,20.08, null);
	
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		
		return products;
	}

}
