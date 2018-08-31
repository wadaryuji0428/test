
public class TestA {
public static void main(String[] args){
	PersonA taro=new PersonA();
	PersonA jiro=new PersonA();
	PersonA hanako=new PersonA();
	Robot aibo=new Robot();
	Robot asimo=new Robot();
	Robot pepper=new Robot();
	Robot doraemon=new Robot();
	taro.name="太郎";
	jiro.name="次郎";
	hanako.name="花子";
    aibo.name="アイボ";
    asimo.name="アシモ";
    pepper.name="ペッパー";
    doraemon.name="ドラえもん";
	taro.age=20;
	jiro.age=18;
	hanako.age=16;
	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(jiro.name);
	System.out.println(jiro.age);
	System.out.println(hanako.name);
	System.out.println(hanako.age);
	taro.talk();
	taro.walk();
	taro.run();
}
}
