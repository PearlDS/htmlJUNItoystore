package applicationpackage.controllers.interfaces;

import applicationpackage.data.User;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public interface UserController {

    String goToLoginPage(Model model, HttpSession httpSession);
    String login(User userReceived, HttpSession httpSession);
}
