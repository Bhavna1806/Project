package Lab14;
	//package com.cg.eis.dao;

	import java.util.HashMap;
	import java.util.Map;

	//import com.cg.eis.bean.Employee;

	public class EmployeeDaoImpl implements EmployeeDao {
		Map<String, Employee> emplist=new HashMap<String,Employee>();
		
		@Override
		public void getDetails(Employee emp) {
			// TODO Auto-generated method stub
			emplist.put(String.valueOf(emp.getId()), emp);
		}

		@Override
		public void getInsurance(String id, String scheme) {
			// TODO Auto-generated method stub
			if(emplist.containsKey(id))
			{
				Employee emp=emplist.get(id);
				emp.setInsuranceScheme(scheme);
				
			}
		}

		@Override
		public Employee showDetails(String id) {
			// TODO Auto-generated method stub
			Employee emp = new Employee();
			if(emplist.containsKey(id))
			{
				emp=emplist.get(id);
			}
			return emp;
		}

}
