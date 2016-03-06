//U10416005ªL«Ø¦t
import java.util.ArrayList;

public class RepeatAdditionQuiz{
	private int a;
	private int ans;
	private ArrayList list = new ArrayList();
	
	public RepeatAdditionQuiz(int a,int ans){
		this.a = a;
		this.ans = ans;
	}
	public int getA(){
		return a;
	}
	public int getAns(){
		return ans;
	}
	public void setA(int a){
		this.a = a;
	}
	public void setAns(int ans){
		this.ans = ans;
	}
	public void addList(){
		list.add(ans);
	}
	public boolean contains(){
		return list.contains(ans);
	}
}