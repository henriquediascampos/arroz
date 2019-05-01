package arroz.models.cidade;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@RestController
@RequestMapping(value = "/cidade")
public class CidadeController extends AbstractController {

    @Autowired
    private CidadeService cidadeService;

    @RequestMapping(value = "/{id}", method = {RequestMethod.GET})
    public Cidade get(@RequestBody @PathVariable("id") Long id) {
        return cidadeService.findById(id);
    }

    @RequestMapping(method = {RequestMethod.GET}, value= "/lista")
    public List<Cidade> lista() {
        return cidadeService.findAll();
    }

    @RequestMapping(method = {RequestMethod.GET}, value = "/busca/{filtros}")
    public List<Cidade> lista(@RequestBody @PathVariable("filtros") String filtros) {
        return cidadeService.findAllByFilters(filtros);
    }

    // @ResponseBody
    // @RequestMapping(method = {RequestMethod.POST})
    // public InfoResponse grava(@RequestBody @Valid Cidade cidade) {
    //     InfoResponse info = new InfoResponse();

    //     try {
    //         cidadeService.create(cidade);
    //     } catch (Exception e) {
    //         catchException(info, e);
    //     }

    //     return info;
    // }
    
    // @ResponseBody
    // @RequestMapping(value = "/{id}", method = {RequestMethod.DELETE})
    // public InfoResponse remove(@RequestBody @PathVariable("id") Long id) {
    //     InfoResponse info = new InfoResponse();

    //     try {
    //         cidadeService.delete(id);
    //     } catch (Exception e) {
    //         catchException(info, e);
    //     }

    //     return info;
    // }

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return null;
	}

}
