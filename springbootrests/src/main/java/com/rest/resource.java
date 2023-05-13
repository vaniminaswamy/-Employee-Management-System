package com.rest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;

@RestController
public class resource {
	
	
	@RequestMapping("value")
	public List<management> getvalues()
	{
		List<management> value = new ArrayList<>();
		
		management a1 = new management();
		a1.setId(101);
		a1.setName("rahul");
		a1.setPhone("784484845");
		a1.setEmail("sam@gmail.com");
		a1.setAddress("ram nagar");
		
		a1.setId(102);
		a1.setName("satya");
		a1.setPhone("784485845");
		a1.setEmail("ram@gmail.com");
		a1.setAddress("sam nagar");
		
		return value;
	}

}
