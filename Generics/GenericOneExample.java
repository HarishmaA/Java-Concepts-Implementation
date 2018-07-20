package Generics;
class Generic<T>
{ 
private T dataMember1;
public Generic(T element)
{
	this.dataMember1=element;
}
public T getDataMember()
{
	return this.dataMember1;
}
}
public class GenericOneExample {

	public static void main(String[] args) {
	Generic<String> obj1=new Generic<>("hello");
	System.out.println(obj1.getDataMember());
	
	Generic<Integer> obj2=new Generic<>(23);
	System.out.println(obj2.getDataMember());
	}

}
