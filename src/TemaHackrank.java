import java.util.HashSet;
import java.util.Scanner;

public class TemaHackrank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		scanner.nextLine();
		HashSet<String> set=new HashSet<>();
           for(int i=0;i<n;i++) {
        	   String pair=scanner.nextLine();
        	   set.add(pair);
        	System.out.println(set.size());
        	   
           }
           scanner.close();
	}

}
