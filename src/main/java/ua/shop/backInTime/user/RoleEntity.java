package ua.shop.backInTime.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ua.shop.backInTime.utils.UserRole;

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
    private UserRole roleName;

    public RoleEntity() {}

    public RoleEntity(UserRole role) {
        this.roleName = role;
    }
}
