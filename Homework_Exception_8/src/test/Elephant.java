package test;

public class Elephant {
	private int length;
	private int wide;
	private int high;
	public Elephant(){
		length = 0;
		wide = 0;
		high = 0;
	}
	public Elephant(int a,int b,int c){
		length = a;
		wide = b;
		high = c;
	}
	public int getLength(){
		return  length;
	}
	public int getWide(){
		return  wide;
	}
	public int getHigh(){
		return  high;
	}
}
