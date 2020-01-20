package dev.mission.exec;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
public class RechercherMissionParDateDebut implements Runnable {

	private MissionRepository missionRepository;

	public RechercherMissionParDateDebut(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		LocalDate dateDebutRecherche = LocalDate.of(2019, 1, 1);
		List<Mission> lDate= missionRepository.findByDateDebut(dateDebutRecherche);

		for (Mission m : lDate) {
			System.out.println(m.getLibelle());
			System.out.println(m.getTauxJournalier());
			System.out.println(m.getDateDebut());
			System.out.println(m.getDateFin());
			}
		}
	}
