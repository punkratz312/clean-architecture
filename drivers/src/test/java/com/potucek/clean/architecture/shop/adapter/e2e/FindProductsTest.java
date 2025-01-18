//package com.potucek.clean.architecture.shop.adapter.e2e;
//
//import io.restassured.response.Response;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static com.potucek.clean.architecture.shop.adapter.in.rest.HttpTestCommons.TEST_PORT;
//import static com.potucek.clean.architecture.shop.adapter.in.rest.product.ProductsControllerAssertions.assertThatResponseIsProductList;
//import static com.poutcek.shop.drivers.out.cart.persistence.persistence.DemoProducts.COMPUTER_MONITOR;
//import static com.poutcek.shop.drivers.out.cart.persistence.persistence.DemoProducts.MONITOR_DESK_MOUNT;
//import static io.restassured.RestAssured.given;
//
//class FindProductsTest extends EndToEndTest {
//
//  @Test
//  void givenTestProductsAndAQuery_findProducts_returnsMatchingProducts() {
//    String query = "monitor";
//
//    Response response =
//        given()
//            .port(TEST_PORT)
//            .queryParam("query", query)
//            .get("/products")
//            .then()
//            .extract()
//            .response();
//
//    assertThatResponseIsProductList(response, List.of(COMPUTER_MONITOR, MONITOR_DESK_MOUNT));
//  }
//}
