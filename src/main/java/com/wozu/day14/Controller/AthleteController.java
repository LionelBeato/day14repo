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

    //get method
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

}
