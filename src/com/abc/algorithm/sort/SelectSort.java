package com.abc.algorithm.sort;

import java.util.Arrays;

/**
 * ѡ������
 * O(N^2)
 * @author Administrator
 *
 */
public class SelectSort {
	
	public static void start() {
		sort();
		System.out.println("ѡ������: " + Arrays.toString(arr));
	}
	
	/** ���������� */
	private static int[] arr = new int[] {10, 2, 4, 6, 7, 2, 5};
	
	/**
	 * ����
	 */
	private static void sort() {
		// ÿ����������ߵ���ȷ��Ϊ��С��
		for (int i = 0; i < arr.length-1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			// ����Сֵ�����������
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}

}
