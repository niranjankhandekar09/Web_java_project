package com.petshop.service;

import java.util.List;

import com.petshop.entity.Category;
import com.petshop.entity.Product;
import com.petshop.entity.User;

public interface ProductService {

	Product addProduct(Product product);

	Product updateProduct(Product product);

	Product getProductById(int productId);

	Long countByStatusIn(List<String> status);

	Long countByStatusInAndSeller(List<String> status, User seller);

	List<Product> getAllProductByStatusIn(List<String> status);

	List<Product> getAllProductBySellerAndStatusIn(User Seller, List<String> status);

	List<Product> getAllProductByCategoryAndStatusIn(Category category, List<String> status);

	List<Product> getAllProductBySellerAndCategoryAndStatusIn(User seller, Category category, List<String> status);

	List<Product> updateAllProduct(List<Product> products);

	List<Product> searchProductNameAndStatusIn(String productName, List<String> status);

	List<Product> searchProductNameAndSellerAndStatusIn(String productName, User seller, List<String> status);

}
