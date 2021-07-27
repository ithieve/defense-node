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
        render.rectLine(
                lfeet[0],
                lfeet[1],
                lfeet[2],
                lfeet[3],
                lfeet[4]
        );
        render.rectLine(
                rfeet[0],
                rfeet[1],
                rfeet[2],
                rfeet[3],
                rfeet[4]
        );
        render.rectLine(
                lhand[0],
                lhand[1],
                lhand[2],
                lhand[3],
                lhand[4]
        );
        render.rectLine(
                rhand[0],
                rhand[1],
                rhand[2],
                rhand[3],
                rhand[4]
        );

        render.circle(
                head[0],
                head[1],
                head[2]
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
        lfeet[1] = body[1]+5; //ystart
        lfeet[2] = xcpos - 50; //xend
        lfeet[3] = lfeet[1] - 100; //yend
        lfeet[4] = 10; //thick

        rfeet[0] = xcpos; //xstart
        rfeet[1] = body[1]+5; //ystart
        rfeet[2] = xcpos + 50; //xend
        rfeet[3] = rfeet[1] - 100; //yend
        rfeet[4] = 10; //thick

        lhand[0] = xcpos; //xstart
        lhand[1] = body[3]-55; //ystart
        lhand[2] = xcpos - 50; //xend
        lhand[3] = lhand[1] + 50; //yend
        lhand[4] = 10; //thick

        rhand[0] = xcpos; //xstart
        rhand[1] = body[3]-55; //ystart
        rhand[2] = xcpos + 50; //xend
        rhand[3] = rhand[1] + 50; //yend
        rhand[4] = 10; //thick

        head[0] = xcpos;
        head[1] = body[3] + 40;
        head[2] = 40;
        // shapeRenderer.rectLine(80,80,130,180, 10);
    }

    public void move(float x, float y){
        xcpos += x;
        ycpos += y;
        update();
    }

}


//stick figure old code
//        shapeRenderer.rectLine(80,80,130,180, 10);
//        shapeRenderer.rectLine(180,80, 130,180,10);
//        shapeRenderer.rectLine(130,180, 130,300,10);
//        shapeRenderer.rectLine(130,220, 80,260,10);
//        shapeRenderer.rectLine(130,220, 190,260,10);
//        shapeRenderer.circle(130,300,40);