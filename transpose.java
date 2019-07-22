class a
{
public static void main(String [] args)
{
int s[][] = {{1,2,3},{4,5,6},{7,8,9}};
System.out.println("matrix is");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
	System.out.print(s[i][j]+" ");
	}
	System.out.println();
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
	if(j>i)
	{
		int r;
		r=s[i][j];
		s[i][j]=s[j][i];
		s[j][i]=r;
	}
	else{
	continue;
	}
	}
}
System.out.println("Transpose is");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
	System.out.print(s[i][j]+" ");
	}
	System.out.println();
}
}
}