package com.drools.demo.point;

/**
 * ����ӿ�
 */
public interface PointRuleEngine {
	
	/**
	 * ��ʼ����������
	 */
	public void initEngine();
	
	/**
	 * ˢ�¹��������еĹ���
	 */
	public void refreshEnginRule();
	
	/**
	 * ִ�й�������
	 * @param pointDomain ����Fact
	 */
	public void executeRuleEngine(final PointDomain pointDomain);
}
