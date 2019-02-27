package pl.website.model;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products_types")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    @Size(max = 100)
    @NotBlank
    private String productTypeName;

    @Column(length = 200)
    @Size(max = 200)
    @NotBlank
    private String productTypeDescription;

    //Relation Many to one with productCategories two-way relation
    @ManyToOne
    private ProductCategory productCategory;

    //Relation one to many with product, two-way relations
    @OneToMany(mappedBy = "productType",fetch = FetchType.EAGER)
    private List<Product> products = new ArrayList<>();

    public ProductType() {
    }

    public ProductType(String productTypeName, String productTypeDescription, ProductCategory productCategory, List<Product> products) {
        this.productTypeName = productTypeName;
        this.productTypeDescription = productTypeDescription;
        this.productCategory = productCategory;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getProductTypeDescription() {
        return productTypeDescription;
    }

    public void setProductTypeDescription(String productTypeDescription) {
        this.productTypeDescription = productTypeDescription;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + id +
                ", productTypeName='" + productTypeName + '\'' +
                ", productTypeDescription='" + productTypeDescription + '\'' +
                ", productCategory=" + productCategory +
                ", products=" + products +
                '}';
    }
}
