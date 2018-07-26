import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.Random;
import java.util.Timer;

public class p12 extends Thread{
	int abctime = 20;	//倒计时的时间
	int abcscore = 0;  //分数
	int m;
	int n;
	int ii;
	int jj;
	int check = 0;
	ImageIcon[] img = new ImageIcon[7]; //添加图片

	
	//初始面板
	JFrame frame = new JFrame("My window");		
	JPanel p_north = new JPanel();		
	JPanel p = new JPanel();
	
	JLabel time = new JLabel("时间:     ");//固定文字
	JLabel abtime = new JLabel("" + abctime);
	
	JLabel score = new JLabel("分数:     ");//固定文字
	JLabel abscore = new JLabel("" + abcscore);
	
	JButton[][] button = new JButton[4][4];//开辟空间
	int [][] info= new int[4][4];
	
	boolean t=false;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new p12().init();
	}
	//重新开始，界面初始化
//	public void restart() {
//		abctime = 20;
//		abcscore=0;
//		int check = 0;
//		boolean t=false;
//		for(int i=0 ; i<button.length ; i++) {				
//			for(int j=0;j<button[i].length;j++) {				
//				button[i][j].setIcon(img[0]);	
//				
//			}
//		}
//
//	}
	
	
//游戏结束
	public void win() {
		int sum=0;
		for(int a=0;a<4;a++) {
			for(int b=0;b<4;b++) {
				if(info[a][b]==-1)
					sum++;
			}
		}
		if(sum==16||abctime==0) {
			int result;
			result  = JOptionPane.showConfirmDialog(null, "您的得分是:"+abcscore+"剩余时间是"+abctime);

		}
	}
	
	
	
	public void init() {
				for(int i=0;i<img.length;i++) {
					img[i] = new ImageIcon(""+i+".jpg");
				}//按顺序创建图片
				p.setLayout(new GridLayout(4,4));	

					for(int q=0;q<4;q++) {
						for(int m=0;m<4;m++) {
							button[q][m] = new JButton();
						}
					}
					
					//第一排按顺序赋值
					for(int i=0;i<button.length;i++) {
						info[i][0]=1;
						info[i][1]=2;
						info[i][2]=3;
						info[i][3]=4;
					}	
					
					
					//随机排列
					Random random = new Random();
					for(int i=0;i<4;i++) {
						for(int j=0;j<4;j++) {
							int b;
							b=info[i][j];
							int temp_i=random.nextInt(3)+1;
							int temp_j=random.nextInt(3)+1;
							info[i][j]=info[temp_i][temp_j];
							info[temp_i][temp_j]=b;
							
						}
					}
					
					start();
					
				//所有牌（按钮）初始界面都是图片0，再给每个按钮添加监视器
				for(int i=0 ; i<button.length ; i++) {				
					for(int j=0;j<button[i].length;j++) {			
						button[i][j] = new JButton();
						p.add(button[i][j]);	
						button[i][j].setIcon(img[0]);
						addListener(button[i][j], i, j);				
					}
				}
				
			
				p_north.add(time);								     		//注释内容
				p_north.add(abtime);										//注释内容     时间
				p_north.add(score);									    	//注释内容
				p_north.add(abscore);										//注释内容     分数
				frame.add(p_north,BorderLayout.NORTH);						//最上层注释
				frame.add(p,BorderLayout.CENTER);					        //棋盘
				frame.setSize(80*4, 80*4+50);								//固定窗口的布局
				frame.setVisible(true);										//显示窗口
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//关闭窗口
		}
	
	//倒计时
	public void run() {
		// TODO 自动生成的方法存根
		while(abctime!=0) {
			try {
				Thread.sleep(1000);
				abctime--;
				abtime.setText(""+abctime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(abctime==0) {
			int result;
			result  = JOptionPane.showConfirmDialog(null, "您的得分是:"+abcscore+"剩余时间是"+abctime);

		}
	}
	
	
	//添加的监视器，翻牌的算法，相同的2张牌直接删掉（显示图片6），不相同的牌时：第二张牌不显示是什么，直接翻回去，
	public void addListener(final JButton b,final int i,int j) {
		b.addMouseListener(new MouseListener() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getButton() == MouseEvent.BUTTON1) {
					b.setIcon(img[info[i][j]]);
					
					if(check!=2) {
						check++;
						if(check==1) {
							n = info[i][j];
							ii=i;
							jj=j;

						}else if(check==2) {
							m = info[i][j];

						}
						if(check==2&&n==m) {

							info[i][j]=-1;
							info[ii][jj]=-1;
							
							button[i][j].setIcon(img[6]);
							button[ii][jj].setIcon(img[6]);
							abcscore = abcscore+10;
							abscore.setText(""+abcscore);

							
							
							if(info[i][j]==-1) {
							t=true;
							}
							check=0;
						}
						else if(check==2&&n!=m){
							check=0;

							button[ii][jj].setIcon(img[0]);
							button[i][j].setIcon(img[0]);
						}
						win();
						if(info[i][j]==-1||info[ii][jj]==-1) {
							if(check==2)
								check--;
							if(check==1)
								check=0;
						}
						if(info[i][j]==-1){
							if(check==2)
								check--;
							if(check==1)
								check=0;
							n=-1;
						}

					}
				}
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub			
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	

}