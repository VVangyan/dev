package twostepsfromjava.cloud.productservice;

/**
 * @author markeluo
 * @email luowanli881224@gmail.com
 * @date 2017/8/17
 */

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品服务
 */
@RestController
@RequestMapping("/products")
public class ProductEndpoint {
    protected org.slf4j.Logger logger = LoggerFactory.getLogger(ProductEndpoint.class);

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list(){
        return  this.buildProducts();
    }

    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product detail(@PathVariable String itemCode){
        List<Product> products=this.buildProducts();
        for(Product product:products){
            if(product.getItemCode().equalsIgnoreCase(itemCode)){
                return product;
            }
        }
        return null;
    }

    /**
     * 产品列表（创建demo数据）
     * @return
     */
    protected  List<Product> buildProducts(){
        List<Product> products=new ArrayList<>();
        products.add(new Product("item-1","IPhone 7","TwoStepsFromJava",5500));
        products.add(new Product("item-2","Surface Pro 4","TwoStepsFromJava",7500));
        products.add(new Product("item-3","MacBook Pro","TwoStepsFromJava",5500));
        products.add(new Product("item-4","MacBook Air","TwoStepsFromJava",5500));
        products.add(new Product("item-5","小米5S","TwoStepsFromJava",1600));
        products.add(new Product("item-6","NOKIA 6","TwoStepsFromJava",2000));
        return products;
    }
}
















