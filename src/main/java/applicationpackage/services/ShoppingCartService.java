package applicationpackage.services;

import applicationpackage.data.Product;
import applicationpackage.data.ShoppingCart;
import applicationpackage.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public void updateShoppingCart(ShoppingCart shoppingCart){
        shoppingCartRepository.save(shoppingCart);
    }

    public List<Product> getProductsByShoppingCartId(ShoppingCart shoppingCart){
     return shoppingCartRepository.findProductById(shoppingCart.getId());
    }



}
