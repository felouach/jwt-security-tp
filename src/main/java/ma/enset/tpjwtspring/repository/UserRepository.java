package ma.enset.tpjwtspring.repository;

import jakarta.el.OptionalELResolver;
import ma.enset.tpjwtspring.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser,Long> {
    Optional<AppUser> findByEmail(String email);
    boolean existsByEmail(String email);
}
