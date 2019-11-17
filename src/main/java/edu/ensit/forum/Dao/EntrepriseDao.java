package edu.ensit.forum.Dao;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

>>>>>>> version finale back
>>>>>>> Added my project
import edu.ensit.forum.entity.Entreprise;

public interface EntrepriseDao  extends InviteRepository<Entreprise>{

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	Optional<Entreprise> findByUsername(String email);
    Boolean existsByEmail(String email);

	 Boolean existsByIdNotAndEmail(@Param("id") long id, @Param("email") String email);
	List<Entreprise> findByEmailContaining(String email);
>>>>>>> version finale back
>>>>>>> Added my project
}
