package partitioning;

public class Main {
	
	public static void main(String[]args) {
		Anfrage[] a = {new Anfrage(1,4), new Anfrage(2,5), new Anfrage(3,8), new Anfrage(6,15), new Anfrage(7,10), new Anfrage(9,12), new Anfrage(11,18), new Anfrage(13,14), new Anfrage(16,17)};
		partitioning(new AnfragenList(a)).print();
	}
	
	static MengeSList partitioning(AnfragenList A) {
		MengeSList S = new MengeSList();
		int r = (A.length == 0) ? 0:1;
		while (A.length != 0) {
			Element a = A.minS();
			A.removeAt(a.index);
			int[] F = new int[r];
			for(int i =0;i<F.length;i++) {
				F[i] = i+1;
			}
			for(int i=0; i< S.length; i++) {
				if(!(S.getAt(i).a.ist_kompatibel_mit(a.a))) {
					F[S.getAt(i).label-1] = 0;
				}
			}
			boolean istNull = true;
			for(int i=0;i<F.length;i++) {
				if(F[i] != 0) {
					istNull = false;
					S.append(a.a, F[i]);
					break;
				}
			}
			if(istNull) {
				r += 1;
				S.append(a.a, r);
			}
		}
		return S;
	}

}
