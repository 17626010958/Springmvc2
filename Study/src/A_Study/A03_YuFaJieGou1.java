package A_Study;

import java.util.Random;
import java.util.Scanner;

public class A03_YuFaJieGou1 {

	public static void main(String[] args) {
		//1.����if��䣬�жϸ����·ݶ�Ӧ�ļ���
        Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("������Ҫ����·ݣ�");
		 * 
		 * int month = input.nextInt();
		 * 
		 * if (month == 3 || month == 4 || month == 5){ System.out.println("����."); }else
		 * if (month == 6 || month == 7 || month == 8){ System.out.println("����."); }else
		 * if (month == 9 || month == 10 || month == 11){ System.out.println("����.");
		 * }else if (month == 12 || month == 1 || month == 2){
		 * System.out.println("����."); }else { System.out.println("������·ݴ��󣡣������������롣"); }
		 */
        
      //2.��ifʵ��ҡɫ�ӵ���Ϸ�����һ�������������Scanner���룬�´�С��if�ȽϺ�����¶��˻�´���
        System.out.println("�����롮�󡯻�С����");
        String mon = input.nextLine();
        int Min = 1;
        int Max = 6;
        int result = Min + (int)(Math.random() * ((Max - Min) + 1));
        
        if (mon.equals("��")){
            if (result < 4){
                System.out.println("�´���");
            }else if(result >= 4){
                System.out.println("�¶���");
            }
        }else if (mon.equals("С")){
            if (result < 4){
                System.out.println("�¶���");
            }else if(result >= 4){
                System.out.println("�´���");
            }
        }
	}

}
