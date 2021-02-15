package lateness;

public class indexList {
	
	public Element elements = null;
	public int length;
	
	public indexList(Anfrage a) {
		elements = new Element(-1,null,new Element(0,a,null));
		length = 1;
	}
	
	public indexList() {
		elements = null;
		length = 0;
	}
	
	public indexList(Anfrage[] a) {
		elements = new Element(-1,null, null);
		for(int i=0;i<a.length;i++) {
			this.append(a[i]);
		}
	}
	
	public Element getAt(int index) {
		if (length != 0) {
			Element temp = elements;
			while(temp.index != index) {
				temp = temp.next;
			}
			return temp;
		}
		return null;
	}
	
	public void removeAt(int index) {
		Element temp = getAt(index-1);
		Element newNext = temp.next.next;
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
	
	public void replaceAt(int index, Anfrage a) {
		Element temp = getAt(index-1);
		Element next = temp.next.next;
		temp.next = new Element(index, a, next);
	}
	
	public void insertAt(int index, Anfrage a) {
		Element temp = getAt(index-1);
		Element next = temp.next;
		temp.next = new Element(index, a, next);
		temp = temp.next.next;
		while(temp.next != null) {
			temp.index++;
			temp = temp.next;
		}
		temp.index++;
	}
	
	public void append(Anfrage a) {
		Element temp = elements;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Element(length,a, null);
		length++;
	}
	
	public Element minF() {
		Element temp = elements;
		Element minF = temp.next;
		while(temp.next != null) {
			if (minF.a.f > temp.next.a.f) {
				minF = temp.next;				
			}
			temp = temp.next;
		}
		return minF;
	}
	
	public void print() {
		String ausgabe = "[";
		Element temp = elements;
		while(temp.next != null) {
			ausgabe += temp.index + ", "; 
			temp = temp.next;
		}
		ausgabe += temp.index + "]";
		System.out.println(ausgabe);
	}
}
