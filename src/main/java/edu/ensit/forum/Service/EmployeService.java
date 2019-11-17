package edu.ensit.forum.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import edu.ensit.forum.entity.Employe;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import edu.ensit.forum.entity.Etudiant;
>>>>>>> version finale back
>>>>>>> Added my project

public interface EmployeService {
	

	ResponseEntity<?> save(Employe employe);
	
    List<Employe> findAll();
<<<<<<< HEAD
    
=======
<<<<<<< HEAD
    
=======
    Employe findById(Long id);
	void delete(Long id);
	 ResponseEntity<?> updateInvite(Employe employe,long id);
>>>>>>> version finale back
>>>>>>> Added my project
   

}
