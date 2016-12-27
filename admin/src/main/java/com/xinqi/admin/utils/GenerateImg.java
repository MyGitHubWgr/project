package com.xinqi.admin.utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by dell on 2016/8/25.
 */
@Component
public class GenerateImg {

    private static final int HEIGHT = 100,WIDTH = 500;

    public String getImageString() {
        return imageString;
    }

    public void setImageString(String imageString) {
        this.imageString = imageString;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    private String imageString,randomString;

    private double rand;
    public GenerateImg(){
        rand = Math.random();
    }

    public BufferedImage createImage(){
        System.out.println(rand);
        BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.gray);
        g.fillRect(0,0,WIDTH,HEIGHT);
        g.setColor(Color.RED);
        g.drawString("nihao",10,10);
        return image;
    }
}
