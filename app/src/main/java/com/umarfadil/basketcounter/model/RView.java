package com.umarfadil.basketcounter.model;

/**
 * Created by alex on 07/05/17.
 */

public class RView {
    private String name;
    private String keterangan;
    private int image;

    public RView(String name, String keterangan, int image) {
        this.name = name;
        this.keterangan = keterangan;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
