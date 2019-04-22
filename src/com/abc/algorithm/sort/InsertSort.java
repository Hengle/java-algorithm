package com.abc.algorithm.sort;

import java.util.Arrays;

/**
 * ��������
 * ����һ����ʶλ��������ź�������飬�ұ���δ��������ݣ�
 * ֻ��Ҫ�ӱ�־λ��ʼ���ν��ұߵ�δ��������ݲ��뵽�������������ĺ���λ�ü���
 * O(N^2)
 * @author Administrator
 *
 */
public class InsertSort {
	
	public static void start() {
		sort();
		System.out.println("��������: " + Arrays.toString(arr));
	}
	
	/** ���������� */
	private static int[] arr = new int[] {10, 2, 4, 6, 7, 2, 5};
	
	/**
	 * ����
	 */
	private static void sort() {
		// ÿ������middle��ߵĶ����ź���ģ���middle�ҵ���ȷ��λ�ò���
		for (int middle = 1; middle < arr.length; middle++) {
			int temp = arr[middle]; 
			int i = middle;
			while (i > 0 && arr[i-1] > temp) {
				arr[i] = arr[i-1];
				i--;
			}
			arr[i] = temp;
		}
	}

}
