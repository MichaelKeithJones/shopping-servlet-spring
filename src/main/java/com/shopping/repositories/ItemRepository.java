package com.shopping.repositories;

import com.shopping.models.*;
import org.springframework.data.jpa.repository.*;

public interface ItemRepository  extends JpaRepository<Item, Long> {}