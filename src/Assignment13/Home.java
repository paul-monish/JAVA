package Assignment13;

import java.applet.Applet;
import java.awt.*;
public class Home extends Applet implements Runnable
{
    boolean flag;
    Thread t;
    public void start()
    {
        t=new Thread(this);
        t.start();
        flag=true;
    }//End of start ()
    public void run()
    {
        while(true)
        {
            try
            {
                if(flag)
                    flag=false;
                else
                    flag=true;
                t.sleep(1000);
                repaint();
            } //End of try block
            catch(Exception e)

            { }
        } //End of While
    }//End of run ()
    public void init(){
        setSize(700,700);
    }
    public void paint(Graphics g)
    {
        /*for house*/
        int x[] = {300,400,500};
        int y[] = {300,200,300};
        g.drawPolygon(x, y, 3);
        g.setColor(new Color(150,150,150));
        g.fillPolygon(x, y,3);
        g.drawRect(300,300,200,100);
        g.setColor(Color.yellow);
        g.fillRect(300,300,200,100);
        if(flag)
        {

//for Closed door

            g.drawRect(375,350,50,50);//draw rectangle
            g.setColor(new Color(120,0,0));//boundary color of rectangle
            g.fillRect(375,350,50,50);//fill rectangle
            g.setColor(Color.black);//fill with black color
            g.drawLine(400,350,400,400);//draw line within rectangle

        } //End of if
        else
        {

//for open door

            g.drawRect(375,350,50,50);
            g.setColor(Color.black);
            g.fillRect(375,350,50,50);//for empty space between open doors
            int x1[] = {375,390,390,375,375};
            int y1[] = {350,360,390,400,350};
            g.setColor(new Color(120,0,0));
            g.fillPolygon(x1,y1,5);//for left door
            int x2[] = {425,410,410,425,425};
            int y2[] = {350,360,390,400,350};

            g.setColor(new Color(120,0,0));//for right door
            g.fillPolygon(x2,y2,5);

        }
    }
}
