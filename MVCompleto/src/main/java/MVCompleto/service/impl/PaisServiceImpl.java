package MVCompleto.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MVCompleto.model.PaisDAO;
import MVCompleto.service.PaisService;
import MVCompleto.vo.Pais;

@Service
public class PaisServiceImpl implements PaisService {
	
	@Autowired
	PaisDAO paisDAO;

	@Override
	public ArrayList<Pais> getPaises() {
		return paisDAO.getPaises();
	}

}
