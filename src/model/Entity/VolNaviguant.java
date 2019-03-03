package model.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VolNaviguant implements Serializable{
		
		// vol = post
	
	    @Column(name = "id_vol")
	    private int idVol;
	 
	    @Column(name = "id_naviguant")
	    private int idNaviguant;
	    
	    public VolNaviguant() {}
	    
	    public VolNaviguant(int idVol,int idNaviguant) {
	        this.idVol = idVol;
	        this.idNaviguant = idNaviguant;
	    }
    
	    @Override
	    public boolean equals(Object n) {
	        if (this == n) return true;
	 
	        if (n == null || getClass() != n.getClass())
	            return false;
	 
	        VolNaviguant that = (VolNaviguant) n;
	        return Objects.equals(idVol, that.idVol) &&
	               Objects.equals(idNaviguant, that.idNaviguant);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(idVol, idNaviguant);
	    }
	    
}
