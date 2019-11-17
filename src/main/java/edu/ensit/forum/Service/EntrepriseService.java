package edu.ensit.forum.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import edu.ensit.forum.entity.Entreprise;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import edu.ensit.forum.entity.Etudiant;
>>>>>>> version finale back
>>>>>>> Added my project

public interface EntrepriseService {
	ResponseEntity<?> save(Entreprise entreprise);

	List<Entreprise> findAll();
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	Entreprise findById(Long id);
	void delete(Long id);
	 ResponseEntity<?> updateInvite(Entreprise entreprise,long id);
>>>>>>> version finale back
>>>>>>> Added my project

}
