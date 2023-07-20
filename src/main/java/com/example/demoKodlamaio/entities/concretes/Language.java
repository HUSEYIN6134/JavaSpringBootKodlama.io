package com.example.demoKodlamaio.entities.concretes;


	public class Language {
	    public String language;
	    public int id;
	    
	    

	    public Language() {
			
		}
	    
	    
        public Language(String language, int id) {
			
			this.language = language;
			this.id = id;
		}



		public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getLanguage() {
	        return language;
	    }

	    public void setLanguage(String programmingLanguage) {
	        this.language = programmingLanguage;
	    }

	    public Language(int id, String language) {
	        this.id=id;
	        this.language = language;
	    }
	}





