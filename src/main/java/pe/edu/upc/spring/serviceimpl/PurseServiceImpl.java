package pe.edu.upc.spring.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.spring.model.Cost;
import pe.edu.upc.spring.model.Document;
import pe.edu.upc.spring.model.Purse;
import pe.edu.upc.spring.repository.ICompanyRepository;
import pe.edu.upc.spring.repository.IDocumentRepository;
import pe.edu.upc.spring.repository.IPurseRepository;
import pe.edu.upc.spring.service.ICompanyService;
import pe.edu.upc.spring.service.IDocumentService;
import pe.edu.upc.spring.service.IPurseService;

@Service
public class PurseServiceImpl implements IPurseService {

	@Autowired
	private IPurseRepository dPurse;
	
	
	@Override
	@Transactional
	public boolean save(Purse purse) {
		Purse objPurse= dPurse.save(purse);
		if (objPurse == null)
			return false;
		else
			return true;
	}


	@Transactional(readOnly = true)
	public List<Purse> listPurse() {
		return dPurse.findAll();
	}
	
}
