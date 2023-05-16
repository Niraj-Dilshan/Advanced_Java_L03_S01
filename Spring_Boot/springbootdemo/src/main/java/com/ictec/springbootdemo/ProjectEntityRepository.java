package com.ictec.springbootdemo;

import org.springframework.data.repository.CrudRepository;

public interface ProjectEntityRepository extends CrudRepository<ProjectEntity, Integer> {
}
