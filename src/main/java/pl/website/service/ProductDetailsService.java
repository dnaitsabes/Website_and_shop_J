package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.ProductCategory;
import pl.website.model.ProductDetails;
import pl.website.repository.ProductDetailsRepository;

import java.util.List;

@Service
@Transactional
public class ProductDetailsService {
    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    public List<ProductDetails> findAllProductDetails(){
        return productDetailsRepository.findAll();
    }

    public ProductDetails findOneProductDetailsById(Long id){
        return productDetailsRepository.findOne(id);
    }

    public void saveProductDetails(ProductDetails productDetails){
        productDetailsRepository.save(productDetails);
    }

    public void deleteOneProductDetailsByProductDetails( ProductDetails productDetails){
        productDetailsRepository.delete(productDetails);
    }

    public void deleteOneProductDetailsById( Long id){
        productDetailsRepository.delete(id);
    }

    public void deleteAllProductDetails( ){
        productDetailsRepository.deleteAll();
    }

    public long countAllProductDetails(){
        return   productDetailsRepository.count();
    }
}

