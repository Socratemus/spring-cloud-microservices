package ro.microservices.checkout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.microservices.checkout.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
