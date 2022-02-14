package applicationpackage.controllers.interfaces;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public interface HelloController {

    String hello1();
    ModelAndView hello2();
    String hello3(Model model);

}
