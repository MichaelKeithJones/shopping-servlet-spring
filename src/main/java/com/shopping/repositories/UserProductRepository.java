package com.shopping.repositories;

import com.shopping.models.*;
import org.springframework.data.jpa.repository.*;

public interface UserProductRepository  extends JpaRepository<UserProduct, Long> {}