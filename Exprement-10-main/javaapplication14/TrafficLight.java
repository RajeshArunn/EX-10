
package javaapplication14;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
class App extends JFrame implements ItemListener{
    JFrame actualWindow;
    JPanel messageContainer, lightsContainer;
    JLabel message;
    ButtonGroup btn_group;
    JRadioButton r, y, g;
    App()
    {
Font f=new Font("Verdana",Font.BOLD, 30);
actualWindow=new JFrame("Traffic Lights");
messageContainer=new JPanel();
lightsContainer=new JPanel();
message=new JLabel("Select Light");
btn_group=new ButtonGroup();
r =new JRadioButton("Red");
y =new JRadioButton("Yellow");
g =new JRadioButton("Green");
actualWindow.setLayout(new GridLayout(2, 1));
message.setFont(f);
r.setForeground(Color.RED);
y.setForeground(Color.YELLOW);
g.setForeground(Color.GREEN);
btn_group.add(r);
btn_group.add(y);
btn_group.add(g);
r.addItemListener(this);
y.addItemListener(this);
g.addItemListener(this);
messageContainer.add(message);
lightsContainer.add(r);
lightsContainer.add(y);
lightsContainer.add(g);
actualWindow.add(messageContainer);
actualWindow.add(lightsContainer);
actualWindow.setSize(300, 200);
actualWindow.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent ie)
    {
JRadioButton selected = (JRadioButton) ie.getSource();
String textOnButton = selected.getText();
if(textOnButton.equals("Red"))
        {
            message.setForeground(Color.RED);
            message.setText("STOP");
        }  
        else if(textOnButton.equals("Yellow"))
        {
            message.setForeground(Color.YELLOW);
            message.setText("READY");
}
        else
        {
            message.setForeground(Color.GREEN);
            message.setText("GO");
        }
    }
}
public class TrafficLight
{

    public static void main(String[] args)
    {
new App();
    }

}
