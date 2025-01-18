package com.poutcek.shop.drivers.out.cart.persistence.jpa;

import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.out.persistence.ProductRepository;
import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.Product;
import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.product.ProductId;
import com.poutcek.shop.drivers.out.cart.persistence.DemoProducts;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Optional;

/**
 * Persistence adapter: Stores products via JPA in a database.
 *
 * @author Sven Woltmann
 */
public class JpaProductRepository implements ProductRepository {

  private final EntityManagerFactory entityManagerFactory;

  public JpaProductRepository(EntityManagerFactory entityManagerFactory) {
    this.entityManagerFactory = entityManagerFactory;
    createDemoProducts();
  }

  private void createDemoProducts() {
    DemoProducts.DEMO_PRODUCTS.forEach(this::save);
  }

  @Override
  public void save(Product product) {
    try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
      entityManager.getTransaction().begin();
        entityManager.merge(com.poutcek.shop.drivers.out.cart.persistence.ProductMapper.toJpaEntity(product));
      entityManager.getTransaction().commit();
    }
  }

  @Override
  public Optional<Product> findById(ProductId productId) {
    try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
        com.poutcek.shop.drivers.out.cart.persistence.ProductJpaEntity jpaEntity =
                entityManager.find(com.poutcek.shop.drivers.out.cart.persistence.ProductJpaEntity.class,
                        productId.value());
        return com.poutcek.shop.drivers.out.cart.persistence.ProductMapper.toModelEntityOptional(jpaEntity);
    }
  }

  @Override
  public List<Product> findByNameOrDescription(String queryString) {
    try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
        TypedQuery<com.poutcek.shop.drivers.out.cart.persistence.ProductJpaEntity> query =
          entityManager
              .createQuery(
                  "from ProductJpaEntity where name like :query or description like :query",
                      com.poutcek.shop.drivers.out.cart.persistence.ProductJpaEntity.class)
              .setParameter("query", "%" + queryString + "%");

        List<com.poutcek.shop.drivers.out.cart.persistence.ProductJpaEntity> entities = query.getResultList();

        return com.poutcek.shop.drivers.out.cart.persistence.ProductMapper.toModelEntities(entities);
    }
  }
}
