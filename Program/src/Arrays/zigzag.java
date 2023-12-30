package Arrays;

public class zigzag {
	public static void main(String[] args) {

	int[] a={10,20,30,40,50};
    int[] b={15,25,35,45,55};
    int[] res=new int[a.length+b.length];
    int i=0;
    int j=0;
    while(i<a.length && i<b.length)
    {
        res[j]=a[i];
        j++;
        res[j]=b[i];
        i++;
        j++;
    }
    for (int k=0;k<res.length;k++)
    {
        System.out.println(res[k]+" ");
    }
	}
}
