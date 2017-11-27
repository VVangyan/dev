package twostepsfromjava.cloud.mallweb;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import twostepsfromjava.cloud.productservice.Product;

import java.util.List;

/**
 * @author markeluo
 * @email luowanli881224@gmail.com
 * @date 2017/8/17
 */
@FeignClient("PRODUCT-SERVICE")
public interface ProductService {
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/products/{itemCode}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);
}
