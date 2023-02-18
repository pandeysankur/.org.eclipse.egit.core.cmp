package BhaiyaIQ_Qus;

public class ApplicationContext {
	public Bank getObjectByBeanNAme(String beanName) {
		if (beanName.equalsIgnoreCase("Sbi")) {
			return new Sbi();
		}else if(beanName.equalsIgnoreCase("Hdfc")) {
			return new Hdfc();
		}else if (beanName.equalsIgnoreCase("Asix")) {
			return new Axis();
		}
		else if (beanName.equalsIgnoreCase("Icici")) {
			return new Icici();
		}
		else{
			return new CanaraBank();
		}
		
		
		

	}
}
