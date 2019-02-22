package pl.website.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// Powiązanie ManyToMany z productDetails dwustronnie

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productCategory;

    private String productCategoryDescription;


    @ManyToMany(cascade =  CascadeType.MERGE)
    private List<ProductDetails>  productsDetails =new ArrayList<>();


}



// product category
//prodyt sub product

// product
