package aa;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Musica {

   static Clip clipM;
   AudioInputStream sound;
   
   Musica( ){
	   
	  
   }
   
   
     public void play(String num){
    	 
    	 
    	 
    	   try{
    		   
    		   if(num.equals("a")){
    		      
    	       AudioInputStream sound = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("Piano_a.wav"));
    	       
    		   } else if(num.equals("b")){
    			    
    		    AudioInputStream sound = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("Piano_b.wav"));
    		   } else if(num.equals("c")){
    			   
    			   AudioInputStream sound = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("Piano_c.wav"));  
    		   }
    		   
    		   
    	       clipM = AudioSystem.getClip();
    	       clipM.open(sound);
    	       } catch (Exception e){

    	    	   JOptionPane.showMessageDialog(null, "x");
    	       }	   
    	   	   clipM.setFramePosition(0);
    	   	   clipM.start();
    
     }

   
     
    
   }
