package Polymorphism;


//Run Time Polymorphism


class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public void color(){
        System.out.println("black");
    }
    public static void main(String args[]){
    	Animal obj = new Cat();//not a proper method
    	Cat obj1 = new Cat();
    	Animal obj2 = new Animal();
    	
    	obj.sound();
    	obj.legs();
    	obj1.sound();
    	obj1.color();
    	obj1.legs();
    	obj2.sound();
    	obj2.legs();
    	//obj.color(); Error
    	
    }
}

