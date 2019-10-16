package com.itheima.first;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				double[] x=new double[10];
				for(int i=0;i<x.length;i++)
				{
					x[i]=s.nextDouble();
				}
				s.close();
				double mean,deviation,a,sum;
				mean=deviation=a=sum=0;
				
				for(int i=0;i<x.length;i++)
					sum=sum+x[i];
				    mean=sum/x.length;
				    
				for(int i=0;i<x.length;i++)
					a+=Math.pow(x[i]-mean, 2);
					deviation=Math.sqrt(a/(x.length-1));
					
				System.out.printf("%.2f\n",mean);
				System.out.printf("%.2f\n",deviation);
			}
		}
