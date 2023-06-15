package org.itstep.many_to_many_uni;

import org.itstep.many_to_one_bi.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
