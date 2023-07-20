package com.example.demoKodlamaio.Business.abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoKodlamaio.DataAccess.concretes.InMemoryLanguageRepository;
import com.example.demoKodlamaio.entities.concretes.Language;

public interface LanguageService {
	

	
	 public void addLanguage(Language language) ;
	    public void deleteLanguage(int id);
	    public void updateLanguage(int id,String name);

	    Language getAllbyId(int id);

	     List<Language> getAll() ;

}
