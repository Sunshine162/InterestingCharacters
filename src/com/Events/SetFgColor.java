package com.Events;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.Operate.MyView;



public class SetFgColor implements ItemListener {
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.SELECTED){
			String s = (String) MyView.jcb1.getSelectedItem();
			
			switch(s) 
			{
			case "black": MyView.jtp.setForeground(Color.black); break;
			case "blue": MyView.jtp.setForeground(Color.blue); break;
			case "cyan": MyView.jtp.setForeground(Color.cyan); break;
			case "darkgray": MyView.jtp.setForeground(Color.darkGray); break;
			case "gray": MyView.jtp.setForeground(Color.gray); break;
			case "green": MyView.jtp.setForeground(Color.green); break;
			case "lightgray": MyView.jtp.setForeground(Color.lightGray); break;
			case "magenta": MyView.jtp.setForeground(Color.magenta); break;
			case "orange": MyView.jtp.setForeground(Color.orange); break;
			case "pink": MyView.jtp.setForeground(Color.pink); break;
			case "red": MyView.jtp.setForeground(Color.red); break;
			case "white": MyView.jtp.setForeground(Color.white); break;
			case "yellow": MyView.jtp.setForeground(Color.yellow); break;
			}
		}
	}
	
}
