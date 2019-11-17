package edu.ensit.forum.Dao;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> Added my project
import edu.ensit.forum.entity.Etudiant;

public interface EtudiantDao  extends InviteRepository<Etudiant>{

<<<<<<< HEAD
=======
=======
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import edu.ensit.forum.entity.Etudiant;



public interface EtudiantDao  extends InviteRepository<Etudiant>{

	Optional<Etudiant> findByUsername(String email);
    Boolean existsByEmail(String email);

	 Boolean existsByIdNotAndEmail(@Param("id") long id, @Param("email") String email);
	List<Etudiant> findByEmailContaining(String email);
>>>>>>> version finale back
>>>>>>> Added my project
}
