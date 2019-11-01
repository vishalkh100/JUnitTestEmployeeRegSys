package employee;

public class Empl  implements Comparable<Empl>{
	public String name;
	public String dept;
	
	public Empl(String n,String a) {
		name = n;
		dept = a;
	}
	
	@Override
    public String toString() {
        return " Name : " + name + ' ' + ", Dept : " + dept;
    }
	
	@Override
	public int compareTo(Empl that) {
        return this.name.compareTo(that.name);
    }
	
	public boolean equals(Object o) {
		if (!(o instanceof Empl)) {
		    return false;
		  }
		  Empl other = (Empl) o;
		  return name.equals(other.name) && dept.equals(other.dept);
	}
}