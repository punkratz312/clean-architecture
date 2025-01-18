package com.potucek.shop.drivers.in.rest.cart.persistence.jpa;

import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence.CartRepository;
import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.Optional;

/**
 * Persistence adapter: Stores carts via JPA in a database.
 *
 * @author Sven Woltmann
 */
public class JpaCartRepository implements CartRepository {

  private final EntityManagerFactory entityManagerFactory;

  public JpaCartRepository(EntityManagerFactory entityManagerFactory) {
    this.entityManagerFactory = entityManagerFactory;
  }

  @Override
  public void save(Cart cart) {
    try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
      entityManager.getTransaction().begin();
        entityManager.merge(com.potucek.shop.drivers.in.rest.cart.persistence.jpa.CartMapper.toJpaEntity(cart));
      entityManager.getTransaction().commit();
    }
  }

  @Override
  public Optional<Cart> findByCustomerId(CustomerId customerId) {
    try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
        com.potucek.shop.drivers.in.rest.cart.persistence.jpa.CartJpaEntity cartJpaEntity =
                entityManager.find(com.potucek.shop.drivers.in.rest.cart.persistence.jpa.CartJpaEntity.class,
                        customerId.value());
        return com.potucek.shop.drivers.in.rest.cart.persistence.jpa.CartMapper.toModelEntityOptional(cartJpaEntity);
    }
  }

  @Override
  public void deleteByCustomerId(CustomerId customerId) {
    try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
      entityManager.getTransaction().begin();

        com.potucek.shop.drivers.in.rest.cart.persistence.jpa.CartJpaEntity cartJpaEntity =
                entityManager.find(com.potucek.shop.drivers.in.rest.cart.persistence.jpa.CartJpaEntity.class,
                        customerId.value());

      if (cartJpaEntity != null) {
        entityManager.remove(cartJpaEntity);
      }

      entityManager.getTransaction().commit();
    }
  }
}
