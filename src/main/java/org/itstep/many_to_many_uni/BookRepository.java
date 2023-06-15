package org.itstep.many_to_many_uni;

import org.itstep.many_to_one_bi.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
