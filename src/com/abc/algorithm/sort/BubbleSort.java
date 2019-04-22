package com.abc.algorithm.sort;

import java.util.Arrays;

/**
 * ð������
 * O(N^2)
 * @author Administrator
 *
 */
public class BubbleSort {

	public static void start() {
		sort();
		System.out.println("ð������: " + Arrays.toString(arr));
	}
	
	/** ���������� */
	private static int[] arr = new int[] {10, 2, 4, 6, 7, 2, 5};
	
	/**
	 * ����
	 */
	private static void sort() {
		// ÿ���������ұߵ���ȷ��Ϊ����
		for (int right = arr.length-1; right > 1; right--) {
			for (int i = 0; i < right; i++) {
				// ���߱�ǰ��С
				if (arr[i+1] < arr[i]) {
					// ����
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
}
