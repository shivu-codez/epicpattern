package art;

public class Rajni 
{
	public static void main(String[] args) 
	{
		int n=5;
		//block 1
		for (int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//2
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//4
			for(int j=0;j<n;j++)
			{
				if(j>n/2 && i==n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//5
			for(int j=0;j<n;j++)
			{
				if(i==n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//6
			for(int j=0;j<n;j++)
			{
				if(j>=n/2 && i>n/2 || i==n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//7
			for(int j=0;j<n;j++)
			{
				if(i>=n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//8
			for(int j=0;j<n;j++)
			{
				if(j<n/2 && i==n/2 || i>n/2 )
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//9
			for(int j=0;j<n;j++)
			{
				if(j<n/2 && i>n/2 || i==n-1 && j!=n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//10
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//11
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//12
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		//block 2
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//2
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<i+1;j++)
			{
				System.out.print(" ");
			}
			//4
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//5
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//6
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//7
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//8
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//9
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//10
			for(int j=0;j<n;j++)
			{
				if(i==0 && j==0 || i==1 && j<n/2 || i>=n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//11
			for(int j=0;j<n;j++)
			{
				if(j<n/2 && i==n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//12
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		//block3
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//2
			for(int j=0;j<n;j++)
			{
				if(j>n-i-2 && i<=n/2 || i>n/2 && i<n-1 || i==n-1 && j!=0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//3
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//4
			for(int j=0;j<n;j++)
			{
				if(i<n/2 || i==n/2 && j==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//5
			for(int j=0;j<n;j++)
			{
				if(i<n/2 || i==n/2 && j==n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//6
			for(int j=0;j<n;j++)
			{
				if(i<=n/2 || (i>n/2 && i<n-1) && j>=n/2 || (i==n-1) && j>n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//7
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//8
			for(int j=0;j<n;j++)
			{
				if(i>n/2 && j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//9
			for(int j=0;j<n;j++)
			{
				if((i>n/2 )&& j<=n/2 || i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//10
			for(int j=0;j<n;j++)
			{
				if(i==n-1 && j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//11
			for(int j=0;j<n;j++)
			{
				if((i==0 && j==n-1) || i>n/2 && j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//12
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		//block4
		for (int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				if(i==0 && j!=n-1 || j<n/2 && i<=n/2 || j<n/2 && i==n-1 || j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//2
			for (int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//3
			for(int j=0;j<n;j++)
			{
				if(j==0 && i<=n/2 || i==0 && j<=n/2 || (i>0 && i<n/2) && j<n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//4
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//5
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//6
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//7
			for(int j=0;j<n;j++)
			{
				if(i==0 && j>n/2 || (i>0 && i<n/2) && j==n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//8
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i==0 || j<n/2 && i>n/2 || i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//9
			for(int j=0;j<n;j++)
			{
				if(j==0 && i==n/2 || j<n/2 && (i>n/2 && i<n-1))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//10
			for(int j=0;j<n;j++)
			{
				if(j==0 && i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//11
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//12
			for(int j=0;j<n;j++)
			{
				if(j<n/2 && i==n/2 || j<=n/2 && i>n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//block5
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				if(j>=n/2 && i==0 || j>n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//2
			for (int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//3
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//4
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//5
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//6
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//7
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//8
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//9
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//10
			for(int j=0;j<n;j++)
			{
				if(i>=n/2 && j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//11
			for (int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//12
			for(int j=0;j<n;j++)
			{
				if(j==0 || j<n/2 && (i!=0 && i!=n-1))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

		//block6
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				if(j>n/2 && i==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//2
			for(int j=0;j<n;j++)
			{
				if(j==0 && i>=n/2 || (j>0 && j<n/2) && i>0 || i==n-1 && j<=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//3
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 && (i<=n/2 && i!=0))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//4
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//5
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//6
			for(int j=0;j<n;j++)
			{
				if(j==0 && (i>=n/2 && i!=n-1))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//7
			for(int j=0;j<n;j++)
			{
				if(j>=n/2 && i!=0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//8
			for(int j=0;j<n;j++)
			{
				if(i!=0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//9
			for(int j=0;j<n;j++)
			{
				if((j<=n/2 && i<=n/2) && i!=0 || j<n/2 && i>n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//10
			for(int j=0;j<n;j++)
			{
				if(j==0 || j<n/2 && i!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//11
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i!=0 || i>n/2 && j!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//12
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//block 7
		for(int i=0;i<n;i++)
		{
			//1
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//2
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//3
			for(int j=0;j<n;j++)
			{
				if(j==0 && i==n/2  ||  j==0 && i==0 || (j>0 && j<n/2) && i>0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//4
			for(int j=0;j<n;j++)
			{
				if(j>0 && i==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//5
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//6
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//7
			for(int j=0;j<n;j++)
			{
				if(j>n/2 && i==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//8
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//9
			for(int j=0;j<n;j++)
			{
				if(j==0 && i==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//10
			for(int j=0;j<n;j++)
			{
				if((j>=n/2 && j<n-1) && i<n/2 || j==n/2 && i!=n-1 || (j>0 && j<n/2) && i==n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//11
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//12
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		//block8
		for(int i=0;i<n;i++)
		{
			//1
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//2
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<n;j++)
			{
				if(j==n/2 && i<=n/2 || j>n/2 && i>n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//4
			for(int j=0;j<n;j++)
			{
				if(j<n/2 && i==n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//5
			for(int j=0;j<n;j++)
			{
				if(j>n/2 && (i>n/2 && i<n-1))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//6
			for(int j=0;j<n;j++)
			{
				if(j>0 && (i>0 && i<n/2) || j<=n/2 && i==n/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//7
			for(int j=0;j<n;j++)
			{
				if(j<=n/2 && (i>0 && i<n/2) || j>0 && i==n/2) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//8
			for(int j=0;j<n;j++)
			{
				if(j<n/2 && (i>n/2 && i<n-1)) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//9
			for(int j=0;j<n;j++)
			{
				if(j>=n/2 && i>n/2) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//10
			for(int j=0;j<n;j++)
			{
				if((j>0 && j<n/2) && i==0 || j==0 && i>0) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//11
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//12
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		//block9
		for(int i=0;i<n;i++)
		{
			//1
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//2
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i<=n/2 || (j>n/2 && j<n-1) && (i>0 && i<n/2)) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//4
			for(int j=0;j<n;j++)
			{
				if(j<=n/2 && i<=n/2 || i==n/2 && j!=n-1 || (j>0 && j<=n/2) && (i>n/2 && i<n-1) || j>n/2 && i==n-1) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//5
			for(int j=0;j<n;j++)
			{
				if(j<=n/2 && i==n-1 || j==n-1 && i==n-1) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//6
			for(int j=0;j<n;j++)
			{
				if(i==n/2 && j>=n/2 || i>n/2) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//7
			for(int j=0;j<n;j++)
			{
				if(j==0 && i==n/2 || j<n-1 && i>n/2 || i==n-1) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//8
			for(int j=0;j<n;j++)
			{
				if(j>=n/2  && i==n-1 || j==0 && i==n-1 || j==n-1 &&(i>n/2 && i<n-1)) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//9
			for(int j=0;j<n;j++)
			{
				if(i==0 && j==0 || j>n/2 && i==n-1 || j==n-1 && i>=n/2) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//10
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//11
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//12
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		//block10
		for (int i=0;i<n;i++)
		{
			//1
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//2
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<n;j++)
			{
				if(i==0 && j!=n-1 || j<=n/2 &&(i>0 && i<n/2) || j<n/2 && i>=n/2 && i!=n-1 || j==0 && i==n-1) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//4
			for(int j=0;j<n;j++)
			{
				if(j==0 || j>=n/2 && i==0 || j>n/2 && (i>0 && i<n/2) || j==n-1 && i==n/2) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//5
			for(int j=0;j<n;j++)
			{
				if(j<n/2 && i>n/2 || j<=n/2 && i==n-1) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//6
			for (int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//7
			for (int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//8
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i==n/2 || j>n/2 && i>n/2 || j>0 && i==n-1) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//9
			for(int j=0;j<n;j++)
			{
				if(j<n/2 && i==0 || (j>n/2 && j<n-1) && i==0 || j==0 && i<n/2 || j==n-1 && i!=0) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//10
			for(int j=0;j<n;j++)
			{
				if(j<n-1 && i>=n/2 || j==n-1 && i>n/2 ) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//11
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//12
			for (int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=0;i<1;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//2
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<n;j++)
			{
				if(j!=0) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//4
			for(int j=0;j<n;j++)
			{
				if(j==0) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//5
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//6
			for(int j=0;j<n;j++)
			{
				if(j>n/2) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//7
			for(int j=0;j<n;j++)
			{
				if(j<=n/2) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//8
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//9
			for(int j=0;j<n;j++)
			{
				if(j==n-1) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//10
			for(int j=0;j<n;j++)
			{
				if(j!=n-1) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			//11
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			//12
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
