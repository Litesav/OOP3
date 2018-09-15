package InheritanceandPolymorphism;

abstract class Animal {
	int age = 0;
	
	void beBorn(){
		System.out.println("Животное родилось");
	}
	
	public void grow(){ //сделали public, чтобы проверить способ инициализации в потомке Bird при переопределении
		System.out.println("Животное растёт");
	}
	
	void breathe(){
		System.out.println("Животное дышит");
	}
	
	public void death(){
		System.out.println("Животное умирает");
	}

}
