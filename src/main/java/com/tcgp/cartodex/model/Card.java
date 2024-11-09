package com.tcgp.cartodex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String weakness;
    private String type;
    
    @Column(name = "rarity_type")
    private String rarityType;
    
    private String copy;
    
    private int pv;
    private int number;
    
    private Integer children; // Peut être nul (int => Integer)
    private Integer retreat;  // Peut être nul (int => Integer)
    
    @Column(name = "rarity_value")
    private int rarityValue;

    private String image;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarityType() {
        return rarityType;
    }

    public void setRarityType(String rarityType) {
        this.rarityType = rarityType;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Integer getRetreat() {
        return retreat;
    }

    public void setRetreat(Integer retreat) {
        this.retreat = retreat;
    }

    public int getRarityValue() {
        return rarityValue;
    }

    public void setRarityValue(int rarityValue) {
        this.rarityValue = rarityValue;
    }

    public String getimage() {
        return image;
    }

    public void setimage(String image) {
        this.image = image;
    }
}
