package com.prism.mr.repository;

import com.prism.mr.model.Members;
import com.prism.mr.model.QMembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(path = "members",collectionResourceRel= "members")
public interface MembersRepository extends JpaRepository<Members,Long>,QuerydslPredicateExecutor<QMembers> {

    List<Members> findAllByEmployeeId(String employeeId);
}
