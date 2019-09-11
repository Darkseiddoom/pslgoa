package com.springmvcone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResourceController {
	
	private List<Product> products =new ArrayList<>();
	public ProductResourceController() {
		products.add(new Product("1","pen",100));
		products.add(new Product("2","pencil",80));
	}
 //@RequestMapping(path="/products",method=RequestMethod.GET)
	@GetMapping("/products")
 public List<Product> getProducts(){
	 return products;
 }
	
@PostMapping("/products")
public void add(@RequestBody Product p)
{
	products.add(p);
}

@DeleteMapping("/products/{code}")
public void delete(@PathVariable("code") String code)
{
    List<Product> product =new ArrayList<>();
	for(Product p:products)
	{
		if(code.equals(p.getCode()))
			product.add(p);
				
	}
	products.removeAll(product);
}
 
@PutMapping("/products/{code}")
public void update(@PathVariable("code") String code,@RequestBody Product e)
{     List<Product> product =new ArrayList<>();
		for(Product p:products)
		{
			if(code.equals(p.getCode()))
			{
				product.add(p);
				break;
			}
					
		}
		products.removeAll(product);
		products.add(new Product(code,e.getName(),e.getPrice()));
}
}
