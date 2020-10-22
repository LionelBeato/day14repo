package com.wozu.day14.Repo;

import com.wozu.day14.Model.Athlete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepo extends CrudRepository<Athlete, Long> {

}
