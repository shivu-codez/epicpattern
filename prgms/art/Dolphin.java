package art;

public class Dolphin {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				System.out.print("#");
			}
			
			for(int j=0;j<n;j++) {
				System.out.print("#");
			}
			
			for(int j=0;j<n;j++) {
				System.out.print("#");
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-1 && j==n-1) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-1 ) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>=n/2 && j>=n-1 || i==n-1 || i==n-2 && j>=1 ) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>=n/2 || i>=1 && j>=n/2) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if((i==2 && j<4) || i>n/2 || i<n/2 && i!=0) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<n/2 || i==1 && j<(n/2)-1 || i==n-1) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n*7;j++) {
				System.out.print("#");
			}
			
			System.out.println("");
		}
		
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(i==n-1 && j==n-1) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>=n/2 && j>=n/2 || i>n/2) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<=n/2) {
					System.out.print("#");
				}  else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n*7;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-(n-1) && j==n-1) {
					System.out.print("#");
				}  else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n/2 && j==0 || i>n/2 && j<=n-2 || i==n-1 && j==n-1) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-1 && j==0) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n*3;j++) {
				System.out.print("#");
			}
			
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(j==n-1 && i!=n-1 || j==n-2 || j==n/2 && i!=0 || j==n-(n-1) && i==n-1) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i!=n-1) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i<=n/2 || j==0 && i==n-2 ) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i<n/2 || j==0 && i==n/2 ) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i<n/2 ) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j==0 || i==n-(n-1) ) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-(n-1) && j<=n/2) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n*3;j++) {
				System.out.print("#");
			}
			
			for(int j=0;j<n;j++) {
				if(i==0) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i<n/2 || i==n/2 && j==n-1) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if( i==n/2 || i==n-2  && j>n/2 || i==n-(n-1) && j<n-1 || i==0 && j<n/2) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>n/2 || i==n/2 && j==0) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i>n/2) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==n-1) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			
			System.out.println("");
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(i==0 && j==n-(n-1)) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n*12;j++) {
				System.out.print("#");
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 ||  i<=n/2 && j!=0 && j!=n-1 && i==n/2 && j==n/2 || i==n-(n-1) && j!=0 && j!=n-1) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<=n/2) {
					System.out.print(" ");
				}  else {
					System.out.print("#");
				}
			}
			
			for(int j=0;j<n;j++) {
				System.out.print("#");
			}
			
			System.out.println("");
		}
		
	}

}
