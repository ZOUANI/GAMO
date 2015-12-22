/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hanane
 */
public class Equipement {
    private int id;
    private String nom;
    private String reference;
    private Salle salle= new Salle();
    private double qteGlobal;
    
    

    public Equipement() {
    }

    public double getQteGlobal() {
        return qteGlobal;
    }

    public void setQteGlobal(double qteGlobal) {
        this.qteGlobal = qteGlobal;
    }

    public Equipement(int id, String nom, String reference) {
        this.id = id;
        this.nom = nom;
        this.reference = reference;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    
    @Override
    public String toString() {
        return "Equipement{" + "id=" + id + ", nom=" + nom + ", reference=" + reference + '}';
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    
    
}
