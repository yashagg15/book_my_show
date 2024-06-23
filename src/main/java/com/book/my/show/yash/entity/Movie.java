package com.book.my.show.yash.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {})
@AllArgsConstructor
@Builder
@Entity
@Table(name = "movies")
public class Movie extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 78L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String movieName;

    //other metadata
    Float ratings;

//    @JsonIgnore
//    @Convert(converter = MovieAttributeConvertor.class)//move to base entity and test
//    MovieAttribute movieAttribute;


}
