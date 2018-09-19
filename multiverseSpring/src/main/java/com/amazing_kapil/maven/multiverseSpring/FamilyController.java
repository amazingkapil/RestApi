package com.amazing_kapil.maven.multiverseSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyController {

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//
//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
//    }
    
    @Autowired
	private FamilyDao familyDao;

	
	@GetMapping("/families")
	@ResponseBody
	public List getFamilies() {
		System.out.println("Getting the list of families: ");
		return familyDao.list();
	}
	
	@GetMapping("/family")
	@ResponseBody
	public Family getFamily() {
		System.out.println("Getting family: ");
		return familyDao.get();
	}
	
	//checking power of Families with a given ID
	@GetMapping("/families/{id}")
	public ResponseEntity checkFamily(@PathVariable("id") String param) {
		System.out.println(param);
		Long id = Long.parseLong(param);

		return new ResponseEntity(familyDao.check(id), HttpStatus.OK);
	}
	
	//balancing the powers
	@GetMapping("/familiesBalance/{id}")
	public ResponseEntity balanceFamily(@PathVariable("id") String param) {
		System.out.println(param);
		Long id = Long.parseLong(param);
		familyDao.balance(id);
		return new ResponseEntity(true, HttpStatus.OK);
	}

	@PostMapping(value = "/families")
	public ResponseEntity createFamily(@RequestBody Family family) {

		familyDao.create(family);

		return new ResponseEntity(family, HttpStatus.OK);
	}

}