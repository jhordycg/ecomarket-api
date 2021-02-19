package dev.jhordycg.ecomarket_api.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class House {

    @Id
    private String id;
    private String location;
    private String reference;
    private Boolean hasRecyclableMaterial;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Boolean getHasRecyclableMaterial() {
        return hasRecyclableMaterial;
    }

    public void setHasRecyclableMaterial(Boolean hasRecyclableMaterial) {
        this.hasRecyclableMaterial = hasRecyclableMaterial;
    }

}
