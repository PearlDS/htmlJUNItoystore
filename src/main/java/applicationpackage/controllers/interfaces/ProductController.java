package applicationpackage.controllers.interfaces;

import org.springframework.ui.Model;

public interface ProductController {

    String showProducts(Model model);
    String showProductsBS(Model model);
    String showSingleProductBS(String id,Model model);


}
