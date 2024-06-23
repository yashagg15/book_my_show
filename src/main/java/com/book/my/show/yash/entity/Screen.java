package com.book.my.show.yash.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"shows"})
@AllArgsConstructor
@Builder
@Entity
@Table(name = "screens")
public class Screen extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 41L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="screen_id")
    private Long id;

    String screenName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "screen")
    @JsonBackReference
    List<Show> shows;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "theatre_id")
    Theatre theatre;

}
