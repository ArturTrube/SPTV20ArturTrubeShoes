/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Arthur
 */
public class Shoes {
    private String shoesName;
    private String makers;
    private int releaseYear;

    public String getShoesName() {
        return shoesName;
    }

    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }

    public String getMakers() {
        return makers;
    }

    public void setMakers(String makers) {
        this.makers = makers;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
 @Override
    public String toString() {
        return "Shoes{" + "bookName=" + shoesName + ", authors=" + makers + ", releaseYear=" + releaseYear + '}';
}
}
