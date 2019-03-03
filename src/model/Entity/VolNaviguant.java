package model.Entity;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity
@Table(name = "VolNaviguant")
public class VolNaviguant {

	 @EmbeddedId
	 private IdVolNaviguant id;
	
	 @ManyToOne
	 @MapsId("idVol")
	 private Vol vol;
	 
	 @ManyToOne
	 @MapsId("navigantId")
	 private Personne personne;
	 
	 @Column(name = "prime")
	 private BigDecimal prime;
	 
	 
	    @Override
	    public boolean equals(Object n) {
	        if (this == n) return true;
	 
	        if (n == null || getClass() != o.getClass())
	            return false;
	 
	        VolNavigant that = (VolNavigant) o;
	        return Objects.equals(vol, that.vol) &&
	               Objects.equals(personne, that.personne);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(vol, personne);
	    }
	 
	 
}
