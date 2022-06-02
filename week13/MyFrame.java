package week13;

import javax.swing.JFrame; // ctrl+shift+o 자동 임포트

public class MyFrame extends JFrame {  // 생성자
	public MyFrame() {
		setTitle("300 X 300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame mf =  new MyFrame();
	}
}
