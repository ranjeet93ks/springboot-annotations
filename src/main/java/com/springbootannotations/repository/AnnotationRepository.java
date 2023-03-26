package com.springbootannotations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springbootannotations.entity.Annotationns;

@Repository
public interface AnnotationRepository extends JpaRepository<Annotationns, Integer> {
}