package com.amazing_kapil.maven.multiverseSpring;

//import javax.persistence.Column;
////import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
////import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name="Families_In_Universes")
public class Family {
	
//	@EmbeddedId
//    private PrimaryKey id;
	
//	public PrimaryKey getId() {
//		return id;
//	}
//
//	public void setId(PrimaryKey id) {
//		this.id = id;
//	}
	
//	@Column(name="Universe_Id")
	private int UniverseId;
	
//	@Column(name="Family_Id")
	private int FamilyId;
	
	public int getUniverseId() {
		return UniverseId;
	}

	public void setUniverseId(int universeId) {
		UniverseId = universeId;
	}

	public int getFamilyId() {
		return FamilyId;
	}

	public void setFamilyId(int familyId) {
		FamilyId = familyId;
	}
//	@Column(name="Person1Id")
	private int Person1Id;
	
//	@Column(name="Person2Id")
	private int Person2Id;
	
//	@Column(name="Person3Id")
	private int Person3Id;
	
//	@Column(name="Power")
	private int Power;
	
	public Family() {
		System.out.println("Constructor mei hu mei abhi\n");
	}
	
	public Family(int universeId, int familyId, int person1Id, int person2Id, int person3Id, int power) {
		super();
//		id = new PrimaryKey(universeId, familyId);
		UniverseId = universeId;
		FamilyId = familyId;
		Person1Id = person1Id;
		Person2Id = person2Id;
		Person3Id = person3Id;
		Power = power;
	}

	public int getPerson1Id() {
		return Person1Id;
	}
	public void setPerson1Id(int person1Id) {
		Person1Id = person1Id;
	}
	public int getPerson2Id() {
		return Person2Id;
	}
	public void setPerson2Id(int person2Id) {
		Person2Id = person2Id;
	}
	public int getPerson3Id() {
		return Person3Id;
	}
	public void setPerson3Id(int person3Id) {
		Person3Id = person3Id;
	}
	public int getPower() {
		return Power;
	}
	public void setPower(int power) {
		Power = power;
	}
}