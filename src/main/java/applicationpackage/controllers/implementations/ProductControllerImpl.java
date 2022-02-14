package applicationpackage.controllers.implementations;

import applicationpackage.controllers.interfaces.ProductController;
import applicationpackage.data.Product;
import applicationpackage.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductControllerImpl implements ProductController {


    private ProductService productService;

    @Autowired
    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    @GetMapping("toys")
    public String showProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "toytest";
    }

    @Override
    @GetMapping("toysBS")
    public String showProductsBS(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "index";
    }

    @Override
    @GetMapping("toys/{id}")
    public String showSingleProductBS(@PathVariable String id, Model model) {
        Integer idInInt = Integer.parseInt(id);

        Product product = productService.getProductById(idInInt).get();
        model.addAttribute("product", product);

        return "singleitem";
    }
}
