package com.itcast.D;

import java.util.Arrays;
public class Solution {
	
	public  int solution(int[] arr,int k){
		
				// ����һ��׼���ż����
				int readymaxsum = 0;
				//����һ�����ż����
				int maxsum=0;
				// �������ŵ���
				reverse(arr);
				// �и�Kֵ
				int i = -1;// ��ʾѭ������
				// �ҵ���ģ��
				for (int o = k, j = 0; i < k / 2 + 1; o -= 2, j += 2) {
					if (o < 0) {
						break;
					}
					System.out.println("ż����" + o + "," + "����:" + j);
					//�ж�������û����ô�������ż��
					boolean flag=false;
					flag=truecount(o, j, arr);
					if(flag){
						readymaxsum=getMaxSum(o, j, arr);
						if(readymaxsum>maxsum){
							maxsum=readymaxsum;
						}
					}else{
						continue;
					}
				}
				// �ҵ�����Ϸ���������ȡֵ��������
				if(maxsum==0){
					return -1;
				}else {
					return maxsum;
				}
	}
	// ���鵹��ķ���
		public static int[] reverse(int[] a) {
			//������������
			Arrays.sort(a);
			//���ĵ��򲢷��ص�������
			int[] b = a;
			for (int start = 0, end = b.length - 1; start < end; start++, end--) {
				int temp = b[start];
				b[start] = b[end];
				b[end] = temp;
			}
			return b;
		}
		//�ж����鵱�е���ż���ĸ����Ƿ��������Ҫ��
		public static boolean truecount(int a,int b,int[] arr){
			int oushucount=0;
			int jishucount=0;
			
			for (int i = 0; i < arr.length; i++) {
				//�ж�ż��
				if(arr[i] % 2==0&&arr[i]!=0){
					oushucount++;
				}
				//�ж�����
				if(arr[i]%2!=0){
					jishucount++;
				}
				
			}
			System.out.println("ż������Ϊ��"+oushucount+"�����ĸ���Ϊ"+jishucount);
			if(oushucount>=a&&jishucount>=b){
				return true;
			}else{
				return false;
			}
		}
		// ��͵ķ���,aΪż����bΪ����
		public static int getMaxSum(int a, int b, int[] arr) {
		//	truecount(a, b, arr);
			
			int oushusum = 0;
			int jishusum = 0;
			// ��ż����
			//���a!=0����ѭ��
			if (a != 0) {
				int counto = 0;
				for (int i = 0; i < arr.length; i++) {
					if (counto >= a) {
						break;
					}
					//�ж�������ǲ���ż��
					if (arr[i] % 2 == 0) {
						oushusum += arr[i];
						counto++;
					}
				}
			}
			if(b!=0){
			int countj = 0;
			// ��������
			for (int i = 0; i < arr.length; i++) {
				if (countj >= b) {
					break;
				}
				if (arr[i] % 2 != 0) {
					jishusum += arr[i];
					countj++;
				}
			}
			}
			System.out.println("ż����"+oushusum+","+"������"+jishusum);
			return (oushusum + jishusum);
		}
}
