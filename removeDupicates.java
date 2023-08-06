// Java program to remove duplicate character
// from character array and print in sorted
// order
import java.util.*;

class GFG{

static char []removeDuplicate(char str[], int n)
{

	// Create a set using String characters
	// excluding '\0'
	HashSet<Character>s = new HashSet<>(n - 1);
	for(char x : str)
		s.add(x);

	char[] st = new char[s.size()];

	// Print content of the set
	int i = 0;
	for(char x : s)
	st[i++] = x;

	return st;
}

// Driver code
public static void main(String[] args)
{
char str[]= "geeksforgeeks".toCharArray();
int n = str.length;

System.out.print(removeDuplicate(str, n));
}
}

// This code is contributed by todaysgaurav
