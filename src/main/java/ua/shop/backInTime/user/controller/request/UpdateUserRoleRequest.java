package ua.shop.backInTime.user.controller.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import ua.shop.backInTime.utils.UserRole;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class UpdateUserRoleRequest {

    @NotEmpty
    Set<UserRole> roles = new HashSet<>();
}