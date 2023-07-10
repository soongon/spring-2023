package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public String getAllProducts() {
        return repository.selectAllProductList();
    }
}
