
class Customer {
	String account;
	String name;
	String password;
	double balance=0;
	boolean VIP=false;
	boolean login=false; 
	String getaccount(){
		return this.account;
	}
	double getbalance(){
		return this.balance;
	}
	String getname(){
		return this.name;
	}
	void setpassword(String password){
		this.password=password;
	}
	void toVIP(){
		this.VIP=true;
	}
	void addBalance(double banlance){
		double i;
		i=this.balance;
		this.balance=balance+i;
	}
}
/*��Ӱ������Ʊϵͳ
1ͼ�ν������GUI
2��Ӱ��Ѷ�������
3.�������
��Ӱ�������.a��Ӱ��bӰ��c�û�����d�Ƿ���ӳ��������e.Ӱ��f.��λgʱ��
��Ӱ��ķ���.���ظ������Եķ���������Ӱ���������û����ֵ��洢������ķ�����
�޸�Ӱ����λʱ��ķ�����
�˿��������.�˺ţ����������룬��VIP��Ĭ��Ϊfalse����
VIP��̳�*/
