class pattern2
{
public static void main (String ar[])
{
	int m=0;
for(int i=1;i<=5;i++)
{
		for(int k=m;k<=5;k++)
		{
			System.out.print(" ");
		}
for(int j=1;j<=m*2+1;j++)
{
	System.out.print("*");
	
}
System.out.println();
if(i<3)
{
	m++;
}
else
{
	m--;
}

}

}
}