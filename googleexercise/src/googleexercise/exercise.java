package googleexercise;
import java.util.Scanner;

import javax.swing.tree.TreeNode;
public class exercise {
	
	



	

		 int fact=1;
		 public String[] arr;
		    public void factrec(int a,int k){
		        if(a>=k)
		        {fact=fact*k;
		        k++;
		        factrec(a,k);
		        }
		        else
		        {System.out.println("The string  will have "+fact+" permutations");
		        }
		        }
		    
		    public void printperm(){
		        String str;
		        int k;
		        Scanner in = new Scanner(System.in);
		       
		        str="abcde";
		        k=str.length();
		        factrec(k,1);
		        arr =new String[fact];
		        char[] array = str.toCharArray();
		        while(p<fact)
		        printcomprec(k,array,arr);
		         
		    }
		    int y=1;
		    int p = 0;
		    int g=1;
		    int z = 0;
		    public void printcomprec(int k,char array[],String arr[]){
		        for (int l = 0; l < k; l++) {
		            for (int b=0;b<k-1;b++){
		            for (int i=1; i<k-g; i++) {
		                char temp;
		                String stri = "";
		                temp = array[i];
		                array[i] = array[i + g];
		                array[i + g] = temp;
		                for (int j = 0; j < k; j++)
		                    stri += array[j];
		                arr[z] = stri;
		                System.out.println(arr[z] + "   " + p++);
		                z++;
		            }
		            }
		            char temp;
		            temp=array[0];
		            array[0]=array[y];
		            array[y]=temp;
		            if (y >= k-1)
		                y=y-(k-1);
		            else
		                y++;
		        }
		        if (g >= k-1)
		            g=1;
		        else
		            g++;
		    }
		    
		    
	public void bsearch()
	{
	Scanner in = new Scanner(System.in);

	System.out.println("enter key");
	String ky = in.nextLine();
	int sz = 120;


	binarySearch(arr, 0, sz, ky);


	}
		
		    public static void binarySearch(String[] arrd,int low, int size, String key)
		    {
		    	
		        int position=((low+size)/2);
		  

		      // To start, find the subscript of the middle position.
		
		        if (arrd[position] == key)
			      {
			            System.out.println("The string was found in array" + position);
			            
			      }
		        else if(( arrd[position] != key) )
		      {
		          //search lower
		          {                                              
		               
		              binarySearch(arrd, low, (position-1), key);
		               
		          }                                                             
		               //search upper                                                 
		         {                                                        
		                
		               binarySearch(arrd, (position+1), size, key);
		         }
		         
		      }
		      else
		           System.out.println("Sorry, the string is not in this array");
		      
		      
		   }

		    
		    public void bsearchnonrecursive()
		    {
		    Scanner in = new Scanner(System.in);

		    System.out.println("enter key");
		    String ky = in.nextLine();
		   


		    binarysearch(arr, ky);


		    }
		    
		public static void binarysearch(String[] arrt, String key)
		{
			int low = 0;
			int high = 120-1; //permutations minus 1 for the array size
			//search lower
			while(low<=high){
				int mid=(low+high)/2;
				if (arrt[mid] == key)
					System.out.print("found at "+mid+ "");
				else 
					low = mid+1;
			}
			///search upper
			while(low<=high){
				int mid=(low+high)/2;
				if (arrt[mid] == key)
					System.out.print("found at "+mid+ "");
				else 
					high = mid-1;
			}
		}
		
		public void display()
		{
			 System.out.println("----MENU-----");
			 System.out.println("press the number & the enter Key to view selection");
			 System.out.println("1. Exercise One");
			 System.out.println("2. Exercise Two");
			 System.out.println("3. Exercise Three");
			 System.out.println("4. Exercise Four");
		}
		   
		    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 exercise tes = new exercise();
			Scanner in = new Scanner(System.in);
			 
			tes.display();
			 int a = in.nextInt();
			 
			 switch(a)
			 {
			 case 1:
			 
		        tes.printperm();
		        tes.display();
		       break;
			 case 2:  
		        tes.bsearch();
		        tes.display();
		        break;
			 case 3:
				
		   tes.bsearchnonrecursive();
		   tes.display();
			  break;
			 
			 }
		        
		}
	}




