package org.athenea.repositories;

import org.athenea.model.CourseOrganizations;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseOrganizationsRepository extends MongoRepository<CourseOrganizations, String> {
    public CourseOrganizations findByTitle(String title);

}
