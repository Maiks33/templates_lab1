
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
/*interface  Task{
	int Question( int type_);
}
 */
public class App{
	public static ArrayList<Integer> listInt;
	public static String[][] listStr;

	public static int Question_1(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("��� �������:" + "\n" + "1.Int" + "\n" + "2.String");
		int num = in.nextInt();
		return num;
	}
	
	public static int Question_2(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("�������� ����������:" + "\n" + "1.������ ���������� ���������� �� �����, ������� ��������, ����������� � ������������ �������" 
		+ "\n" + "2.������ ���������� ������� �� ������ ������ ��� �������� ��������, � ����������� �� ���������" + "\n" + "3. ��������� ��� �����������");
		int num = in.nextInt();
		return num;
	}
	
	public static int Question_3(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("�������: " + "\n" + "1.������" + "\n" + "2. ��������");
		int num = in.nextInt();
		in.close();
		return num;
	}
	
	public static int Question_4(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("�������� ����������:" + "\n" + "1.������ ���������� � ���������� ����������� ������" 
		+ "\n" + "2.������ ���������� ������������ ���������� ���� � ������ ������, ����� ���������� ���� � �������� �� ���� ������� ������" + "\n" + "3.��������� ��� �����������");
		int num = in.nextInt();
		in.close();
		return num;
	}

	public static void main(String[] args) throws IOException, InterruptedException{
		int q = 0;
		int type = 0;
		String Type = " ";
		//Create to hands ( int and string) to help with task
		Handler int_hand = new Handler();
		Handler str_hand = new Handler();

		q = Question_1();
		switch (q) {
           case 1:
   				listInt = Generator.Gen(type);
       			q = Question_2();
           		if (q==1){
        			int_hand.getIntResultFirst(listInt);
        			break;
           		}
          		if (q==2){
          			q = Question_3();
          			if (q==1 || q==2){
						int_hand.getIntResultSecond(listInt,q);
						break;
          			}
          			else{
          				System.out.println("������ �����!");
          				System.exit(0);
          			}	
           		}
    			if (q==3){
    				q = Question_3();
          			if (q==1 || q==2){
          				int_hand.getIntResultFirst(listInt);
     	        	    System.out.println();
          				int_hand.getIntResultSecond(listInt,q);
          				break;
          			}
          			else{
          				System.out.println("������ �����!");
          				System.exit(0);
          			}	
      			}
          		else{
      				System.out.println("������ �����!");
      				System.exit(0);
          		}
        	   
           case 2:
        	   listStr = Generator.Gen(Type);
        	   q = Question_4();
        	   if (q==1){
				   str_hand.getStrResultFirst(listStr);
	               break;
        	   }
        	   if (q==2){
				   str_hand.getStrResultSecond(listStr);
	               break;
        	   }
        	   if (q==3){
				   str_hand.getStrResultFirst(listStr);
	        	   System.out.println();
				   str_hand.getStrResultSecond(listStr);
	               break;
        	   }
        	   else{
	     			System.out.println("������ �����!");
	     			System.exit(0);
         		}

           default:
        	   System.out.println("ERROR");
               break;
       }
	
	/*
		if (q == 1){
			listInt = Generator.Gen(type);
			break;
		}
		if(q == 2){
			listStr = Generator.Gen(Type);
			break;
		}
		else{
			q = Question_1();
		}

	for (int i=0;i<listInt.size();i++){
		System.out.println(listInt.get(i));
	}*/
	//Handler.getResultFirst(listInt);
}
}
