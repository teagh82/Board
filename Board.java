import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
	public Board() {
		setTitle("내 방명록"); // 프레임의 타이틀  달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10,10)); // 컨텐트팬에 BorderLayout 배치관리자 설정
		c.setBackground(Color.WHITE);
		
		JTextArea txt  = new JTextArea(500,500);
		txt.setBackground(Color.PINK);
        JScrollPane sp = new JScrollPane(txt);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		c.add(sp, BorderLayout.CENTER);
		
		JPanel cin = new JPanel();
		cin.setLayout(new FlowLayout(FlowLayout.CENTER,50,10));
		cin.setBackground(Color.YELLOW);
		cin.add(new JButton("확인 !"));
		cin.add(new JButton("취소 !"));
		c.add(cin, BorderLayout.SOUTH);

		setSize(500, 600);
		setVisible(true); // 프레임을 화면에 출력
	}
	public static void main(String[] args) {
		new Board();
	}
}