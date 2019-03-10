package pl.website.model;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

    List<CartItem> cartItems = new ArrayList<>();
    private  Double sum = 0.0;

    public void addToCart(CartItem cartItem) {

        cartItems.add(cartItem);

        //1.Przypisujemy cenę produktu do tempSum
        Double tempSum = cartItem.getProduct().getPrice();

        //3. Mnożymy 'tempsum' przez ilość
        tempSum = tempSum * (cartItem.getQuantity());

        //4.Dodajemy tempsum do 'sum'
        sum = sum + tempSum;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }


    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartItems=" + cartItems +
                ", sum=" + sum +
                '}';
    }
}
