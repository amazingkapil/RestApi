package com.amazing_kapil.maven.multiverseSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class FamilyDao {
	
	private static List<Family> families;
	{
		families = new ArrayList<Family>();
		families.add(new Family(1, 123, 12, 13, 12, 100));
		families.add(new Family(2, 123, 21, 23, 16, 90));
		families.add(new Family(3, 123, 22, 25, 17, 101));
	}
	
	public Family create(Family family) {
		families.add(family);
		System.out.println("The new family is added\n");
		return family;
	}
	
	public List list() {
		System.out.println("I am inside getmethod");
		
		return families;
	}
	public Family get() {
		Family family = new Family(1, 134, 12, 13, 12, 109);
		
		return family;
	}
	
	//check if given FamilyId have all the families with same power
	public boolean check(Long id) {

		int flag = 0;
		int power=-1;
		for (Family c : families) {
			if (c.getFamilyId() == id) {
				if( flag == 0) {
					power = c.getPower();
					flag = 1;
				}
				else if(c.getPower() != power)
					return false;
			}
		}
		return true;
	}
	
	
	//Balance Families with given familyIds 
	public void balance(Long id) {
		
		int maximum = Integer.MIN_VALUE;
		for (Family c : families) {
			if( c.getFamilyId() == id ) {
				maximum = Math.max(maximum, c.getPower());
			}
		}
		for (Family c : families) {
			if( c.getFamilyId() == id ) {
				c.setPower( maximum );
			}
		}
	}
	
}
