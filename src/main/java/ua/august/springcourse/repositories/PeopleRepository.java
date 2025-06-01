package ua.august.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.august.springcourse.models.Person;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
