package ua.shop.backintime.user.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.shop.backintime.utils.UserRole;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String username;
    private String email;
    private LocalDate lastUpdatedDate;
    private LocalDate createdDate;
    private Set<UserRole> roles = new HashSet<>();
}