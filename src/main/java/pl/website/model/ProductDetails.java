package pl.website.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// powiązanie OneToMany z productSize jednostronnie
//Powiązanie ManyToMany z productDetails dwustronnie
@Entity
@Table(name = "products_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    @Size(max = 100)
    @NotBlank
    private String productColor;

    @Column(length = 100)
    @Size(max = 100)
    @NotBlank
    private String productTypeOfMaterial;

    @NotBlank
    private BigDecimal price;


    @ManyToMany(mappedBy = "productsDetails")
    private List<Product> products = new ArrayList<>();

    public ProductDetails() {
    }

    public ProductDetails(String productColor, String productTypeOfMaterial, BigDecimal price, List<Product> products) {
        this.productColor = productColor;
        this.productTypeOfMaterial = productTypeOfMaterial;
        this.price = price;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductTypeOfMaterial() {
        return productTypeOfMaterial;
    }

    public void setProductTypeOfMaterial(String productTypeOfMaterial) {
        this.productTypeOfMaterial = productTypeOfMaterial;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
