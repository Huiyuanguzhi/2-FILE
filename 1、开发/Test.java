package com.itcast.D;

public class Test {
	
	public static void main(String[] args) {
			//测试数据
		/*	int [] arr={4,9,8,6,2};
			int k=3;*/
		/*	int [] arr={5,6,3,4,2};
			k=5;*/
		/*	int [] arr={7,7,7,7,7};
			k=1;*/
			int [] arr={2,3,5,5,5};
			int k=3;
			//创建对象掉方法
			Solution s= new Solution();
			int max=s.solution(arr, k);
			//这里输出结果
			System.out.println(max);
		}
}
