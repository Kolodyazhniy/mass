package mass;

public class Arrays {
	
	public static void main(String[] args) {
		int myRef[], my;// ���������� ������ �� ������ � ����������
		float[] myRefFloat, myFloat; // ��� �������!
		// ���������� � �������������� �������� ���������� �� ���������
		int myDyn[] = new int[10];
		/*���������� � �������������� */
		int myInt[] = {5, 7, 9, -5, 6, -2};//6 ���������
		byte myByte[] = {1, 3, 5};//3 ��������
		/*���������� � ������� ������ �� Object */
		Object myObj = new float[5];
		// ���������� ������������ ������
		myRef = myDyn;
		myDyn = myInt;
		myRefFloat = (float[])myObj;
		myObj = myByte;// �������� ������ ��� ��������� ������
		myRefFloat = (float[])myObj;// ������ ����������
		// ������������ ������������ ������ (����������������)
		// myInt = myByte;
		//myInt = (int[])myByte;
		} 

}
