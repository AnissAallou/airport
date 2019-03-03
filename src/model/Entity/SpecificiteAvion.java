package model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specificite_avion")
public class SpecificiteAvion {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45,  nullable = false)
	private String marque;
	
	@Column(length = 45,  nullable = false)
	private String type;
	
	@Column(length = 45 ,  name = "passager_max")
	private int passagerMax;
	
	@Column(length = 45 ,  name = "volume_reservoir")
	private int volumeReservoir;
	
	@Column(length = 45, name = "consommationMoyenne")
	private int consommationMoyenne;

	@Column(length = 45, name = "surConsommation")
	private int surConsommation;
	
	public int getId() {
		return id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPassagerMax() {
		return passagerMax;
	}

	public void setPassagerMax(int passagerMax) {
		this.passagerMax = passagerMax;
	}

	public int getVolumeReservoir() {
		return volumeReservoir;
	}

	public void setVolumeReservoir(int volumeReservoir) {
		this.volumeReservoir = volumeReservoir;
	}

	public int getConsommationMoyenne() {
		return consommationMoyenne;
	}

	public void setConsommationMoyenne(int consommationMoyenne) {
		this.consommationMoyenne = consommationMoyenne;
	}

	public int getSurconsommation() {
		return surconsommation;
	}

	public void setSurconsommation(int surconsommation) {
		this.surconsommation = surconsommation;
	}


	
	
	
	
	
	
}
