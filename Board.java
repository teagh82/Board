import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
	public Board() {
		setTitle("�� ����"); // �������� Ÿ��Ʋ  �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10,10)); // ����Ʈ�ҿ� BorderLayout ��ġ������ ����
		c.setBackground(Color.WHITE);
		
		JTextArea txt  = new JTextArea(500,500);
		txt.setBackground(Color.PINK);
        JScrollPane sp = new JScrollPane(txt);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		c.add(sp, BorderLayout.CENTER);
		
		JPanel cin = new JPanel();
		cin.setLayout(new FlowLayout(FlowLayout.CENTER,50,10));
		cin.setBackground(Color.YELLOW);
		cin.add(new JButton("Ȯ�� !"));
		cin.add(new JButton("��� !"));
		c.add(cin, BorderLayout.SOUTH);

		setSize(500, 600);
		setVisible(true); // �������� ȭ�鿡 ���
	}
	public static void main(String[] args) {
		new Board();
	}
}