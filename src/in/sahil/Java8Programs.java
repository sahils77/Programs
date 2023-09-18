package in.sahil;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Programs {

	public static void main(String[] args) {
		
				
				
				
		//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

				 List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
				 
				 List<Integer> ll=list.stream().filter(i->i%2==0).collect(Collectors.toList());
				 //System.out.println(ll);
				 
				 
		//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
				 
				 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,1);
				 List<String> al=myList.stream().map(i->i +"").filter(i->i.startsWith("1")).collect(Collectors.toList());
				 //System.out.println(al);
				 
				 
		// Given the list of integers, find the first element of the list using Stream functions?
				 
				 List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
				 int i1=myList1.stream().findFirst().get()
						 ;
				// System.out.println(i1);
				 
				 
		//Given a list of integers, find the total number of elements present in the list using Stream functions?
				 
				 List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
				 
				 //System.out.println(myList2.stream().count());
				 
				 
		//Given a list of integers, find the maximum value element present in it using Stream functions?
				 
				 List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
				 
				 //System.out.println(myList3.stream().max(Integer::compare).get());
				 
				 
				 
		// Given a list of integers, sort all the values present in it using Stream functions?
				 
				 List<Integer> myList4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
				 
				//System.out.println( myList4.stream().sorted().collect(Collectors.toList()));
				 
		//Given a list of integers, sort all the values present in it in descending order using Stream functions?
				 
				 List<Integer> myList5 = Arrays.asList(10,15,8,49,25,98,98,32,15);
				 
				 List<Integer> l=myList5.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
				 //System.out.println(l);
				 
				 
		//Java 8 program to perform cube on list elements and filter numbers greater than 50.
				 
				 List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
				 
				List<Integer> il=integerList.stream().map(i->i*i*i).filter(i->i>50).collect(Collectors.toList());
				//System.out.println(il);

				
				// stream.of() method of method is used to convert arrays directly into stream
				
				Integer arr[]= {4,5,6,7,1,2,3};
				
				Stream<Integer> ss=Stream.of(arr);
				//System.out.println(ss.filter(i->i%2==0).collect(Collectors.toList()));
				
				
				//Date time API introduced to represent local Date Time in java8
				
				LocalDate date = LocalDate.now();    
			    LocalDate yesterday = date.minusDays(1);    
			    LocalDate tomorrow = yesterday.plusDays(2);    
			    System.out.println("Today date: "+date);    
			    System.out.println("Yesterday date: "+yesterday);    
			    System.out.println("Tomorrow date: "+tomorrow);  
			    
			    
			   //Write a program to calculate your exact age
			    
			    System.out.println("Enter the Date of birth");
			    Scanner sc=new Scanner(System.in);
			    String a=sc.next();
			    
			    LocalDate dob = LocalDate.parse(a); 
			    
			    //Period p= Period.between(dob, date.now().parse());  
			   
			    //System.out.println(p.getDays()+""+p.getMonths()+""+p.getYears());

			    
			    
				
			}

		


	}

