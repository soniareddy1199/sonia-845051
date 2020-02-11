import java.util.ArrayList;
import java.util.List;

class Country {
	int population;
	String cname,ccapital;
	public Country(String cname,String ccapital,int population)
	{
		this.cname=cname;
		this.ccapital=ccapital;
		this.population=population;
	}

}
class Simple{
	public static void main(String args[])
	{
	List<Country> list=new ArrayList<Country>();
	Country c1=new Country("India","delhi",1000);
	Country c2=new Country("australia","canberra",2000);
	Country c3=new Country("austria","vienna",3000);
	list.add(c1);
	list.add(c2);
	list.add(c3);
	for(Country c:list){
		System.out.println(c.cname+" "+c.ccapital+"  "+c.population);
	}
	}
}