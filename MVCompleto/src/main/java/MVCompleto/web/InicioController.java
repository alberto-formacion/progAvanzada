package MVCompleto.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import MVCompleto.service.PaisService;
import MVCompleto.vo.Pais;

@Controller
@RequestMapping("/")
public class InicioController {
	
	@Autowired
	PaisService paisService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String inicio(ModelMap model){
		
		ArrayList<Pais> paises = paisService.getPaises();
		
		model.addAttribute("paises", paises);
		
		return "index";
	}

}
