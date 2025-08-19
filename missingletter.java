package arrays;

public class missingletter {
	public static void main(String[] args)
	{
		String s1="rajagopal";
		int s2=s1.length();
		System.out.println(s2);
        String ar1="raju";
		String ar2="raju";
		if(ar1.equals(ar2))
		{
			String s3=ar2.concat(ar1);
			System.out.println(s3);
		}
		String email= "r a j u";
		
		System.out.println(email.indexOf('a'));
		System.out.println(email.replace(' ','S'));
	}

}
