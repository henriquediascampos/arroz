package arroz.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "cat")
@RestController
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public String teste(){
        return "teste";
    }
}