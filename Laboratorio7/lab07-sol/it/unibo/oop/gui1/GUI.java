package a01a.sol2;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.stream.*;

import javax.swing.*;


public class GUI extends JFrame{
	
	public GUI(int size){
		final Logics cs = new LogicsImpl(size);
		this.setSize(500, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());
		
		final java.util.List<JButton> jbs = cs.currentNames()
				  .stream()
				  .map(JButton::new)
				  .collect(Collectors.toList());
		ActionListener ac = e -> {
			final JButton jb = (JButton)e.getSource();
			final int pos = jbs.indexOf(jb);
			jb.setText(cs.hit(pos));
			jb.setEnabled(cs.currentEnabling().get(pos));
			if (cs.toQuit()) {
				System.exit(0);
			}
		};
		jbs.forEach(x->{
			x.addActionListener(ac);
			this.getContentPane().add(x);
		});
		final JButton ok = new JButton("Print");
		this.getContentPane().add(ok);
		ok.addActionListener(x->{
			System.out.println(cs.result());
		});
		
		this.setVisible(true);
	}

}
