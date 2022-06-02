package week13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 버튼 누르면 프로그램 자체도 종료됨.
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // 자동으로 배치, 왼쪽에서 오른쪽으로 배치
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);		
	}

	public static void main(String[] args) {
		ContentPaneEx cp = new ContentPaneEx();
	}
}
