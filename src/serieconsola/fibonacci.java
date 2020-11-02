package serieconsola;

public class fibonacci {
	
	public static void main(String args[])
    {
        int v1=0;
        int v2=1;
        int v3;
        int x=1;
        System.out.println(v1);
        System.out.println(v2);
         do
         {
             x= x+1;
             v3= v1+v2;
             v1=v2;
             v2= v3;
             System.out.println(v3);


         }while(x<=10);

}
	
}
