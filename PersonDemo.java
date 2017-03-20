class Person
{
	private int age;
	public void setAge(int a)
	{
		if( a>0 && a<120)
		{
			age = a;
			speak();
		}
		else
			System.out.println("无效值");
	}
	
	public int getAge()
	{
		return age;
	}
	void speak()
	{
		System.out.println("age="+age);
	}
	
}
class PersonDemo
{
	public static void mian( String []  args )
	{
		Person person = new Person();
		person.setAge(20);
		
	}
}