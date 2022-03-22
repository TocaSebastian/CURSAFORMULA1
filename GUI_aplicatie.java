


package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

import Data.Cursa;
//import Data.Pista;
import Data.Pilot;

public class GUI_aplicatie extends JFrame implements Observator 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JList<Pilot> list;
	JButton btnAdauga;
	JButton btnSterge;
	Cursa cursa;


	public GUI_aplicatie(Cursa c)
	{
		super();
		this.setLayout(null);
		this.setSize(new Dimension(400,700));
		cursa=c;
		list = new JList<Pilot>(cursa.getCursa());
		list.setBounds(10, 10, 200, 300);
		this.add(list);
		
		btnAdauga = new JButton("AdaugaPilot");
		btnAdauga.setBounds(220, 10, 140, 20);
		

		btnSterge = new JButton("StergePilot");
		btnSterge.setBounds(220, 40, 140, 20);
		
		btnAdauga.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Pilot p5 = new Pilot("Hamilton","Mercedes",5);
				cursa.AdaugaPilot(p5);
				Pilot p6 = new Pilot("Verstappen","RedBull",5);
				cursa.AdaugaPilot(p6);
			}
		});

			this.add(btnAdauga);

			btnSterge.addActionListener(new ActionListener()
			{
	public void actionPerformed(ActionEvent e)
			{
				Pilot p5 = new Pilot("Hamilton","Mercedes",5);
					cursa.ScoatePilot(p5);
				Pilot p6 = new Pilot("Verstappen","RedBull",5);
					cursa.ScoatePilot(p6);
			}
				});


		
			this.add(btnSterge);
			
			this.setVisible(true);
		}
		
		public void update(Pilot p) 
		{
			list.setListData(cursa.getCursa());
			this.repaint();
			
		}
}
	
