package pl.website.model;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products_categories")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length =100 )
    @Size(max = 100)
    @NotBlank(message = "pole productCategoryName nie możę być puste")
    private String productCategoryName;

    @Column(length =200 )
    @Size(max = 200)
    @NotBlank(message = "pole productCategoryDescripton nie możę być puste")
    private String productCategoryDescripton;


    //Relation OneToMany with productType  - two-way relations
    @OneToMany(mappedBy = "productCategory", cascade = CascadeType.ALL)
    private List<ProductType> productTypes = new ArrayList<>();

    //Relation ManyToMany with order two-way relation
    @ManyToMany(mappedBy = "productCategory")
    private List<Order> orders = new ArrayList<>();

    public ProductCategory() {
    }

    public ProductCategory(String productCategoryName, String productCategoryDescripton, List<ProductType> productTypes, List<Order> orders) {
        this.productCategoryName = productCategoryName;
        this.productCategoryDescripton = productCategoryDescripton;
        this.productTypes = productTypes;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductCategoryDescripton() {
        return productCategoryDescripton;
    }

    public void setProductCategoryDescripton(String productCategoryDescripton) {
        this.productCategoryDescripton = productCategoryDescripton;
    }

    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
