package com.shopping.repositories;

import com.shopping.models.*;

import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;

import java.util.List;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    @Query(value = "select a.name from authorities a where a.id in (select ua.authority_id from user_authority ua where ua.user_id in (select u.id from users u where u.username = ?))", nativeQuery = true)
    List<String> ofUserWith(String username);
}