1.Write a JSP program to display the details of Patient (PNo, PName, Address, age, disease) in tabular 
form on browser
-------------------------------------------------------------------------------------------------
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
 <title>Patient Details</title>
 <style>
 table {
 width: 50%;
 border-collapse: collapse;
 margin: 20px;
 }
 th, td {
 border: 1px solid black;
 padding: 8px;
 text-align: left;
 }
 th {
 background-color: #f2f2f2;
 }
 </style>
</head>
<body>
 <h2>Patient Details</h2>
 <table>
 <tr>
 <th>Patient Number</th>
 <th>Name</th>
 <th>Address</th>
 <th>Age</th>
 <th>Disease</th>
 </tr>
 <%
 // Sample Patient data (replace with your actual data)
 String[][] patients = {
 {"P001", "Alice", "123 Main St, City", "35", "Fever"},
 {"P002", "Bob", "456 Elm St, Town", "45", "Headache"},
 {"P003", "Charlie", "789 Oak St, Village", "28", 
"Allergy"}
 };
 // Loop through each patient and display details in table 
rows
 for (String[] patient : patients) {
 %>
 <tr>
 <td><%= patient[0] %></td>
 <td><%= patient[1] %></td>
 <td><%= patient[2] %></td>
 <td><%= patient[3] %></td>
 <td><%= patient[4] %></td>
 </tr>
 <% } %>
 </table>
</body>
</html>

 2.Write a Java program to create LinkedList of String objects and perform the following:
 i. Add element at the end of the list 
 ii. Delete first element of the list 
 iii. Display the contents of list in reverse order


 import java.util.*;
import java.io.*;
public class Slip3b {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist=new LinkedList<>();
		linkedlist.add("Apple");
		linkedlist.add("Banana");
		linkedlist.add("Grapes");
		
		System.out.println("LinkedList after adding elements : ");
		System.out.println(linkedlist);
		
		if(!linkedlist.isEmpty()) {
			linkedlist.removeFirst();
			System.out.println("LinkedList after removing first element : ");
			System.out.println(linkedlist);
		}else {
			System.out.println("LinkedList is Empty,so Cannot remove element!");
		}
		
		System.out.println("\n Linked List in Reverse order :");
		ListIterator<String> iterator = linkedlist.listIterator(linkedlist.size());
		while(iterator.hasPrevious()) {
			System.out.println("\n"+iterator.previous());
		}
	}

}

