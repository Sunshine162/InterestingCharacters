package com.Events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.Operate.ImgToChar;
import com.Operate.MyView;

public class OpenImg implements ActionListener{  
 
	static JFileChooser jfc=new JFileChooser();
	static File file = jfc.getSelectedFile();
	
    @Override  
    public void actionPerformed(ActionEvent e) {  
          
    	jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);  
        ImgFilter imgfilter = new ImgFilter();
        jfc.setFileFilter(imgfilter);
        
        try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(jfc);
	        
	        
	        int option = jfc.showDialog(new JLabel(), "选择");
			if (option == JFileChooser.APPROVE_OPTION) {
				File file=jfc.getSelectedFile();  	        
				if(file!=null) {
					if(file.isFile()) {
						String oldstr = file.getAbsolutePath();
						String newstr = oldstr.replace('\\', '/');
						System.out.println(newstr);
						ImgToChar.ImgPath = newstr;
						ImgToChar.ImgName = file.getName();
						ImgToChar.conversion( );
						
						MyView.jb1.setEnabled(true);
						MyView.jb2.setEnabled(true);
						MyView.jb3.setEnabled(true);
						MyView.jb4.setEnabled(true);
						MyView.jb6.setEnabled(true);
						
					}
				}
			
			}
			
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		
    }  
}

class ImgFilter extends javax.swing.filechooser.FileFilter {
	public boolean accept(File f) {
		if (f.isDirectory())
			return true;
		else if (f.getName().endsWith(".jpg") || f.getName().endsWith(".jpeg") ||f.getName().endsWith(".png"))
			return true;
		return false;
	}

	public String getDescription() {
		return "图片文件(*.jpg, *.jpeg, *.png)";
	}
}


