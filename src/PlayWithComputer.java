import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayWithComputer extends Croses {
	int k;

	public void launchFrame() {
		fr.setSize(100, 100);
		comp.setSize(100, 40);
		player.setSize(100, 40);
		fr.setLocation(600, 300);
		fr.setLayout(new FlowLayout());
		fr.add(player);
		fr.add(comp);
		p.setLayout(new GridLayout(3,3));
		cp.setLayout(new BorderLayout());
		cp.add(r, BorderLayout.NORTH);
		r.setLayout(new GridLayout(3,3));
		r.add(result);
		r.add(restart);
		r.add(player1);
		r.add(player2);
		r.add(resc);
		r.add(resz);
		cp.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		fr.setVisible(true);
		//cp.setVisible(true);
		cp.pack();
		cp.addWindowListener(this);
		fr.addWindowListener(this);
		blist[0] = b1;
		blist[1] = b2;
		blist[2] = b3;
		blist[3] = b4;
		blist[4] = b5;
		blist[5] = b6;
		blist[6] = b7;
		blist[7] = b8;
		blist[8] = b9;
		comp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cp.setVisible(true);
				fr.setVisible(false);
			}
		});
		player.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//f.setVisible(true);
				fr.setVisible(false);
			}
		});
		restart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i=0; i<9; i++) {
					blist[i].setLabel("");
					res = "";
					result.setText(res);
					pl = 1;
					temp = 0;
					choice = 0;
				}
				
			}
		});
		for (int i=0; i<9; i++) {
			blist[i].addActionListener(this);
		}
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (pl == 1) {
			for (int i = 0; i < 9; i++) {
				if (blist[i].getLabel().equals("")) {
				if (e.getSource() == blist[i]) {
					blist[i].setLabel("X");
					chooseWinner();
					pl = 2;
					choice++;
					nobody();
				}
			}
			}
		} else if (pl == 2) {
			for (int i = 0; i < 9; i++) {
				if (blist[i].getLabel().equals("")) {
					if (blist[0].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[8].getLabel().equals("")) {blist[8].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[1].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[7].getLabel().equals("")) {blist[7].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[2].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[6].getLabel().equals("")) {blist[6].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[3].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[5].getLabel().equals("")) {blist[5].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[5].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[3].getLabel().equals("")) {blist[3].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[6].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[2].getLabel().equals("")) {blist[2].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[7].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[1].getLabel().equals("")) {blist[1].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[8].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[0].getLabel().equals("")) {blist[0].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[2].getLabel().equals("X")&&blist[6].getLabel().equals("X")&&blist[1].getLabel().equals("")) {blist[1].setLabel("O");chooseWinner(); choice++;break;};
					
					//+++++++++++++++++++++++++++++++++++++++++++++++++++=
					if (blist[0].getLabel().equals("O")&&blist[1].getLabel().equals("O")&&blist[2].getLabel().equals("")) {blist[2].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[1].getLabel().equals("O")&&blist[2].getLabel().equals("O")&&blist[0].getLabel().equals("")) {blist[0].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[0].getLabel().equals("O")&&blist[2].getLabel().equals("O")&&blist[1].getLabel().equals("")) {blist[1].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[0].getLabel().equals("O")&&blist[3].getLabel().equals("O")&&blist[6].getLabel().equals("")) {blist[6].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[3].getLabel().equals("O")&&blist[6].getLabel().equals("O")&&blist[0].getLabel().equals("")) {blist[0].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[0].getLabel().equals("O")&&blist[6].getLabel().equals("O")&&blist[3].getLabel().equals("")) {blist[3].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[6].getLabel().equals("O")&&blist[7].getLabel().equals("O")&&blist[8].getLabel().equals("")) {blist[8].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[7].getLabel().equals("O")&&blist[8].getLabel().equals("O")&&blist[6].getLabel().equals("")) {blist[6].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[6].getLabel().equals("O")&&blist[8].getLabel().equals("O")&&blist[7].getLabel().equals("")) {blist[7].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[2].getLabel().equals("O")&&blist[5].getLabel().equals("O")&&blist[8].getLabel().equals("")) {blist[8].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[5].getLabel().equals("O")&&blist[8].getLabel().equals("O")&&blist[2].getLabel().equals("")) {blist[2].setLabel("O");chooseWinner(); choice++;break;};
					if (blist[2].getLabel().equals("O")&&blist[8].getLabel().equals("O")&&blist[5].getLabel().equals("")) {blist[5].setLabel("O");chooseWinner(); choice++;break;};
					//++++++++++++++++++++++++++++++++++++++++++++
					if (blist[4].getLabel().equals("X")&&blist[8].getLabel().equals("X")&&blist[6].getLabel().equals("")) {blist[6].setLabel("O");chooseWinner(); choice++;break;};
					
				if (blist[0].getLabel().equals("X")&&blist[4].getLabel().equals("")) {blist[4].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[1].getLabel().equals("X")&&blist[4].getLabel().equals("")) {blist[4].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[2].getLabel().equals("X")&&blist[4].getLabel().equals("")) {blist[4].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[3].getLabel().equals("X")&&blist[4].getLabel().equals("")) {blist[4].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[4].getLabel().equals("X")&&blist[0].getLabel().equals("")) {blist[0].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[5].getLabel().equals("X")&&blist[4].getLabel().equals("")) {blist[4].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[6].getLabel().equals("X")&&blist[4].getLabel().equals("")) {blist[4].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[7].getLabel().equals("X")&&blist[4].getLabel().equals("")) {blist[4].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[8].getLabel().equals("X")&&blist[4].getLabel().equals("")) {blist[4].setLabel("O");chooseWinner(); choice++;break;};
				/*++++++++++++++++++++++++++++++*/
				if (blist[0].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[8].getLabel().equals("")) {blist[8].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[1].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[7].getLabel().equals("")) {blist[7].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[2].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[6].getLabel().equals("")) {blist[6].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[3].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[5].getLabel().equals("")) {blist[5].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[5].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[3].getLabel().equals("")) {blist[3].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[6].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[2].getLabel().equals("")) {blist[2].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[7].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[1].getLabel().equals("")) {blist[1].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[8].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[0].getLabel().equals("")) {blist[0].setLabel("O");chooseWinner(); choice++;break;};
				//+++++++++++++++++++++++++++++++++++++++++++++++++++=
				if (blist[0].getLabel().equals("X")&&blist[1].getLabel().equals("X")&&blist[2].getLabel().equals("")) {blist[2].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[1].getLabel().equals("X")&&blist[2].getLabel().equals("X")&&blist[0].getLabel().equals("")) {blist[0].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[0].getLabel().equals("X")&&blist[2].getLabel().equals("X")&&blist[1].getLabel().equals("")) {blist[1].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[0].getLabel().equals("X")&&blist[3].getLabel().equals("X")&&blist[6].getLabel().equals("")) {blist[6].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[3].getLabel().equals("X")&&blist[6].getLabel().equals("X")&&blist[0].getLabel().equals("")) {blist[0].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[0].getLabel().equals("X")&&blist[6].getLabel().equals("X")&&blist[3].getLabel().equals("")) {blist[3].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[6].getLabel().equals("X")&&blist[7].getLabel().equals("X")&&blist[8].getLabel().equals("")) {blist[8].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[7].getLabel().equals("X")&&blist[8].getLabel().equals("X")&&blist[6].getLabel().equals("")) {blist[6].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[6].getLabel().equals("X")&&blist[8].getLabel().equals("X")&&blist[7].getLabel().equals("")) {blist[7].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[2].getLabel().equals("X")&&blist[5].getLabel().equals("X")&&blist[8].getLabel().equals("")) {blist[8].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[5].getLabel().equals("X")&&blist[8].getLabel().equals("X")&&blist[2].getLabel().equals("")) {blist[2].setLabel("O");chooseWinner(); choice++;break;};
				if (blist[2].getLabel().equals("X")&&blist[8].getLabel().equals("X")&&blist[5].getLabel().equals("")) {blist[5].setLabel("O");chooseWinner(); choice++;break;};
				//++++++++++++++++++++++++++++++++++++++++++++
				if ((blist[1].getLabel().equals("X")&&blist[3].getLabel().equals("X")||blist[1].getLabel().equals("X")&&blist[5].getLabel().equals("X")||
					blist[1].getLabel().equals("X")&&blist[7].getLabel().equals("X")||blist[3].getLabel().equals("X")&&blist[5].getLabel().equals("X")||
					blist[3].getLabel().equals("X")&&blist[7].getLabel().equals("X")||blist[5].getLabel().equals("X")&&blist[7].getLabel().equals("X"))&&
						blist[0].getLabel().equals("")) {blist[0].setLabel("O");chooseWinner(); choice++;break;}
				//===============================
				
				else {
					elseStep();
					chooseWinner();
					nobody();
					break;
				}
				}
				nobody();
			}
				chooseWinner();
				pl=1;
				nobody();
				
		
			}
		}

	public void elseStep() {
		for (int i = 0; i < 9; i++) {
			if (blist[i].getLabel().equals("")) {
				k = i;
				break;
			}
		}
		blist[k].setLabel("O");
		choice++;

	}
	public void nobody() {
		if (choice==9) {
			result.setText("Nichya");
		}
	}
}
