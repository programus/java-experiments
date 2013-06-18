package com.ibm.javabasic.research._05_equals.better;

/**
 *
 * @author  Wang Yuan
 */
public class Something {

	private int a = 0;
	private Object o = null;

	/** Creates a new instance of EqResearch */
	public Something(int a, Object o) {
		this.a = a;
		this.o = o;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true; 
		}
		if (obj == null) {
			return false; 
		}
		
		boolean isSame = false; 
		if (obj.getClass().equals(this.getClass())) {
			Something er = (Something) obj; 
			if (this.a == er.a) {
				if ((this.o != null && er.o != null && this.o.equals(er.o)) || this.o == er.o) {
					isSame = true; 
				}
			}
		}
		return isSame;
	}

	public int hashCode() {
		// must override hashCode() if you overrided equals(). 
		// and if a.equals(b) then a.hashCode() == b.hashCode() should be true. 
		return a * 31 * 31 + ((o != null) ? (o.getClass().hashCode() * 31 + o.hashCode()) : 0); 
	}
}
