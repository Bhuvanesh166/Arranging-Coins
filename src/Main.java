import java.util.Scanner;

class StairCase{
    public static int countRows(int n){
        int sum=0;
        int count=0;
        for(int i=1;sum<=n;i++){
            sum+=i;
            if(sum<=n){
                count++;
            }
            
        }
        return count;
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= scanner.nextByte();
        System.out.println(countRows(n));
    }
        }