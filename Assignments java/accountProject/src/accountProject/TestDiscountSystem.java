package accountProject;

import java.util.Date;

public class TestDiscountSystem {

	public static void main(String[] args) {
		Customer c1 = new Customer("mirza", true, "Premium");
        //Customer c2 = new Customer("Kiran", true, "Silver");
  
        Visit v1 = new Visit(c1, new Date());
       //  System.out.println(v1.toString());
        v1.setProductExpense(4.5);
        v1.setServiceExpense(8.5);
        System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

    }
	}


