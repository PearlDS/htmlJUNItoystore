package applicationpackage.controllers.implementations;

import applicationpackage.controllers.interfaces.HelloController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerImpl implements HelloController {


    @Override
    @GetMapping("hello1")
    public String hello1() {
        return "test";
    }

    @Override
    @GetMapping("hello2")
    public ModelAndView hello2() {
        String sentence = "Hello Mars";
        String sentence2 = "Hello Venus";
        return new ModelAndView("test", "message",sentence);
    }

    @Override
    @GetMapping("hello3")
    public String hello3(Model model) {
        String sentence = "Hello Mars";
        String sentence2 = "Hello Venus";
        model.addAttribute("message", sentence);
        model.addAttribute("message2", sentence2);
        return "test";
    }
}
