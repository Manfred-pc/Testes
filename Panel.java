//fundo é um imageIcon
//faz na msm classe, mais fácil
// no construtor da classe principal, instancia Panel e add ele (na ordem)

public class Panel extends JPanel{

    public void paintComponent(Graphics g){
    
    super.paintComponent(g);
    Image img = fundo.getImage();
    g.drawnImage(img, 0,0, this);   

    }
}
