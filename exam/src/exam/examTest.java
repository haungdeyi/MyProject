package exam;

import java.util.Scanner;

public class examTest {


	 public static void main(String[] args){
	      
	      boolean flag = false;
	      
	      Scanner sc = new  Scanner(System.in);
	      System.out.println("请输入最小值....");
	      int m = sc.nextInt();
	      System.out.println("请输入最大值....");
	      int n = sc.nextInt();
	      
	      if(m < n){
	        for(int i = m;i<n;i++){
	           
	        	int count = 0;
	            int j = i;
	            while(j / 10 >=0 ){
		            int temp = j % 10;
		            count = count + (temp*temp*temp);
	          
		            if((j = j / 10)== 0){
		               break;
		            } 
	             }
	             if(count == i) {
	              flag = true;
	              System.out.print(i + " ");
	             }
	          }
	          if(!flag){
	             System.out.println("no");
	          }
	       } 
	      else{
	      
	           for(int i = n;i<m;i++){
	           
	        	int count = 0;
	            int j = i;
	            while(j / 10 >=0 ){
		            int temp = j % 10;
		            count = count + (temp*temp*temp);
	          
		            if((j = j / 10)== 0){
		               break;
		            } 
	             }
	             if(count == i) {
	              flag = true;
	              System.out.print(i + " ");
	             }
	          }
	          if(!flag){
	             System.out.println("no");
	          }
	      }
	    }
}
