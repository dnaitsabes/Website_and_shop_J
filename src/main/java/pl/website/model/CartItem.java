package pl.website.model;

import java.util.Objects;

public class CartItem {

    private Integer quantity;

    private Product product;

    private double productSumPrice;

    public CartItem() {

    }

    public CartItem(Integer quantity, Product product, double productSumPrice) {
        this.quantity = quantity;
        this.product = product;
        this.productSumPrice = productSumPrice;
    }

    public CartItem(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getProductSumPrice() {
        return productSumPrice;
    }

    public void setProductSumPrice(double productSumPrice) {
        this.productSumPrice = productSumPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return Objects.equals(product, cartItem.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "quantity=" + quantity +
                ", product=" + product +
                ", productSumPrice=" + productSumPrice +
                '}';
    }
}
