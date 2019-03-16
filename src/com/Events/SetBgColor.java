package com.Events;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.Operate.MyView;



public class SetBgColor implements ItemListener {
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.SELECTED){
			String s = (String) MyView.jcb2.getSelectedItem();
			
			switch(s) 
			{
			case "black": MyView.jtp.setBackground(Color.black); break;
			case "blue": MyView.jtp.setBackground(Color.blue); break;
			case "cyan": MyView.jtp.setBackground(Color.cyan); break;
			case "darkgray": MyView.jtp.setBackground(Color.darkGray); break;
			case "gray": MyView.jtp.setBackground(Color.gray); break;
			case "green": MyView.jtp.setBackground(Color.green); break;
			case "lightgray": MyView.jtp.setBackground(Color.lightGray); break;
			case "magenta": MyView.jtp.setBackground(Color.magenta); break;
			case "orange": MyView.jtp.setBackground(Color.orange); break;
			case "pink": MyView.jtp.setBackground(Color.pink); break;
			case "red": MyView.jtp.setBackground(Color.red); break;
			case "white": MyView.jtp.setBackground(Color.white); break;
			case "yellow": MyView.jtp.setBackground(Color.yellow); break;
			}
		}
	}
	
}
