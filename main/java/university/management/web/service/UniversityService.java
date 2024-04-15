package university.management.web.service;
import java.util.*;
import university.management.web.data.*;

//UniversityService.java
public class UniversityService {
	
	private static Map<String, University> UNIVERSITY_DATA = new HashMap<String, University>();
	private static Map<String, Specialty> SPECIALTY_DATA = new HashMap<String, Specialty>();
	private HashMap<String, University> tEMP_UNIVERSITY_DATA;

	public University createUniversity(String name, String adress) {
		
		University u= new University();
		u.Create(adress, name);
		if (contains(u)) {
			System.out.println("Déja existant ");
			return null;
		}else {
	    UNIVERSITY_DATA.put(name, u);
	    return u;}
		
 }
	public Specialty createSpecialty(String name) {
     Specialty s= new Specialty();
     s.setName(name);
     if(containsS(s)) {
    	 System.out.println("Déja existant ");
			return null;
     }else {
     SPECIALTY_DATA.put(name, s);
     return s;
     }
 }

 public University connectSpecialtyWithUniversity(String specialtyName, String universityName) {
	 Specialty s = SPECIALTY_DATA.get(specialtyName);
	 University u = UNIVERSITY_DATA.get(universityName);
	 u.setSpecialty(s);
	 UNIVERSITY_DATA.put(universityName, u);
	 return u;
	 
 }

 public HashMap<String, University> findUniversityBySpecialty(String name) throws NoSuchElementException {
			tEMP_UNIVERSITY_DATA = new HashMap<String, University>();
			tEMP_UNIVERSITY_DATA=null;
			Collection<University> values = UNIVERSITY_DATA.values();
			for (University u : values) {
				if (u.getSpecialty().getName().equals(name)) {
					tEMP_UNIVERSITY_DATA.put(name, u);
				}
			}
			if (tEMP_UNIVERSITY_DATA== null) {
				throw new NoSuchElementException("Specialty " + name + " does not exists.");
			} 
			return 	tEMP_UNIVERSITY_DATA;
			
 }
 public boolean contains(University u) {
	 boolean result=false;
	 Collection<University> values = UNIVERSITY_DATA.values();
		for (University ut : values) {
			if (u.getName().equals(ut.getName())) {
				result = true;
			}
		}
		return result;
		}
 
 public boolean containsS(Specialty s) {
	 boolean result=false;
	 Collection<Specialty> values = SPECIALTY_DATA.values();
	 for (Specialty st : values) {
		if (s.getName().equals(st.getName())) {
			result = true;
		}
	}
	return result;
 }

}