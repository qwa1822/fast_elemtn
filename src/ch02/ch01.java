package ch02;

public class ch01 {
	
	int[] intArr; //int Array
	int count;   //개수
	
	
	public int Array_SIZE;
	public static final int ERROR_NUM=-99999999;
	
	
	public ch01() {
		count=0;
		Array_SIZE=10;
		intArr=new int[Array_SIZE];
		
	}
	
	public ch01(int size) {
		count=0;
		Array_SIZE=size;
		intArr=new int[size];
	}
	
	public void insrtElement(int position,int num)

	{
		int i;
		
		if(position <0 || position>count) {
			
			return;
		}
		if(count>=Array_SIZE) {    //꽉 찬 경우
			return;
		}
		for(i=count-1; i>=position; i++) {
			intArr[i+1]=intArr[i];   //하나씩 이동
		}
		
		
		intArr[position]=num;
		count++;
	}
	public int removeElement(int position)

	{
		
		int ret=ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return ret;
		}
		
		if(position<0 || position>count-1) {
			return ret;
		}
		ret=intArr[position];
		
		for(int i=position; i<=count-1; i++) {
			intArr[i]=intArr[i+1];
		}
		count--;
		return ret;
	}
	
	
	public boolean isEmpty() {
		
		if(count==0) {
			return true;
		}
		else return false;
	}
}
