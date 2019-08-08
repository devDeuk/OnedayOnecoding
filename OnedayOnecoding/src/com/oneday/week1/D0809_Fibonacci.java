package com.oneday.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @FileName : Fibonacci.java
 * @Project : OnedayOnecoding
 * @Date : 2019. 8. 8. 
 * @작성자 : d e u k
 * @변경이력 :
 * @프로그램 설명 : 
 * 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치의 수의 합이 된다. 
 * 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라
 * 예제)
 * Input 
 *  -  N = 12
 * Output
 *  - 10 ( 0,1,2,3,5,8 중 짝수인 2+8= 10) 
*/
public class D0809_Fibonacci {

	/*
	 1. input 값을 받는다. 
	 2. input 받은 값에 피보나치 배열을 만든다.
	 3. 피보나치배열에서 짝수를 추출한다.
	 4. 추출한 짝을수를 더한다.
	 5. 결과를 노출한다.
	 */
    
	public static void main(String[] args) throws Exception{
		
		String input= "";
		System.out.print("숫자를 입력하세요 : ");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
		    input = br.readLine();
		
		} catch (IOException e) {
		    e.printStackTrace();
		}
		int number1 = 0;
		int number2 = 0;
		
		//2. input 받은 값에 피보나치 배열을 만든다.
		List<Integer> fibLst = new ArrayList<Integer>();
		
		if(Integer.parseInt(input) != 0){
		    while(number1 <= Integer.parseInt(input)){
		    	
		        if(number1 == 0){
		        	fibLst.add(number1);
		            number1 ++;
		            fibLst.add(number1);
		        }else{
		        	int num = number1;
		        	number1 = number1 + number2;
				    if(!(number1 >Integer.parseInt(input))){
				       fibLst.add(number1);
				       number2 = num;
				    }
				}
		       
			}
		}else{
			fibLst.add(number1);
		}
		
		//4. 짝수만 추출한다.
		List<Integer> fibEvenLst = new ArrayList<Integer>();
		
		int evenNumSum = 0;
		for(int n:fibLst){
			System.out.print(n + " ");
			
			if(n%2 == 0) {
				fibEvenLst.add(n);
				evenNumSum+=n; 
			}
		}
		
		System.out.println(" ");
		System.out.println("짝수 합계는 " + evenNumSum);
		for(int z:fibEvenLst) {
			System.out.print(z + "+");
		}
		System.out.print("=" + evenNumSum);
	}//main		
}
