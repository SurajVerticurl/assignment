package com.mobiles.assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController

public class MobileController {
	
	@RequestMapping("hello")
	public String hello() {
		return "Hello World!";
	}
	
	@Autowired
	private MobileService MobileService;

	@RequestMapping("/mobiles")
	public List<Mobile> getMobiles() {
		return MobileService.getMobiles();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/mobiles")
	public void addmedicine(@RequestBody Mobile Mobile) {
		MobileService.addMobile(Mobile);
	}
	
	@RequestMapping("/mobiles/{id}")
	public  Optional<Mobile> getmedicine(@PathVariable String id){
		System.out.println("Inside getmedicine");
		return MobileService.getMobile(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/mobiles/{id}")
	public void updatemedicine(@RequestBody Mobile Mobile, @PathVariable String id) {
		System.out.println("inside updatemedicine");
		MobileService.updateMobile(id, Mobile);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/mobiles/{id}")
	public void deletemedicine(@PathVariable String id){
		System.out.println("Inside deletemedicine");
		MobileService.deleteMobile(id);
	}

}
