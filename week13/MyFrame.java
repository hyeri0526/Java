package week13;

import javax.swing.JFrame; // ctrl+shift+o �ڵ� ����Ʈ

public class MyFrame extends JFrame {  // ������
	public MyFrame() {
		setTitle("300 X 300 ���� ������ �����");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame mf =  new MyFrame();
	}
}
