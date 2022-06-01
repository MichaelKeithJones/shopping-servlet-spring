package com.shopping.repositories;

import com.shopping.models.*;
import org.springframework.data.jpa.repository.*;

public interface CategoryRepository  extends JpaRepository<Category, Long> {}
