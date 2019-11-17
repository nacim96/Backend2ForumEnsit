package edu.ensit.forum.Controller;

import java.util.List;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import javax.validation.Valid;

>>>>>>> version finale back
>>>>>>> Added my project
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
=======
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> version finale back
>>>>>>> Added my project
import org.springframework.web.bind.annotation.RestController;

import edu.ensit.forum.Service.EtudiantService;
import edu.ensit.forum.entity.Etudiant;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/ForumEnsit")
public class EtudiantController {
	
	 @Autowired 
	  EtudiantService etudiantservice;
   @PostMapping("/etudiant")
	public  ResponseEntity<?> registerEntreprise( @RequestBody Etudiant etudiant) {
	return etudiantservice.save(etudiant);}
	
	@GetMapping("/etudiant")
	public List<Etudiant> getEntrprises() {
		return etudiantservice.findAll();
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	
=======
	}
	
	 @RequestMapping(value = "/etudiants/{id}", method = RequestMethod.GET)
	    public Etudiant getOne(@PathVariable(value = "id") Long id){
	        return etudiantservice.findById(id);
	    }
	 @RequestMapping(value = "/etudiants/delete/{id}", method = RequestMethod.GET)
	 public void deleteById(@PathVariable(value = "id") Long id){
		 etudiantservice.delete(id);
	 }
	 
	@PutMapping("/updateEtudiant/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody Etudiant edutiant, @PathVariable long id) {
		return etudiantservice.updateInvite(edutiant, id);
>>>>>>> version finale back
>>>>>>> Added my project

	}
}



