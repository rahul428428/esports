package com.niit.dao;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductDao {

	void saveProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public void deleteProduct(Product product);
	public void editProduct(Product product);
	public List<Category> getAllCategories();
}