package com.rekarcell.customcheck.Model;

/**
 * Created by mdrezaulislam on 1/29/18.
 */

public class ModelClassCheckUnchek {

    int Image;
    String Name;


    public ModelClassCheckUnchek(){

    }
    public ModelClassCheckUnchek(int image, String name) {
        Image = image;
        Name = name;

    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
