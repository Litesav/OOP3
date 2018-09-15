package InheritanceandPolymorphism;

public interface tame { //приручить
	int test = 5; 
	//переменная неявно имеет модификаторы доступа final public.
	//Это значит, что классы, которые наследуют этот интерфейс, и их потомки получают доступ к этой переменной, но изменить её не смогут. См. в Main
	
	void actionTame();
}
