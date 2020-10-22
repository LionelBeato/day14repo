package com.wozu.day14.Service;

import com.wozu.day14.Model.Athlete;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface AthleteService {

    Optional<Athlete> getAthleteById(Long id);
    Athlete getAthleteByFirstName(String firstName);
    void saveAthlete(Athlete athlete);
    void removeAthlete(Long id);

}
