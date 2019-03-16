package com.Events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Operate.MyView;

public class Inverted implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			String fg = (String) MyView.jcb1.getSelectedItem();
			String bg = (String) MyView.jcb2.getSelectedItem();
			
			switch(bg) 
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
			
			switch(fg) 
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
			
			MyView.jcb1.setSelectedItem(bg);
			MyView.jcb2.setSelectedItem(fg);
			
			System.out.println("点击了 反置 按钮");
			
		}
		
}