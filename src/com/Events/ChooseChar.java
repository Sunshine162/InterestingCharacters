package com.Events;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.Operate.MyView;



public class ChooseChar implements ItemListener {
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.SELECTED){
			String s = (String) MyView.jcb3.getSelectedItem();
			System.out.println(s);
		}
	}
	
}
