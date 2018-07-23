package arroz.models.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
class UsuarioController {
    
    @GetMapping("/inicio")
    public String inicial(){
        return "home/inicio";
    }

    @GetMapping("teste/")
    public ModelAndView teste(Integer id){
        System.out.println(id);
    //    Cidade Cidade =  (Cidade) genericDAO.findById(id);
        return new ModelAndView("home/inicio");
    }
}