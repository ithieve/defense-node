package com.mygdx.project4;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class StickMan {
    protected static float xcpos = 0f;
    protected static float ycpos = 0f;
    protected static float body_length_x = 50;
    protected static float body_length_y = 170;


    protected static float[] body = new float[5]; //start end and width
    protected static float[] lhand = new float[5]; //start end and width
    protected static float[] rhand = new float[5]; //start end and width
    protected static float[] lfeet = new float[5]; //start end and width
    protected static float[] rfeet = new float[5]; //start end and width
    protected static float[] head = new float[5]; //start end and width



    StickMan(float x, float y){
        xcpos=x;
        ycpos=y;
        update();
    }

    public void draw(ShapeRenderer render){
        //draw body
        render.rectLine(
                body[0],
                body[1],
                body[2],
                body[3],
                body[4]
        );

    }

    public void pos(float x, float y){
        xcpos = x;
        ycpos = y;
        update();
    }

    private void update(){
        body[0]=xcpos; //xstart
        body[1]=ycpos-body_length_y/2; //ystart
        body[2]=xcpos; //xend
        body[3]=ycpos+body_length_y/2; //yend
        body[4]=10; //thick

        lfeet[0] = xcpos; //xstart
        lfeet[1] = body[1]; //ystart
        lfeet[2] = xcpos - 50; //xend
        //lfeet[3] = lfeet[1] -  //xend
    }

}
