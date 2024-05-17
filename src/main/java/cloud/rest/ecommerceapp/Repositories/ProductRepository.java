package cloud.rest.ecommerceapp.Repositories;

import cloud.rest.ecommerceapp.Instances.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // No additional methods needed here, as JpaRepository provides CRUD operations out of the box
}
