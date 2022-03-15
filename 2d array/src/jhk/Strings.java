package jhk;

import java.util.Scanner;

public class Strings {
	public static  void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	//private static final int String = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in );
//		System.out.println("enter the value");
//		int rows=sc.nextInt();
//		int column=sc.nextInt();
//		int numbers[][]=new int[rows][column];
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<column;j++) {
//				numbers[i][j]=sc.nextInt();
//				
//			}
//		}
//		int x=sc.nextInt();
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<column;j++) {
//				if(numbers[i][j]==x) {
//					System.out.println("x found at location"+i+","+j);
//	
//			}
//		}
//		}
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		int matrix[][]=new int[n][m];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				matrix[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("the sprical order matrix is:" );
//		int rowstart=0;
//		int rowend=n-1;
//		int colstart=0;
//		int colEnd=m-1;
//		//sprial order matrix
//		while(rowstart<=rowend && colstart<=colEnd) {
//			
//			
//		}
//		System.out.println("enter the value");
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		int matrix[][]=new int[n][m];
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=m;j++) {
//				matrix[i][j]=sc.nextInt();
//				
//			}
//		}
//		System.out.println("transpose of a maxtrix");
//		for(int j=0;j<m;j++) {
//			for(int i=0;i<n;i++) {
//				System.out.println(" ");
//				
//			}
//			System.out.println();
//			
//		}
//		
		//string declaration
//	
//
//String fn="hm";
//String ln="m";
//String ffnn=fn+ln;
////System.out.println(ffnn.length());
//for(int i=0;i<=ffnn.length();i++) {
//	System.out.println(ffnn.charAt(i));
//}
		//.compare
//		String name1="hm";
//		String name2="m";
//		if(name1.compareTo(name2)) {
//			System.out.println("cvnsdb");
//			
//			
//	}
//		if(name1==name2) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//		
//		
//		if(new String("tony")==new String("stark")) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//
//		String sentence="himanshu mishra";
//		String name=sentence.substring(0,4);
//		System.out.println(name);
//		int a,b,i,hcf=0;
//		//Scanner sc=new Scanner(System.in);
//		System.out.println("enter first no.");
//		a=sc.nextInt();
//		System.out.println("enter second no.");
//		b=sc.nextInt();
//		for(int  i1=1; i1<=a ||  i1<=b; i1++){
//		if(a%i1==0 && b%i1 ==0)
//		hcf= i1;
//		}
//		System.out.println("hcf:"+hcf);
		//public class ABC{
			//public static void main(String[] args){
//			int array[]={1,2,3,4,5};{
//			System.out.println(lcm of array element(element_array);
//			}
//			//public static long lcm of array element(int[] element_array){
//			long lcm  array element=1;
//			int div=2;
//			while(true){
//			int count=0;
//			boolean div=false;
//			for(int i=0;i<element_array;i++){
//			if(element_array[i]==0){
//			return 0;
//			}
//			else if(element_array[i]<0){
//			element_array[i]=element_array[i]*(-1);
//			}
//			if(element_array[i]==1){
//			count++;
//			}
//			if(element_array[i]%div==0){
//			div=true;
//			element_array[i]=element_array[i]/div;
//			}
//			}
//			if(div){
//			lcm of array element = lcm of array element*div;
//			}
//			else{
//			div++;
//			}
//			if(count==element_array.length){
//			return lcm of array element;
		// array elment
//		int array[]= {8,4,2,16};
//		int lcm=array[0];
//		int gcd=array[0];
//		for(int i=1;i<array.length;i++) {
//			gcd=findGCD(array[i],lcm);
//			lcm=(lcm*array[i])/gcd;
//		}
//		System.out.println("lcm :" +lcm);
//
//	}
//
//	private static int findGCD(int a, int b) {
//		// TODO Auto-generated method stub
//		if(b==0)
//		//return 0;
//		return a;
//		//return 0;
//		return findGCD(b,a%b);
		//reverse two no.
//		System.out.println("enter the no.");
//		int i=sc.nextInt();
//		int rev=0;
//		while(i!=0) {
//			int reminder=i%10;
//			rev=rev*10+reminder;
//			i=i/10;
//		}
//		System.out.println(rev);
		//
//		int n=sc.nextInt();
//		if(n==0) {
//			System.out.println("no.is balance");
//		}else if(n>0) {
//			System.out.println("no.is +ve");
//		}else {
//			System.out.println("dsbcdsh");
//		}
//		System.out.println("enter the value");
//		int n=sc.nextInt();
//		int sum=0;
//		sum=(n*(n+1))/2;
//		System.out.println("sum"+sum);
		
//		
		//prime no
		//session.setAttribute("Result",result);
		//response.sendRedirect("index.jsp");
		//
//		String st=sc.next();
//		int len=st.length();
//		String st1="";
//		for(int i=0;i<len;i++) {
//			char ch=st.charAt(i);
//			st1=ch+st1;
//		}
//		if(st.equals(st1))
//			System.out.println("p");
//		else
//			System.out.println("not p");
//		
		//armstrong
//		int a=sc.nextInt();
//		if(a>0) {
//			int y=0,z=1,s;
//			System.out.println("f s"+y+","+z+"," );
//		
//		while(z<=a) 
//		{	s=y+z;
//			y=z;
//			z=s;
//			if(z<=a)
//				System.out.println(z+"");
//			
//		}
//		
//	}
//		else {
//			System.out.println("not");
//		}
//		int number=sc.nextInt();
//		System.out.println(number);
//		for(int i=1;i<number;i++) {
//			
//		if(number%i==0)
//			System.out.println(" ");
//		}
		
//		int n=sc.nextInt();
//		int count=0;
//		if(n==1) {
//			System.out.println("not prime");
//		}else if(n==2){
//			System.out.println("prime");
//			
//		}else {
//			for(int i=2;i<=n;i++) {
//				if(n%i==0)
//					count=count+1;
//				break;
//			}
//			if(count==1) 
//				System.out.println("noy prime");
//				else
//					System.out.println("p prime");
//			
//			
//		}
//		int i=sc.nextInt();
//		int rev=0;
//		while(i!=0) {
//			int reminder=i%10;
//			rev=rev*10+reminder;
//			i=i/10;
//		}
//		System.out.println(rev);
//		String i=sc.next();
//		int rev=0;
//		//while(i!=0)
//	 { 
//			int reminder=i%10;
//			rev=rev*10+reminder;
//			i=i/10;
//		}
//		System.out.println(rev);
		//reverse a string
		
//	String s="geeks",n="  ";
//	char ch;
//	System.out.println("orginal word");
//	System.out.println("geeks");
//	for(int i=0;i<s.length();i++) {
//		ch=s.charAt(i);
//		n=ch+n;
//		
//	}
//	System.out.println("reverse string");
//	System.out.println(n);
		//hcf
//		System.out.println("enter the no.");
//		int  num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int n=1;
//		if(num1!=num2) {
//			while(n!=0) {
//				n=num1%num2;
//				if(n!=0) {
//					num1=num2;
//					num2=n;
//				}
//			}
//			System.out.println(num2);
		//lcm
		
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int i;
//		int a=(num1>num2)?num1:num2;// logic for finding lcm
//		for(i=a;i<=num1*num2;i=i+a) {
//			if(i%num1==0&&i%num2==0)
//				break;
//		}
//		System.out.println(i);
//		
		//bit manipulation
//		int n=5;
//		int pos=2;
//		int bitMask=1<<pos;
//		if((bitMask & n)==0) {
//			System.out.println("bit was zero");
//		}else {
//			System.out.println("bit was one");
//		}
		//set bit
//		int n=5;
//		int pos=1;
//		int bitmask=1<<pos;
//		int newnum=bitmask |n;
//		System.out.println(newnum);
	//	clear bit
//		int n=5;
//		int pos=2;
//		int bitmask=1<<pos;
//		int not=~(bitmask);
//		int nunumber=not & n;
//		System.out.println(nunumber);
		//update bit
//		int n=5;
//		int pos=2;
//		int bitmask=1<<pos;
//		int num=~(bitmask);
//		int b=num&n;
//		int c=bitmask | n;
//		if(b==1) {
//		System.out.println(b);
//		}
//		else if(c==0) {
//			System.out.println(c);
//		}
//		Scanner SC=new Scanner(System.in);
//		int operr=SC.nextInt();
//		
//		int n=5;
//		int pos=1;
//		//int operr=1;
//		int bitmask=1<<pos;
//		if(operr==1) {
//			int newnum= bitmask|n;
//			System.out.println(newnum);
//		}else {
//			int newbitmask=~(bitmask);
//			int number=newbitmask & n;
//			System.out.println(number);
//		}
		
		//Sorting technique
		//bubble sort
//		int  arr[]={34,335,6476,78698,899,890,98089098,999999999,790};
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					//swap
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		printarray(arr);
//		// time complexicity =o(n^2)
		//selection sort
//		int arr[]= {7,8,9,6,8,90};
//		for(int i=0;i<arr.length-1;i++) {
//			int smallest=i;	
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[smallest]>arr[j]) {
//					smallest=j;
//				}
//			}
//			int temp=arr[smallest];
//			arr[smallest]=arr[i];
//			arr[i]=temp;
//		}
		//printarray(arr);
		//int smallest=i;//time complexicty o(n^2)
		//insertion sort
		
		
//		int arr[]= {7,8,3,1,2};
//		for(int i=1;i<arr.length;i++) {
//			int current=arr[i];
//			int j=i-1;
//			while(j>=0 && current<arr[j]) {
//				arr[j+1]=arr[j];
//				j--;
//			}
//			arr[j+1]=current;
//		}
//		printarray(arr);
//		
		
		
}
	
}
