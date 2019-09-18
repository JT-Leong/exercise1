///Multable
/**
*@program:Multable
*@Description:null
*@author:Liang Jianteng
*@date:2019-9-18
*/
import java.util.Scanner;
public class Multable{
	public static void main(String[] args){
		System.out.print("Enter a number for MulTable:");
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		//int p = 9;
		for(int i=1;i<=p;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
	}
}