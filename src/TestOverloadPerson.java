
/**
 * This program display a TestclassPerson
 * @version 20.10 2017-3-31
 * @author StormWangxh
 */
public class TestOverloadPerson {
	/*�����Ա����*/
	//���鷽�����أ����������ͺ����ֿ�����ȫ��ͬ��ֻҪ������ͬ���������ͺ͸�����

	private String personName ;
	private int personAge ;
	private String personSex ;
	private String workPlace ;
	private String phoneNum ;
	
	/*�����Ա����*/
	public void setPersonVar()
	{
		personName = "����δ֪";
		personAge = 0;
		personSex = "�Ա�δ֪";
		workPlace = "δ֪";
		phoneNum = "�绰δ֪";
		
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
		System.out.println("���� :"+person.personName+"���� :"+person.personAge+"�Ա� :"+person.personSex);
		
		person.setPersonVar("��С��", 18, "��");
		System.out.println("���� :"+person.personName+"���� :"+person.personAge+"�Ա� :"+person.personSex);
		
		person.setPersonVar("Storm", 18, "��", "school", "0123456789");
		System.out.println("���� :"+person.personName+"���� :"+person.personAge+"�Ա� :"+person.personSex+"�����ص�"+person.workPlace+"�绰 :"+person.phoneNum);
		
		
	}

}
