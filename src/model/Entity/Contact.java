package model.Entity;

import javax.persistence.*;

@Embeddable
public class Contact {
	
	@Column( nullable = true, length = 50)
	private String telephone;
	
	@Column( nullable = true)
	private String street;
	
	@Column( nullable=true)
	private String city;
	
	@Column( nullable = true, name = "code_postal")
	private String codePostal;
	
	@Column( nullable = false , unique = true )
	private String courriel;
	
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.rue = rue;
	}
	
		public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		city = city;
	}


	
	
}
