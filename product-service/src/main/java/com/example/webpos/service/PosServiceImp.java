/*package com.example.webpos.service;

import com.example.webpos.db.PosDB;
import com.example.webpos.model.Cart;
import com.example.webpos.model.Item;
import com.example.webpos.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.webpos.repository.CartRepository;

import java.util.List;

@Component
public class PosServiceImp implements PosService {

    private PosDB posDB;
    private CartRepository cartRepository;

    @Autowired
    public void setPosDB(PosDB posDB) {
        this.posDB = posDB;
    }

    @Autowired
    public void setCartRepository(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
    

    @Override
    public boolean emptyCart()
    {
        if (this.getCart() == null) return false;
        this.getCart().remove();
        return true;
    }

    @Override
    public int getTotalcost() {
        if (this.getCart() == null) return 0;
        List<Item> items = this.getCart().getItems();
        int sum = 0;
        for (Item item : items) 
            sum += item.getQuantity() * item.getProduct().getPrice();
        return sum;
    }

    @Override
    public boolean changeQuantity(String productId, int quantity){
        if (this.getCart() == null) return false;
        return this.getCart().changeQuantity(productId, quantity);
    }

    @Override
    public Cart getCart() {

        Cart cart = posDB.getCart();
        if (cart == null) {
            cart = this.newCart();
        }
        return cart;
    }

    @Override
    public Cart newCart() {
        return posDB.saveCart(new Cart());
    }

    @Override
    public void checkout(Cart cart) {

    }

    @Override
    public void total(Cart cart) {

    }

    @Override
    public boolean add(Product product, int amount) {
        return false;
    }

    @Override
    public boolean add(String productId, int amount) {

        Product product = posDB.getProduct(productId);
        if (product == null){
            return false;
        }

        this.getCart().addItem(new Item(product, amount));
        return true;
    }

    public boolean deleteItem(String productId) {
        if (this.getCart() == null) return false;
        return this.getCart().deleteItem(productId);
    }

    @Override
    public List<Product> products() {
        return posDB.getProducts();
    }

    @Override
    public void saveCart()
    {
        if (this.getCart() != null){
            for (Item item: this.getCart().getItems())
            {
                item.setCart(this.getCart());
            }
            cartRepository.save(this.getCart());
            posDB.newCart();
        }
    }

}
*/