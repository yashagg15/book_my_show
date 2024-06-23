package com.book.my.show.yash.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"shows"}, callSuper = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 47L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String userName;

    String password;

    //	@OneToMany(fetch = FetchType.EAGER)//remove cascade and store in db before passing here
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "user")
    List<Ticket> tickets = new ArrayList<>();//TODO : change to Enum and inside enum store List<Integer> ticket id,
    // so that every time we can easily add new ticket
}
