package com.spring.service;

import java.util.List;
import com.spring.model.ProductDTO;

public interface ProductDAO {
	// DB 상의 전체 상품 수를 받아오는 메서드
    int getListCount();

    // 상품테이블의 리스트를 받아오는 메서드
    List<ProductDTO> getProductList();

    // 상품의 상세정보를 받아오는 메서드
    ProductDTO getProductCont(int product_no);

}
