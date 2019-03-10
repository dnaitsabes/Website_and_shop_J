package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.Product;
import pl.website.model.ProductSizeTable;
import pl.website.repository.ProductSizeTableRepository;

import java.util.List;

@Service
@Transactional
public class ProductSizeTableService {
    @Autowired
    private ProductSizeTableRepository productSizeTableRepository;

    public List<ProductSizeTable> findAllProductSizeTable(){
        return productSizeTableRepository.findAll();
    }

    public ProductSizeTable findOneProductSizeTableById(Long id){
        return productSizeTableRepository.findOne(id);
    }

    public void saveProductSizeTable(ProductSizeTable productSizeTable){
        productSizeTableRepository.save(productSizeTable);
    }

    public void deleteOneProductSizeTableByProductSizeTable( ProductSizeTable productSizeTable){
        productSizeTableRepository.delete(productSizeTable);
    }

    public void deleteOneProductSizeTableById( Long id){
        productSizeTableRepository.delete(id);
    }

    public void deleteAllProductSizeTable( ){
        productSizeTableRepository.deleteAll();
    }

    public long countAllProductSizeTable(){
        return   productSizeTableRepository.count();
    }
}
