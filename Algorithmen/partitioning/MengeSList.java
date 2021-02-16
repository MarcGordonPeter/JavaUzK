package partitioning;

public class MengeSList {
	
	public MengeS elements = null;
	public int length;
	
	public MengeSList(Anfrage a, int l) {
		elements = new MengeS(-1,null,new MengeS(0,a,null,l), 0);
		length = 1;
	}
	
	public MengeSList() {
		elements = null;
		length = 0;
	}
	
	public MengeSList(Anfrage[] a, int[]l) {
		elements = new MengeS(-1,null, null,0);
		for(int i=0;i<a.length;i++) {
			this.append(a[i], l[i]);
		}
	}
	
	public MengeS getAt(int index) {
		if (length != 0) {
			MengeS temp = elements;
			while(temp.index != index) {
				temp = temp.next;
			}
			return temp;
		}
		return null;
	}
	
	public void removeAt(int index) {
		MengeS temp = getAt(index-1);
		MengeS newNext = temp.next.next;
		temp.next = newNext;
		temp = temp.next;
		length--;
		if (!(length == 0) && temp != null) {
			while(temp.next != null) {
				temp.index--;
				temp = temp.next;
			}
			temp.index--;
		}
	}
	
	public void replaceAt(int index, Anfrage a, int l) {
		MengeS temp = getAt(index-1);
		MengeS next = temp.next.next;
		temp.next = new MengeS(index, a, next,l);
	}
	
	public void insertAt(int index, Anfrage a, int l) {
		MengeS temp = getAt(index-1);
		MengeS next = temp.next;
		temp.next = new MengeS(index, a, next,l);
		temp = temp.next.next;
		while(temp.next != null) {
			temp.index++;
			temp = temp.next;
		}
		temp.index++;
	}
	
	public void append(Anfrage a, int l) {
		MengeS temp = elements;
		if(length == 0) {
			elements = new MengeS(-1,null,new MengeS(0,a,null,l), 0);
		} else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new MengeS(length,a, null,l);
		}
		length++;
	}
	
	public void print() {
		String ausgabe = "Label:\ts\tf\n";
		MengeS temp = elements;
		while(temp.next != null) {
			ausgabe += temp.next.toString() + "\n"; 
			temp = temp.next;
		}
		System.out.println(ausgabe);
	}
}

