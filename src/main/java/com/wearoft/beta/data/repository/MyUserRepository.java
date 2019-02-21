package com.wearoft.beta.data.repository;

import com.wearoft.beta.data.domain.MyUser;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the MyUser entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Long> {

}
