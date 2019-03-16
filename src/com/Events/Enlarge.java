package com.Events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Operate.ImgToChar;
import com.Operate.MyView;

public class Enlarge implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ImgToChar.F_size ++;
		Font font =new Font("ÐÂËÎÌå",0,ImgToChar.F_size);
		MyView.jtp.setFont(font);
		System.out.println(ImgToChar.F_size);
		
		System.out.println("µã»÷ÁË ·Å´ó °´Å¥");
	}
}