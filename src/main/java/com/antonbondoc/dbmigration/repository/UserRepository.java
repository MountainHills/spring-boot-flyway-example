package com.antonbondoc.dbmigration.repository;

import com.antonbondoc.dbmigration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
