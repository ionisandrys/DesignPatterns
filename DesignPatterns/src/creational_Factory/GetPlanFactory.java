package creational_Factory;

 class GetPlanFactory {

		// using getPlan method to get objects of type Plan
	//     GenerateBill class will use GetPlanFactory to get a Plan object
	
		
		public Plan getPlan(String planType){
			if(planType == null){
				return null;
			}
			
			if(planType.equalsIgnoreCase("BUSINESSPLAN")){
				return new BusinessPlan();
			}
			
			else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
				return new CommercialPlan();
			}
			
			else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
				return new InstitutionalPlan();
			}
			
			return null;
			
			
			
		}
	}

