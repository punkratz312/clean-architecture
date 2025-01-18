package com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart.product;

import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.product.FindProductsUseCase;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.Product;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import static com.poutcek.tutor.clean.architecture.shop.drivers.in.rest.cart.common.ControllerCommons.clientErrorException;

/**
 * REST controller for all product use cases.
 *
 * @author Sven Woltmann
 */
@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class FindProductsController {

  private final FindProductsUseCase findProductsUseCase;

  public FindProductsController(FindProductsUseCase findProductsUseCase) {
    this.findProductsUseCase = findProductsUseCase;
  }

  @GET
  public List<ProductInListWebModel> findProducts(@QueryParam("query") String query) {
    if (query == null) {
      throw clientErrorException(Response.Status.BAD_REQUEST, "Missing 'query'");
    }

    List<Product> products;

    try {
      products = findProductsUseCase.findByNameOrDescription(query);
    } catch (IllegalArgumentException e) {
      throw clientErrorException(Response.Status.BAD_REQUEST, "Invalid 'query'");
    }

    return products.stream().map(ProductInListWebModel::fromDomainModel).toList();
  }
}
