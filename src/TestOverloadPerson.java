
/**
 * This program display a TestclassPerson
 * @version 20.10 2017-3-31
 * @author StormWangxh
 */
public class TestOverloadPerson {
	/*定义成员变量*/
	//考查方法重载：即方法类型和名字可以完全相同，只要参数不同，包括类型和个数！

	private String personName ;
	private int personAge ;
	private String personSex ;
	private String workPlace ;
	private String phoneNum ;
	
	/*定义成员方法*/
	public void setPersonVar()
	{
		personName = "姓名未知";
		personAge = 0;
		personSex = "性别未知";
		workPlace = "未知";
		phoneNum = "电话未知";
		
	}
	
	public void setPersonVar(String name , int age , String sex)
	{
		personName = name ;
		personAge = age ;
		personSex = sex ;
	}
	public void setPersonVar(String name ,int age ,String sex , String work ,String phone )
	{
		personName = name ;
		personAge = age ;
		personSex = sex ;
		workPlace = work ;
		phoneNum = phone ;
		
	}
	

	public static void main(String[] args) {
		
		TestOverloadPerson person = new TestOverloadPerson();
		
		person.setPersonVar();
		System.out.println("姓名 :"+person.personName+"年龄 :"+person.personAge+"性别 :"+person.personSex);
		
		person.setPersonVar("王小虎", 18, "男");
		System.out.println("姓名 :"+person.personName+"年龄 :"+person.personAge+"性别 :"+person.personSex);
		
		person.setPersonVar("Storm", 18, "男", "school", "0123456789");
		System.out.println("姓名 :"+person.personName+"年龄 :"+person.personAge+"性别 :"+person.personSex+"工作地点"+person.workPlace+"电话 :"+person.phoneNum);
		
		
	}

}
