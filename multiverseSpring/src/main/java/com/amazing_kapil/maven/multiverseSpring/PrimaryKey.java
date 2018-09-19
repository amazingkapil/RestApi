package com.amazing_kapil.maven.multiverseSpring;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrimaryKey implements Serializable{
	

	@Column(name="Family_Id")
	public int FamilyId;
	
	@Column(name="Universe_Id")
	public int UniverseId;
	
	public PrimaryKey(int universeId, int familyId) {
		UniverseId = universeId;
		FamilyId = familyId;
	}

	public PrimaryKey() {
	}
	
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

	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrimaryKey)) return false;
        PrimaryKey that = (PrimaryKey) o;
        return Objects.equals(getUniverseId(), that.getUniverseId()) &&
                Objects.equals(getFamilyId(), that.getFamilyId());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getUniverseId(), getFamilyId());
    }
}

