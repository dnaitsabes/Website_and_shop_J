package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.Product;
import pl.website.model.ProductDetails;
import pl.website.model.ProductType;
import pl.website.repository.ProductRepository;

import java.util.List;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    public Product findOneProductById(Long id){
        return productRepository.findOne(id);
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public void deleteOneProductByProduct( Product product){
        productRepository.delete(product);
    }

    public void deleteOneProductById( Long id){
        productRepository.delete(id);
    }

    public void deleteAllProduct( ){
        productRepository.deleteAll();
    }

    public long countAllProduct(){
        return   productRepository.count();
    }

    public List<Product> findAllByProductType(ProductType productType){
        return productRepository.findAllByProductType(productType);
    }
}
