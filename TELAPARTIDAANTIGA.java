import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

//falta os imports e estÃƒÂ¡ incompleto por enquanto

public class TelaPartida extends JFrame { 

	@@ -33,19 +35,22 @@ public class TelaPartida extends JFrame {
     private JMenuBar  barra;
     private JMenu opcao;
     private JMenuItem config, voltar;
     int cont=0; 

     boolean mouseP = false; 

      public TelaPartida(){ 



    	  barra = new JMenuBar();  
          setJMenuBar(barra);  
          opcao = new JMenu("Opções");  

          config = new JMenuItem("Configurações");  
          voltar = new JMenuItem("Voltar");  

          voltar.addActionListener(  
	@@ -73,73 +78,55 @@ public void actionPerformed(ActionEvent e) {
              perg.setForeground(Color.WHITE); 
              painel.add(perg); 
              int x = 0, y = 0;
              imFor = new ImageIcon(getClass().getResource("for.png")); 
              imaFor = new JLabel(imFor); 
          imaFor.addMouseListener(new MouseListener(){ 

              int x  = 875;
              int y = 740;

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


              }); 

              imif = new ImageIcon(getClass().getResource("if.png")); 
              imaIf = new JLabel(imif); 
          imaIf.addMouseListener(new MouseListener(){ 

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

	@@ -152,84 +139,45 @@ public void mousePressed(MouseEvent arg0) {
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaIf.setBounds(875,540,170,300); 
                                 } 
 }); 

              imif = new ImageIcon(getClass().getResource("if.png")); 
              imaIf = new JLabel(imif); 
          imaIf.addMouseListener(new MouseListener(){ 



              int x  = 695;
              int y = 740;

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


              }); 

              include = new ImageIcon(getClass().getResource("include.png")); 
              imaInclude = new JLabel(include); 
          imaInclude.addMouseListener(new MouseListener(){ 

              int x  = 515;
              int y = 740;

                         public void mouseClicked(MouseEvent arg0) { 
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

	@@ -242,7 +190,7 @@ public void mousePressed(MouseEvent arg0) {
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaInclude.setBounds(875,540,170,300); 


                         } 
	@@ -254,31 +202,32 @@ public void mouseReleased(MouseEvent arg0) {
              imaScanf = new JLabel(scanf); 
          imaScanf.addMouseListener(new MouseListener(){

                         int x  = 1055;
                         int y = 740;

                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaScanf.setBounds(1235,740-100,170,300); 

                                     if (cont >=2){ 
                                   imaScanf.setBounds(1235,740,170,300); 
                              } 

                         } 

                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 



                         } 

                         public void mouseExit(MouseEvent args0){ 



                         } 

                         public void mousePressed(MouseEvent args0){ 

	@@ -290,46 +239,49 @@ public void mousePressed(MouseEvent args0){
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaScanf.setBounds(875,540,170,300); 


                         }

						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub

						} 


              }); 

              imPrintf = new ImageIcon(getClass().getResource("printf.png")); 
              imaPrintf = new JLabel(imPrintf); 
              imaPrintf.addMouseListener(new MouseListener(){ 

            	  int x = 1235; 
                  int  y = 740; 

                         public void mouseClicked(MouseEvent arg0) { 
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
	@@ -341,9 +293,11 @@ public void mousePressed(MouseEvent arg0) {
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaPrintf.setBounds(875,540,170,300); 


                         }


	@@ -369,73 +323,18 @@ public void mouseReleased(MouseEvent arg0) {
              imaFor.setBounds(590,400,170,300); 
              imaScanf.setBounds(760,400,170,300); 
              imaPrintf.setBounds(930,400,170,300); 

      new Mover().start(); 
      setSize(1366, 768);
      setLayout(null); 
      setVisible(true); 


 } 

      public class Mover extends Thread implements MouseListener { 
              public void run(){ 
                      while(true){ 
                              try{ 
                                      sleep(10); 
                              }catch(Exception erro){} 

                      } 


			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

				  if(mouseP){ 
                      Point ponto = getMousePosition(); 
                             if(cont >= 2){ 


                                     int x = 1235; 
                                     int y = 740; 

                                     imaPrintf.setBounds(ponto.x-85,ponto.y-150,170,300); 
                             } 

				  }             

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}



			}



      
      
      
     public static void main (String[]args){ 
        TelaPartida ex = new TelaPartida(); 
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        } 
         
 }
