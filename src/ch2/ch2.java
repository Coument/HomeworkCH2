package ch2;
import	java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ch2{
	public static void main(String[] args) throws IOException{
		/*System.out.println("請輸入整數");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br1.readLine());
		if (num==1) {
			System.out.println("輸入的是1");
			System.out.println("選擇的是1");
		}
		System.out.println("結束");*/
		
		/*System.out.println("請輸入整數");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br1.readLine());
		if (num==1)
			System.out.println("輸入的是1");
			System.out.println("選擇的是1");
		System.out.println("結束");*/
		
		/*System.out.println("請輸入整數");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br1.readLine());
		if (num==1) {
			System.out.println("輸入的是1");
		}
		else {
			System.out.println("選擇的是1以外的");
		}
		System.out.println("結束");*/
		
		/*System.out.println("請輸入整數");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br1.readLine());
		if (num==1) {
			System.out.println("輸入的是1");
		}
		else if(num==2){
			System.out.println("選擇的是2");
		}
		else {
			System.out.println("請輸入1或2");
		}
		System.out.println("結束");*/
		
		/*System.out.println("請輸入整數");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br1.readLine());
		switch (num) {
		case 1:{
			System.out.println("輸入的是1");
			break;
		}
		case 2:{
			System.out.println("輸入的是2");
			break;
		}
		default:{
			System.out.println("請輸入1或2");
			break;
		}
		}*/
		
		/*System.out.println("請輸入整數");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br1.readLine());
		switch (num) {
		case 1:{
			System.out.println("輸入的是1");
		}
		case 2:{
			System.out.println("輸入的是2");
		}
		default:{
			System.out.println("請輸入1或2");
		}
		}*/
		
		/*System.out.println("請輸入a or b");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str=new String();
		char x=str.charAt(0);
		switch (x) {
		case 'a':{
			System.out.println("輸入的是a");
			break;
		}
		case 'b':{
			System.out.println("輸入的是b");
			break;
		}
		default:{
			System.out.println("請輸入a或b");
			break;
		}
		}*/
		
		/*System.out.println("請問是男生?");
		System.out.println("請輸入Y或N");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str=new String();
		char x=str.charAt(0);
		if (x=='Y'||x=='y') {
			System.out.println("是男生");
		}
		else if(x=='n'||x=='N'){
			System.out.println("是女生");
		}
		else {
			System.out.println("請輸入Y或N");
		}*/
		
		/*System.out.println("請問要選哪條路線");
		System.out.println("請輸入整數");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str=br1.readLine();
		int x=Integer.parseInt(str);
		char n=x==1?'A':'B';
		System.out.println("選擇了"+n+"路線");*/
		
		/*for (int i=1;i<=5;i++) {
			System.out.println("第"+i+"次");
		}
		System.out.println("結束");*/
		
		/*int i=1;
		while(i<=5) {
			System.out.println("第"+i+"次");
			i++;
		}
		System.out.println("結束");*/
		
		/*int i=1;
		do {
			System.out.println("第"+i+"次");
			i++;
		}while(i<=5);
		System.out.println("結束");*/
		
		/*int i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				System.out.println("i是"+i+":j是"+j);
			}
		}*/
		
		/*System.out.println("請問要在第幾次結束迴圈");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str=br1.readLine();
		int x=Integer.parseInt(str);
		for (int i=1;i<=10;i++) {
			System.out.println("第"+i+"次");
			if(x==i)
				break;
		}*/
		
		/*System.out.println("請問要跳過第幾次");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str=br1.readLine();
		int x=Integer.parseInt(str);
		for (int i=1;i<=10;i++) {
			if(x==i)
				continue;
			System.out.println("第"+i+"次");
		}*/
		
		/*int[] t=new int[5];
		t[0]=80;
		t[1]=30;
		t[2]=55;
		t[3]=28;
		t[4]=87;
		
		for(int i=0;i<5;i++){
			System.out.println("第"+(i+1)+"個人的分數是"+t[i]+"分");
		}*/
		
		/*int[] intA=(int[]) Array.newInstance(int.class,3);
		Array.set(intA,0,123);
		Array.set(intA,1,456);
		Array.set(intA,2,789);
		
		System.out.println("intArray[0]="+Array.get(intA, 0));
		System.out.println("intArray[1]="+Array.get(intA, 1));
		System.out.println("intArray[2]="+Array.get(intA, 2));*/
		
		/*int[] t= {80,60,33,58,41};
		for(int i=0;i<5;i++){
			System.out.println("第"+(i+1)+"個人的分數是"+t[i]+"分");
		}*/
		
		/*int[] t= {80,60,33,58,41};
		for(int i=0;i<t.length;i++){
			System.out.println("第"+(i+1)+"個人的分數是"+t[i]+"分");
		}
		System.out.println("考試人數"+t.length+"人");*/
		
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入5個人的分數");
		Integer test[]=new Integer[5];
		for(int i=0;i<test.length;i++) {
			String str=br1.readLine();
			test[i]=Integer.parseInt(str);
		}
		Arrays.sort(test,Collections.reverseOrder());
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"名分數是"+test[i]);
		}
	}
}