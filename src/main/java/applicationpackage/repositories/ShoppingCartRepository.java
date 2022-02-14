package applicationpackage.repositories;

import applicationpackage.data.Product;
import applicationpackage.data.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {

    public List<Product> findProductById(int id);


}
