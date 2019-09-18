//Pyramid
/**
*@program:Pyramid(Goldtower)
*@Description:null
*@author:Liang Jianteng
*@date:2019-9-18
*/
import java.util.Scanner;
public class Goldtower{
	public static void main(String[] args){
		System.out.print("Please enter the number of layers:");
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		for(int i = 1;i <= p;i++){
			for(int j = p-i;j >= 0;j--){
				System.out.print(" ");
			}
			for(int k = 2*i-1;k > 0;k--){
				System.out.print("$");
			}
			System.out.println();
		}
		
		
	}
}
