package com.wozu.day14.Service;

import com.wozu.day14.Model.Athlete;

import java.util.Optional;

public interface AthleteService {

    Optional<Athlete> getAthleteById(Long id);
    Athlete getAthleteByFirstName(String firstName);
    Iterable<Athlete> getAllAthletes();
    void saveAthlete(Athlete athlete);
    Optional<Athlete> updateAthlete(Athlete newAthlete, Long id);
    void removeAthlete(Long id);

}
