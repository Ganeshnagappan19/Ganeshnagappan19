package june15;
class Ajithgeneric<T>{
T obj;
void add(T obj){this.obj=obj;}
T get(){return obj;}
}
class TestGenerics1{  	
public static void main(String args[]){
Ajithgeneric<Integer> m=new Ajithgeneric<Integer>();
m.add(2);
//m.add("vivek");//Compile time error
System.out.println(m.get());
}}
