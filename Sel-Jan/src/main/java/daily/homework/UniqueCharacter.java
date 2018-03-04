package daily.homework;

public class UniqueCharacter {

	public static void main(String[] args) {
		char a[] = new char[20];
		char b[] = new char[20];

		String inputString = "Good Morning";

		for (int i = 0; i < inputString.length(); i++) {
			a[i] = inputString.toLowerCase().charAt(i);
			b[i] = ' ';
		}

		int i, j;

		for (i = 0; i < a.length; i++) {
			char currentChar = a[i];
			boolean alreadyExists = false;

			for (j = 0; j < b.length; j++) {
				if (b[j] == currentChar) {
					alreadyExists = true;
					break;
				}

			}

			if (!alreadyExists) {
				b[i] = a[i];
			}

		}

		
		for(int k=0;k<b.length;k++)
		{
			if(b[k]!=' ')
			{
		System.out.print(b[k]);
			}
	}}}

	