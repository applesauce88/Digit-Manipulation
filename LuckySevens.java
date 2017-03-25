import java.lang.Math;

public class LuckySevens{
	public static void main(String[] args){
		//Scanner s = new Scanner(System.in);
		
		int x = IO.readInt();
		int y = IO.readInt();
		int count=0;
		int temp;

		if (x>y){
			IO.reportBadInput();
			return;
		}	
		
		if (x>=0&&y>=0){
			for (int i = x; i<=y; i++) {
				temp = i; 
				while (temp!=0){
					if (temp%10==7){
						count++;
					}
					temp = temp/10;
				}
			}
		} else if (x<0&&y>=0){
			for (int i = 0; i<=y; i++) {
				temp = i; 
				while (temp!=0){
					if (temp%10==7){
						count++;
					}
					temp = temp/10;
				}
			}
			x=x*-1;
			for (int i = 0; i<=x; i++) {
				temp = i; 
				while (temp!=0){
					if (temp%10==7){
						count++;
					}
					temp = temp/10;
				}

			}
		} else if (x<0&&y<0){
			int j = x*-1;
			x=y*-1;
			y=j;
			for (int i = x; i<=y; i++) {
				temp = i; 
				while (temp!=0){
					if (temp%10==7){
						count++;
					}
					temp = temp/10;
				}
			}	
		}
		
		
		
		IO.outputIntAnswer(count);
		
		
		
		
		
	}
}