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
	int abctime = 20;	//����ʱ��ʱ��
	int abcscore = 0;  //����
	int m;
	int n;
	int ii;
	int jj;
	int check = 0;
	ImageIcon[] img = new ImageIcon[7]; //���ͼƬ

	
	//��ʼ���
	JFrame frame = new JFrame("My window");		
	JPanel p_north = new JPanel();		
	JPanel p = new JPanel();
	
	JLabel time = new JLabel("ʱ��:     ");//�̶�����
	JLabel abtime = new JLabel("" + abctime);
	
	JLabel score = new JLabel("����:     ");//�̶�����
	JLabel abscore = new JLabel("" + abcscore);
	
	JButton[][] button = new JButton[4][4];//���ٿռ�
	int [][] info= new int[4][4];
	
	boolean t=false;
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new p12().init();
	}
	//���¿�ʼ�������ʼ��
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
	
	
//��Ϸ����
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
			result  = JOptionPane.showConfirmDialog(null, "���ĵ÷���:"+abcscore+"ʣ��ʱ����"+abctime);

		}
	}
	
	
	
	public void init() {
				for(int i=0;i<img.length;i++) {
					img[i] = new ImageIcon(""+i+".jpg");
				}//��˳�򴴽�ͼƬ
				p.setLayout(new GridLayout(4,4));	

					for(int q=0;q<4;q++) {
						for(int m=0;m<4;m++) {
							button[q][m] = new JButton();
						}
					}
					
					//��һ�Ű�˳��ֵ
					for(int i=0;i<button.length;i++) {
						info[i][0]=1;
						info[i][1]=2;
						info[i][2]=3;
						info[i][3]=4;
					}	
					
					
					//�������
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
					
				//�����ƣ���ť����ʼ���涼��ͼƬ0���ٸ�ÿ����ť��Ӽ�����
				for(int i=0 ; i<button.length ; i++) {				
					for(int j=0;j<button[i].length;j++) {			
						button[i][j] = new JButton();
						p.add(button[i][j]);	
						button[i][j].setIcon(img[0]);
						addListener(button[i][j], i, j);				
					}
				}
				
			
				p_north.add(time);								     		//ע������
				p_north.add(abtime);										//ע������     ʱ��
				p_north.add(score);									    	//ע������
				p_north.add(abscore);										//ע������     ����
				frame.add(p_north,BorderLayout.NORTH);						//���ϲ�ע��
				frame.add(p,BorderLayout.CENTER);					        //����
				frame.setSize(80*4, 80*4+50);								//�̶����ڵĲ���
				frame.setVisible(true);										//��ʾ����
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//�رմ���
		}
	
	//����ʱ
	public void run() {
		// TODO �Զ����ɵķ������
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
			result  = JOptionPane.showConfirmDialog(null, "���ĵ÷���:"+abcscore+"ʣ��ʱ����"+abctime);

		}
	}
	
	
	//��ӵļ����������Ƶ��㷨����ͬ��2����ֱ��ɾ������ʾͼƬ6��������ͬ����ʱ���ڶ����Ʋ���ʾ��ʲô��ֱ�ӷ���ȥ��
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