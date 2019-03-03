package model.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "type_personnel")
public class TypePersonnel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45, nullable = true)
	private String nom;
	
	@OneToMany(mappedBy = "typePersonnel")
	private List<NonNaviguant> nonNaviguants = new ArrayList<>();
	
	@OneToMany(mappedBy = "typePersonnel")
	private List<Naviguant> naviguants = new ArrayList<>();
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NonNaviguant> getNonNaviguants() {
		return nonNaviguants;
	}

	public void setNonNavigants(List<NonNavigant> nonNavigants) {
		this.nonNavigants = nonNavigants;
	}
	
	public void addNonNaviguant(NonNaviguant nonNaviguants ) {
		this.nonNaviguants.add(nonNaviguants);
	}
	
	public List<Naviguant> getNaviguants() {
		return naviguants;
	}
	
	public void setNaviguants(List<Naviguant> naviguants) {
		this.naviguants = naviguants;
	}
	
	public void addNaviguant(Naviguant naviguants ) {
		 this.naviguants.add(naviguants);
	}
	
	
}
