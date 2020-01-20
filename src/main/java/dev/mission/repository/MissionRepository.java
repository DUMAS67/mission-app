
package dev.mission.repository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mission.entite.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> { 

	List<Mission> findByDateDebut (LocalDate dateDeDebut);
	//            findBy | un élément de la classe Mission //*
	
	
	List<Mission> findByDateFin (LocalDate dateDeFin);
	
	List<Mission> findByDateFinAndDateDebut (LocalDate dateDeFin, LocalDate dateDeDebut);
	
//  findBy un élément de la classe Mission par | Date de fin et Date de Début //*
}
