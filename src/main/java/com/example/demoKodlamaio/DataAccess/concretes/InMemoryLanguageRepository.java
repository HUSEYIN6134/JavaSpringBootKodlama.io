package com.example.demoKodlamaio.DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demoKodlamaio.DataAccess.Abstracts.LanguageRepository;
import com.example.demoKodlamaio.entities.concretes.Language;
@Repository // Sınıfın veri erişim katmanında (data access layer) kullanıldığını belirtir.
public class InMemoryLanguageRepository implements LanguageRepository{
	List<Language> languages = new ArrayList<Language>();
    int lastIndex = 3;
	
	
	public InMemoryLanguageRepository() {
		 //geçici veritabanı oluşturuldu.
		
		languages.add(new Language(0,"java"));
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Python"));
	}
	
	@Override
	public void addLanguage(Language language) throws Exception{
        for(Language language1:languages){
            if(language1.getLanguage()=="")
                throw new Exception("Programlama dilleri boş geçilemez");

            if(language1.getLanguage()==language.getLanguage())
                throw new Exception("Programlama dilleri tekrar edemez");

        }
        language.setId(lastIndex);
        lastIndex++;
        languages.add(language);
    }
	@Override
    public void deleteLanguage(int id){
		Language language = languages.get(id);
        languages.remove(language);
    }
    public void updateLanguage(int id,String name){
        languages=new ArrayList<Language>();

        languages.remove(id);
        languages.add(new Language(id,name));

    }


	@Override
	public List<Language> getAll() {
		
		return languages;
	}

}
