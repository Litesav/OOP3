package InheritanceandPolymorphism; //Наследование и полиморфизм на практике

public class Main {
	public static void main(String[] args){
		//Animal objAnimal = new Animal(); - создание объекта на основе абстрактного класса невозможно
		Bird objBird = new Bird(); //создание объекта objBird на основе класса Bird
		format("Bird");
		System.out.println("Доступные поля - " + "age: " +objBird.age + " wings: " + objBird.wings);
		objBird.beBorn();
		objBird.grow();
		objBird.breathe();
		objBird.death();
		objBird.actionTame();
		objBird.actionWalkInYard();
		Fish objFish = new Fish();
		format("Fish");
		System.out.println("Доступные поля - " + "age: " +objFish.age + " fins: " + objFish.fins);
		objFish.beBorn();
		objFish.grow();
		objFish.breathe();
		objFish.death();
		objFish.actionTame();
		Chicken objChicken = new Chicken();
		format("Chicken");
		System.out.println("Доступные поля - " + "age: " +objChicken.age + " wings: " + objChicken.wings + " idC: " + objChicken.idC);
		objChicken.beBorn();
		objChicken.grow();
		objChicken.breathe();
		objChicken.death();
		objChicken.actionTame();
		objChicken.actionWalkInYard();
		objChicken.toName();
		Som objSom = new Som();
		format("Som");
		System.out.println("Доступные поля - " + "age: " +objSom.age + " fins: " + objSom.fins + " idS: " + objSom.idS);
		objSom.beBorn();
		objSom.grow();
		objSom.breathe();
		objSom.death();
		objSom.actionTame();
		objSom.toName();
		
		testInterfaceVariable(objBird,objFish,objChicken,objSom); //смотреть в последнюю очередь
		
		
		System.out.println("Test1333");
		System.out.println("Тестовое изменение");  
	}
	
	static void format(String className){
		System.out.println();
		System.out.println("Анализ объекта на основе класса " + className);
		System.out.println("_____________________");
	}
	
	//в этом методе тестируем доступ к переменным в интерфейсах tame и walkInYard, реализованных в Fish и Chicken
	//Bird реализовал два интерфейса. Fish реализовал один интерфейс
	static void testInterfaceVariable(Bird objBird, Fish objFish, Chicken objChicken, Som objSom){
		System.out.println("_____________________");
		System.out.println("\nПросмотр доступа к чтению переменных реализованных интерфейсами");
		System.out.println("Доступ к переменным интерфейса в классе Bird: " + objBird.test + " " + objBird.test2);
		System.out.println("Доступ к переменным интерфейса в классе Chicken: " + objChicken.test + " " + objChicken.test2);
		System.out.println("Доступ к переменным интерфейса в классе Fish: " + objFish.test);
		System.out.println("Доступ к переменным интерфейса в классе Som: " + objSom.test);
		
		//попытка изменить эти переменные
		
		//objBird.test = 3;  - ошибка, final переменные нельзя изменять. Все переменные в интерфейсах final public
		
	}

}
