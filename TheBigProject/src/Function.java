import java.io.*;
import java.util.*;
public class Function {
	static ArrayList<Customer> customer=new ArrayList<Customer>();
	void create(){
	Customer c1=new Customer();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�������˺�:");
	try {
		c1.account=br.readLine();
	    System.out.println("�������˻�����");
	    c1.password=br.readLine();
	    System.out.println("�������˻�����");
	    c1.name=br.readLine();
	    System.out.println("�Ƿ�������VIP��Ա���������Ǹ������ʵķ�����Ҫ����������yes");
	    String str=br.readLine();
	    if(str.equals("yes"))
	    {
	    	if(c1.balance>=20)
	    	{
	    		c1.toVIP();
	    		System.out.println("�����ɹ�");
	    	}
	    	else System.out.println("�˻��������ȳ�ֵ");
	    }
	    else System.out.println("");
	    customer.add(c1);
	    System.out.println("�����ʻ��ɹ�");
	    menu();
	    br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("����ʧ��!");
		System.exit(-1);
	}
	}
	public void menu() {
		// TODO Auto-generated method stub
		
	}
	public void log() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String account;
		String password;
		System.out.println("�����������˺�");
		account=br.readLine();
		System.out.println("��������������");
		password=br.readLine();
		for(int i=0;i<customer.size();i++){
			while(account.equal())
		}
	}
}