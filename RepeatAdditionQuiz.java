//U10416005ªL«Ø¦t
import java.util.ArrayList;

public class RepeatAdditionQuiz{
	private int a;
	private int ans;
	private ArrayList list = new ArrayList();
	
	public RepeatAdditionQuiz(int a,int ans){
		this.a = a;
		this.ans = ans;
		list.add(a);
		list.add(ans);
	}
	public int getA(int a){
		return a;
	}
	public int getAns(int ans){
		return ans;
	}
	public void setA(){
		this.a = a;
		list.add(a);
	}
	public void setAns(){
		this.ans = ans;
		list.add(ans);
	}
	public boolean contains(){
		return list.contains(ans);
	}
}