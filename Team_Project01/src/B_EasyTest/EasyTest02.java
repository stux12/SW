package B_EasyTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import A_Main.JavaTestList;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EasyTest02 extends JavaTestList {

	private JPanel Pane;

	public EasyTest02() {

		// 창 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		Pane = new JPanel();
		Pane.setBackground(Color.YELLOW);
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);

		// 버튼 설정
		JButton button1 = new JButton("아무것도 출력되지 않는다");
		button1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button1.setBackground(new Color(255, 255, 0));
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Easytle[1] = 2;
				EasytleCount++;
				dispose();
				setVisible(false);
				new EasyTest03().setVisible(true);
			}
		});
		button1.setBounds(35, 252, 659, 50);
		Pane.add(button1);

		JButton button2 = new JButton("ondai");
		button2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button2.setBackground(new Color(255, 255, 0));
		button2.setForeground(new Color(0, 0, 0));
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Easytle[1] = 2;
				EasytleCount++;
				dispose();
				setVisible(false);
				new EasyTest03().setVisible(true);
			}
		});
		button2.setBounds(35, 348, 659, 50);
		Pane.add(button2);

		JButton button3 = new JButton("undal");
		button3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button3.setBackground(new Color(255, 255, 0));
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Easytle[1] = 2;
				EasytleCount++;
				dispose();
				setVisible(false);
				new EasyTest03().setVisible(true);
			}
		});
		button3.setBounds(35, 435, 659, 50);
		Pane.add(button3);

		JButton button4 = new JButton("ondal");
		button4.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button4.setBackground(new Color(255, 255, 0));
		button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Easytle[1] = 0;
				EasyCount++;
				dispose();
				setVisible(false);
				new EasyTest03().setVisible(true);
			}
		});
		button4.setBounds(35, 523, 659, 50);
		Pane.add(button4);

		JButton back = new JButton("이전문제로");
		back.setIcon(new ImageIcon(EasyTest02.class.getResource("/image/left.png")));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Easytle[0] == 0) {
					EasyCount--;
				}
				else {
					EasytleCount--;
				}
				dispose();
				setVisible(false);
				new EasyTest01().setVisible(true);
			}
		});
		back.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		back.setBackground(new Color(255, 255, 0));
		back.setBounds(35, 615, 174, 52);
		Pane.add(back);

		JButton exit = new JButton("포기해요?");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		exit.setIcon(new ImageIcon(EasyTest01.class.getResource("/image/smiley.png")));
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTestLast().setVisible(true);
			}
		});
		exit.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		exit.setBackground(new Color(255, 255, 0));
		exit.setBounds(520, 615, 174, 52);
		Pane.add(exit);

		// 라벨 설정
		JLabel Level = new JLabel("난이도 下");
		Level.setIcon(new ImageIcon(EasyTest01.class.getResource("/image/chick.png")));
		Level.setHorizontalAlignment(SwingConstants.LEFT);
		Level.setOpaque(true);
		Level.setBackground(Color.YELLOW);
		Level.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		Level.setBounds(12, 10, 94, 34);
		Pane.add(Level);

		JLabel jul = new JLabel("");
		jul.setForeground(Color.RED);
		jul.setOpaque(true);
		jul.setBackground(Color.BLACK);
		jul.setBounds(0, 55, 734, 1);
		Pane.add(jul);

		JLabel number = new JLabel("2/10");
		number.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		number.setBounds(681, 11, 41, 27);
		Pane.add(number);

		JLabel monje = new JLabel(
				"<html>Q 02 String a = \"ondal\";<br/>System.out.print(a)를 하면 무엇이 출력될까요??\r\n");
		monje.setHorizontalAlignment(SwingConstants.CENTER);
		monje.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		monje.setBounds(35, 83, 659, 111);
		Pane.add(monje);

	}
}