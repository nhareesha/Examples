package com.Practice.Examples;

import java.util.Scanner;

public class SubstringArrayComparison {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int k = scan.nextInt();
        String[] arr = new String[str.length()-(k-1)];
        for(int i = 0;i<str.length()-(k-1);i++){
            arr[i] = str.substring(i,i+k);
        }
        String temp = null;
        for(int i = 0 ; i<arr.length;i++){
                for(int j = 0; j<arr.length;j++){
                    if(i!=j && (arr[i].compareTo(arr[j]))<0){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
           }
       System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
             
        
    }
	}

