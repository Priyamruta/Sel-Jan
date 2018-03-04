package daily.homework;

public class UniqueCharacter2 {

	public static void main(String[] args) {
		char a[]=new char[256];
		char b[]=new char[256];



		String inputString = "Happy new year";

		for(int i =0; i<inputString.length(); i++) 
		{
			a[i]=inputString.toLowerCase().charAt(i);
			b[i]=' ';

		}

		int i,j;
		for(i=0;i<a.length;i++)
		{
			char currenttext=a[i];
			boolean alreadyexist=false;

			for(j=0;j<b.length;j++)
			{
				if(b[j]==currenttext) {
					alreadyexist=true;
					break;
				}

			}

			if(!alreadyexist)
			{
				b[i]=a[i];
			}
		}
		for(int k=0;k<b.length;k++)
		{
			if(b[k]!=' ')
			{
				System.out.print(b[k]);
			}
		}


	}}