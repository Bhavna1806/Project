package Lab5;

import com.cg.eis.exception.*;

public class Exer4 {
	public String first_name;
	public String last_name;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public static void main(String[] args) {
		Exer4 n = new Exer4();
		n.setFirst_name("Ravi");
		n.setLast_name("Sankar");
		try {
			if ((n.getFirst_name() == null || n.getFirst_name().length() == 0)
					|| (n.getLast_name() == null || n.getLast_name().length() == 0))
				throw new MyException1();
		} catch (MyException1 e) {
			System.out.println(e);
		} finally {
			System.out.println("this is the end");
		}

	}

}
