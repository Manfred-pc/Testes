import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//falta os imports e estÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¡ incompleto por enquanto

public class TelaPartida extends JFrame { 
  
         private static final long serialVersionUID = 1L; 
         private JLabel imaIf, imaFor,imaInclude, imaScanf, imaPrintf,perg; 
     private JPanel painel; 
     private ImageIcon imFor,imif,include, scanf, imPrintf ; 
     Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize(); 
     Color azul = new Color(18,10,143); 
     Color azulc = new Color(65,105,225); 
     Color ouro = new Color(238,201,0); 
     Font fonte1 = new Font("Arial", Font.BOLD, 24); 
     private JMenuBar  barra;
     private JMenu opcao;
     private JMenuItem config, voltar;
     MouseAdapter arrasta;


     
     boolean mouseP = false; 
  
      public TelaPartida(){ 
    	 
    	
    	  
    	 
    	  barra = new JMenuBar();  
          setJMenuBar(barra);  
          opcao = new JMenu("OpÃƒÂ§ÃƒÂµes");  
                    
          config = new JMenuItem("ConfiguraÃƒÂ§ÃƒÂµes");  
          voltar = new JMenuItem("Voltar");  
          
          voltar.addActionListener(  
         		 new ActionListener(){  
         			 public void actionPerformed(ActionEvent e) { 
         			
                         new Menu();
                         dispose();
        
         				
         			 }       
         		 });                 
          
          barra.add(opcao);  
          barra.setBackground(ouro);  
          opcao.add(config);  
          opcao.add(voltar);          
  
              painel = new JPanel(); 
              painel.setLayout(null); 
              painel.setBackground(azulc); 
  
              perg = new JLabel("Desejo mostrar uma mensagem na tela, qual comando devo usar?"); 
              perg.setFont(fonte1); 
              perg.setForeground(Color.WHITE); 
              painel.add(perg); 
              int x = 0, y = 0;
             
              
             
              imFor = new ImageIcon(getClass().getResource("for.png")); 
              
              imaFor = new JLabel(imFor); 
 arrasta= new MouseAdapter(){
            	  
            	  public void mouseDragged (MouseEvent evt){
            		  
            		  imaFor.setLocation(getMousePosition().x, getMousePosition().y-10);
            	  }
            	  
              };
              imaFor.addMouseMotionListener(arrasta);
              
              
              
       
              imif = new ImageIcon(getClass().getResource("if.png")); 
              imaIf = new JLabel(imif); 
          imaIf.addMouseListener(new MouseListener(){ 
        	  
        	  
        	     int cont=0; 
  
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaIf.setBounds(240,400-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaIf.setBounds(240,400,170,300);
                                   JOptionPane.showMessageDialog(null, "Errou");
                                   cont = 0;
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub
                        	 imaIf.setBounds(240,400-50,170,300);
  
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub
                        	 imaIf.setBounds(240,400,170,300);
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaIf.setBounds(240, 400,170,300); 
                                 } 
 }); 
  
              
              include = new ImageIcon(getClass().getResource("include.png")); 
              imaInclude = new JLabel(include); 
          imaInclude.addMouseListener(new MouseListener(){ 
        	  
        	     int cont=0; 
        	  
              int x  = 515;
              int y = 740;
  
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaInclude.setBounds(410,400 -100,170,300); 
  
                                     if (cont >=2){ 
                                   imaInclude.setBounds(410,400,170,300); 
                                   JOptionPane.showMessageDialog(null, "Errou");
                                   cont = 0;
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                        	 
                        	 imaInclude.setBounds(410,400 - 50,170,300); 
  
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                        	 
                        	 imaInclude.setBounds(410,400,170,300); 
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaInclude.setBounds(410,400,170,300); 
  
  
                         } 
  
  
              }); 
  
              scanf = new ImageIcon(getClass().getResource("scanf.png")); 
              imaScanf = new JLabel(scanf); 
          imaScanf.addMouseListener(new MouseListener(){
        	  
        	  
        	     int cont=0; 
                         int x  = 1055;
                         int y = 740;
                         
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaScanf.setBounds(760,400-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaScanf.setBounds(760,400,170,300); 
                                   JOptionPane.showMessageDialog(null, "Errou");
                                   cont = 0;
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 
                        	 imaScanf.setBounds(760,400-50,170,300);

                        	 
                         } 
                          
              
                          
                         public void mousePressed(MouseEvent args0){ 
                          
                         mouseP = true; 
  
                         } 
                          
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaScanf.setBounds(760,400,170,300); 
  
  
                         }

						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							 imaScanf.setBounds(760,400,170,300); 
						}
  
              }); 
  
              imPrintf = new ImageIcon(getClass().getResource("printf.png")); 
              imaPrintf = new JLabel(imPrintf); 
              imaPrintf.addMouseListener(new MouseListener(){ 
            	  
            	     int cont=0; 
            	  
            	  int x = 1235; 
                  int  y = 740; 
  
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaPrintf.setBounds(930,400-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaPrintf.setBounds(930,400,170,300); 
                                   JOptionPane.showMessageDialog(null, "Acertou");
                                   cont = 0;
                              } 
                         } 
                          
                 @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                	             imaPrintf.setBounds(930,400-50,170,300); 
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                        	 imaPrintf.setBounds(930,400,170,300); 
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaPrintf.setBounds(930,400,170,300); 
  
  
                                 
    
                         }
                         
                         
  
  
              }); 
  
              Container cont = getContentPane(); 
              cont.setBackground(azul); 
  
  
              cont.add(painel); 
              cont.add(imaFor); 
              cont.add(imaIf); 
              cont.add(imaInclude); 
              cont.add(imaScanf); 
              cont.add(imaPrintf); 
  
              painel.setBounds(200,50,1000,150); 
              perg.setBounds(20,50,900,100); 
              imaIf.setBounds(240,400,170,300); 
              imaInclude.setBounds(410,400,170,300); 
              imaFor.setBounds(590,400,170,300); 
              imaScanf.setBounds(760,400,170,300); 
              imaPrintf.setBounds(930,400,170,300); 
 
      setSize(1366, 768);
      setLayout(null); 
      setVisible(true); 
  
  
 } 
  
				
					  
				
			

		
     
      
      
      
     public static void main (String[]args){ 
        TelaPartida ex = new TelaPartida(); 
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        } 
         
 }
