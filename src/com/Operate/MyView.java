package com.Operate;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import com.Events.*;


public class MyView{
	
	public static MyFrame mf = new MyFrame("趣味字符");
	public static JPanel jp1,jp2,jp3,jp4,jp5,tp;
	public static JTextPane jtp;
	public static JScrollPane jsp;
	public static JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static JLabel jl1,jl2,jl3,jl4,jl5,jl6;
	public static JComboBox jcb1,jcb2,jcb3,jcb4,jcb5,jcb6;  //下拉框 
	
	static int mf_length = 1200,mf_high = 800;
	static int jp1_length, jp1_high;
	static int jp2_length, jp2_high;
	static int jp2_X, jp2_Y;
	static int ver_spa01, ver_spa02;
	
	
	public MyView() {
		System.out.println("初始化");
		mf.setBackground(Color.white);
		mf.setSize(mf_length, mf_high);
		mf.setLocation(350, 150);
		mf.setLayout(null);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jp1 = new JPanel();
		jp1.setLocation(30, 20);
		jp1.setBackground(Color.gray);
		jp1.setLayout(new GridLayout(1, 1)); 
		jp1.setVisible(true);
			
		jp2 = new JPanel();
		jp2.setBackground(Color.darkGray);
		jp2.setLayout(null);
		jp2.setVisible(true);
		
		
		jtp = new JTextPane();
		jtp.setForeground(Color.white);
		jtp.setBackground(Color.black);
		tp = new JPanel(new BorderLayout());
		tp.add(jtp);
		jsp = new JScrollPane(tp);
		
		
		jb1 = new JButton("放大"); 
		jb2 = new JButton("缩小");
		jb3 = new JButton("反置");
		jb4 = new JButton("原图");
		jb5 = new JButton("选择图片");
		jb6 = new JButton("保存文本");
		jb1.setSize(75,40);
		jb2.setSize(75,40);
		jb3.setSize(75,40);
		jb4.setSize(75,40);
		jb5.setSize(160,40);
		jb6.setSize(160,40);
		
		
		jl1 = new JLabel("前景",JLabel.CENTER);
		jl2 = new JLabel("背景",JLabel.CENTER);
		jl3 = new JLabel("字符",JLabel.CENTER);	
		jl4 = new JLabel("分辨率",JLabel.CENTER);
		jl5 = new JLabel("字体",JLabel.CENTER);
		jl6 = new JLabel("字形",JLabel.CENTER);
		String[] str1 = {"black","blue","cyan","darkgray","gray","green","lightgray","magenta","orange","pink","red","white","yellow"};
		String[] str2 = {"black","blue","cyan","darkgray","gray","green","lightgray","magenta","orange","pink","red","white","yellow"};
		String[] str3 = {"！@#￥%","）*……%*","“《}=+","></';["};
		String[] str4 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		String[] str5 = {"Consolas","Courier New","DialogInput","Lucida Console","Lucida Sans Typewriter","MingLiU-ExtB","MingLiU_HKSCS-ExtB","Monospaced","MS Gothic","SimSun-ExtB","仿宋","宋体","新宋体","楷体","黑体"};
		String[] str6 = {"常规","粗体","斜体","粗斜体"};
		jcb1 = new JComboBox(str1); 
		jcb2 = new JComboBox(str2);
		jcb3 = new JComboBox(str3);
		jcb4 = new JComboBox(str4);
		jcb5 = new JComboBox(str5);
		jcb6 = new JComboBox(str6);
		jl1.setOpaque(true);   
		jl2.setOpaque(true);     //调用此语句之后JLabel才能换颜色
		jl3.setOpaque(true);
		jl4.setOpaque(true);
		jl5.setOpaque(true);
		jl6.setOpaque(true);
		Color drawable = jb2.getBackground();
		jl1.setBackground(drawable);
		jl2.setBackground(drawable);
		jl3.setBackground(drawable);
		jl4.setBackground(drawable);
		jl5.setBackground(drawable);
		jl6.setBackground(drawable);
		jl1.setSize(60,40);
		jl2.setSize(60,40);
		jl3.setSize(60,40);
		jl4.setSize(60,40);
		jl5.setSize(60,40);
		jl6.setSize(60,40);
		jcb1.setSize(100,40);
		jcb2.setSize(100,40);
		jcb3.setSize(100,40);
		jcb4.setSize(100,40);
		jcb5.setSize(100,40);
		jcb6.setSize(100,40);
		jcb1.setSelectedItem("white");
		jcb2.setSelectedItem("black");
		jcb5.setSelectedItem("宋体");
		jcb6.setSelectedItem("常规");
		
		Set_SizeAndLocation();
		
		jb1.addActionListener(new Enlarge());
		jb2.addActionListener(new Scale());
		jb3.addActionListener(new Inverted());
		jb4.addActionListener(new ShowSrcImg());
		jb5.addActionListener(new OpenImg());
		jb6.addActionListener(new SaveText());
		jcb1.addItemListener(new SetFgColor());
		jcb2.addItemListener(new SetBgColor());
		jcb3.addItemListener(new ChooseChar());
		jcb4.addItemListener(new SetResolution());
		jcb5.addItemListener(new Get_F_name());
		jcb6.addItemListener(new Get_F_style());
		
		jb1.setEnabled(false);
		jb2.setEnabled(false);
		jb3.setEnabled(false);
		jb4.setEnabled(false);
		jb6.setEnabled(false);
		
		jp1.add(jsp);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		jp2.add(jl1);
		jp2.add(jl2);
		jp2.add(jl3);
		jp2.add(jl4);
		jp2.add(jl5);
		jp2.add(jl6);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jcb3);
		jp2.add(jcb4);
		jp2.add(jcb5);
		jp2.add(jcb6);
		
		mf.add(jp1);
		mf.add(jp2);
		mf.setVisible(true);
		
	}
	
	public MyView(String ImgPath) {
		
		
	}
	
	static void Set_SizeAndLocation(){
		
		jp1_length = mf_length-300;
		jp1_high = mf_high-40;
		jp2_length = 220;
		jp2_high = mf_high-40;
		jp2_X = mf_length-250;
		jp2_Y = 20;
		ver_spa01 = 20;
		ver_spa02 = (jp2_high-(40+40*4+ver_spa01*2 + 40*6+ver_spa01*5))/2;
		
		jp1.setSize(jp1_length,jp1_high);
		jp2.setSize(jp2_length,jp2_high);
		jp2.setLocation(jp2_X, jp2_Y);
		
		jsp.setSize(jp1_length,jp1_high);
		tp.setSize(jp1_length,jp1_high);
		jtp.setSize(jp1_length,jp1_high);
		
		jb1.setLocation(30,20);
		jb2.setLocation(115,20);
		jb3.setLocation(30,20+(40+ver_spa01)*1);
		jb4.setLocation(115,20+(40+ver_spa01)*1);
		jb5.setLocation(30,jp2_high-120);
		jb6.setLocation(30,jp2_high-60);
		
		jl1.setLocation(30, 20+40*2+ver_spa01*1+ver_spa02);
		jl2.setLocation(30, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*1);
		jl3.setLocation(30, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*2);
		jl4.setLocation(30, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*3);
		jl5.setLocation(30, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*4);
		jl6.setLocation(30, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*5);
		jcb1.setLocation(90, 20+40*2+ver_spa01*1+ver_spa02);
		jcb2.setLocation(90, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*1);
		jcb3.setLocation(90, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*2);
		jcb4.setLocation(90, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*3);
		jcb5.setLocation(90, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*4);
		jcb6.setLocation(90, 20+40*2+ver_spa01*1+ver_spa02 +(40+ver_spa01)*5);
	}
	
}

class MyFrame extends JFrame
{
	static int state = 0;
	
	private Container con;
	MyFrame( String str ) {
		super(str);
		con = this.getContentPane();
		con.setLayout(null);
		this.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				MyView.mf_length = con.getWidth();
				MyView.mf_high = con.getHeight();
				
				state++;
				if(state == 1)
					return;
				state = 2;
				MyView.Set_SizeAndLocation();
			}
		});
	}
}
