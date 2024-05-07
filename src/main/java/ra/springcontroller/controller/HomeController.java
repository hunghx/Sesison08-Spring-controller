package ra.springcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ra.springcontroller.model.Person;

@Controller // tạo bean
//@RequestMapping("/admin")
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

//    @PostMapping(value = "/add")
//    public String contact(@RequestParam String name,@RequestParam String age, @RequestParam(required = false) String description,Model model) {
//        model.addAttribute("name",name);
//        model.addAttribute("age",age);
//        model.addAttribute("des",description);
//        return "list";
//    }
    @PostMapping(value = "/add") // đường dẫn
    public String contact(@ModelAttribute Person person, Model model) {
        model.addAttribute("person",person);
        return "list"; // tên view (view resolver)
    }

    @GetMapping("/student/{id}")
    public String findById(@PathVariable String id){
       return "redirect:/helo/hoho?id="+id;
    }

     // yêu câu người dùng nhâ vào 3 cạnh của tam giac => tính và hiển thị diện tích tam giác

}
