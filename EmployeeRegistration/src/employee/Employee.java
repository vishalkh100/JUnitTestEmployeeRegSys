package employee;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee {
	
	public ArrayList<Empl> emp = new ArrayList<>();
	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JPanel SidePanel = new JPanel();
	
	//Application Name
	public JLabel AppNameLabel = new JLabel("Employee Registration");
	
	public JPanel AddPanel = new JPanel();
	public JLabel AddLabel = new JLabel("Add Members");
	public JPanel RemovePanel = new JPanel();
	public JLabel RemoveLabel = new JLabel("Delete Members");
	public JPanel SortPanel = new JPanel();
	public JLabel SortLabel = new JLabel("Sort Members");
	public JPanel ResetPanel = new JPanel();
	public JLabel ResetLabel = new JLabel("Reset Memberlist");	
	
	public JScrollPane scrollPane = new JScrollPane();
	public JTable table = new JTable();


	public JLabel NameLabel = new JLabel("Name");
	public JTextField NameField = new JTextField();
	public JLabel DeptLabel = new JLabel("Department");
	public JTextField DeptField = new JTextField();
	
	public JButton Button = new JButton();

	/**
	 * @wbp.parser.entryPoint
	 */
	public Employee() {
		initialize();
	}

	private void initialize() {
	
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1024, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1008, 682);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		SidePanel.setBorder(null);
		SidePanel.setBounds(0, 0, 280, 682);
		SidePanel.setBackground(new Color(255, 255, 255));
		SidePanel.setLayout(null);
		panel.add(SidePanel);
	
		AppNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
		AppNameLabel.setBounds(29, 33, 222, 102);
		SidePanel.add(AppNameLabel);
		
		AddPanel.setBackground(new Color(255, 255, 255));
		AddPanel.setBounds(0, 133, 280, 60);
		SidePanel.add(AddPanel);
		
		AddPanel.setLayout(null);	
		
		AddPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {addAction(e);}
		});
	
		AddLabel.setHorizontalAlignment(SwingConstants.LEFT);
		AddLabel.setBounds(70, 0, 210, 60);
		AddPanel.add(AddLabel);
		

		RemovePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {removeAction(e);}
		});
		RemovePanel.setLayout(null);
		RemovePanel.setBackground(new Color(255, 255, 255));
		RemovePanel.setBounds(0, 193, 280, 60);
		SidePanel.add(RemovePanel);
	
		RemoveLabel.setHorizontalAlignment(SwingConstants.LEFT);
		RemoveLabel.setBounds(70, 0, 210, 60);
		RemovePanel.add(RemoveLabel);
		
		
		SortPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {sortAction(e);}
		});

		SortPanel.setLayout(null);
		SortPanel.setBackground(new Color(255, 255, 255));
		SortPanel.setBounds(0, 253, 280, 60);
		SidePanel.add(SortPanel);
	
		SortLabel.setHorizontalAlignment(SwingConstants.LEFT);
		SortLabel.setBounds(70, 0, 210, 60);
		SortPanel.add(SortLabel);
		
		ResetPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resetAction(e);
			}
		});
		ResetPanel.setLayout(null);
		ResetPanel.setBounds(0, 312, 280, 60);
		SidePanel.add(ResetPanel);
		
		ResetLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ResetLabel.setBounds(70, 0, 210, 60);
		ResetPanel.add(ResetLabel);
		
		
		
		scrollPane.setBounds(290, 222, 708, 449);
		panel.add(scrollPane);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Department"
			}
		));
		scrollPane.setViewportView(table);
		

		NameLabel.setBounds(319, 59, 144, 28);
		panel.add(NameLabel);
		NameField.setBounds(319, 85, 289, 48);
		panel.add(NameField);
		NameField.setColumns(10);
		

		DeptLabel.setBounds(662, 59, 144, 28);
		panel.add(DeptLabel);
		DeptField.setColumns(10);
		DeptField.setBounds(662, 85, 316, 48);
		panel.add(DeptField);
		
		Button.setText("Add");
		Button.setBackground(new Color(255, 255, 255));
		Button.setForeground(new Color(0, 0, 0));
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonAction(e);
			}
		});
		Button.setBounds(483, 151, 333, 48);
		panel.add(Button);
	}
	
	
	public void addAction(MouseEvent e) {
		Button.setText("Add");
	}
	public void removeAction(MouseEvent e) {
		Button.setText("Delete");
	}
	public void sortAction(MouseEvent e) {
		Collections.sort(emp);
		unpopulateTable();
		populateTable();
	}
	public void sortSimulate() {
		Collections.sort(emp);
		unpopulateTable();
		populateTable();
	}
	public void resetAction(MouseEvent e) {
		emp.clear();
		unpopulateTable();
		populateTable();
	}
	public void simulateReset() {
		emp.clear();
		unpopulateTable();
		populateTable();
	}
	
	public void buttonAction(ActionEvent e) {
		String name = NameField.getText();
		String dept = DeptField.getText();
		Empl b = new Empl(name,dept);
		String choice = Button.getText();
		if(choice == "Add") {
			emp.add(b);
			unpopulateTable();
			populateTable();
		}
		else {
			emp.remove(b);
			unpopulateTable();
			populateTable();
		}
		
	}
	
	public void populateTable() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Object rowData[] = new Object[2];
		for(int i=0; i<emp.size();i++) {
			rowData[0] = emp.get(i).name;
			rowData[1] = emp.get(i).dept;
			model.addRow(rowData);	
		}
		
	}
	public void unpopulateTable() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
	}
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee window = new Employee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}


