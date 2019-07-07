package ru.springcode.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.springcode.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
