package org.system;
//Assignment1 Week3 day1
public class Desktop extends Computer{
	
	//Assignment1 single inheritance
	public void desktopsize()
	{
		System.out.println("Desktop sizes are given");
	}

	public static void main(String[] args) {
	
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopsize();
			

	}

}
