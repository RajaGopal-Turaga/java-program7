package treess;

	class Calculator{
		int add(int a,int b) {
			return a+b;
		}
		int add(int a,int b,int c) {
			return a+b+c;
		}
		float add(float a,float b) {
			return a+b;
		}
		String add(String a,String b) {
			return a+b;
		}
	}
	public class methodoverloading {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator cal=new Calculator();
			System.out.println("Two integers sum:"+cal.add(2, 5));
			System.out.println("Three integers sum:"+cal.add(2, 3,4));
			System.out.println("Two float numbers sum:"+cal.add(2.3f,3.2f));
			System.out.println("Two strings concat:"+cal.add("Heyy ","GoodAfternoon"));
			
		}

	}
	 


