package cn.com.tarena.service;

import java.util.List;

import cn.com.tarena.pojo.Product;

public interface ProductListService {
	public List getProductList();
	public Product getProductById(int productid);
}
