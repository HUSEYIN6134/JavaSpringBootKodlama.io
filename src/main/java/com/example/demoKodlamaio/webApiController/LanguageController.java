package com.example.demoKodlamaio.webApiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoKodlamaio.Business.abstracts.LanguageService;
import com.example.demoKodlamaio.entities.concretes.Language;



@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    private LanguageService languageService;
    public List<Language>languages;
    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getAll")
    public List<Language>getAll() throws Exception{

        return languageService.getAll();
    }
    @PostMapping("/addLanguage")
    public void addLanguage(@RequestBody Language language){
        languageService.addLanguage(language);

    }
    @DeleteMapping("/deleteLanguage/{id}")
    public void deleteLanguage(@PathVariable("id") int id){

        languageService.deleteLanguage(id);
    }
    @GetMapping("/updateLanguage")
    public void updateLanguage(int id,String name){
        languageService.updateLanguage(id,name);
    }
    @GetMapping("/getAllbyId")
    Language getAllbyId(int id){

        return languageService.getAllbyId(id);
    }



}






