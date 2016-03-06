//U10416005ªL«Ø¦t

//import ArrayList
import java.util.ArrayList;

public class RepeatAdditionQuiz{
	//Data field
	private int a;
	private int ans;
	private ArrayList list = new ArrayList();
	
	//Constructor
	public RepeatAdditionQuiz(int a,int ans){
		this.a = a;
		this.ans = ans;
	}
	//get methods
	public int getA(){
		return a;
	}
	public int getAns(){
		return ans;
	}
	//set methods
	public void setA(int a){
		this.a = a;
	}
	public void setAns(int ans){
		this.ans = ans;
	}
	//the method to add int ans in ArrayList
	public void addList(){
		list.add(ans);
	}
	//the method search whether the number has been entered
	public boolean contains(){
		return list.contains(ans);
	}
}
