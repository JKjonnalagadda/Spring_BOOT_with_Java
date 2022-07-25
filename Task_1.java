import java.util.Scanner;

class Alpha{
	int n=10;
	//Charcter A
	void A(){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i==0 || j==0 ||i==(n-1)/2 || j==(n-1))
				    System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
		
	}
	
	//Charcter B
		void B(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 ||i==(n-1)/2 || j==(n-1) || i== (n-1))
					    System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println("");
			}
		}
		
		
		//Charcter C
		void C(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 || i== (n-1))
					    System.out.print("* ");
						else
						System.out.print("  ");
					}
				System.out.println("");
			 }
		}
		
		
		//Charcter D
	   void D(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 && j<(n-(n-1)/4) || j==0 || i== (n-1) && j<(n-(n-1)/4) ||j==n-1 && i!=0 && i!=n-1 )
					    System.out.print("* ");
						else
						System.out.print("  ");
					}
				System.out.println("");
			 }
		}
				
	 //Character E
	   void E(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 ||i==n-1 || i==(n-1)/2)
					    System.out.print("* ");
						else
						System.out.print("  ");
					}
				System.out.println("");
			 }
		}
	   
	 //Character F
	   void F(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 || i==(n-1)/2)
					    System.out.print("* ");
						else
						System.out.print("  ");
					}
				System.out.println("");
			 }
		}
	   //Character G
	   
	   void G(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 || i==(n-1)/2 && j>=(n-1)/2 ||
							(j==(n-1)/2 ||  j==(n-1))&& (i>(n-1)/2) || i==n-1 && j<(n-1)/2 )
					    System.out.print("* ");
						else
						System.out.print("  ");
					}
				System.out.println("");
			 }
		}
	   
	 //Character H
	   void H(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(j==0 || j==n-1 || i==(n-1)/2)
					    System.out.print("* ");
						else
						System.out.print("  ");
					}
				System.out.println("");
			 }
		}
	   
	   //Character I
	   void I(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || i==n-1 || j==(n-1)/2)
					    System.out.print("* ");
						else
						System.out.print("  ");
					}
				System.out.println("");
			 }
		}
	
	//Character J
	void J(){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1)/2 || j==0 && i>(n-1)/2 || i==n-1 && j<(n-1)/2)
				    System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
		
	}
	
	//Character K
		void K(){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i>=0&&j==(n-1)/2||i==j&&j>n/2||i+j==n-1&&i<3*(n/4))
					    System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println("");
			}
		}
	//Character L
		   void L(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0 || i==n-1)
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		 
	//Character M
		   void M(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0 || j==n-1 || i==j && i<=(n-1)/2 || j>(n-1)/2 && i+j==n-1)
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		 //Character N
		   void N(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0 || j==n-1 || i==j )
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		 //Character O
		   void O(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0 || j==n-1 || i==n-1 || i==0 )
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   //Character P
		   void P(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0 || j==n-1 && i<(n-1)/2 || i==(n-1)/2 || i==0 )
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   
		   //Character Q
		   void Q(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i==j&&i>=n/2||(i==0||i==3*(n/4))&&(j>0&&j<3*(n/4))||(j==0||j==3*(n/4))&&(i>0&&i<3*(n/4)))
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   
		   //Character R
		   void R(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0&&i>=0||i==n/2&&j>=0||i==0&&j>=0||j==n-1&&i<=n/2||i>=n/2&&i==j )
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   //Character S
		   void S(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i==0 || j==0 && i<n/2 || i==(n-1)/2 || i==(n-1) || j==(n-1)&& i>(n-1)/2)
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		 //Character T
		   void T(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i==0 || j==(n-1)/2)
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   //Character U
		   void U(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0 || j==(n-1)||i==(n-1))
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   //Character V
		   void V(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j>=0&&i==j&&i<=(n-1)/2||j>=0&&i+j==n-1&&i<=(n-1)/2)
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   //Character W
		   void W(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0 || j==(n-1)||i>(n-1)/2 && i+j==n || i==j &&i>(n-1)/2)
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   
		   //Character X
		   void X(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i==j || i+j==(n-1))
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   
		 //Character Y
		   void Y(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j>=0&&i==j&&i<=(n-1)/2||j>=0&&i+j==n-1&&i<=(n-1)/2 || j==(n-1)/2 && i>(n-1)/2)
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   
		   //Character Z
		   void Z(){
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i+j==(n-1)||i==0 ||i==(n-1))
						    System.out.print("* ");
							else
							System.out.print("  ");
						}
					System.out.println("");
				 }
			}
		   
}
public class Task_1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=str.toUpperCase();
		Alpha Javengers=new Alpha();
		//String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
		for(int i=0;i<str.length();i++) {
			
		switch(str.charAt(i)) {
		  case 'A':
			  Javengers.A();
			   System.out.println(" ");
		    break;
	
		  case 'B':
			  Javengers.B();
			  System.out.println(" ");
		    break;
		  case 'C':
			  Javengers.C();
			  System.out.println(" ");
		    break;
		  case 'D':
		     Javengers.D();
			 System.out.println(" ");
			 break;
		
		  case 'E':
			  Javengers.E();
			  System.out.println(" ");
			   break;
		case 'F':
			Javengers.F();
				System.out.println(" ");
			    break;
		  case 'G':
			  Javengers.G();
			   System.out.println(" ");
		    break;
	
		  case 'H':
			  Javengers.H();
			  System.out.println(" ");
		    break;
		  case 'I':
			  Javengers.I();
			  System.out.println(" ");
		    break;
		  case 'J':
		     Javengers.J();
			 System.out.println(" ");
			 break;
		
		  case 'K':
			  Javengers.K();
			  System.out.println(" ");
			   break;
		case 'L':
			Javengers.L();
				System.out.println(" ");
			    break;
		 
		  case 'M':
			  Javengers.M();
			   System.out.println(" ");
		    break;
	
		  case 'N':
			  Javengers.N();
			  System.out.println(" ");
		    break;
		  case 'O':
			  Javengers.O();
			  System.out.println(" ");
		    break;
		  case 'P':
		     Javengers.P();
			 System.out.println(" ");
			 break;
		
		  case 'Q':
			  Javengers.Q();
			  System.out.println(" ");
			   break;
		case 'R':
			Javengers.R();
				System.out.println(" ");
			    break;
		  case 'S':
			  Javengers.S();
			   System.out.println(" ");
		    break;
	
		  case 'T':
			  Javengers.T();
			  System.out.println(" ");
		    break;
		  case 'U':
			  Javengers.U();
			  System.out.println(" ");
		    break;
		  case 'V':
		     Javengers.V();
			 System.out.println(" ");
			 break;
		  case 'W':
			     Javengers.W();
				 System.out.println(" ");
				 break;
		
		  case 'X':
			  Javengers.X();
			  System.out.println(" ");
			   break;
		case 'Y':
			Javengers.Y();
				System.out.println(" ");
			    break;
		case 'Z':
			Javengers.Z();
				System.out.println(" ");
			    break;
		  default:
			  System.out.println("NOT an Alphabet");
		}
		
	}
	}
}

