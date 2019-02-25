package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.ProductCategory;
import pl.website.repository.ProductCategoryRepository;

import java.util.List;

@Service
@Transactional
public class ProductCategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> findAllProductCategory(){
        return productCategoryRepository.findAll();
    }

    public ProductCategory findOneProductCategoryById(Long id){
        return productCategoryRepository.findOne(id);
    }

    public void saveProductCategory(ProductCategory productCategory){
        productCategoryRepository.save(productCategory);
    }

    public void deleteOneProductCategoryByProductCategory( ProductCategory productCategory){
        productCategoryRepository.delete(productCategory);
    }

    public void deleteOneProductCategoryById( Long id){
        productCategoryRepository.delete(id);
    }

    public void deleteAllProductCategory( ){
        productCategoryRepository.deleteAll();
    }

    public long countAllProductCategory(){
        return   productCategoryRepository.count();
    }
}
