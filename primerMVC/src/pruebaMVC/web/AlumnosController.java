package pruebaMVC.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pruebaMVC.model.Alumno;

@Controller
@RequestMapping("alumnos")
public class AlumnosController {

	@RequestMapping(method=RequestMethod.GET)
	public String initAlumnoForm(ModelMap model){
		model.addAttribute("alumno", new Alumno());
		return "alumnos";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addAlumno(@ModelAttribute("alumno") Alumno alumno){
		return "index";
	}
}
