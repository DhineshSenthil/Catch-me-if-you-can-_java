// Ball game
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
class BallGame extends Frame implements MouseMotionListener{

//for circle
    int circleX=200,circleY=200,circleRadius=20;
//for mouse
    BallGame(){
        addMouseMotionListener(this);
        setSize(400,400);
        setLayout(null);
        setTitle("BallGame");
        setVisible(true);

    }
//for paint the circle
    public  void paint(Graphics g ){
        super.paint(g);//call paint from Frame class
        g.setColor(Color.red);
        g.fillOval(circleX,circleY,2*circleRadius,2*circleRadius);
    }
    @Override
    public void mouseDragged(MouseEvent e){

    }
    @Override
    public void mouseMoved(MouseEvent e){
//current mouse position
        int x=e.getX();
int y=e.getY();
if(x < circleX+circleRadius){
    circleX++;
}
if(x > circleX+circleRadius){
    circleX--;
}
if(y < circleRadius)
{
    circleY++;

}
if(y > circleRadius)
{
    circleY--;
}
//for painting at new position
repaint();
    }

    public static void main(String[] args) {
        new BallGame();
    }


}
