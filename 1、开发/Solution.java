package com.itcast.D;

import java.util.Arrays;
public class Solution {
	
	public  int solution(int[] arr,int k){
		
				// 设置一个准最大偶数和
				int readymaxsum = 0;
				//设置一个最大偶数和
				int maxsum=0;
				// 给数组排倒序
				reverse(arr);
				// 有个K值
				int i = -1;// 表示循环次数
				// 找到了模型
				for (int o = k, j = 0; i < k / 2 + 1; o -= 2, j += 2) {
					if (o < 0) {
						break;
					}
					System.out.println("偶数：" + o + "," + "奇数:" + j);
					//判断数组有没有这么多个奇数偶数
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
				// 找到了组合方法，就是取值的问题了
				if(maxsum==0){
					return -1;
				}else {
					return maxsum;
				}
	}
	// 数组倒叙的方法
		public static int[] reverse(int[] a) {
			//数组先排正序
			Arrays.sort(a);
			//再拍倒序并反回倒叙数组
			int[] b = a;
			for (int start = 0, end = b.length - 1; start < end; start++, end--) {
				int temp = b[start];
				b[start] = b[end];
				b[end] = temp;
			}
			return b;
		}
		//判断数组当中的奇偶数的个数是否满足组合要求
		public static boolean truecount(int a,int b,int[] arr){
			int oushucount=0;
			int jishucount=0;
			
			for (int i = 0; i < arr.length; i++) {
				//判断偶数
				if(arr[i] % 2==0&&arr[i]!=0){
					oushucount++;
				}
				//判断奇数
				if(arr[i]%2!=0){
					jishucount++;
				}
				
			}
			System.out.println("偶数个数为："+oushucount+"奇数的个数为"+jishucount);
			if(oushucount>=a&&jishucount>=b){
				return true;
			}else{
				return false;
			}
		}
		// 求和的方法,a为偶数。b为奇数
		public static int getMaxSum(int a, int b, int[] arr) {
		//	truecount(a, b, arr);
			
			int oushusum = 0;
			int jishusum = 0;
			// 算偶数合
			//如果a!=0进入循环
			if (a != 0) {
				int counto = 0;
				for (int i = 0; i < arr.length; i++) {
					if (counto >= a) {
						break;
					}
					//判断这个数是不是偶数
					if (arr[i] % 2 == 0) {
						oushusum += arr[i];
						counto++;
					}
				}
			}
			if(b!=0){
			int countj = 0;
			// 算奇数合
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
			System.out.println("偶数合"+oushusum+","+"奇数合"+jishusum);
			return (oushusum + jishusum);
		}
}
