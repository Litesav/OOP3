package InheritanceandPolymorphism;

public class Bird extends Animal implements tame, walkInYard { //множественная реализация интерфейсов (множественного наследования классов в Java нет)
	public int wings = 2;
	
	void beBorn(){
		super.beBorn(); //ключевое слово super позволяет обратиться к методу родительского класса
		System.out.println("Птица родилась");
	}
	
	public void grow(){ //необходимо указать как public (как и в родительском классе), иначе ошибка
		System.out.println("Птица растёт");
	}
	
	void walking(){
		System.out.println("Птица умеет ходить");
	}
	
	
	void flying(){
		System.out.println("Птица умеет летать");
	}
	
	
	//обязательно реализовать методы указанных интерфейсов, иначе ошибка
	
	public void actionTame(){ //реализованные методы интерфейсов всегда должны быть public
		System.out.println("Действие от реализованного интерфейса - приручить к домашнему животному(реализовано в Bird)");
	}

	public void actionWalkInYard() {
		System.out.println("Действие от реализованного интерфейса - ходьба во дворе(реализовано в Bird)");
	}

}

	//Дочерний класс Chicken неявно получит и методы, реализованные от интерфейса, которые при желании можно переопределить. 
	//Однако, реализация методов интерфейса, реализованного в родительском классе, необязательна.