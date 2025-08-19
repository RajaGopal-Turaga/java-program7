package treess;
	import java.util.Scanner;
	class Student1{
		public int roll_no;
		public String name;
		Student1(int roll_no,String name){
			this.roll_no=roll_no;
			this.name=name;
		}
		void print() {
			
		}
	}

	public class student {

		public static void main(String[] args) {
			// TODO Auto-generated method 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter how many Students data:");
			int n=sc.nextInt();
			int i=0;
			for(i=0;i<n;i++) {
			System.out.println("Enter details for the student"+(i+1));
			System.out.print("Name:");
			String name=sc.next();
			System.out.print("Roll No:");
			int roll_no=sc.nextInt();
			System.out.println("---------------------------------");
			
			Student1[] o;
			o=new Student1[5];
			o[0]=new Student1(1,"Alice");
			o[1]=new Student1(2,"Bob");
			o[2]=new Student1(3,"Charlie");
			o[3]=new Student1(4,"David");
			o[4]=new Student1(5,"Eve");
		}

	}
}
