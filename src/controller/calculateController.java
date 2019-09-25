package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculateController {
    @GetMapping("/")
    public  String home() {
        return "index";
    }

    @PostMapping("/caculate")
    public String caculte(ModelMap modelMap, @RequestParam (value = "firstOperand",defaultValue ="0") double firstOperand,
                          @RequestParam (value = "secondOperand",defaultValue = "0") double secondOperand,
                          @RequestParam("operator") String operator) {


        if(secondOperand == 0) {
            modelMap.addAttribute("result","Error!");
            return "index";
        } else {
            double result = Caculate.calculate(firstOperand,secondOperand,operator);
            modelMap.addAttribute("result",result);
        }

        modelMap.addAttribute("firstOperand",firstOperand);
        modelMap.addAttribute("secondOperand",secondOperand);

        return "index";
    }
}

