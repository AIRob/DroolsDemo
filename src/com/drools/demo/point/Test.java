package com.drools.demo.point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		PointRuleEngine pointRuleEngine = new PointRuleEngineImpl();
		while(true){
			InputStream is = System.in;
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String input = br.readLine();
			
			if(null != input && "s".equals(input)){
				System.out.println("��ʼ����������...");
				pointRuleEngine.initEngine();
				System.out.println("��ʼ�������������.");
			}else if("e".equals(input)){
				final PointDomain pointDomain = new PointDomain();
				pointDomain.setUserName("hello kity");
				pointDomain.setBackMondy(100d);
				pointDomain.setBuyMoney(500d);
				pointDomain.setBackNums(1);
				pointDomain.setBuyNums(5);
				pointDomain.setBillThisMonth(5);
				pointDomain.setBirthDay(true);
				pointDomain.setPoint(0l);
				
				pointRuleEngine.executeRuleEngine(pointDomain);
				
				System.out.println("�û�����"+pointDomain.getUserName());
				
				//����һ�������գ����10�֣����ҽ����½��ױ����������ټ������
				System.out.println("�Ƿ����գ�"+pointDomain.isBirthDay());
				
				//�������2011-01-08 - 2011-08-08ÿ�����ÿ�����3�����ϣ�ÿ��3������30��   90
				System.out.println("�������ÿ����������"+pointDomain.getBillThisMonth());
				
				//�����������¹����ܽ��100���ϣ�ÿ100Ԫ����10��  100
				System.out.println("���¹����ܽ�"+pointDomain.getBuyMoney());
				
				//�����ģ����¹������5�����ϣ�ÿ�������50�� 50
				System.out.println("���¹����ܴ�����"+pointDomain.getBuyNums());
				
				//�����壺�ر�ģ����ȫ��������Ҫ������⽱��100�� 

				//�������������˻����ۼ�10��     -10
				System.out.println("�����˻�������"+pointDomain.getBackNums());

				//�����ߣ��˻������ڵ���100���ۼ�100��   -100
				System.out.println("�����˻��ܽ�"+pointDomain.getBackMondy());
				
				
				
				
				
				System.out.println("ִ�����BillThisMonth��"+pointDomain.getBillThisMonth());
				System.out.println("ִ�����BuyMoney��"+pointDomain.getBuyMoney());
				System.out.println("ִ�����BuyNums��"+pointDomain.getBuyNums());
				
				System.out.println("ִ����Ϲ�������������ͻ��֣�"+pointDomain.getPoint());
			} else if("r".equals(input)){
				System.out.println("ˢ�¹����ļ�...");
				pointRuleEngine.refreshEnginRule();
				System.out.println("ˢ�¹����ļ�����.");
			}
		}
	}

}
