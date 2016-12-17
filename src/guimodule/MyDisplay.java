package guimodule;

import processing.core.PApplet;

/**
 * Created by Deepak Kumar on 17/12/2016.
 */
public class MyDisplay extends PApplet{

    public void setup(){
        size(400,400);
        background(70,100,150);
    }

    public void draw(){
        fill(255,255,0);
        ellipse(200,200,300,300);
        fill(0,0,0);
        ellipse(140,150,50,70);
        ellipse(250,150,50,70);
        arc(200,260,75,75,0,PI);
    }
}
