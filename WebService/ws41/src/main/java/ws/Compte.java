package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

//lorsque JaxB va convertir un objet compte en XML va donner un élément XML appelé compte
@XmlRootElement(name = "compte")

//Les annotations de JaxB vont etre appliquées sur les champs : les attributs  et non ps sur les getters
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;

    //lorsque JaxB va sérialiser l'objet compte le convertir en XML va ignorer cet attribut date
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
