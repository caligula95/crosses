import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Croses extends WindowAdapter implements ActionListener  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Croses cr = new Croses();
		PlayWithComputer pl = new PlayWithComputer();
		pl.launchFrame();
		cr.launchFrame();
	}
	Frame f,fr, cp;
	Panel p,r;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, restart, comp, player;
	Button[] blist = new Button[9];
	Label result, player1, player2, resc, resz;
	String lastCommand;
	String res="";
	 int pl = 1;
	boolean start = true;
	int st = 1, count1 = 0, count2 = 0, temp = 0, choice=0;;
	public Croses() {
		cp = new Frame();
		fr = new Frame();
		comp = new Button("Comp");
		player = new Button("Player");
		r = new Panel();
		p = new Panel();
		f = new Frame();
		b1 = new Button("");
		b2 = new Button("");
		b3= new Button("");
		b4 = new Button("");
		b5 = new Button("");
		b6 = new Button("");
		b7 = new Button("");
		b8 = new Button("");
		b9 = new Button("");
		restart = new Button("Очистить поле");
		result = new Label();
		player1 = new Label("Крестики");
		player2 = new Label("Нолики");
		resc = new Label("0");
		resz = new Label("0");
	}
	public void launchFrame() {
		fr.setSize(100, 100);
		fr.setLocation(600, 300);
		fr.setLayout(new FlowLayout());
		fr.add(player);
		fr.add(comp);
		comp.setSize(100, 40);
		player.setSize(100, 40);
		p.setLayout(new GridLayout(3,3));
		f.setLayout(new BorderLayout());
		f.add(r, BorderLayout.NORTH);
		r.setLayout(new GridLayout(3,3));
		r.add(result);
		r.add(restart);
		r.add(player1);
		r.add(player2);
		r.add(resc);
		r.add(resz);
		f.add(p);
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
	//	f.setVisible(true);
		f.pack();
		f.addWindowListener(this);
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
				//f.setVisible(true);
				fr.setVisible(false);
			}
		});
		player.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setVisible(true);
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
				}
				
			}
		});
		for (int i=0; i<9; i++) {
			blist[i].addActionListener(this);
		}
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			if (pl == 1) {
				for (int i=0; i<9; i++) {
					if (blist[i].getLabel().equals("")) {
					if (e.getSource()== blist[i]) {
						blist[i].setLabel("X");
						pl = 2;
						temp++;
						chooseWinner();
						nobody();
						
					}
				}
				}
			}
			else if (pl == 2) {
				for (int i=0; i<9; i++) {
					if (blist[i].getLabel().equals("")){
					if (e.getSource()== blist[i]) {
						blist[i].setLabel("O");
						pl = 1;
						temp++;
						chooseWinner();
						nobody();
						
				}
			}
				}
		}
	}
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//f.dispose();
		System.exit(0);
		///fr.dispose();
	}
	public void chooseWinner() {
		for (int i=0; i<9; i++) {
			if ((blist[0].getLabel().equals("X")&&blist[1].getLabel().equals("X")&&blist[2].getLabel().equals("X"))|| 
					(blist[0].getLabel().equals("X")&&blist[3].getLabel().equals("X")&&blist[6].getLabel().equals("X"))||
					(blist[8].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[0].getLabel().equals("X"))||
					(blist[6].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[2].getLabel().equals("X"))||
					(blist[8].getLabel().equals("X")&&blist[5].getLabel().equals("X")&&blist[2].getLabel().equals("X"))||
					(blist[8].getLabel().equals("X")&&blist[7].getLabel().equals("X")&&blist[6].getLabel().equals("X"))||
					(blist[1].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[7].getLabel().equals("X"))||
					(blist[3].getLabel().equals("X")&&blist[4].getLabel().equals("X")&&blist[5].getLabel().equals("X"))) {
				res = "Крестики выиграли";
				count1++;
				pl = 3;
				resc.setText(Integer.toString(count1/9));
				
			}
			else if ((blist[0].getLabel().equals("O")&&blist[1].getLabel().equals("O")&&blist[2].getLabel().equals("O"))|| 
					(blist[0].getLabel().equals("O")&&blist[3].getLabel().equals("O")&&blist[6].getLabel().equals("O"))||
					(blist[8].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[0].getLabel().equals("O"))||
					(blist[6].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[2].getLabel().equals("O"))||
					(blist[8].getLabel().equals("O")&&blist[5].getLabel().equals("O")&&blist[2].getLabel().equals("O"))||
					(blist[8].getLabel().equals("O")&&blist[7].getLabel().equals("O")&&blist[6].getLabel().equals("O"))||
					(blist[1].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[7].getLabel().equals("O"))||
					(blist[3].getLabel().equals("O")&&blist[4].getLabel().equals("O")&&blist[5].getLabel().equals("O")))
 {
				res = "Нолики выиграли";
				count2++;
				pl = 3;
				resz.setText(Integer.toString(count2/9));
			}
		}
		result.setText(res);
	}
	public void nobody() {
		if (temp == 9) {
			result.setText("Nichya");
		}
	}
	
	
}
