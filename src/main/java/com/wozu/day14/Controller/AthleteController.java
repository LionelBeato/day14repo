package com.wozu.day14.Controller;

import com.wozu.day14.Model.Athlete;
import com.wozu.day14.Service.AthleteService;
import com.wozu.day14.Service.AthleteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api")
public class AthleteController {

    @Autowired
    AthleteServiceImpl athleteServiceImpl;

    /*
     * Our get method will work by
     * having an id as an input and
     */
    @GetMapping("/get/athlete/{id}")
    public Optional<Athlete> getAthleteById(@PathVariable Long id){
        return athleteServiceImpl.getAthleteById(id);
    }

    //save method
    @PostMapping("/post/athlete")
    public String saveAthlete(@RequestBody Athlete athlete){
        athleteServiceImpl.saveAthlete(athlete);
        return "athlete saved";
    }

    // update method
    @PutMapping("/put/athlete/{id}")
    public Optional<Athlete> updateAthlete(@RequestBody Athlete newAthlete, @PathVariable Long id){
        return athleteServiceImpl.updateAthlete(newAthlete, id);
    }


    // delete method

    @DeleteMapping("/delete/athlete/{id}")
    public String deleteAthlete(@PathVariable Long id){
        athleteServiceImpl.removeAthlete(id);
        return "athlete deleted";
    }

}
