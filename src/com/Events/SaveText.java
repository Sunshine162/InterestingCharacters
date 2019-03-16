package com.Events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.Operate.ImgToChar;

public class SaveText implements ActionListener {
	
	static JFileChooser jfc = new JFileChooser();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Init();
		Save();
	}
	
	static void Init(){
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jfc.setSelectedFile(new File(ImgToChar.ImgName+".txt"));
	}
	
	static void Save() {

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(jfc);

			int option = jfc.showSaveDialog(jfc);
			if (option == JFileChooser.APPROVE_OPTION) {
				File file = jfc.getSelectedFile();

				String str = file.getAbsolutePath();
				String path = str.replace('\\', '/');
				System.out.println(path);

				File savefile = new File(path);
				if (savefile.exists()) {
					
					int flag = JOptionPane.showConfirmDialog(null, "同名文件已存在，是否覆盖？", null, JOptionPane.YES_NO_OPTION);
					if (flag == JOptionPane.YES_OPTION) {
						PrintStream ps;
						try {
							ps = new PrintStream(new FileOutputStream(savefile));
							ps.println(ImgToChar.ImgStr);
						} catch (FileNotFoundException e) {
							System.out.println("写入文件出错！");
							e.printStackTrace();
						}
					}
					else {
						Save();
					}
				} else {
					PrintStream ps;
					try {
						ps = new PrintStream(new FileOutputStream(savefile));
						ps.println(ImgToChar.ImgStr);
					} catch (FileNotFoundException e) {
						System.out.println("写入文件出错！");
						e.printStackTrace();
					}
				}
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
			System.out.println("windows窗口出错！");
		}
	}

}


