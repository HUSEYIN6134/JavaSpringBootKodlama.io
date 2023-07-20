package com.example.demoKodlamaio.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoKodlamaio.Business.abstracts.LanguageService;
import com.example.demoKodlamaio.DataAccess.Abstracts.LanguageRepository;
import com.example.demoKodlamaio.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService {
    LanguageRepository languageRepository;
    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    
    public void addLanguage(Language language) {
    	try {
			languageRepository.addLanguage(language);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void deleteLanguage(int id) {
    	languageRepository.deleteLanguage(id);

    }

    @Override
    public void updateLanguage(int id, String name) {

    }

    @Override
    public Language getAllbyId(int id) {
        return null;
    }

    public List<Language> getAll() {
        return languageRepository.getAll();
    }

}