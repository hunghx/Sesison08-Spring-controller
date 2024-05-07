package ra.springcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/math")
    public String math(){
        return "math";
    }
    @PostMapping("/calculator")
    public  String calArea(@RequestParam Double a, @RequestParam Double b, @RequestParam Double c, Model model){
        if (a<=0||b<=0||c<=0){
            model.addAttribute("error","Các cạnh không thể nhỏ hơn hoặc băn 0");
            return "err";
        }
        if (a+b<=c||b+c<=a||c+a<=b){
            model.addAttribute("error","Tổng 2 cạnh phải lớn hơn canạnh còn lại");
            return "err";
        }
        // tin dien tich : heron
        double p = (a+b+c)/2;
        double s = Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("c",c);
        model.addAttribute("s",s);
        return "success";
    }
}
