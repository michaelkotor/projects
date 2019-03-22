package books;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private String value1 = "898";

    @GetMapping("/")
    public String books() {
        return "books";
    }
}
