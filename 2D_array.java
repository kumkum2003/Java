class 2D_array
{
public static void main(String ar[])
{
int x[][][]={
	{{10,20,30},{40,50,60}},
	{{11,21,31},{41,51,61}},
			};
			
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					for(int k=0;k<x[i][j].length;k++)
					{
						System.out.print(x[i][j][k]+" ");
					}
					
						System.out.println();
				}
				System.out.println();
				System.out.println();
			}
}
}