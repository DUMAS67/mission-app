package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;


public class InsererMission implements Runnable {
	private MissionRepository missionRepository;

	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		Mission mission1 = new Mission();
		mission1.setLibelle("Mission 1");
		mission1.setTauxJournalier(new BigDecimal("100.90"));
		mission1.setDateDebut(LocalDate.of(2019, 1, 1));
		mission1.setDateFin(LocalDate.of(2019, 3, 4));
		this.missionRepository.save(mission1);
		
		Mission mission2 = new Mission();
		mission2.setLibelle("Mission 2");
		mission2.setTauxJournalier(new BigDecimal("101.90"));
		mission2.setDateDebut(LocalDate.of(2019, 10, 1));
		mission2.setDateFin(LocalDate.of(2019, 12, 12));
		this.missionRepository.save(mission2);
		

		Mission mission3 = new Mission();
		mission3.setLibelle("Mission 3");
		mission3.setTauxJournalier(new BigDecimal("100.50"));
		mission3.setDateDebut(LocalDate.of(2019, 10, 1));
		mission3.setDateFin(LocalDate.of(2019, 12, 12));
		this.missionRepository.save(mission3);


		Mission mission4 = new Mission();
		mission4.setLibelle("Mission 4");
		mission4.setTauxJournalier(new BigDecimal("101.90"));
		mission4.setDateDebut(LocalDate.of(2019, 8, 1));
		mission4.setDateFin(LocalDate.of(2019, 12, 19));
		this.missionRepository.save(mission4);
		
		
		
	}
}
