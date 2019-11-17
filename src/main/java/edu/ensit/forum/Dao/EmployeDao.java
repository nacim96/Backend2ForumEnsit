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
import edu.ensit.forum.entity.Employe;

public interface EmployeDao extends InviteRepository<Employe> {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	Optional<Employe> findByUsername(String email);
    Boolean existsByEmail(String email);

	 Boolean existsByIdNotAndEmail(@Param("id") long id, @Param("email") String email);
	List<Employe> findByEmailContaining(String email);
>>>>>>> version finale back
>>>>>>> Added my project
}
