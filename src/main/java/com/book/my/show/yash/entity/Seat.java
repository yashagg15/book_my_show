package com.book.my.show.yash.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {}, callSuper = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "seats")
public class Seat extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 43L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String seatType = "silver";//default value
    //other metadata GOLD, SILVER

//    @JsonProperty
//    public Long getSeatId() {
//        return super.getId();
//    }
}
