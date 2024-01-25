package ua.shop.backInTime.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.shop.backInTime.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
