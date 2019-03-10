package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.ProductSizeTable;
import pl.website.model.ProductType;
import pl.website.repository.ProductTypeRepository;

import java.util.List;

@Service
@Transactional
public class ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;

    public List<ProductType> findAllProductType(){
        return productTypeRepository.findAll();
    }

    public ProductType findOneProductTypeById(Long id){
        return productTypeRepository.findOne(id);
    }

    public void saveProductType(ProductType productType){
        productTypeRepository.save(productType);
    }

    public void deleteOneProductTypeByProductType( ProductType productType){
        productTypeRepository.delete(productType);
    }

    public void deleteOneProductTypeById( Long id){
        productTypeRepository.delete(id);
    }

    public void deleteAllProductType( ){
        productTypeRepository.deleteAll();
    }

    public long countAllProductType(){
        return   productTypeRepository.count();
    }
}
