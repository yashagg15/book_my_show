package com.book.my.show.yash.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"screens"})
@AllArgsConstructor
@Builder
@Entity
@Table(name = "theatres")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Theatre extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 45L;

    String theaterName;

    @OneToMany(mappedBy = "theatre")// + 1 dao method
    @JsonIgnore
    List<Screen> screens = new ArrayList<>();

    //other metadata
}
