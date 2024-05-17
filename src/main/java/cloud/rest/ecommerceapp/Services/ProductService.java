package cloud.rest.ecommerceapp.Services;

import cloud.rest.ecommerceapp.Instances.Product;
import cloud.rest.ecommerceapp.Instances.User;
import cloud.rest.ecommerceapp.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product purchaseProduct(Long id, User user) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            product.setPurchasedBy(user);
            return productRepository.save(product);
        } else {
            return null; // Handle not found
        }
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        if (productRepository.existsById(id)) {
            updatedProduct.setId(id);
            return productRepository.save(updatedProduct);
        } else {
            return null; // Handle not found
        }
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
