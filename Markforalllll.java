public class Student{

	public static void main(String[] args) {
		String[] name={"abi","ajay","aadhi","abu"};
		int [][] mark={{76,60,98,76,65},{54,26,85,95,76},{95,86,84,75,65},{94,96,97,85,75}};
		for(int i=0;i<name.length;i++)
		{
		    System.out.println("Name ="+name[i]);
		    double total=0;
		    for(int j=0;j<mark[i].length;j++)
		    {
		        System.out.print(mark [i][j]+"");
		        total=mark[i][j];
		    }
		    {
		        System.out.println();
		        System.out.println("Average:"+(total/5)+"%"); 
		        System.out.println();
		    }
		}
	}
}
