package lab;

class Bank{ //Parent class
float getRateOfInterest(){ //parent class method
	return 0;
	}
}

class SBI extends Bank{ //child 1 class
float getRateOfInterest(){ //Override method
	return 8;
	}
}

class ICICI extends Bank{ //child 2 class
float getRateOfInterest(){
	return 7;
	}
}
class AXIS extends Bank{ //child 3 class
float getRateOfInterest(){
	return 9;
	}
}

class Example3{
	public static void main(String args[]){
		//create a objects
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
	}
}

