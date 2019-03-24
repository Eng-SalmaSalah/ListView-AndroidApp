package com.salma.customlistviewlow_performance;

public class Mad {
    int imageID;
    String name;
    String desc;

    public Mad() {
        this.imageID = 0;
        this.name = null;
        this.desc = null;
    }

    public Mad(int imageID, String name, String desc) {
        this.imageID = imageID;
        this.name = name;
        this.desc = desc;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "name: " + name  + ", desc: " + desc ;
    }
}
