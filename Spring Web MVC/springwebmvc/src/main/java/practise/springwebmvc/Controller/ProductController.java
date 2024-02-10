package practise.springwebmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import practise.springwebmvc.Product;

import org.springframework.ui.Model;

@Controller
public class ProductController {
    @GetMapping("/")
    public String getProductForm(Model model) {
        Product productObj = new Product();
        model.addAttribute("product", productObj);
        return "index";
    }

    @PostMapping("/product")
    public String handleFormSubmit(Product product, Model model) {
        // Process the form submission
        System.out.println("product");
        model.addAttribute("msg", "Product Saved Successfully");
        return "success";
    }
}
