package ua.shop.backintime.user;

import jakarta.persistence.*;
import lombok.*;
import ua.shop.backintime.utils.UserRole;


@Getter
@Setter
@Entity
@Table(name = "roles")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private UserRole name;

    public RoleEntity() {}

    public RoleEntity(UserRole role) {
        this.name = role;
    }
}
