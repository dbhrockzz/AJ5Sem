//Devansh Bhatia (14CSU056)
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JListJava implements ActionListener{
	
	JFrame f;
	JList l1,l2;
	JButton Add,remove,shift;
	JTextField current;
	ArrayList<String> list1,list2;
	String arr[] = {"One","Two","Three","Four","Five","Six"};
	
	public JListJava()
	{
		f = new JFrame("Demo Jlist");
		l1 = new JList();
		shift = new JButton(">>>");
		Add = new JButton("Add");
		remove = new JButton("Remove");
		current = new JTextField("");
		l2 = new JList();
		l1.setBounds(10,10,100,150);
//		l1.setBackground(Color.black);
		shift.setBounds(120,80,60,20);
		l2.setBounds(190, 10, 100, 150);
		Add.setBounds(20, 180, 80, 20);
		remove.setBounds(20, 220, 80, 20);
		current.setBounds(120, 200, 80, 20);
		f.setLayout(null);
		f.setSize(315,300);
		f.add(l1);
		f.add(shift);
		f.add(l2);
		f.add(Add);
		f.add(current);
		f.add(remove);	
		f.setVisible(true);
		makelist();
		Add.addActionListener(this);
		shift.addActionListener(this);
		remove.addActionListener(this);
	}
	
	public void makelist()
	{
		list1 = new ArrayList<String>();
		list2 = new ArrayList<String>();
		list1.addAll(Arrays.asList(arr));
		l1.setListData(list1.toArray());
		l1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		l2.setListData(list2.toArray());
	}
	
	
	
	public static void main(String[] args)
	{
		JListJava j = new JListJava();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getSource());
		if(e.getSource()==Add)
		{
			if(current.getText()!="")
			{
				list1.add(current.getText());
				l1.setListData(list1.toArray());
				current.setText("");
			}
		}
		else if(e.getSource()==shift)
		{
			if(!l1.isSelectionEmpty())
			{
				Object temp[] = list1.toArray();
				for(Object x :temp)
				{
					for(Object y: l1.getSelectedValuesList())
					{
						if(x.equals(y))
						{
							System.out.println(list1);
							list1.remove(x.toString());
							list2.add(x.toString());
						}
					}
				}
				l1.setListData(list1.toArray());
				l2.setListData(list2.toArray());

			}
		}
		else if(e.getSource()==remove)
		{
			System.out.println("...");
			if(!l1.isSelectionEmpty())
			{
				Object temp[] = list1.toArray();
				System.out.println(temp);
				for(Object x :temp)
				{
					for(Object y: l1.getSelectedValuesList())
					{
						if(x.equals(y))
						{
							list1.remove(x.toString());
							System.out.println(list1);
						}
					}
				}
				l1.setListData(list1.toArray());
			}
		}
			
		
	}

}

