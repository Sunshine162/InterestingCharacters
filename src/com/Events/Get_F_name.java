package com.Events;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.Operate.ImgToChar;
import com.Operate.MyView;



public class Get_F_name implements ItemListener {
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.SELECTED){			
			
			ImgToChar.F_name = (String) MyView.jcb5.getSelectedItem();		
			Font font =new Font(ImgToChar.F_name,ImgToChar.F_style,ImgToChar.F_size);
			MyView.jtp.setFont(font);
		}
	}
	
}
