package com.jd.paixu;

public class SortData {
	/*
	 * 选择排序
	 * 
	 * 例如：从小到大排序
	 * 选择排序算法会从数组第一个元素开始依次和他后面的每一个元素比较，当发现比他小数字时会把两个数字交换位置，
	 * 然后拿此时比较小的数字，继续和后面每一个比较，直到从左到右确定每一个数字在这个数组中的位置为止。
	 * 
	 */
	public static void SortData(Integer[] teger){
		int min;
		for (int i = 0; i < teger.length; i++) {
			min = i;
			/*
			 * 外层循环中一个值，和后面每一个比较，如果一直是teger[i]小，则直接执行swap（teger,i,min），其实就是把他自己赋给自己而已
			 * 如果后面teger[j]有比现在teger[i]小的，则执行if语句，将较小数的下标赋给min，然后再和后面的值比较，直到最后，调用swap方法
			 * 把比较出来最小的数赋给最原始的下标i,这也是为什么在第一层循环内写min = i;
			 */
			for (int j = i+1; j < teger.length; j++) {
				//如果teger[j]小于teger[min]则继续向下走
				/*
				 * 此时说明teger[j]比较小，将j的下标赋给min,则teger[min]最小
				 * 那teger[i]呢？
				 * 此时的teger[i]=原来的teger[min];
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
//				System.out.println("排序结果："+inte+"  ");
//			}
		}
	}

	private static void swap(Integer[] teger, int i, int min) {
		// TODO Auto-generated method stub
		int temp = 0;
		/*
		 *由上可知，teger[i]>teger[min]所以将两个值交换位置则此时teger[min]为最小值，teger[i]相对比较大
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
