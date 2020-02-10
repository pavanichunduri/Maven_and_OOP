package com.pavani;

import java.util.*;
		class addition{
		public int add(int x,int y)
		{
		return x+y;
		}
		}

		class subtraction{
		public int sub(int x,int y)
		{
		return x-y;
		}
		}
		class multiplication{
		public int mul(int x,int y)
		{
		return x*y;
		}
		}
		class division{
		public int div(int x,int y)
		{
		return x/y;
		}
		}

		class calci
		{
		public static void main(String[] args)
		{
		int r;
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		String c=sc.next();
		if(c=="+")
		{
		addition a=new addition();
		r=a.add(x,y);
		}
		else if(c=="-")
		{
		subtraction a=new subtraction();
		r=a.sub(x,y);
		}
		else if( c=="*")
		{
		multiplication a=new multiplication();
		r=a.mul(x,y);

		}
		else
		{
		division a=new division();
		r=a.div(x,y);
		}
		System.out.println(r);
		}
		}





