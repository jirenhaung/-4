package 第二章排序;


public class Insertion {
	public static void sort(Comparable[] a){
		int N=a.length;
		for(int i=1;i<N;i++){
			Comparable currentElemet=a[i];
			int k;
			for(k=i-1;k>=0&&less(currentElemet, a[k]);k--)
				a[k+1]=a[k];
			a[k+1]=currentElemet;
		}
	}
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable[] a,int i,int j){
		Comparable tComparable=a[i];
		a[i]=a[j];
		a[j]=tComparable;
	}
	public static boolean isSorted(Comparable[] a){
		for(int i=0;i<a.length;i++)
			if(less(a[i], a[i-1])) return false;
		return true;
	}
	/*public static void main(String[] args) {
		Integer[] a={3,2,14,5,67,8};
		sort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}*/
}
