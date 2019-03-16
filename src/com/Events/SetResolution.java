package com.Events;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.Operate.ImgToChar;
import com.Operate.MyView;


public class SetResolution implements ItemListener {
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.SELECTED){
			String s = (String) MyView.jcb4.getSelectedItem();
			System.out.println(s);
			ImgToChar.F_size = Integer.parseInt(s);
			ImgToChar.conversion( );
		}
	}
}
