package com.loda.apidocumentwithopen_api.repository;

import com.loda.apidocumentwithopen_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
