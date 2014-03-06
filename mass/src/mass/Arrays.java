package mass;

public class Arrays {
	
	public static void main(String[] args) {
		int myRef[], my;// объ€вление ссылки на массив и переменной
		float[] myRefFloat, myFloat; // два массива!
		// объ€вление с инициализацией нулевыми значени€ми по умолчанию
		int myDyn[] = new int[10];
		/*объ€вление с инициализацией */
		int myInt[] = {5, 7, 9, -5, 6, -2};//6 элементов
		byte myByte[] = {1, 3, 5};//3 элемента
		/*объ€вление с помощью ссылки на Object */
		Object myObj = new float[5];
		// допустимые присваивани€ ссылок
		myRef = myDyn;
		myDyn = myInt;
		myRefFloat = (float[])myObj;
		myObj = myByte;// источник ошибки дл€ следующей строки
		myRefFloat = (float[])myObj;// ошибка выполнени€
		// недопустимые присваивани€ ссылок (нековариантность)
		// myInt = myByte;
		//myInt = (int[])myByte;
		} 

}
