package frame03;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// 생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500); // setBounds = setLocation + setSize
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임의 레이아웃 매니저를 사용하지 않기 때문에 UI를 절대좌표에 직접 배치해야 한다.
		setLayout(new GridLayout(2, 2)); // 격자

		JButton btn1 = new JButton("버튼1");
		add(btn1); // 프레임에 btn1 추가

		JButton btn2 = new JButton("버튼2");
		add(btn2); // 프레임에 btn2 추가

		JButton btn3 = new JButton("버튼3");
		add(btn3); // 프레임에 btn3 추가

		JButton btn4 = new JButton("버튼4");
		add(btn4); // 프레임에 btn4 추가

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}

}
