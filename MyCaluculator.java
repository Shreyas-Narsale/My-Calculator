


import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Demo//backend
{
	public int iNum1;
	public int iNum2;
	
	public Demo(int a, int b)
	{
		this.iNum1=a;
		this.iNum2=b;
	}
	public int Addition()
	{
		return (this.iNum1+this.iNum2);
	}
	public int Subtraction()
	{
		return (this.iNum1-this.iNum2);
	}
	public int Mult()
	{
		return (this.iNum1*this.iNum2);
	}
	public int Division()
	{
		return (this.iNum1/this.iNum2);
	}
	
	
}
class MarvellousFrame extends WindowAdapter implements ActionListener//frotend class
{
	public Frame fobj;
	public Button bobj1;
	public Button bobj2;
	public Button bobj3;
	public Button bobj4;
	public TextField tobj1;
	public TextField tobj2;
	public TextField tobj3;
	public TextField tobj4;
	public Label lobj1;
	public Label lobj2;
	public Label lobj3;
	public Label lobj4;
	
	
	public MarvellousFrame(String name)
	{
		fobj=new Frame(name);
		bobj1=new Button("+");
		bobj2=new Button("-");
		bobj3=new Button("*");
		bobj4=new Button("/");
		tobj1=new TextField();
		tobj2=new TextField();
		tobj3=new TextField();
		tobj4=new TextField();
		lobj1=new Label("Enter First No.:");
		lobj2=new Label("Enter Second No.:");
		lobj3=new Label("Answer:");
		lobj4=new Label("");
		
		lobj1.setBounds(60,30,170,20);
		tobj1.setBounds(60,50,170,20);
		
		lobj2.setBounds(60,80,170,20);
		tobj2.setBounds(60,100,170,20);
		
		lobj3.setBounds(60,120,170,20);
		tobj3.setBounds(60,140,170,20);
		
		lobj4.setBounds(60,980,170,20);
		tobj4.setBounds(60,1000,170,20);
		
		bobj1.setBounds(70,180,50,30);
		bobj2.setBounds(150,180,50,30);
		bobj3.setBounds(220,180,50,30);
		bobj4.setBounds(300,180,50,30);
		
		fobj.add(bobj1);
		fobj.add(bobj2);
		fobj.add(bobj3);
		fobj.add(bobj4);
		fobj.add(tobj1);
		fobj.add(tobj2);
		fobj.add(tobj3);
		fobj.add(tobj4);
		fobj.add(lobj1);
		fobj.add(lobj2);
		fobj.add(lobj3);
		fobj.add(lobj4);
		
		fobj.setSize(600,600);
		fobj.setVisible(true);
		fobj.setLayout(null);//set default layout of frame
		
		bobj1.addActionListener(this);
		bobj2.addActionListener(this);
		bobj3.addActionListener(this);
		bobj4.addActionListener(this);
		fobj.addWindowListener(this);
	}
	public void windowClosing(WindowEvent obj)
	{
		System.out.println("Inside windowClosing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent obj) 
	{
		
		String str1=tobj1.getText();
		int iNo1=Integer.parseInt(str1);
		
		String str2=tobj2.getText();
		int iNo2=Integer.parseInt(str2);
		
		
		Demo dobj=new Demo(iNo1,iNo2);
		int iRet=0;
		if(obj.getSource() == bobj1)
		{
			System.out.println("Inside Addition");
			iRet=dobj.Addition();
		}
		else if(obj.getSource() == bobj2)
		{
			System.out.println("Inside Subtraction");
			iRet=dobj.Subtraction();
		}
		else if(obj.getSource() == bobj3)
		{
			
			iRet=dobj.Mult();
		}
		else if(obj.getSource() == bobj4)
		{
			
			iRet=dobj.Division();
		}
		
		String str3=Integer.toString(iRet);
		tobj3.setText(str3);
		
		String str4=new String("Marvellous Calculator");
		tobj4.setText(str4);
	}
	
}


class MyCaluculator
{
	public static void main(String args[])throws Exception
	{
		System.out.println("Print the data on console");
		
		MarvellousFrame mobj=new MarvellousFrame("PPA");
		
		
	}
}