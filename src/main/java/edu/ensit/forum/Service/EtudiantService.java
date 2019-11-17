package edu.ensit.forum.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import edu.ensit.forum.entity.Etudiant;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import edu.ensit.forum.entity.User;
>>>>>>> version finale back
>>>>>>> Added my project

public interface EtudiantService {
	
	ResponseEntity<?>  save(Etudiant etudiant);

	List<Etudiant> findAll();
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
	Etudiant findById(Long id);
	void delete(Long id);
	 ResponseEntity<?> updateInvite(Etudiant entreprise,long id);
>>>>>>> version finale back
>>>>>>> Added my project

}
