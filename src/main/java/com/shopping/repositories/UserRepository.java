package com.shopping.repositories;

import com.shopping.models.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository  extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
