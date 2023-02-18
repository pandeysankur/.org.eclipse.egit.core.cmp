package BhaiyaIQ_Qus;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ApplicationContext();

		Bank b = ac.getObjectByBeanNAme("");
		if (b instanceof Icici) {
			System.out.println("Icici");
		}else if (b instanceof Sbi) {
			System.out.println("SBI");
		}else if (b instanceof Hdfc) {
			System.out.println("HDFC");
		}else if (b instanceof Axis) {
			System.out.println("Axis");
		}else if (b instanceof CanaraBank) {
			System.out.println("Canara Bank");
		}
	}

}
