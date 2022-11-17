/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.applet.*;
import java.awt.*;
public class Shapes extends Applet
{
   
    @Override
    public void init()
    {
setBackground(Color.white);
    }
   
    @Override
    public void paint(Graphics g)
    {
g.setColor(Color.black);
g.drawString("Square",75,200);
int x[]={50,150,150,50};
int y[]={50,50,150,150};
g.drawPolygon(x,y,4);
g.setColor(Color.yellow);
g.fillPolygon(x,y,4);
g.setColor(Color.black);
g.drawString("Circle",400,200);
g.drawOval(350,50,125,125);
g.setColor(Color.yellow);
g.fillOval(350,50,125,125);
g.setColor(Color.black);
g.drawString("Rectangle",300,380);
x=new int[]{250,450,450,250};
y=new int[]{250,250,350,350};
g.drawPolygon(x,y,4);
g.setColor(Color.yellow);
g.fillPolygon(x,y,4);
    }
}
