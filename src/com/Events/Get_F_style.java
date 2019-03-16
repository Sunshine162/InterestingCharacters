package com.Events;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.Operate.ImgToChar;
import com.Operate.MyView;



public class Get_F_style implements ItemListener {
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.SELECTED){			
			String styleStr = (String) MyView.jcb6.getSelectedItem();
			if(styleStr.equals("常规"))
				ImgToChar.F_style = Font.PLAIN;
			else if(styleStr.equals("粗体"))
				ImgToChar.F_style = Font.BOLD;
			else if(styleStr.equals("斜体"))
				ImgToChar.F_style = Font.ITALIC;
			else if(styleStr.equals("粗斜体"))
				ImgToChar.F_style = Font.BOLD+Font.ITALIC;
			
			Font font =new Font(ImgToChar.F_name,ImgToChar.F_style,ImgToChar.F_size);
			MyView.jtp.setFont(font);
		}
	}
	
}
