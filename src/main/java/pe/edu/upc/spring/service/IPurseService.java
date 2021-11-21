package pe.edu.upc.spring.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.spring.model.Company;
import pe.edu.upc.spring.model.Cost;
import pe.edu.upc.spring.model.Document;
import pe.edu.upc.spring.model.Purse;
import pe.edu.upc.spring.model.Users;


public interface IPurseService {
	public List<Purse> listPurse();
	public boolean save(Purse purse);


}

