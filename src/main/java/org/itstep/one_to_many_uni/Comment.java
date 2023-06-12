package org.itstep.one_to_many_uni;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;


}
