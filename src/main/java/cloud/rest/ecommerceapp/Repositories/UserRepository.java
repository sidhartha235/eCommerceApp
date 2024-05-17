package cloud.rest.ecommerceapp.Repositories;

import cloud.rest.ecommerceapp.Instances.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // No additional methods needed here, as JpaRepository provides CRUD operations out of the box
}
