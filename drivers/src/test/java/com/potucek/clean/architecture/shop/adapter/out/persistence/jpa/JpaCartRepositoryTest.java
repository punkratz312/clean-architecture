package com.potucek.clean.architecture.shop.adapter.out.persistence.jpa;

import com.potucek.clean.architecture.shop.adapter.out.persistence.AbstractCartRepositoryTest;
import com.potucek.shop.drivers.in.rest.cart.persistence.jpa.JpaProductRepository;
import com.poutcek.shop.drivers.out.cart.persistence.persistence.jpa.EntityManagerFactoryFactory;
import com.poutcek.shop.drivers.out.cart.persistence.persistence.jpa.JpaCartRepository;
import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

class JpaCartRepositoryTest
    extends AbstractCartRepositoryTest<JpaCartRepository, JpaProductRepository> {

  private static MySQLContainer<?> mysql;
  private static EntityManagerFactory entityManagerFactory;

  @BeforeAll
  static void startDatabase() {
    mysql = new MySQLContainer<>(DockerImageName.parse("mysql:8.0"));
    mysql.start();

    entityManagerFactory =
        EntityManagerFactoryFactory.createMySqlEntityManagerFactory(
            mysql.getJdbcUrl(), "root", "test");
  }

  @Override
  protected JpaCartRepository createCartRepository() {
    return new JpaCartRepository(entityManagerFactory);
  }

  @Override
  protected JpaProductRepository createProductRepository() {
    return new JpaProductRepository(entityManagerFactory);
  }

  @AfterAll
  static void stopDatabase() {
    entityManagerFactory.close();
    mysql.stop();
  }
}
