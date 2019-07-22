class sumd
{
public static void main(String [] args)
{
int m[][]={{1,2,3},{4,5,6},{7,8,9}};
int sum=0;
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
	if(i==j)
	{
		sum =sum+s[i][j];
	}
	else
	{
	continue;
	}
	}
}
System.out.println("sum of diagonals  " + sum);
}
}	