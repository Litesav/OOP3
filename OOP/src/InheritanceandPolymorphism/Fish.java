package InheritanceandPolymorphism;

public class Fish extends Animal implements tame{
	int fins = 2;
	
	public void beBorn(){ 
		System.out.println("Рыба родилась");
	}
	
	//Несмотря на то, что в родительском классе модификатор доступа не определен, как public, если мы укажем public при 
	//переопределении, ошибки не будет. Но в обратную сторону это не действует. 
	
	void swimming(){
		System.out.println("Рыба умеет плавать");
	}

	//обязательно реализовать методы указанного интерфейса, иначе ошибка
	
	public void actionTame(){ //реализованные методы интерфейсов всегда должны быть public, т.к все элементы интерфейсов являются public
		System.out.println("Действие от реализованного интерфейса - приручить к домашнему животному (Реализовано в Fish)");
	}
}
