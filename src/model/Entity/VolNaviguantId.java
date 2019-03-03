package model.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdVolNaviguant implements Serializable{
		
		// vol = post
	
	    @Column(name = "id_vol")
	    private int idVol;
	 
	    @Column(name = "id_naviguant")
	    private int idNaviguant;
	    
	    public IdVolNaviguant() {}
	    
	    public IdVolNaviguant(int idVol,int idNaviguant) {
	        this.idVol = idVol;
	        this.idNaviguant = idNaviguant;
	    }
    
	    @Override
	    public boolean equals(Object n) {
	        if (this == n) return true;
	 
	        if (n == null || getClass() != n.getClass())
	            return false;
	 
	        IdVolNaviguant that = (IdVolNaviguant) n;
	        return Objects.equals(idVol, that.idVol) &&
	               Objects.equals(idNaviguant, that.idNaviguant);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(idVol, idNaviguant);
	    }
	    
}
