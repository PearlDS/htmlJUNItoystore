package applicationpackage.controllers.implementations;

import applicationpackage.controllers.interfaces.UserController;
import applicationpackage.data.User;
import applicationpackage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserControllerImpl implements UserController {


    private UserService userService;

    @Autowired
    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    @GetMapping("login")
    public String goToLoginPage(Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("loggedInUser")==null) {
            model.addAttribute("user", new User("", "", null));
            return "loginPage";
        }
        else
            return "redirect:toysBS";
    }

    @Override
    @PostMapping("login")
    public String login(@ModelAttribute("user") User userReceived, HttpSession httpSession) {
        System.out.println(userReceived.getUserName());
        System.out.println(userReceived.getPassWord());

        User foundUser = userService.getUserByUserNameAndPassWord(userReceived.getUserName(), userReceived.getPassWord());

        if(foundUser==null){
            System.out.println("no valid stuff");
            return "redirect:login";
        }
        else {
            System.out.println("welcome");
            httpSession.setAttribute("loggedInUser", userReceived.getUserName());
            return "redirect:toysBS";
        }

    }

    @PostMapping("logout")
    public String logout(HttpSession httpSession){
        httpSession.setAttribute("loggedInUser", null);
        return "redirect:login";
    }
}
