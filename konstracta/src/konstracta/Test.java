package konstracta;

public class Test {
public static void main(String[] args){
	Person taro=new Person();
	taro.name="太郎";
	taro.age=20;
	Person jiro=new Person("次郎",0);
	Person saburo=new Person("三郎");
	System.out.println("JIROの名前は"+jiro.name);
}
}