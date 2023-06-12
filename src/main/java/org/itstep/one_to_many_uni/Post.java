package org.itstep.one_to_many_uni;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @OneToMany(mappedBy="post", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
