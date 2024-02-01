package ua.shop.backInTime.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ua.shop.backInTime.user.RoleEntity;
import ua.shop.backInTime.utils.UserRole;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    Optional<RoleEntity> findByName(UserRole name);

    @Query("FROM RoleEntity re WHERE re.name IN :names")
    Set<RoleEntity> findByNames(@Param("names") Collection<UserRole> names);
}