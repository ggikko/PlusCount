package service.template.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Park Ji Hong, ggikko.
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "hello";
    }
}
