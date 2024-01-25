package ua.shop.backInTime.user;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String password;

    public User() {}

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
