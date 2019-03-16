package com.Events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Operate.ImgToChar;
import com.Operate.MyView;

public class Scale implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {

		ImgToChar.F_size--;
		Font font = new Font("新宋体", 0, ImgToChar.F_size);
		MyView.jtp.setFont(font);
		System.out.println(ImgToChar.F_size);

		System.out.println("点击了 缩小 按钮");
	}
}