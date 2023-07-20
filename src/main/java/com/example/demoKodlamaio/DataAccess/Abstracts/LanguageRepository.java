package com.example.demoKodlamaio.DataAccess.Abstracts;

import java.util.List;

import com.example.demoKodlamaio.entities.concretes.Language;

public interface LanguageRepository {

	List<Language> getAll();
	void addLanguage(Language language) throws Exception;  //hata fırlatma ihtimali sebebi programlama dili boş geçilemez ve isimler tekrar edemez.
	void deleteLanguage(int id);

}
