package com.wozu.day14.Service;

import com.wozu.day14.Model.Athlete;
import com.wozu.day14.Repo.AthleteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AthleteServiceImpl implements AthleteService {
    
    @Autowired
    AthleteRepo athleteRepo; 
    
    @Override
    public Optional<Athlete> getAthleteById(Long id) {
        return athleteRepo.findById(id); 
    }

    @Override
    public Athlete getAthleteByFirstName(String firstName) {
        return null;
    }

    @Override
    public void saveAthlete(Athlete athlete) {
        athleteRepo.save(athlete);
    }

    @Override
    public void removeAthlete(Long id) {

    }
}
