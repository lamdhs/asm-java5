package com.poly.repositories;

import java.util.List;

import com.poly.beans.ProductModel;

public interface ProductRepository {
	List<ProductModel> findALl();
}
