package com.Events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import com.Operate.ImgToChar;

import java.awt.Color;
import java.awt.GridLayout;


public class ShowSrcImg implements ActionListener {

	static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);};

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("点击了 查看原图 按钮");
		ShowImage.display(ImgToChar.ImgPath);
		
	}
}


class ShowImage {
	
	public static void display(String ImagePath) {
		
		Mat src = Imgcodecs.imread(ImagePath);
		int w = src.width();
		int h = src.height();
		
		JFrame jf = new JFrame();
		jf.setLocation(300,300);
		jf.setSize(w+10, h+44);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1, 1));
		
		Icon icon=new ImageIcon( ImagePath );  
		JLabel jl = new JLabel(icon, JLabel.CENTER); 
		jl.setOpaque(true);
		jl.setBackground(Color.black);
		
		jp.add(jl);
		jf.add(jp);
		jf.setResizable(false);
		jf.setVisible(true);
	}
}