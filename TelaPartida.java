import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

//falta os imports e estÃ¡ incompleto por enquanto

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
     int cont=0; 
     boolean mouseP = false; 
     
     Border borda = BorderFactory.createLineBorder(Color.WHITE, 4);
  
      public  TelaPartida(){ 
    	  
    	      Cartas carta = new Cartas();
  
              painel = new JPanel(); 
              painel.setLayout(new BorderLayout()); 
              painel.setBackground(azulc); 
              painel.setBorder(borda);
  
              perg = new JLabel("Desejo mostrar uma mensagem na tela, qual comando devo usar?"); 
              perg.setFont(fonte1); 
              perg.setForeground(Color.WHITE); 
              painel.add(perg, BorderLayout.CENTER);
           //   painel.add(perg); 
  
              imFor = new ImageIcon(getClass().getResource("for.png")); 
              imaFor = new JLabel(imFor); 
              imaFor.addMouseListener(carta.po);
       /*   imaFor.addMouseListener(new MouseListener(){ 
  
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaFor.setBounds(1235,740-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaFor.setBounds(1235,740,170,300); 
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaFor.setBounds(875,540,170,300); 
  
  
                         } 
  
  
              }); */
  
              imif = new ImageIcon(getClass().getResource("if.png")); 
              imaIf = new JLabel(imif); 
              imaIf.addMouseListener(carta.po);
              /* imaIf.addMouseListener(new MouseListener(){ 
  
        	          public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaIf.setBounds(1235,740-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaIf.setBounds(1235,740,170,300); 
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaIf.setBounds(875,540,170,300); 
                                 } 
 });  */
  
              imif = new ImageIcon(getClass().getResource("if.png")); 
              imaIf = new JLabel(imif); 
              imaIf.addMouseListener(carta.po);
              /*imaIf.addMouseListener(new MouseListener(){ 
  
        	  /*  public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaIf.setBounds(1235,740-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaIf.setBounds(1235,740,170,300); 
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
 } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaIf.setBounds(875,540,170,300); 
  
  
                         } 
  
  
              }); */
  
              include = new ImageIcon(getClass().getResource("include.png")); 
              imaInclude = new JLabel(include); 
              imaInclude.addMouseListener(carta.po);
              /*      imaInclude.addMouseListener(new MouseListener(){ 
  
                      /*   public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaInclude.setBounds(1235,740-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaInclude.setBounds(1235,740,170,300); 
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaInclude.setBounds(875,540,170,300); 
  
  
                         } 
  
  
              }); */
  
              scanf = new ImageIcon(getClass().getResource("scanf.png")); 
              imaScanf = new JLabel(scanf); 
              imaScanf.addMouseListener(carta.po);
              /*  imaScanf.addMouseListener(new MouseListener(){ 
  
                    /*     public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaScanf.setBounds(1235,740-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaScanf.setBounds(1235,740,170,300); 
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
                          
                         public void mouseExit(MouseEvent args0){ 
                          
                          
                          
                         } 
                          
                         public void mousePressed(MouseEvent args0){ 
                          
                         mouseP = true; 
  
                         } 
                          
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaScanf.setBounds(875,540,170,300); 
  
  
                         }

						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						} 
  
  
              }); */
  
              imPrintf = new ImageIcon(getClass().getResource("printf.png")); 
              imaPrintf = new JLabel(imPrintf);
              imaPrintf.addMouseListener(carta.po);
              /* imaPrintf.addMouseListener(new MouseListener(){ 
  
                /*         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaPrintf.setBounds(1235,740-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaPrintf.setBounds(1235,740,170,300); 
                              } 
                         } 
                          
                 @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaPrintf.setBounds(875,420,170,300); 
  
  
                         } 
  
  
              }); */
  
              Container cont = getContentPane(); 
              cont.setBackground(azul); 
  
  
              cont.add(painel); 
              cont.add(imaFor); 
              cont.add(imaIf); 
              cont.add(imaInclude); 
              cont.add(imaScanf); 
              cont.add(imaPrintf); 
  
              painel.setBounds(520,50,800,200); 
              //perg.setBounds(20,50,900,100); 
              imaIf.setBounds(695,740,170,300); 
              imaInclude.setBounds(515,740,170,300); 
              imaFor.setBounds(875,740,170,300); 
              imaScanf.setBounds(1055,740,170,300); 
              imaPrintf.setBounds(1235,740,170,300); 
  
 new Mover().start(); 
       setSize(dimensao); 
       setLayout(null); 
       setVisible(true); 
  
  
 } 
      
      
      private class Cartas{
    	  
    	  CartasMovem po = new CartasMovem();
    	  
    	  private class CartasMovem implements MouseListener {
    	  
  
	    	  public void mouseClicked(MouseEvent arg0){ 
	    		  
	    		  if(arg0.getSource() == imaPrintf) {
	    			  
	                  cont++; 
	                  imaPrintf.setBounds(1235,740-100,170,300); 
	                  if (cont >=2){ 
	                	  
	                     imaPrintf.setBounds(1235,740,170,300); 
	                  }
	    		  } else if(arg0.getSource() == imaScanf){
	    			  
	    			  cont++; 
	                  imaScanf.setBounds(1235,740-100,170,300); 
	                  if (cont >=2){ 
	                    	  
	                     imaScanf.setBounds(1235,740,170,300); 
	                  } 
	    		  } else if(arg0.getSource() == imaInclude){
	    			  
	    			  cont++; 
	                  imaScanf.setBounds(1235,740-100,170,300); 
	
	                      if (cont >=2){ 
	                    	  
	                         imaScanf.setBounds(1235,740,170,300); 
	    		          }
	    		  } else if (arg0.getSource() == imaIf){
	    			  
	    			  cont++; 
	                  imaIf.setBounds(1235,740-100,170,300); 
	
	                      if (cont >=2){ 
	                    	  
	                          imaIf.setBounds(1235,740,170,300); 
	                      } 
	    		  } else if(arg0.getSource() == imaFor) {
	    			  
	    			  cont++; 
	                  imaFor.setBounds(1235,740-100,170,300); 
	
	                      if (cont >=2){ 
	                    	  
	                         imaFor.setBounds(1235,740,170,300); 
	                      } 	  
	    		  }                         
	      } 
	       
	      public void mouseEntered(MouseEvent arg0) { 
	              // TODO Auto-generated method stub 
	    	  
	    	  if(arg0.getSource() == imaFor) {
	    		  
	    		  
	    	  } else if(arg0.getSource() == imaPrintf) {
	    		  
	    		  
	    		  
	    	  } else if(arg0.getSource() == imaInclude) {
	    		  
	    		  
	    	  } else if(arg0.getSource() == imaIf) {
	    		      		  
	    	  } else if(arg0.getSource() == imaScanf) {
	    		  
	    	  }
		
	      } 
	
	      public void mouseExited(MouseEvent arg0) { 
	              // TODO Auto-generated method stub
	    	  
	if(arg0.getSource() == imaFor) {
	    		  
	    		  
	    	  } else if(arg0.getSource() == imaPrintf) {
	    		  
	    		  
	    		  
	    	  } else if(arg0.getSource() == imaInclude) {
	    		  
	    		  
	    	  } else if(arg0.getSource() == imaIf) {
	    		      		  
	    	  } else if(arg0.getSource() == imaScanf) {
	    		  
	    	  }
	
	      } 
	
	      public void mousePressed(MouseEvent arg0) { 
	              
	              
	              if(arg0.getSource() == imaFor) {
	            	  
	            	  mouseP = true;
	        		  
	        		  
	        	  } else if(arg0.getSource() == imaPrintf) {
	        		  
	        		  mouseP = true;
	        		  
	        	  } else if(arg0.getSource() == imaInclude) {
	        		  
	        		  mouseP = true;
	        		  
	        		  
	        	  } else if(arg0.getSource() == imaIf) {
	        		  
	        		  mouseP = true;
	        		      		  
	        	  } else if(arg0.getSource() == imaScanf) {
	        		  
	        		  mouseP = true;
	        		  
	        	  }
	             
	      } 
	
	      public void mouseReleased(MouseEvent arg0) { 
	              // TODO Auto-generated method stub 
	             
	    	  	if(arg0.getSource() == imaFor) {
	    		  
	    		  
	    	  } else if(arg0.getSource() == imaPrintf) {
	    		 	  
	    		  
	    	  } else if(arg0.getSource() == imaInclude) {
	    		  
	    		  
	    	  } else if(arg0.getSource() == imaIf) {
	    		      		  
	    	  } else if(arg0.getSource() == imaScanf) {
	    		  
	    	  }
	
	     }  
	    	  
      }  
  }
  
      public class Mover extends Thread{ 
              public void run(){ 
                      while(true){ 
                              try{ 
                                      sleep(10); 
                              }catch(Exception erro){} 
                              if(mouseP){ 
                                      Point ponto = getMousePosition(); 
                                             if(cont >= 2){ 
                                                     int x = 1235; 
                                                     int y = 740; 
                                                     imaPrintf.setBounds(ponto.x-85,ponto.y-150,170,300); 
                                             } 
  
                              } 
                      } 
              } 
      } 
      
      
     public static void main (String[]args){ 
        TelaPartida ex = new TelaPartida(); 
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        } 
         
 } 
