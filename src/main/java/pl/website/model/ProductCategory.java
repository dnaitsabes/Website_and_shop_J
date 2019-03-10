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

    @Column(length =300 )
    @Size(max = 300)
    @NotBlank(message = "pole productCategoryDescripton nie możę być puste")
    private String productCategoryLink;


    public ProductCategory() {
    }

    public ProductCategory(String productCategoryName, String productCategoryDescripton, String productCategoryLink) {
        this.productCategoryName = productCategoryName;
        this.productCategoryDescripton = productCategoryDescripton;
        this.productCategoryLink = productCategoryLink;
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

    public String getProductCategoryLink() {
        return productCategoryLink;
    }

    public void setProductCategoryLink(String productCategoryLink) {
        this.productCategoryLink = productCategoryLink;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", productCategoryName='" + productCategoryName + '\'' +
                ", productCategoryDescripton='" + productCategoryDescripton + '\'' +
                ", productCategoryLink='" + productCategoryLink + '\'' +
                '}';
    }
}
