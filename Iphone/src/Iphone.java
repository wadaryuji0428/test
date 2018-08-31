
public class Iphone {
	public static void main(String[]args){
		SmartPhone iphone=new SmartPhone();
		iphone.play();
		iphone.stop();
		iphone.next();
		iphone.back();
}
	public interface NewFunction{
		public abstract void call();
		public abstract void mail();
		public abstract void photo();
		public abstract void internet();
	}
}
