package com.Operate;

import java.awt.Font;
import java.awt.FontMetrics;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;


public class ImgToChar {

	static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);};
	public static String ImgPath = null;
	public static String ImgStr = null;
	public static String ImgName = null;
	public static String F_name = "宋体";
	public static int F_style = Font.PLAIN;
	public static int F_size = 16;
	
	public static void conversion( ) {

		String str2 = " !(_j{[|:;Ji1^I]f`l+-t./,~x>\"T=})\\7<zyrs4v?'AXYZ3g2npa*qdcmoewuS$V5N%9h#F_w@W&RELUPFG0OH6kMCQbDBK";
		
		Mat imgSrc = Imgcodecs.imread(ImgPath);
		Mat GrayImg = new Mat();
		Imgproc.cvtColor(imgSrc, GrayImg, Imgproc.COLOR_RGB2GRAY);
		
		ImgStr = "";
		double sum = 0.0;
		
		Font font =new Font(F_name,F_style,F_size);
		FontMetrics fm = sun.font.FontDesignMetrics.getMetrics(font); 
		int F_h = fm.getHeight();
		int F_w = fm.charWidth('M');
		int rows = GrayImg.height() / F_h;
		int cols = GrayImg.width() / F_w;

		for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sum = 0.0;
            	for(int m=i*F_h; m<i*F_h+F_h; m++)
            	{
            		for(int n=j*F_w; n<j*F_w+F_w; n++)
            		{
            			double[] data = GrayImg.get(m, n);
            			sum = sum+data[0];
            		}
            	}
          
            	int k = (int) (sum/(float)(F_h*F_w*256/95));
            	if(k>94) k=88;
            	ImgStr = ImgStr + (str2.charAt(k));
            }
            ImgStr = ImgStr+"\r\n";
        }
		
		System.out.println(ImgStr);
		
		MyView.jtp.setFont(font);
		MyView.jtp.setText(ImgStr);
	}
}






