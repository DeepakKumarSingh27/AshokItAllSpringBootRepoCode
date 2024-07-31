package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Product;

@RestController
public class ProductRestController {

	@GetMapping(value = "/product", produces = { "application/xml", "application/json" })
	public ResponseEntity<Product> getProduct() {

		Product productObj = new Product();
		productObj.setPid(101);
		productObj.setPname("mouse");
		productObj.setPrice(400.000d);

		return new ResponseEntity<Product>(productObj, HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		Product p1 = new Product(101, "Monitor", 800.00);
		Product p2 = new Product(102, "Ram", 600.00);
		Product p3 = new Product(103, "Cpu", 1000.00);
		Product p4 = new Product(104, "Keyword", 300.00);
		List<Product> products = Arrays.asList(p1, p2, p3, p4);
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	
	
}
