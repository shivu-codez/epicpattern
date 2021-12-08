package art;

public class Ganesha {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n*4; j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(i>n/2 && j>n/2 || i==n-1 && j>=n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>n/2 || i==n/2 && j!=n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>n/2 && j==0 || i==n-1 && j<n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for (int j = 0; j < n*4; j++) {
				System.out.print("0");
			}

			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for (int j = 0; j < n*2; j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 && j>n/2 || i==n-1 && j==n-1 || i==n-2 && j>0 && j<=n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 || i==n-(n-1) && j!=0 || i==n-1 || i==n-2 && j==n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i!=0 || j>n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			
			for(int j=0;j<n;j++) {
				if(i>0 || i==0 && j==0) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 || i==n-1 || i==n-(n-1) && j<=n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(( i==n/2 || i==n-1 )&& j==0 || i==n-2 && j>=n/2 && j!=n-1 ) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for (int j = 0; j < n*2; j++) {
				System.out.print("0");
			}
			
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(i==0 && j==n-1 || i==n/2 && j<n/2 || i==n-2 && j>0 && j<=n/2 || i==n-(n-1)  && j>0 && j<=n/2 || i==n-1 && j>n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 && j==0) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j==0 || i==n-(n-1) && j>0 && j<n-1 || j==n-1 && i>=n/2 && i!=n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>=n/2 && j==0 || i>=n/2 && j==n-1 && i!=n-1 || i==n-1 && j==n-(n-1)) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>=n-(n-1) && j<n/2 && i!=n-1 || j==n-1 && i==n-1 || j==n/2 && i>=n/2 && i<n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 && j>0 && j<n-1 || i==n-(n-1) && j==n-1 || i==n-2 && j<n/2 || i==n-1 && j==0) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-(n-1) && j<=n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-(n-1) ) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 && j>=n/2 || i==n-(n-1) && j<n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-2 && j<=n/2 || i==n-1 && j>0 && j<=n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<=n/2 || i==n-(n-1) && j>n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if( i==n-(n-1) && j==0) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(j<n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(j>n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n*2;j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-2 && j>0 && j<n-1 || i==n/2 && j==n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 && j<=n/2 || i==n-(n-1) && j>n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<=n/2 || i==n-(n-1) && j==0) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n*4;j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-(n-1) && j>=n/2 || i==0 && j<n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 && j<=n/2 || i==n-2 && j==n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<n/2 || i==n-(n-1) && j>=n/2 || i==n-2 && j<n/2 || i==n-1 && j>n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 && j<n/2 || i==n-2 && j>=n/2 && j<n-1 || i==n-1 && j>n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n*3;j++) {
				System.out.print("0");
			}
			
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n*5;j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-1 && j==n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 && j==n-1 || i==n-2 && j>=n/2  || i==n-1 && j<n/2 || i==n-1 && j==n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i<=n/2 && j<n/2 || i<=n/2 && j==n-1 || i==n-2 && j>0 && j<n-1 || i==n-1 && j<n/2 || i==n/2 && j==n-2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i<n/2 && j==0) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n*2;j++) {
				System.out.print("0");
			}
			
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n*4;j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-(n-1) && j>=n/2 || i>0 && j==n-1 || i==n/2 && j<=n/2 && j!=0 || i==n-1 && j<=n/2 && j!=0 || i==n-2 && j!=n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<=n/2 || i==n-(n-1) && j>0 || i==n/2 && j==0 || i==n-1 && j==0) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n*4;j++) {
				System.out.print("0");
			}
			
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n*4;j++) {
				System.out.print("0");
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j>n/2 || i==n/2 && j==n-1) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j>0 && j<=n/2 || i==n-(n-1) && j<n/2 || i==n/2 || i==n-2 && j<=n/2) {
					System.out.print("*");
				}  else {
					System.out.print("0");
				}
			}
			
			for(int j=0;j<n*5;j++) {
				System.out.print("0");
			}
			
			System.out.println("");
		}

	}

}
