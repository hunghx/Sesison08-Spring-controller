package ra.springcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller // tạo bean
@RequestMapping("/admin")
public class HomeController {
    @GetMapping
    public String home(Model model) {
        model.addAttribute("name", "hung");
        return "home";
    }

    @GetMapping(value = "/list") // /admin/list?id=1&name=hung
    public String list() {
        return "list";
    }

    @GetMapping("/about")
    public String about() {
        return "list";
    }

    @PostMapping(value = "/contact")
    public String contact(@RequestParam String name,@RequestParam String age, @RequestParam(required = false) String description,Model model) {
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        model.addAttribute("des",description);
        return "list";
    }
}
