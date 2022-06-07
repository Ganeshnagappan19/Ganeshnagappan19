
public class lower {
public static void main(String[] args) {
	int[] a= {1,2,3,2,3,6,4,9,2,3,7};
	//int count=0,count1=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==3) {
			System.out.print(i);
			break;
			
		}
	}
	
	for(int i=a.length-1;i>=0;i--) {
		if(a[i]==3) {
			System.out.print(i);
			break;
		}
	}
	//System.out.print(a.length-count+1);
}
}
 