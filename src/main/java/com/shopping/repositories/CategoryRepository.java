package com.shopping.repositories;

import com.shopping.models.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {}
