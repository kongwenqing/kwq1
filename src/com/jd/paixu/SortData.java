package com.jd.paixu;

public class SortData {
	/*
	 * ѡ������
	 * 
	 * ���磺��С��������
	 * ѡ�������㷨��������һ��Ԫ�ؿ�ʼ���κ��������ÿһ��Ԫ�رȽϣ������ֱ���С����ʱ����������ֽ���λ�ã�
	 * Ȼ���ô�ʱ�Ƚ�С�����֣������ͺ���ÿһ���Ƚϣ�ֱ��������ȷ��ÿһ����������������е�λ��Ϊֹ��
	 * 
	 */
	public static void SortData(Integer[] teger){
		int min;
		for (int i = 0; i < teger.length; i++) {
			min = i;
			/*
			 * ���ѭ����һ��ֵ���ͺ���ÿһ���Ƚϣ����һֱ��teger[i]С����ֱ��ִ��swap��teger,i,min������ʵ���ǰ����Լ������Լ�����
			 * �������teger[j]�б�����teger[i]С�ģ���ִ��if��䣬����С�����±긳��min��Ȼ���ٺͺ����ֵ�Ƚϣ�ֱ����󣬵���swap����
			 * �ѱȽϳ�����С����������ԭʼ���±�i,��Ҳ��Ϊʲô�ڵ�һ��ѭ����дmin = i;
			 */
			for (int j = i+1; j < teger.length; j++) {
				//���teger[j]С��teger[min]�����������
				/*
				 * ��ʱ˵��teger[j]�Ƚ�С����j���±긳��min,��teger[min]��С
				 * ��teger[i]�أ�
				 * ��ʱ��teger[i]=ԭ����teger[min];
				 * 
				 */
				 
//				System.out.println(teger[j]+"teger[j]---VS---teger[min]"+teger[min]);
				if(teger[j].compareTo(teger[min])<0){
					System.out.println(teger[j]+"---["+teger[min]+"-----]");
					min = j;
				}
			}
			swap(teger,i,min);
//			for (Integer inte : teger) {
//				System.out.println("��������"+inte+"  ");
//			}
		}
	}

	private static void swap(Integer[] teger, int i, int min) {
		// TODO Auto-generated method stub
		int temp = 0;
		/*
		 *���Ͽ�֪��teger[i]>teger[min]���Խ�����ֵ����λ�����ʱteger[min]Ϊ��Сֵ��teger[i]��ԱȽϴ�
		 */
		temp = teger[i];
		teger[i] = teger[min];
		teger[min] = temp;
	}
	public static void main(String[] args) {
		
		Integer[] teger = {-1,34,456,46,3,453,64,85};
		SortData.SortData(teger);
		for (Integer inte : teger) {
			System.out.println(inte+"  ");
		}
	}
}
