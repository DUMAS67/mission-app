package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;


public class ListerMissions implements Runnable {
	
	private MissionRepository missionRepository;
	
	public ListerMissions(MissionRepository missionRepository) {
		super(); 
		this.missionRepository = missionRepository; }


@Override
public void run() {  // TODO     } 
	
	
	List<Mission> lmission=this.missionRepository.findAll();
	for (Mission m : lmission) {
	System.out.println(m.getLibelle());
	System.out.println(m.getTauxJournalier());
	System.out.println(m.getDateDebut());
	System.out.println(m.getDateFin());
	}
	
	}
}